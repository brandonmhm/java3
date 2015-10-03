/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-107
 */
public class ProbarHibernate {
    public static void main(String[] args) throws Exception{
        System.out.println("Bienvenido a hibernate !!!");
        SessionFactory fuck= HibernateUtilidades.getSessionFactory();
         Session sesion=fuck.openSession();
         Transaction tranza= sesion.beginTransaction();
         Usuario u=new Usuario("Brandon", "Moises");
         //con esto guardamos un usuario
         sesion.save(u);
         tranza.commit();
         sesion.close();
         
         System.out.println("si se guardo!!!");
    }
    
}
