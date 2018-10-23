/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletLogin;

import ServletSignup.*;
import static java.lang.System.out;
import java.net.ConnectException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Manshu(Badshah)
 */
public class Validity {
    
    public  boolean validityOfUser(String mnumber,String password)   {

            long mnumber2=Long.parseLong(mnumber);
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction t = session.beginTransaction();
            Login login = (Login) session.get(Login.class, mnumber2);
            if(login!=null){
                return login.getPassword().equals(password);
            }else{
                return false;
            }
    
    
    }
    
}
