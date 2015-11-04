/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.dao;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.modelo.Produto;
import br.com.lsi.ordemservico.util.PersistenceUtil;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;




/**
 *
 * @author Onismar
 */
public class ProdutoDAO extends DAOGeneric<Produto> implements IProdutoDAO{
    
    
  
    private EntityManager manager;

    @Override
    public Produto buscarPorNome(String nome) throws DAOException {
            
        Session sessoa = PersistenceUtil.getSessionFactory().openSession();
        
        Produto p = null;
        try{
            
            sessoa.getTransaction().begin();
            Criteria criteria = sessoa.createCriteria(Produto.class);
            criteria.add(Restrictions.eq("nome", nome));
            p = (Produto) criteria.uniqueResult();
        }catch (Exception e){
            sessoa.getTransaction().rollback();
            e.printStackTrace();
            throw new DAOException("Erro ao pesquisar por nome");
        }finally{
           sessoa.close();
        }
      return p;
        
      
        
        
    }
    
    
    
    
}
