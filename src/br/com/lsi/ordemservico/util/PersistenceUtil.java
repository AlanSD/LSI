/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Allan
 */
public class PersistenceUtil {
    
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory(){
        try{  
            return new Configuration().configure().buildSessionFactory();
        }catch(Throwable e){
            System.out.println("Criação inicial do objeto SessionFactory falhou." 
                    + "Erro: " + e);
            throw new ExceptionInInitializerError(e);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
    public static void closeSessionFactory(){
        if(sessionFactory != null)
            sessionFactory.close();
    }
}
