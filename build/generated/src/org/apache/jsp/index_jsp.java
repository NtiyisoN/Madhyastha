package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Log in</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("                <link rel=\"stylesheet\" href=\"antima-style-min.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("            .aa-input--bar:before, .aa-input--bar:after { background:rgb(233,30,99) !important;}\n");
      out.write("            .aa-input:focus ~ .aa-input--label, .aa-input:valid ~ .aa-input--label{ color: rgb(233,30,99) !important; }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"aa-padding-64 \"style=\"background:linear-gradient(180deg,#ff4081,#ffff);;\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"aa-padding-xxxx \">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                    <form action=\"ServletLogin\" method=\"POST\"  class=\" aa-card-4 aa-animate-zoom aa-panel aa-round-xxlarge  aa-padding-xxxx\" style=\"; margin:auto ;width:750px;height: auto; background-color: #ffff\">\n");
      out.write("                            \n");
      out.write("            \n");
      out.write("                        <h5>Madhyastha</h5>\n");
      out.write("                        <h5>Sign in</h5>\n");
      out.write("                        <h6>with your phone number</h6>\n");
      out.write("                        <div class=\"aa-input--group\">\n");
      out.write("                            \n");
      out.write("                            <input type =\"text\" required=\"\" name=\"mnumber\"  class=\"aa-input\" style=\"width:100%; background:transparent \" >\n");
      out.write("                            <span class=\"aa-input--highlight \"></span>\n");
      out.write("                            <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                            <label class=\"aa-input--label\" >Phone number</label> \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("                        <div class=\"aa-input--group\">\n");
      out.write("\n");
      out.write("                            <input type =\"text\" required=\"\" name=\"password\"  class=\"aa-input\" style=\"width:100%; background:transparent \"  >\n");
      out.write("                            <span class=\"aa-input--highlight \"></span>\n");
      out.write("                            <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                            <label class=\"aa-input--label\" >Password</label> \n");
      out.write("                        \n");
      out.write("            \n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                        <input type=\"submit\" value=\"Log in\" class=\"aa-button\"Style=\"width:100%;background-color: #ff4081;;color: white;\"> \n");
      out.write("\n");
      out.write("           \n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <span>Forgot</span>\n");
      out.write("                        <a  style=\"text-decoration: none;\"  href=\"signup.jsp\">Password</a>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <span>Create account</span>\n");
      out.write("                        <a  style=\"text-decoration: none;\"  href=\"signup.jsp\">Sign up</a>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("                    </form> \n");
      out.write("            \n");
      out.write("            ");
 out.print(request.getContextPath()); 
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("   \n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
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
