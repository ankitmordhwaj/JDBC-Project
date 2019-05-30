<%-- 
    Document   : newrecord
    Created on : 20 Apr, 2018, 1:04:13 PM
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
<h1><font color="white"><center>Add New Student<font></center></h1>
<font color="#00FFFF">
<h3>
    <form action="record">
                User ID&#160  
                <input type="text" name="id">
               &#160<br> <br>Password &#160
                <input type="password" name="pass">
                &#160<br><br>Full Name&#160  
                <input type="text" name="name"  >
               &#160<br> <br>Father Name &#160
                <input type="text" name="fname">
              &#160 <br><br> Mother Name&#160
                <input type="text" name="mname" >
               &#160 <br><br> Date of Birth &#160
               <input type="text" name="dob" >
                 &#160 <br> <br>  Gender&#160
                <input type="radio" name="gender" value="male" > Male&#160
                <input type="radio" name="gender" value="female"> Female&#160
                <input type="radio" name="gender" value="other"> Other&#160
             &#160 <br> <br>  Email ID&#160
                <input type="email" name="email" >
             &#160 <br> <br>  Mobile Number&#160
                <input type="text" name="pno" >
              &#160 <br> <br> Address&#160
                  <input type="text" name="address" >
              &#160 <br> <br> City&#160
                  <input type="text" name="city">
              &#160<br>  <br>  State&#160
                  <input type="text" name="state">
              &#160<br>  <br>  Zipcode&#160
                  <input type="text" name="zipcode">
             &#160 <br>  <br>  Country&#160
                  <input type="text" name="country">
                  </li>
             &#160 <br> <br> Course name&#160
                 <select name="course">
                    <option> &nbsp </option>
                    <option value="HTML">HTML</option>
                    <option value="CSS">CSS</option>
                    <option value="Bootstrap">Bootstrap</option>
                    <option value="XML">XML</option>
                    <option value="JavaScript">JavaScript</option>
                    <option value=">jQuery">jQuery</option>
                    <option value="AngularJS">AngularJS</option>
                    <option value="JSON">JSON</option>
                    <option value="AJAX">AJAX</option>
                    <option value="SQL">SQL</option>
                    <option value="PHP">PHP</option>
                    <option value="ASP">ASP</option>
                  </select><br><br>
                  <a href="newrecord.jsp"> <input type="submit" value="Submit" onclick="alert('Thanks for applying.')"></a><br><br>        
</form>
</h3>
</font>
</center>
</body>
</html>
