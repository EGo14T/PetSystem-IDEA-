<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/9
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@page import="pett.bean.petInfo" %>
<%@page import="java.util.ArrayList" %>
<html>
<head>
    <title>修改宠物信息</title>
</head>
<body>
<center>
    <br><br><br>
    <h3>请修改宠物信息</h3>
    <form action="http://localhost:8080/UpdatePetServlet" method="get">
        <table border="2" width="600">
            <%
            ArrayList al = (ArrayList)session.getAttribute("al");
            for (int i = 0;i<al.size();i++){
                petInfo mi = (petInfo)al.get(i);

            %>
            <tr>
                <td>宠物编号</td>
                <td>
                    <input type="text" name="petId"
                    value="<%=mi.getPetId()%>" readonly/>
                </td>
            </tr>

            <tr>
                <td>宠物品种</td>
                <td>
                    <input type="text" name="petKind"
                           value="<%=mi.getPetKind()%>"/>
                </td>
            </tr>

            <tr>
                <td>雌雄</td>
                <td>
                    <input type="text" name="petSex"
                           value="<%=mi.getPetSex()%>"/>
                </td>
            </tr>

            <tr>
                <td>年龄</td>
                <td>
                    <input type="text" name="petAge"
                           value="<%=mi.getPetAge()%>"/>
                </td>
            </tr>

            <tr>
                <td>宠物产地</td>
                <td>
                    <input type="text" name="petAddress"
                           value="<%=mi.getPetAddress()%>"/>
                </td>
            </tr>

            <tr>
                <td>宠物主人姓名</td>
                <td>
                    <input type="text" name="mrPetName"
                           value="<%=mi.getMrPetName()%>"/>
                </td>
            </tr>

            <tr>
                <td>宠物主人电话</td>
                <td>
                    <input type="text" name="mrPetTel"
                           value="<%=mi.getMrPetTel()%>"/>
                </td>
            </tr>

            <tr align="center">
                <td colspan="2">
                    <input name="sure" type="submit" value="修改">
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="clear" type="reset" value="清空">
                </td>
            </tr>

            <%
                }
            %>



        </table>
    </form>
</center>
</body>
</html>
