/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.enuns;

/**
 *
 * @author Usuario
 */
public enum TipoEmpresa {
    
    PESSOAFISICA("PESSOAFISICA"),
    PESSOAJURIDICA("PESSOAJURIDICA");
    
    private String tipoEmpresa;
    
    private TipoEmpresa(String empresa){
        this.tipoEmpresa = empresa;
    }

    public static TipoEmpresa getPESSOAFISICA() {
        return PESSOAFISICA;
    }

    public static TipoEmpresa getPESSOAJURIDICA() {
        return PESSOAJURIDICA;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }
    
    
    
    
}
