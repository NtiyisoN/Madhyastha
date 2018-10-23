package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Managment.DatabaseManagement;
import Managment.RetriveTableEntity;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Profile</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"antima-style-min.css\">\n");
      out.write("        ");
  //for session
            response.setHeader("Cache-Control","no-cache,no-store");
            response.setHeader("Pragma","no-cache,no-store");
            HttpSession httpSession=request.getSession(false);
            if(httpSession==null)
                request.getRequestDispatcher("index.jsp").forward(request, response);
            //for string display
            String mnumber = (String) session.getAttribute("userID");
            long number = Long.parseLong(mnumber);
            //usebean
            DatabaseManagement db = new DatabaseManagement();
            RetriveTableEntity entity = db.RetriveTable("signup",number);
        
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .container{width: 1024px;height: 750px;background: white;margin: auto; }            \n");
      out.write("            .fb-profile img.cover{z-index: 0;width: 1024px;height: 400px;}\n");
      out.write("            .profile{margin: -90px 0px 0px 50px;z-index: 9;width: 250px;height: 250px; border-radius: 5px;border: 5px solid white; }\n");
      out.write("            .profile-text{margin-left: 50px;margin-right: 50px;}\n");
      out.write("            .cover{background: gray no-repeat fixed center; background-size: auto;}\n");
      out.write("            .cover-modal{ top: 100px;  display: none; position: absolute;}\n");
      out.write("        </style>  \n");
      out.write("\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div  class=\"container aa-padding-48 \">\n");
      out.write("            <div  class=\"fb-profile  \">\n");
      out.write("        \n");
      out.write("   \n");
      out.write("                                \n");
      out.write("\n");
      out.write("               \n");
      out.write("                <img  class=\"cover aa-shadow--16dp\" src=\"\" id=\"myBtn\" />   \n");
      out.write("                <img  class=\"profile\" src=\"images/profile.png\" />\n");
      out.write("  \n");
      out.write("\n");
      out.write("        \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profileModelForCover.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"profile-text\">\n");
      out.write("            \n");
      out.write("                    <h3>");
out.println(entity.getFirstname()+" "+entity.getLastname());
      out.write("</h3>\n");
      out.write("                    <h5>");
out.println(entity.getQuote());
      out.write("</h5>\n");
      out.write("        \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"\" style=\"width:300px; float:left;\">\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                <div class=\"fb-profile aa-card aa-padding-x\" style=\"width: 300px; height: 350px;\">\n");
      out.write("                    <img src=\"icons/ic_account_circle_black/ic_account_circle_black_48dp.png\" class=\"aa-circular\" style=\"width:50px; height: 50px; display: inline-block\">\n");
      out.write("                    <h5 class=\"aa-text-center\" style= \"display: inline-block\">Intro</h5>\n");
      out.write("                    <hr>\n");
      out.write("                    <h6>Lives in ");
out.println(entity.getCountry());
      out.write("</h6>\n");
      out.write("                    <h6>Gender ");
out.println(entity.getGender());
      out.write("</h6>\n");
      out.write("                    <h6>Date of birth ");
out.println(entity.getDob());
      out.write("</h6>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            \n");
      out.write("                <div class=\"fb-profile aa-card aa-padding-x\" style=\"width: 300px; height: 350px;\">\n");
      out.write("                    <img src=\"icons/ic_add_a_photo_black/ic_add_a_photo_black_48dp.png\" class=\"aa-circular\" style=\"width:35px; height: 35px; display: inline-block\">\n");
      out.write("                    <h5 class=\"aa-text-center\" style= \"display: inline-block\">Photos</h5>\n");
      out.write("                    <hr>\n");
      out.write("                    <img src=\"\" class=\"aa-col--6\" style=\" height: 100px; display: inline-block ;\">\n");
      out.write("                    <img src=\"\" class=\"aa-col--6\" style=\" height: 100px; display: inline-block ;\">\n");
      out.write("                </div>  \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            \n");
      out.write("                <div class=\"fb-profile aa-card aa-padding-x\" style=\"width: 300px; height: 350px;\">\n");
      out.write("                    <img src=\"icons/ic_people_black/ic_people_black_48dp.png\" class=\"aa-circular\" style=\"width:50px; height: 50px; display: inline-block\">\n");
      out.write("                    <h5 class=\"aa-text-center\" style= \"display: inline-block\">Friends</h5>\n");
      out.write("                    <hr>\n");
      out.write("                </div>                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"aa-card aa-padding-x\"style=\"float:right; width:720px;height: 400px;\">\n");
      out.write("                \n");
      out.write("                    <img src=\"\" class=\"aa-circular\" style=\"width:50px; height: 50px; display: inline-block ;\">\n");
      out.write("                    <div style= \"display: inline-block; height: 50px;width: 600px;\">\n");
      out.write("                        <h6  style=\"height: 35px; margin:0px;padding:0px;\">Friends</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\" aa-border--grey\"style=\"width:100%;height:250px; border: 1px solid #ccc; \">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"aa-padding-x\" style=\"width: 100%; height: 50px;\">\n");
      out.write("                        <div class=\"aa-col--6\" style=\"height:45px;\">\n");
      out.write("                            <div style=\"height:45px;\">\n");
      out.write("                                <input type=\"button\" class=\"aa-text-center aa-ripple aa-hover-sepia aa-color--white\" style=\"width:100%;height:45px; border: none;\"value=\"Like\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"aa-col--6 \">\n");
      out.write("                            <div style=\"height:45px;\">\n");
      out.write("                                <input type=\"button\" class=\"aa-text-center aa-ripple aa-hover-sepia aa-color--white\" style=\"width:100%;height:45px; border: none;\"value=\"Comment\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write(" \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("   \n");
      out.write("             \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
