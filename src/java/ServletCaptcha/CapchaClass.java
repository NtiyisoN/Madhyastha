package ServletCaptcha;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manshusharma
 */
public class CapchaClass {
    
    private static String pattern ="bbfkwebfkwefw121212eiufhweufhkwehfkwefk";
    
    public static String getCapchaString(){
        
    Random r = new Random(pattern.length());
    
    StringBuilder builder = new StringBuilder("");
    
    for(int i=0;i<6;i++){
            builder.append(pattern.charAt(r.nextInt(pattern.length())));
    }
   
    System.out.print(builder.toString());
        return  builder.toString();
    
    
    }
    
    

}
