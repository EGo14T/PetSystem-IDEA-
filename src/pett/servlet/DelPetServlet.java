package pett.servlet;

import pett.bean.MasterBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DelPetServlet")
public class DelPetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String petId = new String(request.getParameter("petId"));
        System.out.println(petId);
        MasterBean db = new MasterBean();
        if (db.delpet(petId)){
            response.sendRedirect("masterbox/success.jsp");
        }
    }
}
