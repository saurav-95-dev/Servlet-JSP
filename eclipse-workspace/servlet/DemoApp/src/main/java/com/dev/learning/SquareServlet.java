package com.dev.learning;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req , HttpServletResponse res ) throws IOException {
    	res.getWriter().println("hii there , this is square servlet");
    	
    	int k  = (int)req.getAttribute("result");
    	int ans = k*k;
    	res.getWriter().println("Square of the 2 numbers is:" + ans);
    	
    }
}
