<%-- 
    Document   : search
    Created on : Jun 19, 2018, 1:45:41 PM
    Author     : manshusharma
--%>

<%@page import="Managment.RetriveTableEntity"%>
<%@page import="Managment.DatabaseManagement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                
        <link rel="stylesheet" href="antima-style-min.css">
                
        <%
            //for session
            response.setHeader("Cache-Control","no-cache,no-store");
            response.setHeader("Pragma","no-cache,no-store");
            HttpSession httpSession=request.getSession(false);
            if(httpSession==null)
                request.getRequestDispatcher("index.jsp").forward(request, response);
        %>    
        <style>
            .aa-input--bar:before, .aa-input--bar:after { background:rgb(233,30,99) !important;}
            .aa-input:focus ~ .aa-input--label, .aa-input:valid ~ .aa-input--label{ color: rgb(233,30,99) !important; }
            .posts {margin-top: 100px;}
            a{text-decoration:  none;}

        </style>
    </head>
    <body>
        
            <jsp:include page="header.jsp"></jsp:include>


        <div class=" aa-container " >
            
            <div class="posts">
             

                
                             
                <div class="aa-panel aa-card aa-round-xlarge aa-padding-48  aa-margin-top aa-animate-zoom" style="width:850px;margin: auto ; background: none; margin-top: 100px;" >
                
                    <!--here we declare our post -->    
                
                    <form class="aa-input--group  "action="Search" method="get" >
                        <input class="aa-input  " required="" type="text" style="width:100%;" name="searchData">
                        <span class="aa-input--highlight "></span>
                        <span class="aa-input--bar" style="width:100%"></span>
                        <label class="aa-input--label" >Search your love once</label> 
                        <div style="width:100%; margin-top:50px;">                    
                            <input  type="submit" value="Search" class="aa-button aa-color-text--white aa-ripple"  name="postBtn" style="background-color: #ff4081; float: right;">
                        </div>
                    </form>    
                    

            
                </div>
                      
            </div>
               
      
            <jsp:include page="results.jsp"></jsp:include>

            
        </div>

    </body>
</html>
