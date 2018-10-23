/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managment;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author manshusharma
 */
public class RetriveDataOfPost {
    
    
 
        
    private String post ;
    private String image ;
    private Integer id ;
    private Date date;    

        
    private  ArrayList<String> list1 = new ArrayList<String>();


 
        
        
    public RetriveDataOfPost() {
    
    }   
    
    


    RetriveDataOfPost(String post, String images, Date dates, Integer id) {
            this.post = post;
            this.image = image;
            this.id = id;
            this.date = date; 
    }
        
    public ArrayList<String> getList1() {
        return list1;
    }

    public void setList1(ArrayList<String> list1) {
        this.list1 = list1;
    }    RetriveDataOfPost(ArrayList<String> list1){
    
        this.list1=list1;
    }         
        
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
