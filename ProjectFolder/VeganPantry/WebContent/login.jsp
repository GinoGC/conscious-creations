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
<body id="login-body">  
<form action="action_page.php" method="post">   
  <div class="container">
    <label for="username"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="username" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form> 
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
