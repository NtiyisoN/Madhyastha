<%-- 
    Document   : profileModelForCover
    Created on : Jul 15, 2018, 12:44:13 PM
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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <style>       
            /* The Modal (background) */
            .modal {display: none; position: fixed;z-index: 1;padding-top: 100px; left: 0;top: 0;width: 100%;height: 100%; overflow: auto;  background-color: rgba(0,0,0,0.4);}
            /* Modal Content */
            .modal-content {background-color: #fefefe;margin: auto;padding: 20px;border: 1px solid #888;width: 80%;border-radius: 10px;}
            /* The Close Button */
            .close {color: #aaaaaa;float: right;font-size: 28px;font-weight: bold;}
            .close:hover,.close:focus {color: #000;text-decoration: none;cursor: pointer;}
            .modal-subtitle{text-align: center;}
            #upload-file-For-Profile{display: none;}
            .lable-upload-file{ height: 200px; width: 450px; margin: auto;  background-image: url("icons/ic_add_black/ic_add_black_48dp.png") ; background-repeat:no-repeat; background-position: center; border: 1px solid #ccc;}
            .lable-upload-preview{ height: 200px; width: 450px; margin: auto; }
            #blahForProfile{width: 100%; height: 200px;}

            .submit-section{width: 100%; height: 50px; padding: 5px;}
        </style>
        <script>
     
      function readURLForProfile(input) {
            if (input.files && input.files[0]) {
                var reader = new FileReader();

                reader.onload = function (e) {
                    $('#blahForProfile')
                        .attr('src', e.target.result);
                };

                reader.readAsDataURL(input.files[0]);
            }
        }            
        </script>
     

</head>
    <body>

         <!-- The Modal -->

         <div id="myModalForProfile" class="modal-profile">

  
             <!-- Modal content -->
  
             <div class="modal-content aa-animate-top" style="">
                 <span class="close">&times;</span>
                 <div>
                   <h3>Upload profile photo or choose from uploaded photos.</h3>
                 </div>
                             
                 <form action="PageProfilePhoto"  method="POST" enctype="multipart/form-data">
                     
                 
                     <div style="width: 100%; height: 350px; border:1px solid #ccc;">
                     
                         <div style="width: 50%; height: 100%; float: left;">
                         
                             <h5 class="modal-subtitle">Upload photo</h5>  
                             <input type="file"  name="profile_image" id="upload-file-For-Profile"  onchange="readURLForProfile(this);" >
                             <label for="upload-file-For-Profile" >
                                 <div class="lable-upload-file aa-ripple">
                                 </div>
                             </label>
                         </div> 
                         <div style="width: 50%; height: 100%; float: right;">
                             <h5 class="modal-subtitle">Preview photo</h5>  
                             <div class="lable-upload-preview aa-ripple">
                                 <img id="blahForProfile" src="https://www.cal-sailing.org/components/com_easyblog/themes/wireframe/images/placeholder-image.png" alt="your image" />
                             </div>
                         </div>   
                 
                     </div>
                 
                 
                
                     <div class="submit-section">
                         <input type="submit" class="aa-button aa-ripple aa-color--pink aa-text-uppercase aa-border-0 aa-color-text--white" style="float: right; " value="submit">
                     </div>                     
                     
                     
                     
                     
                     
                 </form>
    

             </div>
         </div>
         <script>
             // Get the modal    
              var myModalForProfile = document.getElementById('myModalForProfile');
             // Get the button that opens the modal
              var btn = document.getElementById("myBtnForProfile");
              // Get the <span> element that closes the modal
              var span = document.getElementsByClassName("close")[1];
              // When the user clicks the button, open the modal 
              btn.onclick = function() {
                  myModalForProfile.style.display = "block";
              }
              // When the user clicks on <span> (x), close the modal
              span.onclick = function() {
                  myModalForProfile.style.display = "none";
              }

              // When the user clicks anywhere outside of the modal, close it
              window.onclick = function(event) {
                  if (event.target == myModalForProfile) {
                     myModalForProfile.style.display = "none";
                   }
              }            
        </script>

    </body>
</html>
