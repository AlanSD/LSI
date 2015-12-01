/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.dao;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.modelo.Cidade;
import br.com.lsi.ordemservico.util.PersistenceUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Alan Santos Diniz
 */
public class CidadeDAO extends DAOGeneric<Cidade> implements ICidadeDAO {

    private Class classe;

    public CidadeDAO() {
        this.classe = (Class<Cidade>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public List<Cidade> getCidadePorEstado(String uf) throws DAOException {
        List<Cidade> lista = null;
        Session sessao = PersistenceUtil.getSessionFactory().openSession();
        try {
            sessao.getTransaction().begin();
            Criteria criteria = sessao.createCriteria(classe);
            criteria.add(Restrictions.eq("estado", uf));
            lista = criteria.list();

        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException("Erro ao buscar listar no BD");
        } finally {
            sessao.close();
        }

        return lista;

    }

}
