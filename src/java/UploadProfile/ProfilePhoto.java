/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UploadProfile;

import Managment.DatabaseManagement;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author manshusharma
 */

@MultipartConfig()

public class ProfilePhoto extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            
        HttpSession httpSession=request.getSession(false);
            
            
        Part part1 = request.getPart("profile_image");
            
        String time=LocalDateTime.now().toString().replace(":","").replace("-","");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

  
            String relativepath = request.getServletContext().getRealPath("")+"images";
            File file = new File (relativepath);
            if(!file.exists())
                file.mkdir();
            String originalFileNmae =part1.getSubmittedFileName();
            String exten = originalFileNmae.substring(originalFileNmae.lastIndexOf("."));
            File uploadFile= new File (relativepath,time+exten);
           
            
            
                       
            String mnumbers = (String) httpSession.getAttribute("userID");
            long numbers = Long.parseLong(mnumbers);
           
            
            
            
            
            


            
            FileOutputStream fos = new FileOutputStream(uploadFile);
            InputStream inputStream = part1.getInputStream();
            int n = inputStream.read();
            while(n!=-1){
            
                fos.write(n);
                n=inputStream.read();
                fos.flush();
            }
            fos.close();
            inputStream.close();
            


            DatabaseManagement db = new DatabaseManagement();
            
            if(db.insertDataIntoProfilePhoto(time+exten, numbers)==true){
            
            
                request.getRequestDispatcher("profile.jsp").forward(request, response);
            }
            
            
            
            
            
            
            

        } catch(Exception e){
        
        
            out.print("Error"+ e);
        
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
        processRequest(request, response);
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
        processRequest(request, response);
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
