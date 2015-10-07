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
public enum Operadora {
    
    CLARO("CLARO"),
    TIM("TIM"),
    VIVO("VIVO"),
    OI("OI");
    
    private String operadora;

    private Operadora(String operadora) {
        this.operadora = operadora;
    }
    
    
}
