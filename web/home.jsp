 <%-- 
    Document   : Home
    Created on : May 24, 2018, 11:35:25 AM
    Author     : manshu sharma
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
        <link rel="stylesheet" href="antima-style-min.css">
        <%  //for session
            response.setHeader("Cache-Control","no-cache,no-store");
            response.setHeader("Pragma","no-cache,no-store");
            HttpSession httpSession=request.getSession(false);
            if(httpSession==null)
                request.getRequestDispatcher("index.jsp").forward(request, response);
            //for string display
            String mnumber = (String) httpSession.getAttribute("userID");
            long number = Long.parseLong(mnumber);

        %>  
        <style>
            .aa-input:focus ~ .aa-input--label, .aa-input:valid ~ .aa-input--label{ color: rgb(233,30,99) !important; }
            .aa-input--bar:before, .aa-input--bar:after { background:rgb(233,30,99) !important;}
            .posts {margin-top: 100px;margin-bottom: 100px; }
            #blahForProfile{width:50px; height: 50px; margin: 10px; display: none;}
        </style> 
        
        <script>
     
      function readURLForProfile(input) {
            if (input.files && input.files[0]) {
                var reader = new FileReader();

                reader.onload = function (e) {
                    $('#blahForProfile')
                        .attr('src', e.target.result);
                 $('#blahForProfile')
                        .attr('style', "display:block;");
                };

                reader.readAsDataURL(input.files[0]);
            }
        }            
        </script>        
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <div class=" aa-container ">          
            <div class="posts">

                
                <form  class="aa-panel aa-card aa-round-xlarge aa-padding-48 aa-margin-top aa-animate-zoom"  action="ServletPostWithImage" style="width:720px;margin: auto ; background: none; display: block;" id="PostWithImage"  method="POST" >                
                    <div class="aa-input--group  " style="" >
                        <input autocomplete="off"class="aa-input  " required=""type="text" style="width:100%;" name="userPost">
                        <span class="aa-input--highlight "></span>
                        <span class="aa-input--bar" style="width:100%"></span>
                        <label class="aa-input--label" >Whats in your mind</label>  
                    </div> 
                    <div style="width:100%">
                                                        
                        <img id="blahForProfile" src="https://www.cal-sailing.org/components/com_easyblog/themes/wireframe/images/placeholder-image.png" alt="your image" />

                    </div>
                    <div style="width:100%"> 
                                                
                        <input id="Post-Image" type="file" value="select image" class="aa-button aa-color-text--white aa-ripple" onchange="readURLForProfile(this);" name="postImage" style="display:none;">
                                                     
                        <label for="Post-Image" >
                            <input type="button" value="select image" class="aa-button aa-color-text--white aa-ripple"  style="background-color: #ff4081; float: left;">
                        </label>
                        
                        
                        
                        <label for="Post-Video" >
                            <input type="button" value="select video" class="aa-button aa-color-text--white aa-ripple"  style="background-color: #ff4081; float: left; margin-left: 10px;">
                        </label>                       <!-- <button   onclick="callFormText();" class="aa-button aa-color-text--white aa-ripple"  style="background-color: #ff4081; float: left;">only text</button>-->
                        <input  type="submit" value="Post" class="aa-button aa-color-text--white aa-ripple"  name="postBtn" style="background-color: #ff4081; float: right;">
                    </div>
                    <div>
                        
                    </div>
                </form>

                

            </div>
            <div class="aa-box aa-color--pink " style="margin:auto;">
                <div class="aa-boxinner aa-color--pink"></div>
            </div>            
            <script type="text/javascript">
                $(window).load(function() {
                    $(".aa-box").fadeOut("slow");
                });

    
            </script>
            
                 
            <script>
          function callFormImage(){
              alert("dfnslfnslkn");
              document.getElementById('PostWithImage').style.display="block";
              document.getElementById('PostWithoutImage').style.display="none";
          }
          function callFormText(){
              alert("dfnslfnslkn");
              document.getElementById('PostWithImage').style.display="none";
              document.getElementById('PostWithoutImage').style.display="block";
          }           
            </script>  
            <div class="posts">
                <jsp:include page="posts.jsp"></jsp:include>
                
            </div>
               
        </div>
    </body>
    <script>
        
           
    $(document).ready(function() {
        function disableBack() { window.history.forward() }

        window.onload = disableBack();
        window.onpageshow = function(evt) { if (evt.persisted) disableBack() }
    });
    </script>
</html>
