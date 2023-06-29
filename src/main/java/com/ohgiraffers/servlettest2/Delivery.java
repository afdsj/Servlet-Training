package com.ohgiraffers.servlettest2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class Delivery extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = (String) req.getAttribute("name");
        String kind = (String) req.getAttribute("kind");
        String spicy = (String) req.getAttribute("spicy");
        String topping = (String) req.getAttribute("topping");
        String delivery = "이상우";

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html lang=\"en\">")
                .append("<head>")
                .append("<title>forward</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1 style=\"align-content: center;\">")
                .append(name)
                .append("님 주문내역</h1>")
                .append("<label>종류 : </label>" + kind)
                .append("<br/>")
                .append("<label>맵기 : </label>" +spicy)
                .append("<br/>")
                .append("<label>토핑 종류 : </label>" +topping)
                .append("<br/>")
                .append("<label>배달원 이름 : </label>" + delivery)
                .append("</body>")
                .append("</html>");
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out = resp.getWriter();

        out.print(responseText.toString());
        out.flush();
        out.close();
    }
}
