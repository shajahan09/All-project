/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;


/**
 *
 * @author HP
 */
@ManagedBean(name="type")
public class test {
    private String age;
    String name;
    String email;
    String pass;
    String gen;
    String hobby;
    String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public List<String> ages(String input){
      List<String> items = new ArrayList<>();
      List<String> matchItems = new ArrayList<>();   
      items.add("napa");
      items.add("sirap");
      items.add("016");
      items.add("017");
      items.add("013");
      items.add("014");
      items.add("015");
      for(String age: items){
          if(age.contains(input)){
          matchItems.add(age);
          }
      }
      return matchItems;
    }
    public String submit(){
        
        return "signup";
    }
   public String back(){
        
        return "login";
    }
   public String res(){
        
        return "result";
    }
   public String bk(){
        
        return "signup";
    }
   public String bck(){
        
        return "menu";
    }
   public String sel(){
        
        return "selling";
    }
   public String selPer(){
        
        return "sel_per";
    }
    
   
  
}
