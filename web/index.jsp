<%-- 
    Document   : index
    Created on : Apr 2, 2022, 9:00:58 PM
    Author     : Manshu(Badshah)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Log in</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
<%
    response.setHeader("Cache-Control", "no-cache,no-store");
    response.setHeader("Pragma", "no-cache,no-store");
    HttpSession httpSession = request.getSession(false);
    if (httpSession != null) {
        response.sendRedirect("ServletHome");
    }
%>        
        <link rel="stylesheet" href="antima-style-min.css">
        <style>


            .aa-input--bar:before, .aa-input--bar:after { background:rgb(233,30,99) !important;}
            .aa-input:focus ~ .aa-input--label, .aa-input:valid ~ .aa-input--label{ color: rgb(233,30,99) !important; }

            


        </style>
    </head>
    <body class="aa-padding-64 "style="background:linear-gradient(180deg,#ff4081,#ffff);;">
        


        <div class="aa-padding-xxxx ">
            
            
                    <form action="ServletLogin" method="post"  class=" aa-card-4 aa-animate-zoom aa-panel aa-round-xxlarge  aa-padding-xxxx" style="; margin:auto ;width:750px;height: auto; background-color: #ffff">
                            
            
                        <h5>Madhyastha</h5>
                        <h5>Sign in</h5>
                        <h6>with your phone number</h6>
                        <div class="aa-input--group">
                            
                            <input type ="text" required="" name="mnumber"  class="aa-input" style="width:100%; background:transparent " >
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Phone number</label> 

                        </div>
            
                        <div class="aa-input--group">

                            <input type ="password" required="" name="password"  class="aa-input" style="width:100%; background:transparent "  >
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Password</label> 
                        
            
                        </div>
            
            
                        <input type="submit" value="Log in" class="aa-button"Style="width:100%;background-color: #ff4081;;color: white;"> 

           
                        <br>
                        <br>
                        <span>Forgot</span>
                        <a  style="text-decoration: none;"  href="signup.jsp">Password</a>
                        <br>
                        <br>
                        <span>Create account</span>
                        <a  style="text-decoration: none;"  href="signup.jsp">Sign up</a>
                        


        
                    </form> 
            

 
        </div>

    </body>
</html>
