package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname  = request.getParameter("uname");
		String pass  = request.getParameter("pass");
		
		if(uname.equalsIgnoreCase("Saurabh") && pass.equalsIgnoreCase("Saurabh@123")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname); //putting data into session
			response.sendRedirect("Welcome.jsp");
			
			
		}
		else {
			response.sendRedirect("login.jsp");
		}
	}



}
