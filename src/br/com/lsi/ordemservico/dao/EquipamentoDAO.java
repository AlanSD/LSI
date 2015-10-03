/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.dao;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.interfac.IDAOEquipamento;
import br.com.lsi.ordemservico.modelo.Equipamento;
import br.com.lsi.ordemservico.util.PersistenceUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Alan Santos Diniz
 */
public class EquipamentoDAO extends DAOGeneric<Equipamento> implements IDAOEquipamento{
     @Override
    public List<Equipamento> buscaPorNome(String nome) throws DAOException {
        List<Equipamento> lista = new ArrayList<>();
        Session sessoa = PersistenceUtil.getSessionFactory().openSession();
        try {
            sessoa.getTransaction().begin();
            Criteria criteria = sessoa.createCriteria(Equipamento.class);
            criteria.add(Restrictions.like("descricao", nome, MatchMode.ANYWHERE));
            lista = criteria.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException("Erro ao buscar por Descrição no BD");
        } finally {
            sessoa.close();
        }
        return lista;
    }
}
