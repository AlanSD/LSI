/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.dao;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.modelo.Empresa;
import br.com.lsi.ordemservico.util.PersistenceUtil;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class EmpresaDAO extends DAOGeneric<Empresa> implements IEmpresaDAO {

    private EntityManager manager;

    @Override
    public Empresa buscarPorCNPJ(String cnpj) throws DAOException {
        
        Session sessoa = PersistenceUtil.getSessionFactory().openSession();
        Empresa e = null;
        sessoa.getTransaction().begin();
        Criteria criteria = sessoa.createCriteria(Empresa.class);
        criteria.add(Restrictions.eq("cnpj", cnpj));
        e = (Empresa) criteria.uniqueResult();
        return e;
    }

}
