/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.interfac;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.modelo.Equipamento;
import java.util.List;

/**
 *
 * @author Alan Santos Diniz
 */
public interface IDAOEquipamento extends IDAOGeneric<Equipamento>{
    public List<Equipamento> buscaPorNome(String nome) throws DAOException;
}
