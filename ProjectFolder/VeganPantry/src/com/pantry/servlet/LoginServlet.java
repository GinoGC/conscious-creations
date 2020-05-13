package com.pantry.servlet;
//import org.apache.tomcat.jni.User;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pantry.jsp.PantryDB;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//Step 1: set the content type and create db connection/////////////////////////////////////////////////////////////
		response.setContentType("text/html");

		 
		//Step 2: get the printwriter and dbConnection///////////////////////////////////////////////////////////////////////////////////////
		PrintWriter out = response.getWriter();
		
		//parameters to be passed to the PantryDB object
		String dbURL = "jdbc:mysql://localhost:3306/VeganPantry";
		String dbUsername = "root";
		String dbPass = "H3ll@D@t@2020";
		PantryDB connection = new PantryDB(dbURL, dbUsername, dbPass);
		
		//login.html supplies the email and password
		String inputEmail = request.getParameter("username");
		String output = null;
		try {
			output = connection.addUser(inputEmail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Step 3: generate HTML content/////////////////////////////////////////////////////////////////////////////////////
		
		out.println("<html><body>");

		out.println("");
		out.println("Input email value = " + inputEmail);
		out.println("<br><br>");
		out.println(output);
		
		out.println("</html></body>");
	}

}
