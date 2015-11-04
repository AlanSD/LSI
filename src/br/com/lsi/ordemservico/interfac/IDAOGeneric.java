/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.interfac;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;


/**
 *
 * @author Allan
 */
public interface IDAOGeneric<T> {

    public void salvar(T t) throws DAOException;

    public void atualizar(T t) throws DAOException;

    public void deletar(T t) throws DAOException;

    public T getById(Long id) throws DAOException;

    public List<T> getAll() throws DAOException;

   
}
