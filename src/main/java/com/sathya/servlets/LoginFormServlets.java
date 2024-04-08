package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/LoginFormServlets")
public class LoginFormServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

        
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 String username=request.getParameter("Username");
	 
	 String password=request.getParameter("password");
	 
	 String status;
	 if(username.equals("sathya")&& password.equals("sathya@123"))
	 {
		status="login successfull..";
	
	 }
	 else
	 {
		 status="login fail";
	 }
	 PrintWriter writer=response.getWriter();
	 response.setContentType("text/html");
	 writer.println("<html>");
	 writer.println("<h1>Loginstatus...</h1>"+status);
	 writer.println("</html>");
	  
	}

}
