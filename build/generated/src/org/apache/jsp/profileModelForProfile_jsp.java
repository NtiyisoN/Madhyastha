package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Managment.RetriveTableEntity;
import Managment.DatabaseManagement;

public final class profileModelForProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <style>       \n");
      out.write("            /* The Modal (background) */\n");
      out.write("            .modal-profile {display: none; position: fixed;z-index: 1;padding-top: 100px; left: 0;top: 0;width: 100%;height: 100%; overflow: auto;  background-color: rgba(0,0,0,0.4);}\n");
      out.write("            /* Modal Content */\n");
      out.write("            .modal-content {background-color: #fefefe;margin: auto;padding: 20px;border: 1px solid #888;width: 80%;border-radius: 10px;}\n");
      out.write("            /* The Close Button */\n");
      out.write("            .close {color: #aaaaaa;float: right;font-size: 28px;font-weight: bold;}\n");
      out.write("            .close:hover,.close:focus {color: #000;text-decoration: none;cursor: pointer;}\n");
      out.write("            .modal-subtitle{text-align: center;}\n");
      out.write("            #upload-file{display: none;}\n");
      out.write("            .lable-upload-file{ height: 200px; width: 450px; margin: auto;  background-image: url(\"icons/ic_add_black/ic_add_black_48dp.png\") ; background-repeat:no-repeat; background-position: center; border: 1px solid #ccc;}\n");
      out.write("            .lable-upload-preview{ height: 200px; width: 450px; margin: auto; }\n");
      out.write("            #blah{width: 100%; height: 200px;}\n");
      out.write("\n");
      out.write("            .submit-section{width: 100%; height: 50px; padding: 5px;}\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("     \n");
      out.write("      function readURLForProfile(input) {\n");
      out.write("            if (input.files && input.files[0]) {\n");
      out.write("                var reader = new FileReader();\n");
      out.write("\n");
      out.write("                reader.onload = function (e) {\n");
      out.write("                    $('#blah')\n");
      out.write("                        .attr('src', e.target.result);\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                reader.readAsDataURL(input.files[0]);\n");
      out.write("            }\n");
      out.write("        }            \n");
      out.write("        </script>\n");
      out.write("     \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("         <!-- The Modal -->\n");
      out.write("\n");
      out.write("         <div id=\"myModal\" class=\"modal-profile\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("             <!-- Modal content -->\n");
      out.write("  \n");
      out.write("             <div class=\"modal-content aa-animate-zoom\" style=\"\">\n");
      out.write("                 <span class=\"close\">&times;</span>\n");
      out.write("                 <div>\n");
      out.write("                   <h3>Upload cover photo or choose from uploaded photos.</h3>\n");
      out.write("                 </div>\n");
      out.write("                             \n");
      out.write("                 <form action=\"CoverPhoto\"  method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                     \n");
      out.write("                 \n");
      out.write("                     <div style=\"width: 100%; height: 350px; border:1px solid #ccc;\">\n");
      out.write("                     \n");
      out.write("                         <div style=\"width: 50%; height: 100%; float: left;\">\n");
      out.write("                         \n");
      out.write("                             <h5 class=\"modal-subtitle\">Upload photo</h5>  \n");
      out.write("                             <input type=\"file\"  name=\"cover\" id=\"upload-file\"  onchange=\"readURLForProfile(this);\" >\n");
      out.write("                             <label for=\"upload-file\" >\n");
      out.write("                                 <div class=\"lable-upload-file aa-ripple\">\n");
      out.write("                                 </div>\n");
      out.write("                             </label>\n");
      out.write("                         </div> \n");
      out.write("                         <div style=\"width: 50%; height: 100%; float: right;\">\n");
      out.write("                             <h5 class=\"modal-subtitle\">Preview photo</h5>  \n");
      out.write("                             <div class=\"lable-upload-preview aa-ripple\">\n");
      out.write("                                 <img id=\"blah\" src=\"http://placehold.it/180\" alt=\"your image\" />\n");
      out.write("                             </div>\n");
      out.write("                         </div>   \n");
      out.write("                 \n");
      out.write("                     </div>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 <div class=\"submit-section\">\n");
      out.write("                     <input type=\"submit\" class=\"aa-button aa-ripple aa-color--pink aa-text-uppercase aa-border-0 aa-color-text--white\" style=\"float: right; \" value=\"submit\">\n");
      out.write("                 </div>                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                 </form>\n");
      out.write("    \n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <script>\n");
      out.write("             // Get the modal    \n");
      out.write("              var modal = document.getElementById('myModal');\n");
      out.write("             // Get the button that opens the modal\n");
      out.write("              var btn = document.getElementById(\"myBtn\");\n");
      out.write("              // Get the <span> element that closes the modal\n");
      out.write("              var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("              // When the user clicks the button, open the modal \n");
      out.write("              btn.onclick = function() {\n");
      out.write("                  modal.style.display = \"block\";\n");
      out.write("              }\n");
      out.write("              // When the user clicks on <span> (x), close the modal\n");
      out.write("              span.onclick = function() {\n");
      out.write("                  modal.style.display = \"none\";\n");
      out.write("              }\n");
      out.write("\n");
      out.write("              // When the user clicks anywhere outside of the modal, close it\n");
      out.write("              window.onclick = function(event) {\n");
      out.write("                  if (event.target == modal) {\n");
      out.write("                     modal.style.display = \"none\";\n");
      out.write("                   }\n");
      out.write("              }            \n");
      out.write("        </script>\n");
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
