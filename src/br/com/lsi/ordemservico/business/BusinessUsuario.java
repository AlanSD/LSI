/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.business;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.dao.DaoUsuario;
import br.com.lsi.ordemservico.enuns.Nivel;
import br.com.lsi.ordemservico.modelo.Usuario;
import br.com.lsi.ordemservico.validation.Validation;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Allan
 */
public class BusinessUsuario {

    private final DaoUsuario daoUsuario;
    private Usuario usuario;

    public BusinessUsuario() {
        daoUsuario = new DaoUsuario();
        usuario = new Usuario();
    }

    public void salvarOuAtualizar(Usuario usuario) throws DAOException {

        if (usuario.getId() == null) {
            daoUsuario.salvar(usuario);
        } else {
            daoUsuario.atualizar(usuario);
        }
    }

    public void deletar(Usuario usuario) throws DAOException {
        daoUsuario.deletar(usuario);
    }

    public Usuario getById(Long id) throws DAOException {
        return daoUsuario.getById(id);
    }

    public List<Usuario> getAll() throws DAOException {
        return daoUsuario.getAll();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean testaUsuario(String nome, String senha) throws DAOException {
        List<Usuario> lista = daoUsuario.getAll().stream()
                .filter(usu -> usu.getUsuarioNome().equalsIgnoreCase(nome)
                        && usu.getUsuarioSenha().equalsIgnoreCase(senha)).collect(Collectors.toList());
        if (lista.size() > 0) {
            usuario = lista.get(0);
            Validation.setUsuario(usuario);
            return true;
        }
        return false;
    }

    public void insereUsuarioMaster() throws DAOException {
        Usuario u = new Usuario();
        u.setUsuarioNome("master");
        u.setUsuarioSenha("123");
        u.setNivel(Nivel.MASTER);
        daoUsuario.salvar(u);
    }
}
