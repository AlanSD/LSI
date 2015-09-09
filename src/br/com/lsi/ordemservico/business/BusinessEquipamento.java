/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.business;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.dao.DAOEquipamento;
import br.com.lsi.ordemservico.modelo.Equipamento;
import java.util.List;

/**
 *
 * @author Alan Santos Diniz
 */
public class BusinessEquipamento {

    DAOEquipamento daoEquipamento;

    public BusinessEquipamento() {
        daoEquipamento = new DAOEquipamento();
    }
    
    public void salvarOuAtualizar (Equipamento eq) throws DAOException{
        if(eq.getEquipamentoId() == null){
            ////VALIDAÇÕES VEM AQUI
            daoEquipamento.salvar(eq);
        }else{
            daoEquipamento.atualizar(eq);

        }
    }
    
    public void deletar (Equipamento eq) throws DAOException{
        daoEquipamento.deletar(eq);
    }
    
    public Equipamento getById (Long id) throws DAOException{
        return daoEquipamento.getById(id);
    }
    
    public List<Equipamento> getAll () throws DAOException{
      return daoEquipamento.getAll();
    }

}
