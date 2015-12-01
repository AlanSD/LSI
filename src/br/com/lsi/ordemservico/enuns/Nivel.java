/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.enuns;

/**
 *
 * @author Allan
 */
public enum Nivel {
    
    MASTER("MASTER"),
    ADMIN("ADMIN"),
    USUARIO("USUARIO");
    
    private String nivel;
    
     private Nivel(String nivel){
        this.nivel = nivel;
    }
    
}
