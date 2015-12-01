/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.util;

import br.com.lsi.ordemservico.modelo.Cidade;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author Alan Santos Diniz
 */
public class Utilitarios {

    public Calendar pasarStringParaCalendar(String dataString) {

        Date d = null;
        Calendar c = null;
        try {

            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            c = Calendar.getInstance();
            c.setTime(formatoData.parse(dataString));

        } catch (Exception e) {
            return null;
        }

        return c;
    }

    public String pasarCalendarParaString(Calendar dataCalendar) {
        String dataString = "";
        try {

            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            Calendar hoje = new GregorianCalendar();

            dataString = formatoData.format(hoje.getTime());

        } catch (Exception e) {
            return null;
        }
        return dataString;
    }

    public void SalvarCidadesEstadosDeArquivoNoBanco() {

        Workbook workbook;
        try {
            workbook = Workbook.getWorkbook(new File("src//munic.xls"));
            Sheet sheet = workbook.getSheet(0);

            int linhas = sheet.getRows();

            System.out.println("Iniciando a leitura da planilha XLS:");

            for (int i = 0; i < linhas; i++) {
                Cell a1 = sheet.getCell(0, i);

                Cell a2 = sheet.getCell(1, i);

                Cell a3 = sheet.getCell(2, i);

                String as1 = a1.getContents();

                String as2 = a2.getContents();

                String as3 = a3.getContents();
                System.out.println("Coluna 1: " + as1);

                System.out.println("Coluna 2: " + as2);

                System.out.println("Coluna 3: " + as3);

            }
            workbook.close();

        } catch (IOException ex) {
            Logger.getLogger(Utilitarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(Utilitarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Cidade> LerCidadesEstadosNoArquivo() {
        List<Cidade> listaCidade = new ArrayList<>();
        Workbook workbook;
        try {
            workbook = Workbook.getWorkbook(new File("src//munic.xls"));
            Sheet sheet = workbook.getSheet(0);

            int linhas = sheet.getRows();

            System.out.println("Iniciando a leitura da planilha XLS:");
         
            for (int i = 0; i < linhas; i++) {
                Cidade c = new Cidade();

                Cell a1 = sheet.getCell(0, i);

                Cell a2 = sheet.getCell(1, i);

                Cell a3 = sheet.getCell(2, i);

                if (i > 1) {
                    String as1 = a1.getContents();
                    String as2 = a2.getContents();
                    String as3 = a3.getContents();

                    c.setEstado(as1);
                    c.setCidade(as3);
                    listaCidade.add(c);

                 

                }

////            System.out.println("Coluna 1: " + as1);
//            System.out.println("Coluna 2: " + as2);
//            System.out.println("Coluna 3: " + as3);
            }
            workbook.close();

        } catch (IOException ex) {
            Logger.getLogger(Utilitarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(Utilitarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaCidade;

    }

}
