/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemservico;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.dao.DAOEquipamento;
import br.com.lsi.ordemservico.fachada.Fachada;
import br.com.lsi.ordemservico.modelo.Equipamento;

/**
 *
 * @author Alan Santos Diniz
 */
public class OrdemServico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException {
        
        Fachada fachada = new  Fachada();
        Equipamento equipamento = new Equipamento();
        
        equipamento.setDescricao("note2222");
        equipamento.setModelo("DESCONHECIDO");
        equipamento.setNumSerie(32423);
        
        fachada.businessEquipamento.salvarOuAtualizar(equipamento);
//        equipamento = daoEq.getById(Long.parseLong("1"));
//        daoEq.deletar(equipamento);
    }
    
}
