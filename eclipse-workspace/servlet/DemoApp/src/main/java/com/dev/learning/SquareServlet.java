package com.dev.learning;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req , HttpServletResponse res ) throws IOException {
		
    	//res.getWriter().println("hii there , this is square servlet");
    	
    	//int k  = (int)req.getAttribute("result");
    	//int k = Integer.parseInt(req.getParameter("result"));
		//HttpSession session = req.getSession();
		
		//int k = (int)session.getAttribute("result");
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("result")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		int ans = k*k;
    	res.getWriter().println("Square of the 2 numbers using cookies is:" + ans);
		System.out.println("sq called");
		
    	
    }
}
