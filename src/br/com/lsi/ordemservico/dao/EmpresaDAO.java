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



    public class EmpresaDAO extends DAOGeneric<Empresa> implements IEmpresaDAO {
        
        private EntityManager manager;

        @Override
        public Empresa buscarPorCNPJ(String cnpj) throws DAOException {

            Empresa e = null;
            manager = this.getEntityManeger();
            Criteria criteria = this.getCriteria();
            criteria.add(Restrictions.eq("cnpj", cnpj));
            e = (Empresa) criteria.uniqueResult();
            return e;
        }

        
    }
