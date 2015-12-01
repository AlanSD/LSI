/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Onismar
 */
public class Caracter extends PlainDocument {

//    @Override
//    public void insertString (int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
//        //super.insertString(offset, str.replaceAll("[^0-9]",""), attr);
//       String texto = getText(0, getLength());
//        if(texto.length() < 7) {
//            remove(0, getLength());
//            StringBuffer strBuf = new StringBuffer(texto.replaceAll("[^0-9]","")
//                    + str);
//            if(strBuf.length() < 3) strBuf.insert(0, ",  ");
//            else strBuf.insert(strBuf.length() - 2, ",");
//            super.insertString(0, strBuf.toString(),attr);
//        }
//    }
//    
//    public void replace (int offset, String str, javax.swing.text.AttributeSet attr)throws BadLocationException{
//        super.insertString(offset, str.replaceAll("[^0-9]",""), attr);
//    }
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {

        String texto = getText(0, getLength());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return;
            }
        }

        if (texto.length() < 6) {
            super.remove(0, getLength());
            texto = texto.replace(".", "").replace(",", "");
            StringBuffer s = new StringBuffer(texto + str);

            if (s.length() > 0 && s.charAt(0) == '0') {
                s.deleteCharAt(0);
            }

            if (s.length() < 3) {
                if (s.length() < 1) {
                    s.insert(0, "000");
                } else if (s.length() < 2) {
                    s.insert(0, "00");
                } else {
                    s.insert(0, "0");
                }
            }

            s.insert(s.length() - 2, ",");

            if (s.length() > 6) {
                s.insert(s.length() - 6, ".");
            }

            if (s.length() > 10) {
                s.insert(s.length() - 10, ".");
            }

            super.insertString(0, s.toString(), a);
        }
    }

    public void remove(int offset, int length) throws BadLocationException {
        super.remove(offset, length);
        String texto = getText(0, getLength());
        texto = texto.replace(",", "");
        texto = texto.replace(".", "");
        super.remove(0, getLength());
        insertString(0, texto, null);
    }

}
