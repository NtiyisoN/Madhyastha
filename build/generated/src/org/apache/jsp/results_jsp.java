package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Managment.RetriveTableEntity;
import Managment.DatabaseManagement;

public final class results_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
 
            String UInput = request.getParameter("searchData");
            DatabaseManagement db = new DatabaseManagement();
            RetriveTableEntity entity = db.RetriveInfoFromSignup(UInput);
        
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        ");
 
        for(int i=0;i<=entity.getList().toArray().length-1;i++){
        
      out.write("\n");
      out.write("        <div class=\"posts\">\n");
      out.write("            <div class=\"aa-panel aa-card aa-round-xlarge aa-padding-48  aa-margin-top aa-animate-zoom\" style=\"width:850px;margin: auto ; background: none; margin-top: 100px;\" >\n");
      out.write("                <img src=\"\" class=\"aa-circular\" style=\"width:50px; height: 50px; display: inline-block ;\">\n");
      out.write("                    <div style= \"display: inline-block; height: 50px;width: 600px;\">\n");
      out.write("                        \n");
      out.write("                        ");

                            out.print("<a href='other_profile.jsp'>");
                            out.print("<h5>"+entity.getList().get(i)+"</h5>");
                                                        
                            out.print("<h5>"+entity.getCountry()+"</h5>");

                            out.print("</a>");
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <hr>  \n");
      out.write("                        \n");
      out.write("                    <div style=\"width:100%; margin-top:50px;\">                    \n");
      out.write("                        <input  type=\"submit\" value=\"Send Friend Request\" class=\"aa-button aa-color-text--white aa-ripple\"  name=\"\" style=\"background-color: #ff4081;  float: right;\">\n");
      out.write("                    </div>\n");
      out.write("            </div>                \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("      ");

      }
       
      out.write('\n');
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
