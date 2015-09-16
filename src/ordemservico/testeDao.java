/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemservico;

import br.com.lsi.ordemservico.fachada.Fachada;
import br.com.lsi.ordemservico.modelo.Equipamento;

/**
 *
 * @author Alan Santos Diniz
 */
public class testeDao implements Runnable{

    Fachada fachada = new Fachada();
    

    public void teste() {

        new Thread() {

            @Override
            public void run() {
                try {
                    while (true) {
                        Equipamento equipamento = new Equipamento();
                        equipamento.setDescricao("note2222");
                        equipamento.setModelo("DESCONHECIDO");
                        equipamento.setNumSerie(32423);
                        Thread.sleep(2000);
                        System.out.println("SALVANDO NOVO EQUIPAMENTO");
                       // fachada.businessEquipamento.salvarOuAtualizar(equipamento);

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }.start();
    }

    @Override
    public void run() {
            }
}
