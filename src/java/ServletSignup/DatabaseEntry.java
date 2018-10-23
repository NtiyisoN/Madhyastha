/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletSignup;

import java.sql.DriverManager;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Manshu(Badshah)
 */
public class DatabaseEntry {

    
    public boolean insertion(String firstname,String lastname,long mnumber2,String country,int countrycode2,Date DOB2,String gender,String password,String quote) throws ClassNotFoundException{
    
                    
            String coverPhoto = null, profilePhoto = null;

            // Entery in signup Database
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            Transaction t = session.beginTransaction();
            Signup db =  new Signup(mnumber2,firstname,"great",lastname,DOB2,country,countrycode2,gender,quote,coverPhoto,profilePhoto);
            session.save(db);
            t.commit();    
            session.close();
            
            
            // Entery in login Database
            SessionFactory factory2 = HibernateUtil.getSessionFactory();
            Session session2 = factory2.openSession();
            Transaction t2 = session2.beginTransaction();
            Login login =  new Login(mnumber2,password);
            session2.save(login);
            t2.commit();
            session2.close();
            
            

      
      
    
        return true;
    }
}
