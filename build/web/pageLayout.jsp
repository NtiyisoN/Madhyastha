<%-- 
    Document   : profile
    Created on : Jun 14, 2018, 5:09:20 PM
    Author     : Manshu(Badshah)
--%>

<%@page import="Managment.QueryOfPage"%>
<%@page import="Managment.RetriveDataOfPage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id ="data" class="Managment.DatabaseManagement"/>
<jsp:useBean id ="greeting" class="Calender.Calender"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
        <link rel="stylesheet" href="antima-style-min.css">
        <%  //for session
            response.setHeader("Cache-Control","no-cache,no-store");
            response.setHeader("Pragma","no-cache,no-store");
            HttpSession httpSession=request.getSession(false);
            if(httpSession==null)
                request.getRequestDispatcher("index.jsp").forward(request, response);
            //for string display
            String mnumber = (String) session.getAttribute("userID");
            //for string display
            StringBuffer requestURL = request.getRequestURL();
            if (request.getQueryString() != null) {
                requestURL.append("?").append(request.getQueryString());
            }
            String completeURL = requestURL.toString().substring(53);

            //usebean
            QueryOfPage q = new QueryOfPage();
            System.out.print(completeURL);
            RetriveDataOfPage entity = q.RetriveTableInfoFromPage(completeURL);

        %>
        <style>
            .container{width: 1024px;height: 750px;background: white;margin: auto; }            
            .fb-profile img.cover{z-index: 0;width: 1024px;height: 400px;}
            .profile{margin: -90px 0px 0px 50px;z-index: 9;width: 250px;height: 250px; border-radius: 5px;border: 5px solid white; }
            .profile-text{margin-left: 50px;margin-right: 50px;}
            .cover{background: gray no-repeat fixed center; background-size: auto;}
            .cover-modal{ top: 100px;  display: none; position: absolute;}
        </style>  
 
    </head>
    <body>
        
        <jsp:include page="header.jsp"></jsp:include>

        
        <div  class="container aa-padding-48 ">
            
                       <div  class="fb-profile  ">

                <img  class="cover aa-shadow--16dp" <%out.print("src='images/"+entity.getCover()+"'");%> id="myBtn" />   
                <img  class="profile"  <%out.print("src='images/"+entity.getProfile()+"'");%> id="myBtnForProfile" />

                <jsp:include page="pageModelForCover.jsp"></jsp:include>
                <jsp:include page="pageModelForProfile.jsp"></jsp:include>

                <div class="profile-text">
            
                    <h3><%out.println(completeURL);%></h3>
                    <h5><%out.println(entity.getQuote());%></h5>
        
                </div>

            </div> 
            
            <div class="" style="width:300px; float:left;">                
                <div class="fb-profile aa-card aa-padding-x" style="width: 300px; height: 350px;">
                    <img src="icons/ic_account_circle_black/ic_account_circle_black_48dp.png" class="aa-circular" style="width:50px; height: 50px; display: inline-block">
                    <h5 class="aa-text-center" style= "display: inline-block">Intro</h5>
                    <hr>
                    <h6>Created:<%out.println(entity.getDate());%> </h6>
                    <h6>Category:<%out.println(entity.getCategory());%> </h6>
                </div>
                <br>
                <br>
                <br>
            
                <div class="fb-profile aa-card aa-padding-x" style="width: 300px; height: 350px;">
                    <img src="icons/ic_add_a_photo_black/ic_add_a_photo_black_48dp.png" class="aa-circular" style="width:35px; height: 35px; display: inline-block">
                    <h5 class="aa-text-center" style= "display: inline-block">Photos</h5>
                    <hr>
                    <img class="aa-col--6" style=" height: 100px; display: inline-block ;">
                    <img  class="aa-col--6" style=" height: 100px; display: inline-block ;">
                </div>  
                <br>
                <br>
                <br>
            
                <div class="fb-profile aa-card aa-padding-x" style="width: 300px; height: 350px;">
                    <img src="icons/ic_people_black/ic_people_black_48dp.png" class="aa-circular" style="width:50px; height: 50px; display: inline-block">
                    <h5 class="aa-text-center" style= "display: inline-block">Following</h5>
                    <hr>
                </div>   
                <br>
                <br>
                <div class="fb-profile aa-card aa-padding-x" style="width: 300px; height: 350px;">
                    <img src="icons/ic_people_black/ic_people_black_48dp.png" class="aa-circular" style="width:50px; height: 50px; display: inline-block">
                    <h5 class="aa-text-center" style= "display: inline-block">Follower</h5>
                    <hr>
                </div> 
            </div>            
            
            
            
        </div>

        
        
        
        
        
        
        
        
    </body>
</html>
