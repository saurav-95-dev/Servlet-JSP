package com.dev.learning;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.getWriter().println("Hi");

        //ServletContext context = req.getServletContext();
        ServletConfig cg = getServletConfig();
        
        

        String name = cg.getInitParameter("name");
        String phone = cg.getInitParameter("Phone");

        res.getWriter().println("Name: " + name);
        res.getWriter().println("Phone: " + phone);
    }
}
