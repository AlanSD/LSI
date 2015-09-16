/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.fachada;

import br.com.lsi.ordemservico.business.BusinessEquipamento;
import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.dao.EmpresaDAO;
import br.com.lsi.ordemservico.dao.EquipamentoDAO;
import br.com.lsi.ordemservico.dao.FuncionarioDAO;
import br.com.lsi.ordemservico.dao.IEmpresaDAO;
import br.com.lsi.ordemservico.dao.IFuncionario;
import br.com.lsi.ordemservico.dao.IProdutoDAO;
import br.com.lsi.ordemservico.dao.IServicoDAO;
import br.com.lsi.ordemservico.dao.ProdutoDAO;
import br.com.lsi.ordemservico.dao.ServicoDAO;
import br.com.lsi.ordemservico.interfac.IDAOEquipamento;
import br.com.lsi.ordemservico.modelo.Empresa;
import br.com.lsi.ordemservico.modelo.Equipamento;
import br.com.lsi.ordemservico.modelo.Funcionario;
import br.com.lsi.ordemservico.modelo.Produto;
import br.com.lsi.ordemservico.modelo.Servico;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alan Santos Diniz
 */
public class Fachada implements IFachada {

    private IFuncionario daoFun;
    private IEmpresaDAO daoEmp;
    private IProdutoDAO daoPro;
    private IServicoDAO daoSer;
    private IDAOEquipamento daoEq;

    public Fachada() {
        this.daoFun = new FuncionarioDAO();
        this.daoEmp = new EmpresaDAO();
        this.daoPro = new ProdutoDAO();
        this.daoSer = new ServicoDAO();
        this.daoEq = new EquipamentoDAO();

    }
//---------------------------Funcionario--------------------------------------------------

    @Override
    public void salvarFuncionarios(Funcionario f) throws DAOException {
        daoFun.salvar(f);

    }

    @Override
    public void atualizarFuncionarios(Funcionario f) throws DAOException {

        daoFun.atualizar(f);

    }

    @Override
    public void deletarFuncionarios(Funcionario f) throws DAOException {

        daoFun.deletar(f);

    }

    @Override
    public Funcionario getByIdFuncionarios(Long id) throws DAOException {

        return daoFun.getById(id);

    }

    @Override
    public List<Funcionario> getAllFuncionarios() throws DAOException {

        return daoFun.getAll();

    }
//---------------------------------------Empresa------------------------------------------------------------------

    @Override
    public void salvarEmpresas(Empresa e) throws DAOException {

        daoEmp.salvar(e);

    }

    @Override
    public Empresa buscarPorCNPJ(String cnpj) throws DAOException {

       return daoEmp.buscarPorCNPJ(cnpj);
        
    }

    @Override
    public void atualizarEmpresas(Empresa e) throws DAOException{
        daoEmp.atualizar(e);
        
    }

    @Override
    public void deletarEmpresas(Empresa e) throws DAOException{
      daoEmp.deletar(e);
    }

    @Override
    public Empresa getByIdEmpresas(Long id)throws DAOException{
        return daoEmp.getById(id);

    }

    @Override
    public List<Empresa> getAllEmpresas()throws DAOException {
        return  daoEmp.getAll();
    }
//-------------------------Produto----------------------------------------------//
    @Override
    public void salvarProdutos(Produto p) throws DAOException{
        daoPro.salvar(p);
    }

    @Override
    public Produto buscarPorNomeProduto(String nome) throws DAOException{
        return daoPro.buscarPorNome(nome);
    }

    @Override
    public void atualizarProdutos(Produto p) throws DAOException{
        daoPro.atualizar(p);
        }

    @Override
    public void deletarProdutos(Produto p)throws DAOException {
        daoPro.deletar(p);
    }

    @Override
    public Produto getByIdProdutos(Long id) throws DAOException{
        return daoPro.getById(id);
    }

    @Override
    public List<Produto> getAllProdutos() throws DAOException{
        return daoPro.getAll();
    }
//------------------------Servico-----------------------------------------------//
    @Override
    public void salvarServicos(Servico eq) throws DAOException{
        daoSer.salvar(eq);
    }

    @Override
    public void atualizarServicos(Servico eq) throws DAOException{
        daoSer.atualizar(eq);
    }

    @Override
    public void deletarServicos(Servico eq) throws DAOException{
         daoSer.deletar(eq);
    }

    @Override
    public Servico getByIdServicos(Long id)throws DAOException {
        return  daoSer.getById(id);
    }

    @Override
    public List<Servico> getAllServicos() throws DAOException{
        return  daoSer.getAll();
    }
//--------------------------Equipamento--------------------------------------------//
    @Override
    public void salvarEquipamentos(Equipamento eq)throws DAOException {
        daoEq.salvar(eq);
        
    }

    @Override
    public void atualizarEquipamentos(Equipamento eq)throws DAOException {
        daoEq.atualizar(eq);

    }

    @Override
    public void deletarEquipamentos(Equipamento eq) throws DAOException{
        daoEq.deletar(eq);

    }

    @Override
    public Equipamento getByIdEquipamentos(Long id)throws DAOException {
        return daoEq.getById(id);

    }

    @Override
    public List<Equipamento> getAllEquipamentos()throws DAOException {
        return daoEq.getAll();
        

    }

   //public final BusinessEquipamento businessEquipamento = new BusinessEquipamento();;
}
