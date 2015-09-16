/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemservico;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.dao.EquipamentoDAO;
import br.com.lsi.ordemservico.fachada.Fachada;
import br.com.lsi.ordemservico.modelo.Equipamento;
import br.com.lsi.ordemservico.modelo.Funcionario;

/**
 *
 * @author Alan Santos Diniz
 */
public class OrdemServico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException {
        
         Fachada fachada = new Fachada();
     // testeDao teste = new testeDao();
//        new Thread(teste).start();
     
//        equipamento = daoEq.getById(Long.parseLong("1"));
//        daoEq.deletar(equipamento);
        
//             Equipamento equipamento = new Equipamento();
//                        equipamento.setDescricao("note2222");
//                        equipamento.setModelo("DESCONHECIDO");
//                        equipamento.setNumSerie(32423);
//                        Thread.sleep(2000);
//                        System.out.println("SALVANDO NOVO EQUIPAMENTO");
//                        fachada.businessEquipamento.salvarOuAtualizar(equipamento);
         
         Funcionario func = new Funcionario();
         func.setNome("Alan");
         fachada.salvarFuncionarios(func);

    }

  

}
