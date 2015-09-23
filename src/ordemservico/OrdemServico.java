///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ordemservico;
//
//import br.com.lsi.ordemservico.commom.exception.DAOException;
//import br.com.lsi.ordemservico.dao.EquipamentoDAO;
//import br.com.lsi.ordemservico.fachada.Fachada;
//import br.com.lsi.ordemservico.modelo.Empresa;
//import br.com.lsi.ordemservico.modelo.Equipamento;
//import br.com.lsi.ordemservico.modelo.Funcionario;
//import br.com.lsi.ordemservico.modelo.Produto;
//import java.awt.Menu;
//import java.util.Scanner;
//
///**
// *
// * @author Alan Santos Diniz
// */
//public class OrdemServico {
//
//    public static int Menu() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Menu");
//        System.out.println("1 - CRUD FUNCIONARIO");
//        System.out.println("2 - CRUD EMPRESA");
//        System.out.println("3 - CRUD EQUIPAMENTO");
//        System.out.println("4 - CRUD PRODUTO");
//        System.out.println("0 - SAIR");
//        int op;
//        return op = sc.nextInt();
//
//    }
//
//    public static int menuGenerico() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("1 - ADICIONAR");
//        System.out.println("2 - BUSCAR");
//        System.out.println("3 - DELETAR");
//        System.out.println("4 - LISTAR");
//        System.out.println("0 - SAIR");
//        int op;
//        return op = sc.nextInt();
//
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) throws DAOException {
//
//        Fachada fachada = new Fachada();
//
//        // testeDao teste = new testeDao();
////        new Thread(teste).start();
////        equipamento = daoEq.getById(Long.parseLong("1"));
////        daoEq.deletar(equipamento);
////             Equipamento equipamento = new Equipamento();
////                        equipamento.setDescricao("note2222");
////                        equipamento.setModelo("DESCONHECIDO");
////                        equipamento.setNumSerie(32423);
////                        Thread.sleep(2000);
////                        System.out.println("SALVANDO NOVO EQUIPAMENTO");
////                        fachada.businessEquipamento.salvarOuAtualizar(equipamento);
////         Funcionario func = new Funcionario();
////         func.setNome("Alan");
////         fachada.salvarFuncionarios(func);
////         
////         
////         Empresa empre = new Empresa();
////         empre.setCNPJ("123");
////         fachada.salvarEmpresas(empre);
////         
////         Produto p = new Produto();
////         p.setNome("feijão");
////         fachada.salvarProdutos(p);
//        Scanner sc = new Scanner(System.in);
//
//        int op = 0;
//        op = Menu();
//        while (op != 0) {
//            switch (op) {
//                case 1: {
//                    System.out.println("FUNCIONARIO");
//                    while(menuGenerico()!=0){
//                        
//                        switch(menuGenerico()){
//                            case 1:{
//                                System.out.println("ADICIONAR");
//                                
//                                break;
//                                
//                            }
//                            case 2:{
//                                System.out.println("BUSCAR");
//                                break;
//                                
//                                
//                            }
//                            case 3:{
//                                 System.out.println("DELETAR");
//                                break;
//                                
//                            }
//                            case 4:{
//                                break;
//                                
//                            }
//                            
//                        }
//                        
//                        
//                          menuGenerico();
//                          
//                        
//                    }
//                  
//                    break;
//                }
//                case 2: {
//                    System.out.println("EMPRESA");
//                    menuGenerico();
//                    break;
//                }
//                case 3: {
//                    System.out.println("EQUIPAMENTO");
//                    menuGenerico();
//                    break;
//                }
//                case 4: {
//                    System.out.println("PRODUTO");
//                    menuGenerico();
//                    break;
//                }
//            }
//            op = Menu();
//        }
//
//    }
//
//}
