package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class sdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
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
      out.write("<body class=\"bg\" background=\"file:///C:/PROJECT/Images/ban4.jpg\">  \n");
      out.write("<div class=\"topnav\">\n");
      out.write("\t<img src=\"file:///C:/PROJECT/Images/LOGO.png\" alt=\"hkh\" width=\"50\" height=\"50\">\n");
      out.write("\t<font color=\"white\"><a href=\"#home\">A.R.A.M Education Center</a></font>\n");
      out.write("  <div class=\"topnav-right\">\n");
      out.write("  <a  href=\"home.jsp\">Home</a>\n");
      out.write("                <a href=\"course.jsp\">Course</a>\n");
      out.write("                <a href=\"login.jsp\">Login</a>\n");
      out.write("                <a href=\"gallery.jsp\">Gallery</a>\n");
      out.write("                <a href=\"contact.jsp\">Contact</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<center>\n");
      out.write("<font color=\"white\">\n");
      out.write("<br><br><br><h1>Details of Student</h1>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("       <table border=\"1\">\n");
      out.write("           <tr>\n");
      out.write("               <th>Name</th>\n");
      out.write("               <th>Father Name</th>\n");
      out.write("               <th>Mother Name</th>\n");
      out.write("               <th>Date of Birth</th>\n");
      out.write("               <th>Gender</th>\n");
      out.write("               <th>Email ID</th>\n");
      out.write("               <th>Mobile No.</th>\n");
      out.write("               <th>Address</th>\n");
      out.write("               <th>City</th>\n");
      out.write("               <th>State</th>\n");
      out.write("               <th>Zipcode</th>\n");
      out.write("               <th>Country</th>\n");
      out.write("               <th>Course Name</th>\n");
      out.write("           \n");
      out.write("      \n");
      out.write("           </tr>\n");
      out.write("               ");

                  Class.forName("org.sqlite.JDBC");
                  Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Sqllite/aman.db");
                  Statement stmt;
                  stmt=con.createStatement();
                  ResultSet rs=stmt.executeQuery("Select * from student");
                   while(rs.next())
                   {
                       
                   
      out.write("\n");
      out.write("                   <tr>\n");
      out.write("                       <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(10));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(11));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(12));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(13));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(14));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(15));
      out.write("</td>\n");
      out.write("                   </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                   </table>\n");
      out.write("    \n");
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
