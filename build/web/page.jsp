<%-- 
    Document   : page
    Created on : Aug 10, 2018, 10:29:49 PM
    Author     : manshusharma
--%>

<%@page import="Managment.QueryOfPage"%>
<%@page import="Managment.RetriveDataOfPage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <%  //for session
            response.setHeader("Cache-Control","no-cache,no-store");
            response.setHeader("Pragma","no-cache,no-store");
            HttpSession httpSession=request.getSession(false);
            if(httpSession==null)
                request.getRequestDispatcher("index.jsp").forward(request, response);
            //for string display
            String mnumber = (String) session.getAttribute("userID");
            long number = Long.parseLong(mnumber);
            
            QueryOfPage q = new QueryOfPage();
                        
            RetriveDataOfPage entity = q.RetriveNameAndNumber(number);


        %>        <style>
        
            .aa-input--bar:before, .aa-input--bar:after { background:rgb(233,30,99) !important;}
            .aa-input:focus ~ .aa-input--label, .aa-input:valid ~ .aa-input--label{ color: rgb(233,30,99) !important; }
    
        </style>        
    </head>
    
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        
        <!--Need  take careabout below div position and left-->
        
        <div class="aa-padding-xxxx aa-col--12" style="position: absolute; top: 100px; ">
            
            
                    <form action="ServletPage" method="post"  class="aa-col--5 aa-card-4 aa-animate-zoom aa-panel aa-round-xxlarge  aa-padding-xxxx" style="; margin:auto ;width:750px;height: auto; background-color: #ffff">
                            
            
                        <h5> Create new page</h5>
                        <div class="aa-input--group">
                            
                            <input type ="text" required="" name="Page_name"  class="aa-input" style="width:100%; background:transparent " >
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Page name</label> 
                
           
                        </div>
                        <div class="aa-input--group">
                            
                            <input type ="text" required="" name="Page_description"  class="aa-input" style="width:100%; background:transparent " >
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Page description</label> 
                
           
                        </div>            
                        <div class="aa-input--group">

                            <select type ="text" required="" name="category"  class="aa-input" style="width:100%; background:transparent "  >
                                
                                <option></option>
                                <option value="Business">Business</option>
                                <option value="Community">Community </option>
                                <option value="Brand">Brand </option>
                                <option value="Entertainment">Entertainment </option>
                                <option value="Artist">Artist </option>
                            </select>
                            <span class="aa-input--highlight "></span>
                            <span class="aa-input--bar" style="width:100%"></span>
                            <label class="aa-input--label" >Category</label> 
                        
            
                        </div>
                      
                        <input type="submit" value="submit" class="aa-button"  name="submit" Style="width:100%;background-color: #ff4081;color: white;"> 

           
                        <br>
                        <br>


        
                    </form> 
            
                 
            <div class="aa-col--5 aa-card-4  aa-round-xxlarge  aa-padding-xxxx" style="float: right;">
                        
                <h5>Pages</h5>
                
        <% 
        for(int i=0;i<=entity.getList1().toArray().length-1;i++){
            
        %>
        <div class="posts">
            <div class="aa-animate-zoom"  >
                       
                <%out.print(entity.getList1().get(i));%>
                <hr>  
            </div>                
        </div>
           <%
       }%>                
                
                        
            </div>
 
        </div>
        

        
    </body>
</html>
