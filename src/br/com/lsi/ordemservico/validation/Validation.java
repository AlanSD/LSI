/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.validation;

import br.com.lsi.ordemservico.modelo.Usuario;
import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    
      public static Usuario usuario;


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
    

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        Validation.usuario = usuario;
    }
    
    public static String criptografia(String original)  
    {  
        String senha = null;  
        MessageDigest algoritmo;  
        byte messageDigest[];  
        StringBuilder hexString;  
        try {  
            algoritmo = MessageDigest.getInstance("MD5");
            messageDigest = algoritmo.digest(original.getBytes("UTF-8"));  
            hexString = new StringBuilder();  
            for (byte b : messageDigest) {  
                hexString.append(String.format("%02X", 0xFF & b));  
            }  
            senha = hexString.toString();  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        System.out.println("Senha normal: "+original+" - Senha criptografada: "+senha);  
        return senha;  
    }  
    
    
    public static void main(String args[]){
        Validation.criptografia("allan");
    }

}
