package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      Managment.DatabaseManagement data = null;
      synchronized (_jspx_page_context) {
        data = (Managment.DatabaseManagement) _jspx_page_context.getAttribute("data", PageContext.PAGE_SCOPE);
        if (data == null){
          data = new Managment.DatabaseManagement();
          _jspx_page_context.setAttribute("data", data, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      Calender.Calender greeting = null;
      synchronized (_jspx_page_context) {
        greeting = (Calender.Calender) _jspx_page_context.getAttribute("greeting", PageContext.PAGE_SCOPE);
        if (greeting == null){
          greeting = new Calender.Calender();
          _jspx_page_context.setAttribute("greeting", greeting, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");

   HttpSession hs=request.getSession(false);
   System.out.println("In header "+hs.getId());
   //for string display
   String mnumber = request.getParameter("mnumber");
   long number = Long.parseLong(mnumber);
   //usebean
   String name = data.RetriveNameFromSignup("signup", number);
   String Toast = greeting.Toast();
   


      out.write("     \n");
      out.write("    \n");
      out.write("            \n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"antima-style-min.css\">\n");
      out.write("        <style>\n");
      out.write("            .header{width: 100%;height: 50px;background-color:#ff4081; display:inline-flex}\n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header aa-display-container\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form action=\"\">\n");
      out.write("                <input class=\"aa-input\" placeholder=\"Search\" style=\"background:transparent; display: inline-block; margin-left: 20px;\">\n");
      out.write("                <input type=\"button\" class=\"aa-button  \" style=\"background:transparent; margin-left: 20px; display: inline-block;\" value=\"Search\"> \n");
      out.write("            </form>     \n");
      out.write("\n");
      out.write("            <a class=\"aa-button aa-padding-16 \" style=\"background:transparent;  margin-left: 20px; display: inline-block;\" href=\"ServletProfile\" >Profile</a>\n");
      out.write("            <a class=\"aa-button aa-padding-16 \" style=\"background:transparent;  margin-left: 20px; display: inline-block;\" href=\"\" >Page</a>\n");
      out.write("            <a class=\"aa-button aa-padding-16 \" style=\"background:transparent;  margin-left: 20px; display: inline-block; \" href=\"LogoutController\" >Log out</a>\n");
      out.write("            <div class=\"aa-display-topright aa-margin-right\">\n");
      out.write("                <h5 class=\"  aa-font-thin aa-color-text--white\" style=\"display: inline-block; padding-bottom: 25px;\"> ");
out.print(Toast+" "+name);
      out.write(" </h5>\n");
      out.write("            </div>    \n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </header>\n");
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
