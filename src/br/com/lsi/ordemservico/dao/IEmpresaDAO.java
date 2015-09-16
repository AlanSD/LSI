/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.dao;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.modelo.Empresa;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IEmpresaDAO {

    public void inserir(Empresa e) throws DAOException;

    public void editar(Empresa e) throws DAOException;

    public void remover(int id) throws DAOException;

    public List<Empresa> listarEmpresa() throws DAOException;

    public List<Empresa> listarEmpresaPorNome(String nome) throws DAOException;

    public Empresa getPorId(int id) throws DAOException;

}
