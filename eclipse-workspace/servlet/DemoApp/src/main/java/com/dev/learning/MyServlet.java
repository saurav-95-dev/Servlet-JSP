package com.dev.learning;

import java.io.IOException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.getWriter().println("Hi");

        ServletContext context = req.getServletContext();

        String name = context.getInitParameter("name");
        String phone = context.getInitParameter("Phone");

        res.getWriter().println("Name: " + name);
        res.getWriter().println("Phone: " + phone);
    }
}
