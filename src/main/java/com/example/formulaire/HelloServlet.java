package com.example.formulaire;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Réserver";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<form action=\"main.jsp\" method=\"post\">");
        out.println("<label for=\"nom\">Nom: </label><br>");
        out.println("<input type=\"text\" id=\"nom\" name=\"nom\"><br>");
        out.println("<label for=\"prenom\">Prénom</label><br>");
        out.println("<input type=\"text\" id=\"prenom\" name=\"prenom\"><br>");
        out.println("<label for=\"courriel\">Courriel</label><br>");
        out.println("<input type=\"text\" id=\"courriel\" name=\"courriel\"><br>");
        out.println("<label>");
        out.println("<select required id=\"menu\" name=\"menu\">");
        out.println("<option value=\"Boeuf\">Boeuf</option>");
        out.println("<option value=\"Poulet\">Poulet</option>");
        out.println("<option value=\"Végé\">Végé</option>");
        out.println("</select>");
        out.println("</label>");
        out.println("<br/>");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");


        out.println("</body></html>");
    }



















    public void destroy() {
    }
}