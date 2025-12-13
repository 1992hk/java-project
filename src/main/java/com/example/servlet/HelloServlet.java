package com.example.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println("<h1>Employee WebApp - Jenkins CI/CD Practice</h1>");
        response.getWriter().println("<p>Welcome Hari! This is your Java application deployment project.</p>");
        response.getWriter().println("<p>This is the second line to Practise WebHook</p>");
    }
}
