/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.enuns;

/**
 *
 * @author Alan Santos Diniz
 */
public enum Sexo {
    
    MASCULINO("MASCULINO"),
    FEMENINO("FEMINI");
    
    private String sexo;
    
    private Sexo(String sexo){
        this.sexo = sexo;
    }
    
    
}
