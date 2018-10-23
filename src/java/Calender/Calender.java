/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calender;

import java.util.Calendar;

/**
 *
 * @author Manshu(Badshah)
 */
public class Calender {
    
    public String Toast(){
    
    
        Calendar c= Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        String greeting=null;
        if(timeOfDay>=0&&timeOfDay<12){
             greeting ="Good morning";
        }else if(timeOfDay>=12&&timeOfDay<16){
             greeting ="Good afternoon";
        }else if(timeOfDay>=16&&timeOfDay<21){
             greeting ="Good evening";
        }else{
             greeting ="Hello";
        }
    
        return greeting;
    }
    
}
