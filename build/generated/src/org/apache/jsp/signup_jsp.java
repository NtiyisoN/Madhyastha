package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"antima-style-min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("            \n");
      out.write("        <style>\n");
      out.write("        \n");
      out.write("            .aa-input--bar:before, .aa-input--bar:after { background:rgb(233,30,99) !important;}\n");
      out.write("            .aa-input:focus ~ .aa-input--label, .aa-input:valid ~ .aa-input--label{ color: rgb(233,30,99) !important; }\n");
      out.write("    \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"aa-padding-64 \"style=\"background:linear-gradient(90deg,#ff4081,#ffff);\">\n");
      out.write("\n");
      out.write("        <div class=\"aa-padding-xxxx \">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                    <form action=\"ServletSignup\" method=\"POST\"  class=\" aa-card-4 aa-animate-zoom aa-panel aa-round-xxlarge  aa-padding-xxxx\" style=\"; margin:auto ;width:750px;height: auto; background-color: #ffff\">\n");
      out.write("                            \n");
      out.write("            \n");
      out.write("                        <h5>Madhyastha</h5>\n");
      out.write("                        <h5>Sign up</h5>\n");
      out.write("                        <div class=\"aa-input--group\">\n");
      out.write("                            \n");
      out.write("                            <input type =\"text\" required=\"\" name=\"firstname\"  class=\"aa-input\" style=\"width:100%; background:transparent \" >\n");
      out.write("                            <span class=\"aa-input--highlight \"></span>\n");
      out.write("                            <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                            <label class=\"aa-input--label\" >First Name</label> \n");
      out.write("                \n");
      out.write("           \n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                        <div class=\"aa-input--group\">\n");
      out.write("\n");
      out.write("                            <input type =\"text\" required=\"\" name=\"lastname\"  class=\"aa-input\" style=\"width:100%; background:transparent \"  >\n");
      out.write("                            <span class=\"aa-input--highlight \"></span>\n");
      out.write("                            <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                            <label class=\"aa-input--label\" >Last Name</label> \n");
      out.write("                        \n");
      out.write("            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"aa-input--group\">\n");
      out.write("\n");
      out.write("                            <input type =\"text\" required=\"\" name=\"mnumber\"  class=\"aa-input\" style=\"width:100%; background:transparent \"  >\n");
      out.write("                            <span class=\"aa-input--highlight \"></span>\n");
      out.write("                            <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                            <label class=\"aa-input--label\" >mobile number</label> \n");
      out.write("                        \n");
      out.write("            \n");
      out.write("                        </div>    \n");
      out.write("                        \n");
      out.write("                \n");
      out.write("                        <div class=\"aa-input--group\">\n");
      out.write("\n");
      out.write("                            <input type =\"text\" required=\"\" name=\"country\"  class=\"aa-input\" style=\"width:100%; background:transparent \"  >\n");
      out.write("                            <span class=\"aa-input--highlight \"></span>\n");
      out.write("                            <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                            <label class=\"aa-input--label\" >Country</label> \n");
      out.write("                        \n");
      out.write("            \n");
      out.write("                        </div>                     \n");
      out.write("            \n");
      out.write("\n");
      out.write("                        \n");
      out.write("                     \n");
      out.write("                        <div class=\"aa-input--group\">\n");
      out.write("\n");
      out.write("                            <select type =\"text\" required=\"\" name=\"countrycode\"  class=\"aa-input\" style=\"width:100%; background:transparent \"  >\n");
      out.write("                                \n");
      out.write("                                <option></option>\n");
      out.write("                                <option>+91</option>\n");
      out.write("                                <option>+92</option>\n");
      out.write("                                <option>+1</option>\n");
      out.write("                            </select>\n");
      out.write("                            <span class=\"aa-input--highlight \"></span>\n");
      out.write("                            <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                            <label class=\"aa-input--label\" >Country code</label> \n");
      out.write("                        \n");
      out.write("            \n");
      out.write("                        </div>  \n");
      out.write("                        \n");
      out.write("                        <span>\n");
      out.write("                            \n");
      out.write("                            <h6>Date of birth</h6>\n");
      out.write("                                                    \n");
      out.write("                            <div class=\"aa-input--group\"style=\"display:inline-block\">\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                                <input type =\"text\" required=\"\" name=\"date\"  class=\"aa-input\" style=\"width:100px; background:transparent \"  >\n");
      out.write("                                <span class=\"aa-input--highlight \"></span>\n");
      out.write("                                <span class=\"aa-input--bar\" style=\"width:100px;\"></span>\n");
      out.write("                                <label class=\"aa-input--label\" >Date</label> \n");
      out.write("                                               \n");
      out.write("                            </div>    \n");
      out.write("                        \n");
      out.write("                                                \n");
      out.write("                        \n");
      out.write("                            <div class=\"aa-input--group\" style=\"display:inline-block\">\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                                <select type =\"text\" required=\"\" name=\"month\"  class=\"aa-input\" style=\"width:100px; background:transparent \"  >\n");
      out.write("                                \n");
      out.write("                                    <option value></option>\n");
      out.write("                                    <option value=\"1\">January</option>\n");
      out.write("                                    <option value=\"2\">February</option>\n");
      out.write("                                    <option value=\"3\">March</option>\n");
      out.write("                                    <option value=\"4\">April</option>\n");
      out.write("                                    <option value=\"5\">May</option>\n");
      out.write("                                    <option value=\"6\">June</option>   \n");
      out.write("                                    <option value=\"7\">July</option>\n");
      out.write("                                    <option value=\"8\">August</option>\n");
      out.write("                                    <option value=\"9\">September</option>\n");
      out.write("                                    <option value=\"10\">October</option>\n");
      out.write("                                    <option value=\"11\">November</option>\n");
      out.write("                                    <option value=\"12\">December</option>                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                </select>\n");
      out.write("                                <span class=\"aa-input--highlight \"></span>\n");
      out.write("                                <span class=\"aa-input--bar\" style=\"width:100px;\"></span>\n");
      out.write("                                <label class=\"aa-input--label\" >month</label> \n");
      out.write("                        \n");
      out.write("                            </div>  \n");
      out.write("                        \n");
      out.write("                                                \n");
      out.write("                        \n");
      out.write("                            <div class=\"aa-input--group\" style=\"display:inline-block\">\n");
      out.write("\n");
      out.write("                                <input type =\"text\" required=\"\" name=\"year\"  class=\"aa-input\" style=\"width:100px; background:transparent \"  >\n");
      out.write("                                <span class=\"aa-input--highlight \"></span>\n");
      out.write("                                <span class=\"aa-input--bar\" style=\"width:100px;\"></span>\n");
      out.write("                                <label class=\"aa-input--label\" >year</label> \n");
      out.write("                        \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </span>\n");
      out.write("                        \n");
      out.write("  \n");
      out.write("                        \n");
      out.write("                        <div class=\"aa-input--group\">\n");
      out.write("\n");
      out.write("                            <select type =\"text\" required=\"\" name=\"gender\"  class=\"aa-input\" style=\"width:100%; background:transparent \"  >\n");
      out.write("                                <option></option>\n");
      out.write("                                <option>Male</option>\n");
      out.write("                                <option>Female</option>\n");
      out.write("                                <option>Rather not say</option>      \n");
      out.write("                                <option>Custom</option>                                \n");
      out.write("                            </select>\n");
      out.write("                            <span class=\"aa-input--highlight \"></span>\n");
      out.write("                            <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                            <label class=\"aa-input--label\" >Gender</label> \n");
      out.write("                        \n");
      out.write("            \n");
      out.write("                        </div>    \n");
      out.write("                    \n");
      out.write("                        <div class=\"aa-input--group\">\n");
      out.write("\n");
      out.write("                            <input type =\"text\" required=\"\" name=\"password\"  class=\"aa-input\" style=\"width:100%; background:transparent \"  >\n");
      out.write("                            <span class=\"aa-input--highlight \"></span>\n");
      out.write("                            <span class=\"aa-input--bar\" style=\"width:100%\"></span>\n");
      out.write("                            <label class=\"aa-input--label\" >Password</label> \n");
      out.write("                        \n");
      out.write("            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"aa-container\">\n");
      out.write("                            <h6>Enter following captcha</h6>\n");
      out.write("\n");
      out.write("                            <img src=\"Captcha\" style=\"display:inline-block;\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"aa-input--group\" style=\"display:inline-block;\">\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                                <input type =\"text\" required=\"\" name=\"captcha\"  class=\"aa-input\" style=\"width:200px; background:transparent \"  >\n");
      out.write("                                <span class=\"aa-input--highlight \"></span>\n");
      out.write("                                <span class=\"aa-input--bar\" style=\"width:200px;\"></span>\n");
      out.write("                                <label class=\"aa-input--label\" >Enter captcha</label> \n");
      out.write("                        \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <input type=\"submit\" value=\"submit\" class=\"aa-button\"  name=\"search\" Style=\"width:100%;background-color: #ff4081;color: white;\"> \n");
      out.write("\n");
      out.write("           \n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <span>Login account</span>\n");
      out.write("                        <a  style=\"text-decoration: none\"  href=\"index.jsp\">Log in</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("                    </form> \n");
      out.write(" \n");
      out.write("        </div>\n");
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
