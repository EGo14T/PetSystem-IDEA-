package pett.servlet;

import java.io.IOException;

import pett.bean.*;

public class UserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String method = request.getParameter("method");
        if ("login".equals(method)){
            String username = new String(request.getParameter("userName").getBytes("ISO-8859-1"),"UTF-8");
            System.out.println(username);
            String password = new String(request.getParameter("password").getBytes("ISO-8859-1"),"UTF-8");
            System.out.println(password);
            UserBean userBean = new UserBean();
            boolean isValid = userBean.valid(username,password);
            if(isValid){
                System.out.println("登录成功！");
                request.getSession().setAttribute("username", username);
                response.sendRedirect("welcome.jsp");
                return;
            }else{
                response.sendRedirect("login.jsp");
                System.out.println("账号或密码错误");

                return;
            }
        }



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
