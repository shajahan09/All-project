/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import org.primefaces.context.RequestContext;





@ManagedBean(name="mylogin")
public class loginRes {
    
    String email;
    String pass;

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
     public String sbm(){
         
         
//        if(email.equals("parvez")&& pass.equals(123)){
//            
//          return "menu";
//          
//        }else{
//            
//            
//            RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(FacesMessage.SEVERITY_INFO, "Login", "Faild"));
//        }
        return "menu";
    
}
    
}
