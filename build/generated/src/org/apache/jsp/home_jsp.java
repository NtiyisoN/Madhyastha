package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        ");

            String mnumber = request.getParameter("mnumber");
           
            String postData = request.getParameter("postData");
        
            System.out.println("signin filter work");
        
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("                <link rel=\"stylesheet\" href=\"antima-style-min.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .header{width: 100%;height: 50px;background-color:#ff4081; display:inline-flex}\n");
      out.write("            .container{width: 100%;height: 750px;background: white;  }\n");
      out.write("            .aa-input:focus ~ .aa-input--label, .aa-input:valid ~ .aa-input--label{ color: rgb(233,30,99) !important; }\n");
      out.write("            .aa-input--bar:before, .aa-input--bar:after { background:rgb(233,30,99) !important;}\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header class=\"header aa-display-container\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form action=\"\">\n");
      out.write("                <input class=\"aa-input\" placeholder=\"Search\" style=\"background:transparent; display: inline-block; margin-left: 20px;\">\n");
      out.write("                <input type=\"button\" class=\"aa-button  \" style=\"background:transparent; margin-left: 20px; display: inline-block;\" value=\"Search\"> \n");
      out.write("            </form>     \n");
      out.write("\n");
      out.write("            <a class=\"aa-button aa-padding-16 \" style=\"background:transparent;  margin-left: 20px; display: inline-block;\" src=\"\">Profile</a>\n");
      out.write("            <a class=\"aa-button aa-padding-16 \" style=\"background:transparent;  margin-left: 20px; display: inline-block;\" src=\"\" >Page</a>\n");
      out.write("            <a class=\"aa-button aa-padding-16 \" style=\"background:transparent;  margin-left: 20px; display: inline-block;\" src=\"\" >Log out</a>\n");
      out.write("            <div class=\"aa-display-topright aa-margin-right\">\n");
      out.write("                <h5 class=\"  aa-font-thin aa-color-text--white\" style=\"display: inline-block; padding-bottom: 25px;\">Hello ");
out.print(mnumber); 
      out.write(" </h5>\n");
      out.write("            </div>    \n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </header>\n");
      out.write("        <div class=\" aa-container\" >\n");
      out.write("            \n");
      out.write("\n");
      out.write("                \n");
      out.write("             <div class=\"aa-panel aa-card aa-round-xlarge aa-padding-xxxx aa-margin-top aa-animate-zoom\" style=\"width:850px;margin: auto ; background: none;\" >\n");
      out.write("                <!--here we declare our post -->    \n");
      out.write("                <div class=\"aa-input--group  \" >\n");
      out.write("                    <input class=\"aa-input  \" required=\"\"type=\"text\" style=\"width:100%;\" name=\"postData\">\n");
      out.write("                    <span class=\"aa-input--highlight \"></span>\n");
      out.write("                    <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                    <label class=\"aa-input--label\" >Whats in your mind</label>  \n");
      out.write("                 </div>                \n");
      out.write("                <input  type=\"submit\" value=\"Post\" class=\"aa-button\"  name=\"postBtn\" style=\"background-color: rgb(248,187,208) !important;\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"aa-container\">\n");
      out.write("                <div class=\"aa-loader-container\">\n");
      out.write("                <div id=\"aa-loader2\" class=\"aa-loader1\">\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                <!--here  post are shown -->    \n");
      out.write("\n");
      out.write("               \n");
      out.write("            <div class=\"aa-panel aa-card aa-round-xlarge aa-padding-xxxx aa-margin-top\" style=\"width:850px;margin: auto ; background: none;\" >\n");
      out.write("                    \n");
      out.write("                    <span style=\"height:150px;\">\n");
      out.write("                        <h3>Post </h3>\n");
      out.write("                    </span>\n");
      out.write("                    <hr>\n");
      out.write("                    <span>\n");
      out.write("                        <h6 class=\"post-name\"style=\"display:inline-block;\">Post by</h6>\n");
      out.write("                        <h6 class=\"post-datetime\"style=\"display:inline-block;\">date - time</h6>   \n");
      out.write("                        <input type=\"checkbox\" style=\"display:inline-block;\">\n");
      out.write("                        \n");
      out.write("                    </span>\n");
      out.write(" \n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
 out.print(request.getContextPath()); 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
