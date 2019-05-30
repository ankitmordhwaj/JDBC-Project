package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newrecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a.hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a.active {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav-right {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("body, html {\n");
      out.write("    height: 100%;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg {\n");
      out.write("    /* The image used *\n");
      out.write("\n");
      out.write("    /* Full height */\n");
      out.write("    height: 100%; \n");
      out.write("\n");
      out.write("    /* Center and scale the image nicely */\n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<title>A.R.A.M Education Center</title>\n");
      out.write("<body class=\"bg\" background=\"file:///C:/PROJECT/Images/ban4.jpg\">   \n");
      out.write("<div class=\"topnav\">\n");
      out.write("\t<img src=\"file:///C:/PROJECT/Images/LOGO.png\" alt=\"hkh\" width=\"50\" height=\"50\">\n");
      out.write("\t<font color=\"white\"><a href=\"#home\">A.R.A.M Education Center</a></font>\n");
      out.write("  <div class=\"topnav-right\">\n");
      out.write(" <a  href=\"home.jsp\">Home</a>\n");
      out.write("                <a href=\"course.jsp\">Course</a>\n");
      out.write("                <a href=\"login.jsp\">Login</a>\n");
      out.write("                <a href=\"gallery.jsp\">Gallery</a>\n");
      out.write("                <a href=\"contact.jsp\">Contact</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<h1><font color=\"white\"><center>Add New Student<font></center></h1>\n");
      out.write("<font color=\"#00FFFF\">\n");
      out.write("<h3>\n");
      out.write("    <form action=\"record\">\n");
      out.write("                User ID&#160  \n");
      out.write("                <input type=\"text\" name=\"id\">\n");
      out.write("               &#160<br> <br>Password &#160\n");
      out.write("                <input type=\"password\" name=\"pass\">\n");
      out.write("                &#160<br><br>Full Name&#160  \n");
      out.write("                <input type=\"text\" name=\"name\"  >\n");
      out.write("               &#160<br> <br>Father Name &#160\n");
      out.write("                <input type=\"text\" name=\"fname\">\n");
      out.write("              &#160 <br><br> Mother Name&#160\n");
      out.write("                <input type=\"text\" name=\"mname\" >\n");
      out.write("               &#160 <br><br> Date of Birth &#160\n");
      out.write("               <input type=\"text\" name=\"dob\" >\n");
      out.write("                 &#160 <br> <br>  Gender&#160\n");
      out.write("                <input type=\"radio\" name=\"gender\" value=\"male\" > Male&#160\n");
      out.write("                <input type=\"radio\" name=\"gender\" value=\"female\"> Female&#160\n");
      out.write("                <input type=\"radio\" name=\"gender\" value=\"other\"> Other&#160\n");
      out.write("             &#160 <br> <br>  Email ID&#160\n");
      out.write("                <input type=\"email\" name=\"email\" >\n");
      out.write("             &#160 <br> <br>  Mobile Number&#160\n");
      out.write("                <input type=\"text\" name=\"pno\" >\n");
      out.write("              &#160 <br> <br> Address&#160\n");
      out.write("                  <input type=\"text\" name=\"address\" >\n");
      out.write("              &#160 <br> <br> City&#160\n");
      out.write("                  <input type=\"text\" name=\"city\">\n");
      out.write("              &#160<br>  <br>  State&#160\n");
      out.write("                  <input type=\"text\" name=\"state\">\n");
      out.write("              &#160<br>  <br>  Zipcode&#160\n");
      out.write("                  <input type=\"text\" name=\"zipcode\">\n");
      out.write("             &#160 <br>  <br>  Country&#160\n");
      out.write("                  <input type=\"text\" name=\"country\">\n");
      out.write("                  </li>\n");
      out.write("             &#160 <br> <br> Course name&#160\n");
      out.write("                 <select name=\"course\">\n");
      out.write("                    <option> &nbsp </option>\n");
      out.write("                    <option value=\"HTML\">HTML</option>\n");
      out.write("                    <option value=\"CSS\">CSS</option>\n");
      out.write("                    <option value=\"Bootstrap\">Bootstrap</option>\n");
      out.write("                    <option value=\"XML\">XML</option>\n");
      out.write("                    <option value=\"JavaScript\">JavaScript</option>\n");
      out.write("                    <option value=\">jQuery\">jQuery</option>\n");
      out.write("                    <option value=\"AngularJS\">AngularJS</option>\n");
      out.write("                    <option value=\"JSON\">JSON</option>\n");
      out.write("                    <option value=\"AJAX\">AJAX</option>\n");
      out.write("                    <option value=\"SQL\">SQL</option>\n");
      out.write("                    <option value=\"PHP\">PHP</option>\n");
      out.write("                    <option value=\"ASP\">ASP</option>\n");
      out.write("                  </select><br><br>\n");
      out.write("                  <a href=\"newrecord.jsp\"> <input type=\"submit\" value=\"Submit\" onclick=\"alert('Thanks for applying.')\"></a><br><br>        \n");
      out.write("</form>\n");
      out.write("</h3>\n");
      out.write("</font>\n");
      out.write("</center>\n");
      out.write("</body>\n");
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
