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
    
    FORNECEDOR("FORNECEDOR"),
    CLIENTE("CLIENTE");
    
    private String tipoEmpresa;
    
    private TipoEmpresa(String empresa){
        this.tipoEmpresa = empresa;
    }

    public static TipoEmpresa getFORNECEDOR() {
        return FORNECEDOR;
    }

    public static TipoEmpresa getCLIENTE() {
        return CLIENTE;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }
  
    
    
}
