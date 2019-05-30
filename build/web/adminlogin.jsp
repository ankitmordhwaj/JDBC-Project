<%-- 
    Document   : adminlogin
    Created on : 20 Apr, 2018, 1:02:08 PM
    Author     : amany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

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

<head>
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
<center><br>
<h1><font color="white">Admin Login</font></h1>
<form action="alogin">
<br><br><br><br><br><br><br>
<h1>
 <b><font color="LightSalmon">ID:</b>
 <input type="text" name="id" size="20"><br><br>
 <b>Password:</b>
 <input type="password" name="pass" size="20"><br>
</font></h1>
<font color="black" size="5"><b><input type="submit" value="Login" name="s" ></b></font><br><br><br>
</form>

</center>
</body>
</head>
</html>
