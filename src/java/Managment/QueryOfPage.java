/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managment;

import static Managment.DatabaseManagement.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author manshusharma
 */
public class QueryOfPage {    
   private static final String DB_URL = "jdbc:derby://localhost:1527/social;create=true;user=manshu;password=manshu";

   //  Database credentials
   private static final String USER = "manshu";
   private static final String PASS = "manshu";
         
   static Connection connection = null;
   static  Statement statement = null;
    
   

    
   //INSERT DATA INTO ACTIVITY
   public boolean insertDataIntoPage(Long number,String pageName,String pageDescription,String category) throws ClassNotFoundException, SQLException, ParseException{
               
       LocalDateTime datetime1 = LocalDateTime.now();  
       DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
       String formatDateTime = datetime1.format(format);

      //STEP 2: Register JDBC driver
      Class.forName("org.apache.derby.jdbc.ClientDriver");
      
      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      connection = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      statement = connection.createStatement();

      
      
      String cover=null;
      String profile = null;
            
      statement.executeUpdate("INSERT INTO PAGE (NUMBER,NAME,DATE,CATEGORY,COVER,PROFILE,QUOTE) VALUES("+number+",'"+pageName+"','"+formatDateTime+"','"+category+"','"+cover+"','"+profile+"','"+pageDescription+"')");
      System.out.println("Done");     
      return true;

   }   
   
   
   
      
      //USED FOR SEARCHING  USERS......
      public  static RetriveDataOfPage RetriveNameAndNumber(long number) throws SQLException, ClassNotFoundException {

             

      //STEP 2: Register JDBC driver
      Class.forName("org.apache.derby.jdbc.ClientDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      connection = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      statement = connection.createStatement();

      // Extract records with any condition.
      System.out.println("Fetching records without condition...");
      String sql = "SELECT * FROM Page WHERE NUMBER ="+number;
      System.out.println( "SELECT * FROM Page WHERE NUMBER ="+number);
      
      ArrayList list1;
       try (ResultSet rs = statement.executeQuery(sql)) {
           String Pagename = null;
           
           
           
           list1 = new ArrayList<String>();
           
           while(rs.next()){
               
               Pagename =rs.getString("name");
               //Retrieve by column name
               list1.add("<a href='pageLayout.jsp?name="+Pagename+"'><h4>"+Pagename+"</h4></a>");
               
           }
       
       }
         return  new RetriveDataOfPage(list1);

      }
      
   //RETRIVE SIGN UP DATA 
   public static RetriveDataOfPage RetriveTableInfoFromPage(String pageName) throws ClassNotFoundException, SQLException{

      //STEP 2: Register JDBC driver
      Class.forName("org.apache.derby.jdbc.ClientDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      connection = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      statement = connection.createStatement();

      // Extract records without any condition.
      System.out.println("Fetching records without condition...");
      String sql = "SELECT NUMBER,NAME,DATE,QUOTE,COVER,PROFILE,CATEGORY  FROM PAGE where NAME ='"+pageName+"'";
      ResultSet rs = statement.executeQuery(sql);

      String name=null,category=null,quote=null,cover=null,profile=null;
      Long number=null;
      Date dob=null;
      
      while(rs.next()){
         //Retrieve by column name
         number =rs.getLong("number");
         name  = rs.getString("name");
         dob  = rs.getDate("date");
         category  = rs.getString("category");
         quote  = rs.getString("quote");
         cover = rs.getString("cover");
         profile = rs.getString("profile");

         System.out.print(profile);

      }
      
      rs.close();
            
      return new RetriveDataOfPage(number,name,dob,category,cover,profile,quote);

   }
   //INSERT COVER PHOTO
   public boolean insertDataIntoPageCover(String cover ,String name) throws ClassNotFoundException, SQLException{
      
      //STEP 2: Register JDBC driver
      Class.forName("org.apache.derby.jdbc.ClientDriver");
      
      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      connection = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      statement = connection.createStatement();
      statement.executeUpdate("UPDATE PAGE SET COVER = '"+cover+"' WHERE Number = "+name );
      System.out.println("Done");     
      return true;

   }
}