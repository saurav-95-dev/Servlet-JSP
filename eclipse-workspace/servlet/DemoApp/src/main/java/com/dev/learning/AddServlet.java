package com.dev.learning;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res ) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		
		int j = Integer.parseInt(req.getParameter("num2"));
		int result = i+j;
		
		
        Cookie cookie = new Cookie("result" , result+"");
        res.addCookie(cookie);
        res.sendRedirect("sq");
        
        
	}

}

