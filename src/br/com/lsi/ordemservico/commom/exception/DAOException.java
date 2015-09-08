/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.commom.exception;

/**
 *
 * @author win7
 */
public class DAOException extends Exception {
    
    public DAOException(String msg){
        super(msg);
    }
    
    public DAOException(Exception e){
        super(e);
    }
    
    public DAOException(String msg, Exception e){
        super(msg,e);
    }
}
