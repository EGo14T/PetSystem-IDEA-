package pett.servlet;

import pett.bean.MasterBean;
import pett.bean.petInfo;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

@WebServlet(name = "SelectSearchPetServlet")
public class SelectSearchPetServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            MasterBean db = new MasterBean();
            String petId = new String(request.getParameter("petId").getBytes("ISO-8859-1"),"UTF-8");
            System.out.println(123456);
            ResultSet rs = db.selectUpdatePet(petId);
            HttpSession session = request.getSession();
            ArrayList al = new ArrayList();
            while (rs.next()){
                petInfo mi = new petInfo();
                mi.setPetId(rs.getString("id"));
                mi.setPetKind(rs.getString("kind"));
                mi.setPetSex(rs.getString("sex"));
                mi.setPetAge(rs.getString("age"));
                mi.setPetAddress(rs.getString("address"));
                mi.setMrPetName(rs.getString("name"));
                mi.setMrPetTel(rs.getString("tel"));
                al.add(mi);
                session.setAttribute("al",al);
            }
            rs.close();
            response.sendRedirect("pet/searchpetInfo.jsp");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
