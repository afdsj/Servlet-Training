package com.ohgiraffers.servlettest2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/tteokbokki")
public class Tteokbokki extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        System.out.println("사용자 이름 : " + name);
        String kind = req.getParameter("kind");
        System.out.println("종류 : " + kind);
        String spicy = req.getParameter("spicy");
        System.out.println("맵기 : " + spicy);
        String topping = req.getParameter("topping");
        System.out.println("토핑 종류 : " + topping);

        if (name.isEmpty()) {
            resp.sendError(404, "잘못된 주문입니다");
        } else if (kind == null) {
            resp.sendError(404, "잘못된 주문입니다");
        } else if (spicy == null) {
            resp.sendError(404, "잘못된 주문입니다");
        } else if (topping == null) {
            resp.sendError(404, "잘못된 주문입니다");
        }else {
            req.setAttribute("name", name);
            req.setAttribute("kind", kind);
            req.setAttribute("spicy", spicy);
            req.setAttribute("topping", topping);

            RequestDispatcher rd = req.getRequestDispatcher("print");
            rd.forward(req, resp);
        }
    }
}
