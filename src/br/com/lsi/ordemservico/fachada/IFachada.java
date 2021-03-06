/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.fachada;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.modelo.Cidade;
import br.com.lsi.ordemservico.modelo.Cliente;
import br.com.lsi.ordemservico.modelo.Empresa;
import br.com.lsi.ordemservico.modelo.Equipamento;
import br.com.lsi.ordemservico.modelo.Funcionario;
import br.com.lsi.ordemservico.modelo.Marca;
import br.com.lsi.ordemservico.modelo.Produto;
import br.com.lsi.ordemservico.modelo.Servico;
import java.util.List;

/**
 *
 * @author Onismar
 */
public interface IFachada {

    //------------------------------funcionario------------------------------//
    public void salvarFuncionarios(Funcionario f) throws DAOException;

    public void atualizarFuncionarios(Funcionario f) throws DAOException;

    public void deletarFuncionarios(Funcionario f) throws DAOException;

    public Funcionario getByIdFuncionarios(Long id) throws DAOException;

    public List<Funcionario> getAllFuncionarios() throws DAOException;

    //------------------------------Clientes------------------------------//
    public void salvarClientes(Cliente c) throws DAOException;

    public void atualizarClientes(Cliente c) throws DAOException;

    public void deletarClientes(Cliente c) throws DAOException;

    public Cliente getByIdClientes(Long id) throws DAOException;

    public List<Cliente> getAllClientes() throws DAOException;

    //-------------------------------Cidade----------------------------------------//
    public void salvarCidade(Cidade c) throws DAOException;

    public void atualizarCidade(Cidade c) throws DAOException;

    public void deletarCidade(Cidade c) throws DAOException;

    public Cidade getByIdCidade(Long id) throws DAOException;

    public List<Cidade> getAllCidade() throws DAOException;
    
     public List<Cidade> getCidadePorEstado(String uf) throws DAOException ;
    
    //-------------------------Empresa----------------------------------------//
    public void salvarEmpresas(Empresa e) throws DAOException;

    public Empresa buscarPorCNPJ(String cnpj) throws DAOException;

    public void atualizarEmpresas(Empresa e) throws DAOException;

    public void deletarEmpresas(Empresa e) throws DAOException;

    public Empresa getByIdEmpresas(Long id) throws DAOException;

    public List<Empresa> getAllEmpresas() throws DAOException;

    //-------------------------Produto----------------------------------------//
    public void salvarProdutos(Produto p) throws DAOException;

    public Produto buscarPorNomeProduto(String nome) throws DAOException;

    public void atualizarProdutos(Produto p) throws DAOException;

    public void deletarProdutos(Produto p) throws DAOException;

    public Produto getByIdProdutos(Long id) throws DAOException;

    public List<Produto> getAllProdutos() throws DAOException;

    //-------------------------Servico-------------------------------------------//  
    public void salvarServicos(Servico eq) throws DAOException;

    public void atualizarServicos(Servico eq) throws DAOException;

    public void deletarServicos(Servico eq) throws DAOException;

    public Servico getByIdServicos(Long id) throws DAOException;

    public List<Servico> getAllServicos() throws DAOException;

    //-----------------------Equipamento------------------------------------------//  
    public void salvarEquipamentos(Equipamento eq) throws DAOException;

    public void atualizarEquipamentos(Equipamento eq) throws DAOException;

    public void deletarEquipamentos(Equipamento eq) throws DAOException;

    public Equipamento getByIdEquipamentos(Long id) throws DAOException;

    public List<Equipamento> getAllEquipamentos() throws DAOException;

    public List<Equipamento> buscarPorDescricao(String nome) throws DAOException;

    //-----------------------MARCA------------------------------------------//  

    public void salvarMarca(Marca m) throws DAOException;

    public void atualizarMarca(Marca m) throws DAOException;

    public void deletarMarca(Marca m) throws DAOException;

    public Marca getByIdMarca(Long id) throws DAOException;

    public List<Marca> getAllMarca() throws DAOException;

}
