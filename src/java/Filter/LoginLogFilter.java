/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Manshu(Badshah)
 */
public class LoginLogFilter implements Filter {
    

    public LoginLogFilter() {
    }    
    
  
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
   
        
       
        System.out.println("signin filter work");
   
        
        HttpServletRequest servletRequest = (HttpServletRequest) request;
        String clientIpAdds = servletRequest.getRemoteAddr();
        String resource = servletRequest.getRequestURI();
        String folder = request.getServletContext().getRealPath("")+"logs";
        File file = new File(folder);
        
        if(!file.exists())
            file.mkdir();
            try(FileOutputStream fos =  new FileOutputStream(new File(folder,"LoginLog.txt"),true) ){
                StringBuilder sb = new StringBuilder();
                sb.append("Client Ip address:-").append(clientIpAdds).append("access resource:-").append(resource).append("\n\n");
                fos.write(sb.toString().getBytes());
            }            

        
                 
            chain.doFilter(request, response);
        

        
            
        
          
          
    }



    public void destroy() {        
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {        

    }

  
}
