<%-- 
    Document   : others_post
    Created on : Aug 11, 2018, 8:40:01 AM
    Author     : manshusharma
--%>

<%@page import="Managment.RetriveTableEntity"%>
<%@page import="Managment.RetriveDataOfPost"%>
<%@page import="Managment.DatabaseManagement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
 //for session
            
    response.setHeader("Cache-Control","no-cache,no-store");
    response.setHeader("Pragma","no-cache,no-store");
    HttpSession httpSession=request.getSession(false);
    if(httpSession==null)
        request.getRequestDispatcher("index.jsp").forward(request, response);
//for string display
  StringBuffer requestURL = request.getRequestURL();
            if (request.getQueryString() != null) {
                requestURL.append("?").append(request.getQueryString());
            }
            String completeURL = requestURL.toString().substring(58);
            //for string display
            long number = Long.parseLong(completeURL);
            //usebean
           String tableName = "Activity91"+number;   
            DatabaseManagement db = new DatabaseManagement();
                
            RetriveDataOfPost entity = db.RetriveInfoFromActivity(tableName);

            RetriveTableEntity entity2 = db.RetriveTable("signup",number);
        
%>

<% 
    for(int i=entity.getList1().size()-1 ; i>=0;i--){
%>

<div class="aa-card aa-padding-x"style=" width:720px;height: 100%; margin: auto; margin-bottom: 10px;">
                
                    
<!--- Here i need change in image tag  below-->     
    <img src='images/<%out.print(entity2.getProfile());%>' class="aa-circular" style="width:75px; height: 75px; display: inline-block;">
    <h5  style="height: 35px; margin:0px;padding:0px; display: inline-block;"><%out.println(entity2.getFirstname()+" "+entity2.getLastname());%></h5>
    <%out.println(entity.getList1().get(i));%>                   
                 
        <div class="aa-padding-x" style="width: 100%; height: 50px;">
            <div class="aa-col--6" style="height:45px;">
                <div style="height:45px;">
                    <input type="button" class="aa-text-center aa-ripple aa-hover-sepia aa-color--white" style="width:100%;height:45px; border: none;"value="Like">
                </div>
            </div>                        
            <div class="aa-col--6 ">              
                <div style="height:45px;">
                    <input type="button" class="aa-text-center aa-ripple aa-hover-sepia aa-color--white" style="width:100%;height:45px; border: none;"value="Comment">
                </div>                            
            </div>
        </div>
</div>
<%  }%>
