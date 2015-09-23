/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.dao;



import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.interfac.IDAOGeneric;
import br.com.lsi.ordemservico.util.PersistenceUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;



/**
 *
 * @author Allan
 */
public class DAOGeneric<T> implements IDAOGeneric<T> {

    private Class classe;
     private EntityManagerFactory entityManagerFactory;
    private EntityManager manager;
    public DAOGeneric() {
        this.classe = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }
    
    @Override
    public void salvar(T t) throws DAOException{
        Session sessao = PersistenceUtil.getSessionFactory().openSession();
           try {
                sessao.getTransaction().begin();
                sessao.save(t);
                sessao.getTransaction().commit();
           } catch (Exception e) {
               sessao.getTransaction().rollback();
               e.printStackTrace();
               throw new DAOException("Erro ao Salvar no BD");
           }finally{
               sessao.close();
           }
           
    }

    @Override
    public void atualizar(T t) throws DAOException {
        Session sessao = PersistenceUtil.getSessionFactory().openSession();
        try {
            sessao.getTransaction().begin();
            sessao.update(t);
            sessao.getTransaction().commit();            
        } catch (Exception e) {
            sessao.getTransaction().rollback();
            e.printStackTrace();
            throw new DAOException("Erro ao Atualizar no BD");
        }finally{
            sessao.close();
        }
    }
    
    @Override
    public void deletar(T t) throws DAOException{
        Session sessao = PersistenceUtil.getSessionFactory().openSession();
        try {
            sessao.getTransaction().begin();
            sessao.delete(t);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            sessao.getTransaction().rollback();
            e.printStackTrace();
            throw new DAOException("Erro ao Deletar no BD");
        }finally{
            sessao.close();
        }
    }

    @Override
    public T getById(Long id) throws DAOException {
        T t=null;
        Session sessao = PersistenceUtil.getSessionFactory().openSession();
        try {
            sessao.getTransaction().begin();
            Criteria criteria = sessao.createCriteria(classe);
            criteria.add(Restrictions.eq("id", id));
            t = (T) criteria.uniqueResult();
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException("Erro ao buscar por ID no BD");
        }finally{
            sessao.close();
        }
        return t;
        
    }

    @Override
    public List<T> getAll() throws DAOException {
        List<T> lista = null;
        Session sessao = PersistenceUtil.getSessionFactory().openSession();
        try {
            sessao.getTransaction().begin();
            Criteria criteria = sessao.createCriteria(classe);
            lista = criteria.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException("Erro ao buscar listar no BD");
        }finally{
            sessao.close();
        }
        return lista;
    }
    
    public EntityManager getEntityManeger(){
        
        try {
            manager = entityManagerFactory.createEntityManager();
            
        } catch (Exception e) {
        }
        return manager;
    }
    
    public Criteria getCriteria(){
        try {
            return ((Session) manager.getDelegate()).createCriteria(classe);
        } catch (Exception e) {
        }
        return null;
    }
}
