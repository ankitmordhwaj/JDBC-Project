<%-- 
    Document   : detailsstud
    Created on : 20 Apr, 2018, 1:03:17 PM
    Author     : amany
--%>

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
<form>
    <br><br><input type="submit" value="Show All Records">
</form>
</center>
</font>
</body>
</html>
