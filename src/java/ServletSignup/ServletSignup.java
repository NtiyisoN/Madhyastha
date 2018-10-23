/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletSignup;

import Managment.DatabaseManagement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Manshu(Badshah)
 */
public class ServletSignup extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                
            System.out.println("Successfully done buddy");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String mnumber = request.getParameter("mnumber");
            String country = request.getParameter("country");
            String countrycode = request.getParameter("countrycode");
            String date = request.getParameter("date");
            String month = request.getParameter("month");
            String year = request.getParameter("year");
            String gender = request.getParameter("gender");
            String password = request.getParameter("password");
            String quote = request.getParameter("quote");
            
            // upper to lower 
            
            
            StringBuilder firstname1 = new StringBuilder(firstname);
            StringBuilder lastname1 = new StringBuilder(lastname);
            StringBuilder country1 = new StringBuilder(country);
            StringBuilder gender1 = new StringBuilder(gender);
            StringBuilder quote1 = new StringBuilder(quote);
            

            for (int index = 0; index < firstname1.length() ; index++) {
    
                char c = firstname1.charAt(index);
                firstname1.setCharAt(index, Character.toLowerCase(c));

            } 
            for (int index = 0; index < lastname1.length() ; index++) {
    
                char c = lastname1.charAt(index);
                lastname1.setCharAt(index, Character.toLowerCase(c));

            }
            for (int index = 0; index < country1.length() ; index++) {
    
                char c = country1.charAt(index);
                country1.setCharAt(index, Character.toLowerCase(c));

            }  
            for (int index = 0; index < gender1.length() ; index++) {
    
                char c = gender1.charAt(index);
                gender1.setCharAt(index, Character.toLowerCase(c));

            }
            for (int index = 0; index < quote1.length() ; index++) {
    
                char c = quote1.charAt(index);
                quote1.setCharAt(index, Character.toLowerCase(c));

            }            
            
            
            
            //conversion
            int countrycode2 = Integer.parseInt(countrycode);
            long mnumber2=Long.parseLong(mnumber);

            String DOB =date+"/"+month+"/"+year;
            Date DOB2= new SimpleDateFormat("dd/MM/yyyy").parse(DOB);

            

            
            DatabaseEntry databaseentry =  new DatabaseEntry();

            DatabaseManagement db = new DatabaseManagement();
            
            
            
            if(databaseentry.insertion(firstname1.toString(), lastname1.toString(), mnumber2, country1.toString(), countrycode2, DOB2,gender1.toString(), password,quote1.toString())==true & db.createTableForActivity(mnumber,countrycode)==true ){
                               
                // Create a session object if it is already not  created.
                                               
                    HttpSession session = request.getSession(true); 
                    session.setAttribute("userID", mnumber);
                    System.out.println("Successfully done buddy");

                                
                


                request.getRequestDispatcher("home.jsp").forward(request, response);


            }else{
                out.println("Not done buddy");
                System.out.println("Not done buddy");
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ServletSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletSignup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ServletSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletSignup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
