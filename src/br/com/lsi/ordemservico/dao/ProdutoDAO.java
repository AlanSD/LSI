/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.dao;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.modelo.Produto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;



/**
 *
 * @author Onismar
 */
public class ProdutoDAO extends DAOGeneric<Produto> implements IProdutoDAO{
    
    
  
    private EntityManager manager;

    @Override
    public Produto buscarPorNome(String nome) throws DAOException {
              Produto p = null;
        try{
            manager = this.getEntityManeger();
            Criteria criteria = this.getCriteria();
            criteria.add(Restrictions.eq("nome", nome));
            p = (Produto) criteria.uniqueResult();
        }catch (Exception e){
            manager.getTransaction().rollback();
            e.printStackTrace();
            throw new DAOException("Erro ao pesquisar por nome");
        }finally{
            manager.close();
        }
      return p;
        
      
        
        
    }
    
    
    
    
}
