<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Log In</title>
  <link href="style.css" rel="stylesheet" type="text/css">
</head>
<header>
  <nav class='navbar'>          
    <a class= 'nav-link' href='home.html'>
      <img class='nav-icons' src="icons8-home-48.png" alt="Home icon">
      <span class='nav-span'>Home</span>
    </a>             
   <a class='nav-link'href='pantry.html'>
     <img class='nav-icons' src="icons8-ingredients-50.png" alt="pantry icon">
     <span class='nav-span'>Pantry</span>
    </a> 
   <a class='nav-link' href="recipes.html">
     <img class='nav-icons' src="icons8-cooking-book-50.png" alt="recipe icon">
     <span class='nav-span'>Recipes</span>
    </a>
  <a class='nav-link' href="logIn.html">
    <img class='nav-icons' src="icons8-login-48.png" alt="login icon">
    <span class='nav-span'>Login</span>
   </a>
</nav>
</header>
<body id= 'loginBody'>  
<form action="loginResponse.jsp">   
  <div class="container">
    <label for="username"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="passwd" required>

    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
    <span class="usr">Forgot <a href="#">username?</a></span>
  </div>
  <div class='signup'>
    <p><a id="signupbtn" href="signup.html">Sign Up</a></p>
  </div>
</form> 
<%
String message = (String)session.getAttribute("loginMessage");

if(message != null){
	out.println(message);
	session.removeAttribute("loginMessage");
}
%>
</body>
</html>
