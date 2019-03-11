package pett.servlet;

import pett.bean.MasterBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdatePetServlet")
public class UpdatePetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String petId = new String(request.getParameter("petId"));
        String petKind = new String(request.getParameter("petKind"));
        String petSex = new String(request.getParameter("petSex"));
        String petAge = new String(request.getParameter("petAge"));
        String petAddress = new String(request.getParameter("petAddress"));
        String mrPetName = new String(request.getParameter("mrPetName"));
        String mrPetTel = new String(request.getParameter("mrPetTel"));

        System.out.println(123);

        MasterBean db = new MasterBean();
        if (db.updatepet(petId,petKind,petSex,petAge,petAddress,mrPetName,mrPetTel)){
            response.sendRedirect("masterbox/success.jsp");
        }
    }
}

