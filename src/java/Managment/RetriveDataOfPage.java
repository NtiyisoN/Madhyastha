/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managment;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author manshusharma
 */
public class RetriveDataOfPage {
    
    
        
    private long number ;

    private String name ;
        
    private Date date;     

    private String category ;
    
    private String cover ;

        
    private String profile ;

            
    private String quote ;

     
           
    private  ArrayList<String> list1 = new ArrayList<String>();

    public RetriveDataOfPage() {
    
    }   
    
    RetriveDataOfPage(long number,String name, Date date,String category,String cover,String profile,String quote) {
            this.number = number;
            this.name = name;
            this.date = date;
            this.category = category;
            this.cover = cover;
            this.profile = profile;
            this.quote = quote;

    }    



   

    RetriveDataOfPage(ArrayList list1) {
        this.list1=list1;
    }
    
        
    RetriveDataOfPage(long number) {
            this.number = number;
    }  

    public ArrayList<String> getList1() {
        return list1;
    }

    public void setList1(ArrayList<String> list1) {
        this.list1 = list1;
    }
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }


    
}
