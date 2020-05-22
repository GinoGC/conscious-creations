<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pantry.jsp.*" %>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Log In</title>
  <link href="style.css" rel="stylesheet" type="text/css">
</head>
<body id="login-body">  

<%

//DBPantry constructor overloaded to default into VeganPantry database 
PantryDB connection = new PantryDB();
String inputEmail = request.getParameter("email");
String inputPass = request.getParameter("passwd");
boolean userAuthenticated = false;


try {
	userAuthenticated = connection.authenticate(inputEmail, inputPass);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//Step 3: generate HTML content/////////////////////////////////////////////////////////////////////////////////////

//If user is authenticated they are redirected to the homepage
if(userAuthenticated) {
	
	
	/***********************************
	login session is being created
	
	session.setAttribute("userSession", obj_Login_Bean.getUser_name())
	
	************************************/
	
	%>
	<script>//redirects to homepage
		window.location.href="http://localhost:8080/VeganPantry/home.html"
	</script>
	<% 	
}

//If the user is not authenticated they are redirected to the login page with a message
else{
	session.setAttribute("loginMessage", "Login Failed, Incorrect Email or Password. Please try again :D");
%>
	<script>//redirects to homepage
		window.location.href="http://localhost:8080/VeganPantry/login.jsp"
	</script>
<%
}
%>




</body>
<footer>  
  <div class="footer">
    <h6 id="foorter-header">Support & Resources</h6>
    <ul>
      <li>
        <div class="footer-links"><a class='nav-anchor'href="about-us.html">About Us</a></div>
      </li>
      <li>
        <div class="footer-links"><a class='foot-anchor' href="contact.html">Contact Us</a></div>
      </li>
      <li>
        <div class="footer-links"><a href="#" class="foor-anchor">Forum</a></div>
      </li>
      <li>
        <div class="footer-links"><a href="#" class="foor-anchor">Support</a></div>
      </li>
    </ul>
  </div>
</footer>
</html>
