package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class messageLayout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("                <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("                <style>\n");
      out.write("            .messaging-container{width:325px; height: 300px; background: #ccc;}\n");
      out.write("            .messaging-header{ width: 100%; height: 35px; background-color: #ff4081;}\n");
      out.write("            .messaging-content{width: 100%; height: 350px; background: #FFFFFF;}\n");
      out.write("            .messenger-name{text-align: center;}\n");
      out.write("            .send-messaging{ width: 100%; background: whitesmoke;}\n");
      out.write("            .text-messaging{width: 250px; height: 50px; border:1px solid #ccc; border-radius: 5px; background: #fff; display: inline; font-size: 15px; outline:none;}\n");
      out.write("            .text-messaging::placeholder{padding-left: 5px;}\n");
      out.write("            .messaging-title{ width: 300px;margin: auto; padding-top: 5px;}\n");
      out.write("            .messenger-name{display: inline;}\n");
      out.write("            /* The Close Button */\n");
      out.write("            .close {color: #aaaaaa;float: right;font-size: 28px;font-weight: bold; display: inline;}\n");
      out.write("            .close:hover,.close:focus {color: #000;text-decoration: none;cursor: pointer;}\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            .messenging-right{ width: 170px; height: 110px; background: #ccc;}\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                </style>\n");
      out.write("                \n");
      out.write("                <div style=\" z-index: 1; height: 440px;  bottom: 0px; right: 0px; position: fixed; display: none;  \" class=\"aa-color--black\" id=\"messenger-layout\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("        <div class=\"messaging-container\" id=\"myModal\">  \n");
      out.write("            <div class=\"messaging-header\">\n");
      out.write("                <div class=\"messaging-title\">\n");
      out.write("                    <h5 class=\"messenger-name\">name</h5>\n");
      out.write("                    <span class=\"close\">&times;</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"messaging-content\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"send-messaging aa-padding-x\">\n");
      out.write("                <input type=\"text\" placeholder=\"send message\" class=\" aa-input text-messaging\">\n");
      out.write("                <div style=\"height: 50px; width: 50px; display:inline;\">\n");
      out.write("                    <button style=\" display:inline;  width: 50px;  background: transparent;border: 0;cursor: pointer;flex: 0 0 auto;padding-top: 0px;position: absolute;outline: none;\"> <i class=\"material-icons\" style=\" margin-top: 5px;font-size:40px;color:#ff4081;\">send</i></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <script>\n");
      out.write("            var modal = document.getElementById('myModal');\n");
      out.write("            var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("            // When the user clicks on <span> (x), close the modal\n");
      out.write("            span.onclick = function() {\n");
      out.write("                modal.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("            // When the user clicks anywhere outside of the modal, close it\n");
      out.write("            window.onclick = function(event) {\n");
      out.write("                if (event.target == modal) {\n");
      out.write("                    modal.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("                \n");
      out.write("        </script>\n");
      out.write("</div>");
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
