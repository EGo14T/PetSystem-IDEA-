package pett.servlet;

import pett.bean.MasterBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DelDoctorServlet")
public class DelDoctorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mrName = new String(request.getParameter("name"));
        System.out.println(mrName);
        MasterBean db = new MasterBean();
        if (db.deldoctor(mrName)){
            response.sendRedirect("masterbox/success.jsp");
        }
    }
}
