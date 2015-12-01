/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemservico;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.dao.CidadeDAO;
import br.com.lsi.ordemservico.dao.ClienteDAO;
import br.com.lsi.ordemservico.dao.EquipamentoDAO;
import br.com.lsi.ordemservico.fachada.Fachada;
import br.com.lsi.ordemservico.modelo.Cidade;
import br.com.lsi.ordemservico.modelo.Cliente;
import br.com.lsi.ordemservico.modelo.Contato;
import br.com.lsi.ordemservico.modelo.Empresa;
import br.com.lsi.ordemservico.modelo.Equipamento;
import br.com.lsi.ordemservico.modelo.Funcionario;
import br.com.lsi.ordemservico.modelo.Produto;
import br.com.lsi.ordemservico.util.Utilitarios;
import java.awt.Menu;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import jxl.Cell;
import jxl.NumberCell;

import jxl.Sheet;

import jxl.Workbook;

import jxl.read.biff.BiffException;

import javax.swing.JOptionPane;
import javax.swing.SpringLayout;



/**
 *
 * @author Alan Santos Diniz
 */
public class OrdemServico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DAOException, IOException, BiffException {
//        List<Contato> lista = new ArrayList<Contato>();
//      ClienteDAO dao = new ClienteDAO();
//      long id = 32768;
//      Cliente c = new Cliente();
//      
//    c = dao.getById(id);
//       lista = dao.buscarContatosDoCliente(id);
//        System.out.println(lista);

//        Workbook workbook = Workbook.getWorkbook(new File("src//munic.xls"));
//        Sheet sheet = workbook.getSheet(0);
//
//        int linhas = sheet.getRows();
//
//        System.out.println("Iniciando a leitura da planilha XLS:");
//
//        for (int i = 0; i < linhas; i++) {
//            Cell a1 = sheet.getCell(0, i);
//
//            Cell a2 = sheet.getCell(1, i);
//
//            Cell a3 = sheet.getCell(2, i);
//
//            String as1 = a1.getContents();
//
//            String as2 = a2.getContents();
//
//            String as3 = a3.getContents();
//            System.out.println("Coluna 1: " + as1);
//
//            System.out.println("Coluna 2: " + as2);
//
//            System.out.println("Coluna 3: " + as3);
//
//        }
//        workbook.close();
        
//         List<Cidade> lista = new ArrayList<Cidade>();
//           Utilitarios utilitarios = new Utilitarios();
//           lista = utilitarios.LerCidadesEstadosNoArquivo();
//           System.out.println(lista.toString());   
        
//        CidadeDAO dao = new CidadeDAO();
//       List<Cidade> lista = new ArrayList<Cidade>();
//       lista = dao.getCidadePorEstado("PE");
//   
//        System.out.println(lista.toString());
    }

}
