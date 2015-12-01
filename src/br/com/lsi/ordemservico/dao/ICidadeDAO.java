/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.dao;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.interfac.IDAOGeneric;
import br.com.lsi.ordemservico.modelo.Cidade;
import java.util.List;

/**
 *
 * @author Alan Santos Diniz
 */
public interface ICidadeDAO extends IDAOGeneric<Cidade>{
     public List<Cidade> getCidadePorEstado(String uf) throws DAOException ;
}
