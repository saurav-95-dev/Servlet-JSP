package com.dev.learning;

import java.io.IOException;

import jakarta.servlet.http.*;

public class AddServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req , HttpServletResponse res ) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		
		int j = Integer.parseInt(req.getParameter("num2"));
		int result = i+j;
		System.out.println(result);
		res.getWriter().println(result);
		
	}

}

