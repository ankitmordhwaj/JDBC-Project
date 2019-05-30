<%-- 
    Document   : sdetails
    Created on : 23 Apr, 2018, 11:42:10 PM
    Author     : amany
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a.hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}

.topnav-right {
  float: right;
}
body, html {
    height: 100%;
    margin: 0;
}

.bg {
    /* The image used *

    /* Full height */
    height: 100%; 

    /* Center and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
</style>
<title>A.R.A.M Education Center</title>
<body class="bg" background="file:///C:/PROJECT/Images/ban4.jpg">  
<div class="topnav">
	<img src="file:///C:/PROJECT/Images/LOGO.png" alt="hkh" width="50" height="50">
	<font color="white"><a href="#home">A.R.A.M Education Center</a></font>
  <div class="topnav-right">
  <a  href="home.jsp">Home</a>
                <a href="course.jsp">Course</a>
                <a href="login.jsp">Login</a>
                <a href="gallery.jsp">Gallery</a>
                <a href="contact.jsp">Contact</a>
  </div>
</div>
<center>
<font color="white">
<br><br><br><h1>Details of Student</h1>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
       <table border="1">
           <tr>
               <th>Name</th>
               <th>Father Name</th>
               <th>Mother Name</th>
               <th>Date of Birth</th>
               <th>Gender</th>
               <th>Email ID</th>
               <th>Mobile No.</th>
               <th>Address</th>
               <th>City</th>
               <th>State</th>
               <th>Zipcode</th>
               <th>Country</th>
               <th>Course Name</th>
           
      
           </tr>
               <%
                  String ID=request.getParameter("id");
                  String sql="Select * from student where id=?";
                   Class.forName("org.sqlite.JDBC");
                  Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Sqllite/aman.db");
                  PreparedStatement stmt=con.prepareStatement(sql);
                   stmt.setString(1,ID);
                  ResultSet rs=stmt.executeQuery();
                   while(rs.next())
                   {
                       
                   %>
                   <tr>
                       <td><%=rs.getString(3)%></td>
                       <td><%=rs.getString(4)%></td>
                       <td><%=rs.getString(5)%></td>
                       <td><%=rs.getString(6)%></td>
                       <td><%=rs.getString(7)%></td>
                       <td><%=rs.getString(8)%></td>
                       <td><%=rs.getString(9)%></td>
                       <td><%=rs.getString(10)%></td>
                       <td><%=rs.getString(11)%></td>
                       <td><%=rs.getString(12)%></td>
                       <td><%=rs.getString(13)%></td>
                       <td><%=rs.getString(14)%></td>
                       <td><%=rs.getString(15)%></td>
                   </tr>
                    <%}%>
                   </table>
    
</html>
