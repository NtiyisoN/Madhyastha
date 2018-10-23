<%-- 
    Document   : signup
    Created on : Apr 2, 2022, 10:08:45 PM
    Author     : Manshu(Badshah)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="antima-style-min.css">
        <title>JSP Page</title>
      
<%
    response.setHeader("Cache-Control", "no-cache,no-store");
    response.setHeader("Pragma", "no-cache,no-store");
    HttpSession httpSession = request.getSession(false);
    if (httpSession != null) {
        response.sendRedirect("home.jsp");
    }
%>         

        <style>
        
            .aa-input--bar:before, .aa-input--bar:after { background:rgb(233,30,99) !important;}
            .aa-input:focus ~ .aa-input--label, .aa-input:valid ~ .aa-input--label{ color: rgb(233,30,99) !important; }
    
        </style>
    </head>
    <body class="aa-padding-64 "style="background:linear-gradient(90deg,#ff4081,#ffff);">

        <div class="aa-padding-xxxx ">
            
            
                    <form action="ServletSignup" method="post"  class=" aa-card-4 aa-animate-zoom aa-panel aa-round-xxlarge  aa-padding-xxxx" style="; margin:auto ;width:750px;height: auto; background-color: #ffff">
                            
            
                        <h5>Madhyastha</h5>
                        <h5>Sign up</h5>
                        <div class="aa-input--group">
                            
                            <input type ="text" required="" name="firstname"  class="aa-input" style="width:100%; background:transparent " >
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >First Name</label> 
                
           
                        </div>
            
            
                        <div class="aa-input--group">

                            <input type ="text" required="" name="lastname"  class="aa-input" style="width:100%; background:transparent "  >
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Last Name</label> 
                        
            
                        </div>
                        
                        
                        
                        <div class="aa-input--group">

                            <input type ="text" required="" name="mnumber"  class="aa-input" style="width:100%; background:transparent "  >
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Mobile number</label> 
                        
            
                        </div>    
                        
                
                        <div class="aa-input--group">

                            <input type ="text" required="" name="country"  class="aa-input" style="width:100%; background:transparent "  >
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Country</label> 
                        
            
                        </div>                     
            

                        
                     
                        <div class="aa-input--group">

                            <select type ="text" required="" name="countrycode"  class="aa-input" style="width:100%; background:transparent "  >
                                
                                <option></option>
                                <option value="91">+91</option>
                                <option value="92">+92</option>
                                <option value="01">+1</option>
                            </select>
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Country code</label> 
                        
            
                        </div>  
                        
                        <span>
                            
                            <h6>Date of birth</h6>
                                                    
                            <div class="aa-input--group"style="display:inline-block">

                            
                                <select type ="text" required="" name="date"  class="aa-input" style="width:100px; background:transparent "  >
                                    <option value></option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>   
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                    <option value="9">9</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                    <option value="1">13</option>
                                    <option value="2">14</option>
                                    <option value="3">15</option>
                                    <option value="4">16</option>
                                    <option value="5">17</option>
                                    <option value="6">18</option>   
                                    <option value="7">19</option>
                                    <option value="8">20</option>
                                    <option value="9">21</option>
                                    <option value="10">22</option>
                                    <option value="11">23</option>
                                    <option value="12">24</option> 
                                    <option value="7">25</option>
                                    <option value="8">26</option>
                                    <option value="9">27</option>
                                    <option value="10">28</option>
                                    <option value="11">29</option>
                                    <option value="12">30</option> 
                                    <option value="12">31</option>  
                                </select>
                                <span class="aa-input--highlight "></span>
                                <span class="aa-input--bar" style="width:100px;"></span>
                                <label class="aa-input--label" >Date</label> 
                                               
                            </div>    
                        
                                                
                        
                            <div class="aa-input--group" style="display:inline-block">

                            
                                <select type ="text" required="" name="month"  class="aa-input" style="width:100px; background:transparent "  >
                                
                                    <option value></option>
                                    <option value="1">January</option>
                                    <option value="2">February</option>
                                    <option value="3">March</option>
                                    <option value="4">April</option>
                                    <option value="5">May</option>
                                    <option value="6">June</option>   
                                    <option value="7">July</option>
                                    <option value="8">August</option>
                                    <option value="9">September</option>
                                    <option value="10">October</option>
                                    <option value="11">November</option>
                                    <option value="12">December</option>                                
                                
                                
                                
                                
                                
                                </select>
                                <span class="aa-input--highlight "></span>
                                <span class="aa-input--bar" style="width:100px;"></span>
                                <label class="aa-input--label" >month</label> 
                        
                            </div>  
                        
                                                
                        
                            <div class="aa-input--group" style="display:inline-block">

                                <input type ="text" required="" name="year"  class="aa-input" style="width:100px; background:transparent "  >
                                <span class="aa-input--highlight "></span>
                                <span class="aa-input--bar" style="width:100px;"></span>
                                <label class="aa-input--label" >year</label> 
                        
                            </div>
                            
                            
                        </span>
                        
  
                        
                        <div class="aa-input--group">

                            <select type ="text" required="" name="gender"  class="aa-input" style="width:100%; background:transparent "  >
                                <option></option>
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>
                                <option value="Not">Rather not say</option>      
                                <option value="Custom">Custom</option>                                
                            </select>
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Gender</label> 
                        
            
                        </div>    
                    
                        <div class="aa-input--group">

                            <input type ="text" required="" name="password"  class="aa-input" style="width:100%; background:transparent "  >
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Password</label> 
                        
            
                        </div>
                        
                        <div class="aa-container">
                            <h6>Enter following captcha</h6>

                            <img src="Captcha" style="display:inline-block;">
                            
                            <div class="aa-input--group" style="display:inline-block;">

                            
                                <input type ="text" required="" name="captcha"  class="aa-input" style="width:200px; background:transparent "  >
                                <span class="aa-input--highlight "></span>
                                <span class="aa-input--bar" style="width:200px;"></span>
                                <label class="aa-input--label" >Enter captcha</label> 
                        
                            </div>
                            
                            
                        </div>
                        
                        
                        <div class="aa-input--group">

                            <input type ="text" required="" name="quote"  class="aa-input" style="width:100%; background:transparent "  >
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Quote (Optional)</label> 
                        
            
                        </div>                        
                        
                        <input type="submit" value="submit" class="aa-button"  name="search" Style="width:100%;background-color: #ff4081;color: white;"> 

           
                        <br>
                        <br>
                        <span>Login account</span>
                        <a  style="text-decoration: none"  href="index.jsp">Log in</a>


        
                    </form> 
 
        </div>
    </body>
</html>
