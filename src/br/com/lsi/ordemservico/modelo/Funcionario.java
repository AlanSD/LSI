/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.modelo;

import br.com.lsi.ordemservico.enuns.Sexo;
import java.io.Serializable;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;







/**
 *
 * @author Alan Santos Diniz
 */
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Funcionario extends Pessoa implements Serializable{
    
  
    private String funcao;
   

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

 


    
    

}
