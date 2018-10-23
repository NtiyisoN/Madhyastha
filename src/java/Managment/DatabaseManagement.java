package Managment;


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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author manshusharma
 */
public class DatabaseManagement {
      
    
   private static final String DB_URL = "jdbc:derby://localhost:1527/social;create=true;user=manshu;password=manshu";

   //  Database credentials
   private static final String USER = "manshu";
   private static final String PASS = "manshu";
         
   static Connection connection = null;
   static  Statement statement = null;
    



   
   //create a table for profile........   
   public  boolean   createTableForActivity(String number ,String countrycode) throws ClassNotFoundException, SQLException{
   

      
      //STEP 2: Register JDBC driver
      Class.forName("org.apache.derby.jdbc.ClientDriver");
      
      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      connection = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      statement = connection.createStatement();
      
      statement.executeUpdate("CREATE TABLE "+"Activity"+countrycode+number+"(ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) , DATES DATE , POST  VARCHAR(100) , IMAGE  VARCHAR(30)  , PRIMARY KEY (ID))");
      System.out.println("Done");      
            
      return  true;
      

   }

   //INSERT COVER PHOTO
   public boolean insertDataIntoProfileCover(String cover ,Long number) throws ClassNotFoundException, SQLException{
      
       

      
      //STEP 2: Register JDBC driver
      Class.forName("org.apache.derby.jdbc.ClientDriver");
      
      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      connection = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      statement = connection.createStatement();
      statement.executeUpdate("UPDATE SIGNUP SET COVER = '"+cover+"' WHERE NUMBER = "+number );
      System.out.println("Done");     
      return true;

   }
   //INSERT PROFILE PHOTO
   public boolean insertDataIntoProfilePhoto(String profile ,Long number) throws ClassNotFoundException, SQLException{
      
       
      //STEP 2: Register JDBC driver
      Class.forName("org.apache.derby.jdbc.ClientDriver");
      
      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      connection = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      statement = connection.createStatement();
      statement.executeUpdate("UPDATE SIGNUP SET PROFILE = '"+profile+"' WHERE NUMBER = "+number );
      System.out.println("Done");     
      return true;

   }
   //INSERT DATA INTO ACTIVITY
   public boolean insertDataIntoActivity(Long number, int countrycode,String img,String post) throws ClassNotFoundException, SQLException, ParseException{
               
       LocalDateTime datetime1 = LocalDateTime.now();  
       DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
       String formatDateTime = datetime1.format(format);

      Integer n=1;
      //STEP 2: Register JDBC driver
      Class.forName("org.apache.derby.jdbc.ClientDriver");
      
      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      connection = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      statement = connection.createStatement();

      
      String tNmae= Integer.toString(countrycode)+number.toString();
      
      
      
            
      System.out.println("INSERT INTO ACTIVITY"+tNmae+" VALUES("+10+",'"+formatDateTime+"','"+post+"','"+img+"')");
      statement.executeUpdate("INSERT INTO ACTIVITY"+tNmae+"(DATES,POST,IMAGE) VALUES('"+formatDateTime+"','"+post+"','"+img+"')");
      System.out.println("Done");     
      return true;

   }   
   
   //RETRIVE SIGN UP DATA 
   public static RetriveTableEntity RetriveTable(String tableName,Long number) throws ClassNotFoundException, SQLException{

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
      String sql = "SELECT firstname , lastname ,dob,country,countrycode,gender,quote,middle,cover,profile  FROM "+tableName+" where number ="+number;
      ResultSet rs = statement.executeQuery(sql);

      String firstname=null,middle=null,lastname=null,country=null,quote=null,gender=null,cover=null,profile=null;
      Date dob=null;
      Integer countrycode=null;
      
      while(rs.next()){
         //Retrieve by column name
         firstname  = rs.getString("firstname");
         middle  = rs.getString("middle");
         lastname  = rs.getString("lastname");
         dob  = rs.getDate("dob");
         country  = rs.getString("country");
         countrycode  = rs.getInt("countrycode");
         gender  = rs.getString("gender");
         quote  = rs.getString("quote");
         cover = rs.getString("cover");
         profile = rs.getString("profile");

         System.out.print(profile);

      }
      
      rs.close();
            
      return new RetriveTableEntity(firstname,middle,lastname,dob,country,countrycode,gender,quote,cover,profile);

   }
   
   

      //FETCHING NAME FROM SIGN UP FOR TOAST TO USER
      public  static RetriveTableEntity RetriveNameFromSignup(String tableName,long number) throws SQLException, ClassNotFoundException {

             

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
      String sql = "SELECT firstname FROM "+tableName+" WHERE number="+number;
      ResultSet rs = statement.executeQuery(sql);
      String firstname = null;
      while(rs.next()){
         //Retrieve by column name
          firstname  = rs.getString("firstname");

      
      }
      rs.close();

            

      return  new RetriveTableEntity(firstname);
   
   }
      
      
      //USED FOR SEARCHING  USERS......
      public  static RetriveTableEntity RetriveInfoFromSignup(String UInput) throws SQLException, ClassNotFoundException {

             

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
      String sql = "SELECT * FROM SIGNUP WHERE FIRSTNAME LIKE "+"'%"+UInput+"%'"+" OR COUNTRY LIKE "+"'%"+UInput+"%'";
      
      ArrayList list1,list2;
       try (ResultSet rs = statement.executeQuery(sql)) {
           String firstname=null,middle=null,lastname=null,country=null,quote=null,gender=null,profile=null;
           Integer countrycode=null;
           Long mobile=null;
           
           
           
           list1 = new ArrayList<String>();
           list2 = new ArrayList<Long>();
           
           while(rs.next()){
               
               firstname =rs.getString("firstname");
               middle = rs.getString("middle");
               lastname = rs.getString("lastname");
               mobile =rs.getLong("number");
               quote = rs.getString("quote");
               String fullname = firstname+" "+" "+middle+" "+"  "+lastname;
               //Retrieve by column name

         
               profile = rs.getString("profile");

               list1.add("<img class='aa-circular' style='width:100px; height: 100px;' src='images/"+profile+"' />"+" "+"<a href='other_profile.jsp?number="+mobile+"'><h4>"+fullname+"</h4></a> <p>"+quote+"<p>");
               list2.add(mobile);
               
           }
       }
       

       
         System.out.print(list1 +" "+ list2);
         return  new RetriveTableEntity(list1,list2);
   
   }   
      
      
   
   //FOR RETRIVING POST DATA OF PARTCULAR USER 
   public   RetriveDataOfPost RetriveInfoFromActivity(String tableName) throws SQLException, ClassNotFoundException {
       
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
      String sql = "SELECT post , image , dates ,id FROM "+tableName;
      ResultSet rs = statement.executeQuery(sql);

    
      ArrayList list3 = new ArrayList<String>();
     
          String post=null,images=null;
          Date dates=null;
          Integer id=null;
          while(rs.next()){
             //Retrieve by column name
             post  = rs.getString("post");
             images  = rs.getString("image");
             dates  = rs.getDate("dates");
             id  = rs.getInt("id");
             
             list3.add("<p  style=\"height: 35px; margin:0px;padding:0px; display: inline-block;\">"+ dates+"</p> <hr>" + "<h4>"+post +"</h4><img onerror='this.style.display = \"none\"' style='width:100%; 'src='images/"+images+"'>"); 

          }

          rs.close();       
         
          System.out.println(id+""+dates + images + post);
       
      
          return  new RetriveDataOfPost(list3);
     
   } 

   public static void main(String args[]) throws ClassNotFoundException, SQLException, ParseException{


      // createTableForActivity(num1,num2);
       Long number =9828650287l;
       int countrycode=91;

       String tableNmae ="Activity"+Integer.toString(countrycode)+number.toString();
       
      // RetriveDataOfPost r=RetriveInfoFromActivity(tableNmae);

                 
       //System.out.println(r.getList1());

       
       
       
   }
    
}
