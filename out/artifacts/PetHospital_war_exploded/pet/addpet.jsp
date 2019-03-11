<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/8
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" ; charset="UTF-8">
    <title>添加医生信息</title>
</head>
<body bgcolor="#ffa29e">
<center>
    <br>
    <br>
    <br>
    <h3>添加宠物信息</h3>
    <!--<form action="http://localhost:8080/AddMasterServlet" method="get">-->
    <form action="http://localhost:8080/AddPetServlet" method="get">
        <table border="0" width="235">
            <tr>
                <td>宠物ID:</td>
                <td><input type="text" name = "petId"></td>
            </tr>

            <tr>
                <td>宠物种类:</td>
                <td><input type="text" name = "petKind"></td>
            </tr>

            <tr>
                <td>宠物性别:</td>
                <td><input type="text" name = "petSex"></td>
            </tr>

            <tr>
                <td>宠物年龄:</td>
                <td><input type="text" name = "petAge"></td>
            </tr>

            <tr>
                <td>宠物产地:</td>
                <td><input type="text" name = "petAddress"></td>
            </tr>

            <tr>
                <td>主人姓名:</td>
                <td><input type="text" name = "mrPetName"></td>
            </tr>

            <tr>
                <td>主人电话:</td>
                <td><input type="text" name = "mrPetTel"></td>
            </tr>

            <tr align="center">
                <td colspan="2">
                    <input name="sure" type="submit" value="添加"/>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="clear" type="reset" value="清空"/>
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
