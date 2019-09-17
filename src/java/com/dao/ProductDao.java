/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Parvez;
import com.model.Userlogin;

import java.util.ArrayList;
import java.util.List;
;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDao {
    SessionFactory sessionfactiory =HibernateUtil.getSessionFactory();
    public List<Parvez> getproducts(){
        List<Parvez>lists = new ArrayList<>();
        Session sess = sessionfactiory.openSession();
        Query query =sess.createQuery("From Parvez");
        lists = query.list();
        return lists;
    }
    public Parvez getProductById(int id){
        Parvez p = new Parvez();
        Session sess = sessionfactiory.openSession();
        Query query = sess.createQuery("From Product p where p.id= :productId");
        query.setParameter("productId", id);
        for(Object p1:query.list()){
            p = (Parvez) p1;
        }
        return p;
    }
    public void insert(Parvez p){
        Session sess = sessionfactiory.openSession();
        sess.beginTransaction();
        sess.getTransaction();
        sess.save(p);
        sess.getTransaction().commit();
        sess.close();
    }
     public List<Parvez> getAllEmps() {
         SessionFactory sessionFac = HibernateUtil.getSessionFactory();
        List<Parvez> emps = new ArrayList<>();
        Session sess = sessionFac.openSession();
        Query query = sess.createQuery("From Parvez");
        emps = query.list();
//        for(Employee e: emps) {
//            emps.add(e);
//        }
        sess.close();
        return emps;
    }
     SessionFactory sessionfac= HibernateUtil.getSessionFactory();
      public boolean login (String email,String password){
       boolean result=false;
       Session sess=sessionfac.openSession();
       Query query = sess.createQuery("From Userlogin  u where u.email= :em AND "+"u.password= :pass");
       query.setParameter("em",email);
       query.setParameter("pass",password);
       List<Userlogin> lists=query.list();
       
       for(Userlogin log: lists){
           result=true;
       }
       sess.close();
       return result;
   }  

   
   public List<Userlogin> getAll(){
       List<Userlogin> ul = new ArrayList<>();
       Session sess = sessionfac.openSession();
       Query query = sess.createQuery("From Userlogin");
       ul= query.list();
//       for(Userlogin u:ul){
//           ul.add(u);
//       }
       sess.close();
       return ul;
   }
   
       public void  signUp(Userlogin ul) {
       boolean result = false;
       Session sess = sessionfac.openSession();
       sess.beginTransaction();
       sess.save(ul);
       sess.getTransaction().commit();
       sess.close();
    }

    
}
