//Serlvet Filters:

package com.dev.learning;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addAlien")
public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("Welcome");
	}
}
