/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.dao;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.modelo.Empresa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class EmpresaDAO {

    public class EmpresaDao implements IEmpresaDAO {

        private Class classe;
        private EntityManager manager;
        public EntityManagerFactory entityManagerFactory;

        @Override
        public void inserir(Empresa e) {

            manager = entityManagerFactory.createEntityManager();

            manager.getTransaction().begin();
            manager.persist(e);
            manager.getTransaction().commit();
            manager.close();

        }

        @Override
        public void editar(Empresa e) throws DAOException {
            manager = entityManagerFactory.createEntityManager();

            manager.getTransaction().begin();
            e = manager.merge(e);
            manager.getTransaction().commit();
            manager.close();

        }

        @Override
        public void remover(int id) throws DAOException {

        }

        @Override
        public List<Empresa> listarEmpresa() {
            List<Empresa> lista = null;

            manager = entityManagerFactory.createEntityManager();

            Session session = (Session) manager.getDelegate();
            Criteria criteria = session.createCriteria(classe);
            lista = criteria.list();
            return lista;

        }

        @Override
        public List<Empresa> listarEmpresaPorNome(String nome) {
            List<Empresa> lista = null;
            manager = entityManagerFactory.createEntityManager();
            Session session = (Session) manager.getDelegate();
            Criteria criteria = session.createCriteria(classe);
            criteria.add(Restrictions.eq("Nome", nome));
 
            return lista;

        }

        @Override
        public Empresa getPorId(int id) throws DAOException {
            Empresa e = null;
            manager = entityManagerFactory.createEntityManager();
            Session session = (Session) manager.getDelegate();
            Criteria criteria = session.createCriteria(classe);
            criteria.add(Restrictions.eq("id", id));
            e = (Empresa) criteria.uniqueResult();

            return e;
        }
    }
}
