/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.ProductDao;
import com.model.Parvez;
import com.model.Userlogin;
import java.util.ArrayList;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped

public class ProductController {
     List<Parvez> ParvezTableData = new ArrayList<>();
    List<Parvez> productList = new ArrayList<>();
    
    Userlogin ul = new Userlogin();
    
    String name;
    int qty;
    Float price;
    String self;
    String date;
    String search;
    String email;
    String pass;
    String gender;
    int phone;
    
    
    public String add(){
        int id = Integer.parseInt(search.split("-")[0]);
        for (Parvez p: productList) {
            
            if(p.getId() == id) {
                System.out.println("ID ------ "+p.getId()+"-"+id);
                ParvezTableData.add(p);
            }
        }
//        employeeTableData.add(employeeList.g)
        return "";
    }
    
     public List<Parvez> selectedEmps() {
        return ParvezTableData;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<Parvez> getProductList() {
        return productList;
    }
    public void setProductList(List<Parvez> productList) {
        this.productList = productList;
    }

    public Userlogin getUl() {
        return ul;
    }

    public void setUl(Userlogin ul) {
        this.ul = ul;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
@PostConstruct
    public void inti() {
        productList = dao.getAllEmps();
//        System.out.println("---- size "+productList.size());
    }
    public List<String> testCompleteMethod(String input) {
//        System.out.println("------ "+input);
        List<String> suggesstions = new ArrayList<>();
        for(Parvez e: productList) {
            if(!e.getName().isEmpty() && e.getName().toLowerCase().contains(input.toLowerCase())) {
                suggesstions.add(e.getId()+"-"+e.getName());
            }
        }
        return suggesstions;
    }
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

  

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    ProductDao dao =new ProductDao();

    public ProductDao getDao() {
        return dao;
    }

    public void setDao(ProductDao dao) {
        this.dao = dao;
    }
    
    
    public List<Parvez> productList(){
        List<Parvez> products=dao.getproducts();
                
      return products;       
    }
    public String productUrl(){
        
        
        return "addProduct";
    }
    public String addProduct(){
        dao.insert(new Parvez(name,self,date,qty,price));
        return "addProduct";
    }
     public String back(){
        
        return "menu";
    }
      public String view(){
        
        return "allPro";
    }
       public String sell(){
        
        return "selling";
    }
        public String signup(){
        
        ul.setEmail(email);
        ul.setPassword(pass);
        ul.setName(name);
        ul.setGender(gender);
        ul.setPhone(phone);
        dao.signUp(ul);
        
      return "login";
    }
    
      public String login() {
          
        boolean respose = dao.login(email, pass);
        if(respose) {
            
            return "menu";
        }
        return "login";
    }
      
     
     
}
