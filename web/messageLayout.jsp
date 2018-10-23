<%-- 
    Document   : messageLayout
    Created on : Aug 13, 2018, 10:49:24 AM
    Author     : manshusharma
--%>

<%@page import="Managment.RetriveTableEntity"%>
<%@page import="Managment.DatabaseManagement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%  //for session
            response.setHeader("Cache-Control","no-cache,no-store");
            response.setHeader("Pragma","no-cache,no-store");
            HttpSession httpSession=request.getSession(false);
            if(httpSession==null)
                request.getRequestDispatcher("index.jsp").forward(request, response);
            
            String mnumber = (String) httpSession.getAttribute("userID");
            
            
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

                <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
                <style>
            .messaging-container{width:325px; height: 300px; background: #ccc;}
            .messaging-header{ width: 100%; height: 35px; background-color: #ff4081;}
            .messaging-content{width: 100%; height: 350px; background: #FFFFFF;}
            .messenger-name{text-align: center; color: white;}
            .send-messaging{ width: 100%; background: whitesmoke;}
            .text-messaging{width: 250px; height: 50px; border:1px solid #ccc; border-radius: 5px; background: #fff; display: inline; font-size: 15px; outline:none;}
            .text-messaging::placeholder{padding-left: 5px;}
            .messaging-title{ width: 300px;margin: auto; padding-top: 5px;}
            .messenger-name{display: inline;}
            /* The Close Button */
            .close {color: #aaaaaa;float: right;font-size: 28px;font-weight: bold; display: inline;}
            .close:hover,.close:focus {color: #000;text-decoration: none;cursor: pointer;}
                </style>
                
              
                <div style=" border: 1px solid #ccc; z-index: 1; height: 440px;  bottom: 0px; right: 0px; position: fixed;  " class="aa-color--black">    
        <div class="messaging-container" id="myModal">  
            <div class="messaging-header">
                <div class="messaging-title">
                    <h5 class="messenger-name"><%out.println(entity.getFirstname()+" "+entity.getLastname());%></h5>
                    <span class="close">&times;</span>
                </div>
            </div>
                    
                    
                    
                    
            <div class="messaging-content">
                <input type="text" class="aa-input" style="display: inline; width:200px;" id="username" placeholder="Username" />
                <button type="button" style="display: inline; width:100px;" class="aa-button  aa-color--pink aa-color-text--white" onclick="connect();">Connect</button>                   
                <textarea readonly="true" rows="10" cols="80" style="width: 320px; height: 100%;" id="log" class="aa-input"></textarea>
                <input type="text" size="15" style="width:300px; display: none; " class="aa-input" id="to" placeholder="To"/>                                 
            </div>
                   
            <script>
                    
                var url = window.location.href;
                var value = 'number=';
                var hash = url.indexOf(value);
                var to = url.substring(hash + value.length, url.length);
    
                $("#to").val(to);
                 

            </script>
                    
            <div class="send-messaging aa-padding-x">
                <input type="text"id="msg" placeholder="send message" class=" aa-input text-messaging">
                <div style="height: 50px; width: 50px; display:inline;">
                    <button style=" display:inline;  width: 50px;  background: transparent;border: 0;cursor: pointer;flex: 0 0 auto;padding-top: 0px;position: absolute;outline: none;" onclick="send();"> <i class="material-icons" style=" margin-top: 5px;font-size:40px;color:#ff4081;">send</i></button>
                </div>
            </div>
                    
                    
                    
                    
        </div>                    
    <script src="js/script.js"></script>
        <script>
            
            // Get the modal
            var modal = document.getElementById('myModal');
            // Get the <span> element that closes the modal
            var span = document.getElementsByClassName("close")[0];
            // Get the button that opens the modal
            var btn = document.getElementById("show-messenger");
            // When the user clicks the button, open the modal 
            btn.onclick = function() {
                 modal.style.display = "block";
            }
            // When the user clicks on <span> (x), close the modal
            span.onclick = function() {
                modal.style.display = "none";
            }
            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function(event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        </script>
         
                
                </div>