<%-- 
    Document   : results
    Created on : Jun 30, 2018, 2:19:22 AM
    Author     : manshusharma
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Managment.RetriveTableEntity"%>
<%@page import="Managment.DatabaseManagement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <% 
            String UInput = request.getParameter("searchData");
            DatabaseManagement db = new DatabaseManagement();
            RetriveTableEntity entity = db.RetriveInfoFromSignup(UInput);
            
            //for string display
            String mnumber = (String) session.getAttribute("userID");
            long number = Long.parseLong(mnumber);
            
        %>
        
        <% 
        for(int i=0;i<=entity.getList1().toArray().length-1;i++){
            
          if(number != entity.getList2().get(i)){
        %>
        <div class="posts">
            <div class="aa-panel aa-card aa-round-xlarge aa-padding-48  aa-animate-zoom" style="width:850px;margin: auto ; background: none; margin-top: 100px;" >
                    <div style= "display: inline-block; height: 100%;width: 800px;">
                        <%out.print(entity.getList1().get(i));%>
                    </div>
                    <hr>  
            </div>                
        </div>
           <%}
       }%>
