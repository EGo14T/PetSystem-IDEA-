package pett.servlet;

import pett.bean.MasterBean;
import pett.bean.masterInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

@WebServlet(name = "SelectUpdateMasterServlet")
public class SelectSearchMasterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            MasterBean db = new MasterBean();
            String mrName = new String(request.getParameter("name").getBytes("ISO-8859-1"),"UTF-8");
            System.out.println(mrName);
            ResultSet rs = db.selectUpdateMaster(mrName);
            HttpSession session = request.getSession();
            ArrayList al = new ArrayList();
            while (rs.next()){
                masterInfo mi = new masterInfo();
                mi.setMrId(rs.getString("id"));
                mi.setMrName(rs.getString("name"));
                mi.setMrSex(rs.getString("sex"));
                mi.setMrAge(rs.getString("age"));
                mi.setMrAdress(rs.getString("address"));
                mi.setMrTel(rs.getString("tel"));
                mi.setMrPet(rs.getString("pet"));
                al.add(mi);
                session.setAttribute("al",al);
            }
            rs.close();
            response.sendRedirect("masterbox/searchmasterInfo.jsp");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
