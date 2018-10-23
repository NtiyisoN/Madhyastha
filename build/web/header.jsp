<%-- 
    Document   : header
    Created on : Jun 14, 2018, 2:50:02 PM
    Author     : Manshu(Badshah)
--%>

<%@page import="Managment.RetriveTableEntity"%>
<%@page import="Managment.DatabaseManagement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id ="greeting" class="Calender.Calender"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
        <link rel="stylesheet" href="antima-style-min.css">
                
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

        <%
            //for session
            response.setHeader("Cache-Control","no-cache,no-store");
            response.setHeader("Pragma","no-cache,no-store");
            HttpSession httpSession=request.getSession(false);
            if(httpSession==null)
                request.getRequestDispatcher("index.jsp");

            //for string display
            String mnumber = (String) httpSession.getAttribute("userID");
            long number = Long.parseLong(mnumber);
            //usebean
            DatabaseManagement db = new DatabaseManagement();
            RetriveTableEntity entity = db.RetriveNameFromSignup("signup",number);
            String Toast = greeting.Toast();
        %>
        
<script>

function myFunction(){
    var x =document.getElementById("myDIV");
    if(x.style.display==="none"){
        x.style.display = "block";
    }else{
        x.style.display = "none";
    }
        
    
}
//this below code is used just for disable back button of the browser.......... 
$(document).ready(function() {
        window.history.pushState(null, "", window.location.href);        
        window.onpopstate = function() {
            window.history.pushState(null, "", window.location.href);
        };
    });
</script>  

       <style>
            .header{width: 100%;height: 50px;background-color:#ff4081; display:inline-flex; position:fixed;margin-bottom: 50px; z-index: 1;}
            .search >form{ display:inline-flex; margin: 5px;}
            .header >div{ display:inline-flex; }
            .badge {
                background: radial-gradient( 5px -9px, circle, white 8%, #ed2324 26px );
                background: -moz-radial-gradient( 5px -9px, circle, white 8%, #ed2324 26px );
                background: -ms-radial-gradient( 5px -9px, circle, white 8%, #ed2324 26px );
                background: -o-radial-gradient( 5px -9px, circle, white 8%, #ed2324 26px );
                background: -webkit-radial-gradient( 5px -9px, circle, white 8%, #ed2324 26px );
                background-color: #ed2324;border-radius: 50%;width: 20px;height: 20px;text-align: center;padding: 5% 5%;position: relative;right: -5.8px;top: -9px;float: right;display: block;
            }
            .message-count {position: relative;display: block;font: bold 14px/13px Helvetica, Verdana, Tahoma;text-align: center;margin: 0;top: 2px;}
            .myDIVarrowUp{position: absolute; top: 50px;}
            .node1{border: 3px solid #000;  top: 50px; width: 5px;  height: 10px;  }
            .node2{border: 3px solid #000;  top: 50px; width: 5px;  height: 10px;  }
       </style> 

        <header   class="header aa-display-container">
            <div class="search">
                <form action="Search" method="get">
                    <input class="aa-color--white aa-input"required="" name="searchData" placeholder="Search" style="margin-left: 20px;">
                    <input type="submit" name="postBtn" class="  aa-button aa-color-text--white aa-ripple" style="background:transparent;box-shadow: none;"> 
                </form>
            </div>
            

    
            <div style="background:transparent;  margin-left: 20px; ">
                <a class="aa-button aa-padding-16 aa-color-text--white aa-ripple "  href="ServletHome">Home</a>
                <a class="aa-button aa-padding-16 aa-color-text--white aa-ripple" href="ServletProfile">Profile</a>
                <a class="aa-button aa-padding-16 aa-color-text--white aa-ripple"   href="Page">Page</a>
                <a class="aa-button aa-padding-16 aa-color-text--white aa-ripple"   href="LogoutController">Log out</a> 
            </div>
            
           
            <div style=" height: 100%; width: 250px;margin-left: 100px; ">
                <h5 class=" aa-color-text--white" style="background:transparent;"><%out.print(Toast+" "+entity.getFirstname());%> </h5>
            </div> 
            <div class=" aa-container aa-padding-xxx ">
                <img onclick="myFunction()" class="aa-ripple"  src="icons/ic_message_black/ic_message_white_18dp.png" style="position:fixed;" >

                <div id="myDIV" class=" aa-animate-bottom aa-border  m-click aa-card  aa-color--white " style="width:300px; height: 500px; z-index: 1;right: 200px; top: 55px; display: none; position: fixed;">
                    <div class="myDIVarrowUp">
                        <span class="node1"></span>
                        <span class="node2"></span>  
                    </div>

                    <div class="aa-container">
                        <h5 >Messages</h5>
                        
                        
                    </div>
                    <hr>

                </div>
            </div>

        </header>
