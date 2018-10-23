<%-- 
    Document   : profile
    Created on : Jun 14, 2018, 5:09:20 PM
    Author     : Manshu(Badshah)
--%>
<%@page import="Managment.DatabaseManagement"%>
<%@page import="Managment.RetriveTableEntity"%>
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
            StringBuffer requestURL = request.getRequestURL();
            if (request.getQueryString() != null) {
                requestURL.append("?").append(request.getQueryString());
            }
            String completeURL = requestURL.toString().substring(58);
            //for string display
            long number = Long.parseLong(completeURL);
            //usebean
            DatabaseManagement db = new DatabaseManagement();
            RetriveTableEntity entity = db.RetriveTable("signup",number);
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
                <img  class="cover aa-shadow--16dp" <%out.print("src='images/"+entity.getCover()+"'");%> />   
                <img  class="profile" <%out.print("src='images/"+entity.getProfile()+"'");%>/>
                <div class="profile-text">
                    <h3><%out.println(entity.getFirstname()+" "+entity.getLastname());%></h3>
                    <h5><%out.println(entity.getQuote());%></h5>
                    <button class="aa-button aa-color--pink aa-color-text--white" id="show-messenger"  onclick="messagingLayout();">write message</button>
                    
                    <input type="submit" value="follow"class="aa-button aa-color--pink aa-color-text--white" id="Idfollow" onclick="callFollow()"></input>
                    <input type="submit" value="un follow" class="aa-button aa-color--pink aa-color-text--white" id="IdUnfollow"  onclick="callUnfollow()" style="display: none;"></input>
                
                </div> 
            </div>
      <script>
          function callFollow(){
              document.getElementById('Idfollow').style.display="none";
              document.getElementById('IdUnfollow').style.display="inline-block";
          }
          function callUnfollow(){              
              document.getElementById('IdUnfollow').style.display="none";
              document.getElementById('Idfollow').style.display="inline-block";
          }
      </script>                    
            <hr>
            <div class="" style="width:300px; float:left;">
                <div class="fb-profile aa-card aa-padding-x" style="width: 300px; height: 350px;">
                    <img src="icons/ic_account_circle_black/ic_account_circle_black_48dp.png" class="aa-circular" style="width:50px; height: 50px; display: inline-block">
                    <h5 class="aa-text-center" style= "display: inline-block">Intro</h5>
                    <hr>
                    <h6>Lives in <%out.println(entity.getCountry());%></h6>
                    <h6>Gender <%out.println(entity.getGender());%></h6>
                    <h6>Date of birth <%out.println(entity.getDob());%></h6>
                </div>
                <br>
                <br>
                <br>
                <div class="fb-profile aa-card aa-padding-x" style="width: 300px; height: 350px;">
                    <img src="icons/ic_add_a_photo_black/ic_add_a_photo_black_48dp.png" class="aa-circular" style="width:35px; height: 35px; display: inline-block">
                    <h5 class="aa-text-center" style= "display: inline-block">Photos</h5>
                    <hr>
                    <img src="<%out.println("images/"+entity.getCover());%> "class="aa-col--6" style=" height: 100px; display: inline-block ;">
                    <img src="<%out.println("images/"+entity.getProfile());%> " class="aa-col--6" style=" height: 100px; display: inline-block ;">
                </div>  
                <br>
                <br>
                <br>
            
                <div class="fb-profile aa-card aa-padding-x" style="width: 300px; height: 350px;">
                    <img src="icons/ic_people_black/ic_people_black_48dp.png" class="aa-circular" style="width:50px; height: 50px; display: inline-block">
                    <h5 class="aa-text-center" style= "display: inline-block">Following</h5>
                    <hr>
                </div>                
            </div>
            <div class="aa-padding-x"style="float:right; width:720px;">  
            <div class="aa-box aa-color--pink aa-margin-top aa-margin-bottom" style="margin:auto;">
                <div class="aa-boxinner aa-color--pink"></div>
            </div>            
            
            <script type="text/javascript">
                $(window).load(function() {
                    $(".aa-box").fadeOut("slow");
                });
                            
            </script>
            <jsp:include page="others_post.jsp"></jsp:include>
            </div>
           <jsp:include page="messageLayout.jsp"></jsp:include>
         
        </div>

           
            
    </body>
</html>
