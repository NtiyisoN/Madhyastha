package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Managment.RetriveTableEntity;
import Managment.DatabaseManagement;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("                \n");
      out.write("        <link rel=\"stylesheet\" href=\"antima-style-min.css\">\n");
      out.write("                \n");
      out.write("        ");

            //for session
            response.setHeader("Cache-Control","no-cache,no-store");
            response.setHeader("Pragma","no-cache,no-store");
            HttpSession httpSession=request.getSession(false);
            if(httpSession==null)
                request.getRequestDispatcher("index.jsp").forward(request, response);
            
            DatabaseManagement db = new DatabaseManagement();
            RetriveTableEntity entity;
            
     
        
      out.write("      \n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("            .aa-input--bar:before, .aa-input--bar:after { background:rgb(233,30,99) !important;}\n");
      out.write("            .aa-input:focus ~ .aa-input--label, .aa-input:valid ~ .aa-input--label{ color: rgb(233,30,99) !important; }\n");
      out.write("            .posts {margin-top: 100px;}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\" aa-container \" >\n");
      out.write("            \n");
      out.write("            <div class=\"posts\">\n");
      out.write("             \n");
      out.write("\n");
      out.write("                \n");
      out.write("                             \n");
      out.write("                <div class=\"aa-panel aa-card aa-round-xlarge aa-padding-48  aa-margin-top aa-animate-zoom\" style=\"width:850px;margin: auto ; background: none; margin-top: 100px;\" >\n");
      out.write("                \n");
      out.write("                    <!--here we declare our post -->    \n");
      out.write("                \n");
      out.write("                    <form class=\"aa-input--group  \"action=\"Search\" >\n");
      out.write("                        <input class=\"aa-input  \" required=\"\" type=\"text\" style=\"width:100%;\" name=\"searchData\">\n");
      out.write("                        <span class=\"aa-input--highlight \"></span>\n");
      out.write("                        <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                        <label class=\"aa-input--label\" >Search your love once</label> \n");
      out.write("                        <div style=\"width:100%; margin-top:50px;\">                    \n");
      out.write("                            <input  type=\"submit\" value=\"Post\" class=\"aa-button aa-color-text--white aa-ripple\"  name=\"postBtn\" style=\"background-color: #ff4081; float: right;\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("            \n");
      out.write("                </div>\n");
      out.write("                      \n");
      out.write("            </div>\n");
      out.write("        ");

            out.print("        <jsp:include page="+"results.jsp"+"></jsp:include>");
        
      out.write("\n");
      out.write("      \n");
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
