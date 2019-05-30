<%-- 
    Document   : gallery
    Created on : 20 Apr, 2018, 1:03:35 PM
    Author     : amany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

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

.topnav a:hover {
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
<body class="bg" background="file:///C:/PROJECT/Images/3.jpg">  
        <div class="topnav">
          <img src="file:///C:/PROJECT/Images/LOGO.png" alt="hkh" width="50" height="50">
  <font color="white"><a href="#home">A.R.A.M Education Center</a></font>
                <div class="topnav-right">
             <a  href="home.jsp">Home</a>
                <a href="course.jsp">Course</a>
                <a href="login.jsp">Login</a>
                <a class="active" href="gallery.jsp">Gallery</a>
                <a href="contact.jsp">Contact</a>
                </div>
              </div>

              <br><br><br><br>

              <marquee>
                  <img src="file:///C:/PROJECT/Images/gal1.jpg" width="600" height="430"> &nbsp&nbsp
                  <img src="file:///C:/PROJECT/Images/gal2.jpg" height="430"> &nbsp&nbsp
                  <img src="file:///C:/PROJECT/Images/gal3.jpg" height="430"> &nbsp&nbsp
                  <img src="file:///C:/PROJECT/Images/gal4.jpg" height="430"> &nbsp&nbsp
                  <img src="file:///C:/PROJECT/Images/gal5.jpg" height="430"> &nbsp&nbsp
                  <img src="file:///C:/PROJECT/Images/gal6.jpg" height="430"> &nbsp&nbsp
                  <img src="file:///C:/PROJECT/Images/gal7.jpg" height="430"> &nbsp&nbsp
                  <img src="file:///C:/PROJECT/Images/gal8.jpg" height="430"> &nbsp&nbsp
                  <img src="file:///C:/PROJECT/Images/gal9.png" height="430"> &nbsp&nbsp
                  <img src="file:///C:/PROJECT/Images/gal10.jpg" height="430"> &nbsp&nbsp
                  <img src="file:///C:/PROJECT/Images/gal11.jpg" height="430"> &nbsp&nbsp
                </marquee>
             
                            



</body>
</head>
</html>