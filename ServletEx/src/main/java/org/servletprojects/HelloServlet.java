package org.servletprojects;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")  ---> for external Tomcat
public class HelloServlet extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
         System.out.println("In Service");
//         res.getWriter().println("Hello World");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2><b>Hello World</b?></h2>");
     }
}
