/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.validation;

import java.awt.Color;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalBorders;

/**
 *
 * @author Allan
 */
public class Validation {

    public static boolean campoObrigatorio(JTextField txt) {
        if (txt.getText().trim().equals("")) {
            txt.setBorder(new LineBorder(Color.RED));
            txt.requestFocus();
            return true;
        }
        txt.setBorder(MetalBorders.getTextFieldBorder());
        return false;
    }

    public static boolean campoObrigatorio(JTextField txt, JLabel lbl) {
        if (txt.getText().trim().equals("")) {
            lbl.setForeground(Color.RED);
            txt.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean validaTelaVisao(String nomeTela) {
        if (nomeTela.equals("dialog0")) {
            return true;
        }
        return false;
    }

    public static String validaData(Calendar cal) {
        Date d = cal.getTime();
        cal.setTime(d);
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        return df.format(cal.getTime());
    }

    public static boolean validaCpfOuCep(String txt) {
        if (!txt.equals("")) {
            try {
                int numero = Integer.parseInt(txt);
                return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Campos com valores incoreto CPF OU CEP");
                return false;
            }

        }else
            return true;
    }
}
