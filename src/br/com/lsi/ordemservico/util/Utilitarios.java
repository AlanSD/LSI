/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.util;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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


    




    }



