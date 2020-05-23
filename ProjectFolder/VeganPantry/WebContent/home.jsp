<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
  <html lang='en'>
    <head>
      <style src='app.js'></style>
      <meta charset='UTF-8'>
      <meta name='viewport' content='width=device-width, initial-scale=1.0'>
      <title>Conscious Creations</title>
      <link href='style.css' rel='stylesheet' type='text/css'>
    </head>
    <header id='nav-bar'>
      <nav >
        <ul class='nav'>
          <li class='nav-list'>
            <a class= 'nav-anchor' href='home.html'><img class='nav-icons' src="icons8-home-48.png" alt="Home icon"></a>
          </li>
         <li class='nav-list'>
           <a class='nav-anchor'href='pantry.html'><img class='nav-icons' src="icons8-ingredients-50.png" alt="pantry icon"></a>
         </li>
         <li class='nav-list'>
           <a class='nav-anchor' href="recipes.html"><img class='nav-icons' src="icons8-cooking-book-50.png" alt="recipe icon"></a>
         </li>
        </ul>
      </nav>
    </header>
    <body class='homebody'>
    
	<%
    //This is where the login session cookie will be
    
    String userSession = (String)session.getAttribute("userSession");
	
    if(userSession==null){
    	String sessionMessage = "Please log in";
    	session.setAttribute("loginMessage", sessionMessage);
    	
    %>
	<script type="text/javascript">
		window.location.href="http://localhost:8080/VeganPantry/login.jsp"
	</script>
	<%
    }
    %>

      <div class='home'>
        <div class='home-item-1'>
         <h2 ><a id='pageAnchor1' class='page-anchor' href="pantry.html">Pantry</a></h2>
           <p>Not sure what to cook? Just choose what's in your pantry and we'll give you the recipes you can make.</p>
        </div>
        <div class="home-item-2">
          <h2><a id='pageAnchor2' class='page-anchor' href="recipes.html">Recipes</a></h2>
            <p>Looking to go grocery shopping and want to know what you'll need. Add ingredients to a list by just choosing the recipes you'd like to try.</p>
        </div>
      </div>
    </body>
    <footer>  
      <div class="footer">
        <h3 id="footerHeader">Support & Resources</h3>
        <ul>
          <li>
            <div class="footer-links"><a class='footer-anchor'href="about-us.html">About Us</a></div>
          </li>
          <li>
            <div class="footer-links"><a class='footer-anchor' href="contact.html">Contact Us</a></div>
          </li>
          <li>
            <div class="footer-links"><a href="#" class='footer-anchor'>Forum</a></div>
          </li>
          <li>
            <div class="footer-links"><a href="#" class='footer-anchor'>Support</a></div>
          </li>
        </ul>
        <div id= 'assets'>
          <p><a target="_blank" href="https://icons8.com/icons/set/home"></a> Icons by <a target="_blank" href="https://icons8.com">Icons8</a></p>
        </div>
      </div>
    </footer>
  </html>
           <p>Not sure what to cook? Just choose what's in your pantry and we'll give you the recipes you can make.</p>
        </div>
        <div class="home-item-2">
          <h2><a id='pageAnchor2' class='page-anchor' href="recipes.html">Recipes</a></h2>
            <p>Looking to go grocery shopping and want to know what you'll need. Add ingredients to a list by just choosing the recipes you'd like to try.</p>
        </div>
      </div>

    </body>
  </html>
