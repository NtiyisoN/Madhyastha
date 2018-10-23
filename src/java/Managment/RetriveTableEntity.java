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
public class RetriveTableEntity implements java.io.Serializable{
    
        private String firstname ;
        private String middle ;
        private String lastname ;
        private Date dob;
        private String country ;
        private Integer countrycode;
        private String gender;
        private String quote;  
        private String cover;  
        private String profile;  

        private  ArrayList<String> list1 = new ArrayList<String>();
        private  ArrayList<Long> list2 = new ArrayList<Long>();
    public RetriveTableEntity() {

        
    }   
    
    
    
    
    
    public RetriveTableEntity(String firstname,String middle,String lastname,Date dob,String country,Integer countrycode,String gender,String quote,String cover,String profile)
    {    
        this.firstname = firstname;
        this.middle = middle;
        this.lastname = lastname;
        this.dob = dob;
        this.country = country;
        this.countrycode = countrycode;
        this.gender = gender;
        this.quote = quote;
        this.cover =  cover;
        this.profile =  profile;

    }




    public RetriveTableEntity(String firstname,String middle,String lastname,String quote)
    {    
        this.firstname = firstname;
        this.middle = middle;
        this.lastname = lastname;

        this.quote = quote;

    }
    
    
    
    RetriveTableEntity(ArrayList<String> list1,ArrayList<Long> list2){
    
        this.list1=list1;
        this.list2=list2;
    
    } 
    
    
        


    public ArrayList<String> getList1() {
        return list1;
    }

    public void setList1(ArrayList<String> list1) {
        this.list1 = list1;
    }

    public ArrayList<Long> getList2() {
        return list2;
    }

    public void setList2(ArrayList<Long> list2) {
        this.list2 = list2;
    }
    


    
    
    
    
    
    
    
    
    
      

    
    
    
    
    
    
    
    
    
    RetriveTableEntity(String firstname) {
                
        this.firstname = firstname;
    }
    
        
    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
        
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
      
    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the middle
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * @param middle the middle to set
     */
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the countrycode
     */
    public Integer getCountrycode() {
        return countrycode;
    }

    /**
     * @param countrycode the countrycode to set
     */
    public void setCountrycode(Integer countrycode) {
        this.countrycode = countrycode;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the quote
     */
    public String getQuote() {
        return quote;
    }

    /**
     * @param quote the quote to set
     */
    public void setQuote(String quote) {
        this.quote = quote;
    }
         	






}
