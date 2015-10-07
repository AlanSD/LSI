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
public class Funcionario extends Pessoa {
    
  
    private String nome,cpf;
    private Sexo sexo;
    private String funcao;
    
    @Temporal (TemporalType.TIMESTAMP)
    private Calendar dateAdimicao;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Calendar getDateAdimicao() {
        return dateAdimicao;
    }

    public void setDateAdimicao(Calendar dateAdimicao) {
        this.dateAdimicao = dateAdimicao;
    }
    
    

}
