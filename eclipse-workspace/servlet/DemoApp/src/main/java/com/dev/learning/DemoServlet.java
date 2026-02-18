package com.dev.learning;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet") 
public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
    	   String name = "Saurabh , run fast ,pick up speed"; //goal is to send this name to jsp file.
    	   request.setAttribute("label" , name);
    	   RequestDispatcher rd = request.getRequestDispatcher("display.jsp"); //calling jsp file from a servlet file.
    	   rd.forward(request, response);
    	   
    	   
    }
}
