package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class posts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    \n");
      out.write("<div class=\"aa-card aa-padding-x\"style=\" width:720px;height: 400px; margin: auto;\">\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("    <img src=\"\" class=\"aa-circular\" style=\"width:50px; height: 50px; display: inline-block ;\">\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("    <div style= \"display: inline-block; height: 50px;width: 600px;\">\n");
      out.write("                           \n");
      out.write("        <h6  style=\"height: 35px; margin:0px;padding:0px;\">Friends</h6>\n");
      out.write("                        \n");
      out.write("    </div>\n");
      out.write("                        \n");
      out.write("    <hr>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("    <div class=\" aa-border--grey\"style=\"width:100%;height:250px; border: 1px solid #ccc; \">\n");
      out.write("                       \n");
      out.write("                           \n");
      out.write("        ");
 out.print(request.getParameter("val").toString()) ;
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("        <div class=\"aa-padding-x\" style=\"width: 100%; height: 50px;\">\n");
      out.write("                            \n");
      out.write("            <div class=\"aa-col--6\" style=\"height:45px;\">\n");
      out.write("                                \n");
      out.write("                <div style=\"height:45px;\">\n");
      out.write("                                    \n");
      out.write("                    <input type=\"button\" class=\"aa-text-center aa-ripple aa-hover-sepia aa-color--white\" style=\"width:100%;height:45px; border: none;\"value=\"Like\">\n");
      out.write("                                \n");
      out.write("                </div>\n");
      out.write("                            \n");
      out.write("            </div>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("            <div class=\"aa-col--6 \">\n");
      out.write("                            \n");
      out.write("                                \n");
      out.write("                <div style=\"height:45px;\">\n");
      out.write("                                   \n");
      out.write("                    <input type=\"button\" class=\"aa-text-center aa-ripple aa-hover-sepia aa-color--white\" style=\"width:100%;height:45px; border: none;\"value=\"Comment\">\n");
      out.write("                               \n");
      out.write("                </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("            </div>\n");
      out.write("                        \n");
      out.write("        </div>\n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("</div>\n");
      out.write("                    \n");
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
