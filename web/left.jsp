<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/7
  Time: 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>左边</title>

    <style type="text/css">
        body {
            width:  100%;
            height: 100%;
            font-family: "Open Sans" , sans-serif;
            background-color: white;
        }

    .main {
          left: 50%;

    }

    .main h1 {
        color: #ffc975; text-shadow: 0 0 3px rgba(0,0,0,0.10); letter-spacing: 1px; text-align: center;
    }

    .h2 {
        color: #8effbf; text-shadow: 0 0 3px rgba(0,0,0,0.10); letter-spacing: 1px; text-align: center;
    }


    </style>

</head>
<body bgcolor="#a52a2a">
 <div class="main">
     <h1 class="h1">导航栏</h1>
 </div>

<div>
    <table align="center">
        <h2 class="h2">宠物主人信息</h2>
        <tr>
            <td><a href="masterbox/selectsearchmaster.jsp" target="owner">查看主人信息</a></td>
        </tr>

        <tr>
            <td><a href="masterbox/selectupdatemaster.jsp" target="owner">修改主人信息</a></td>
        </tr>

        <tr>
            <td><a href="masterbox/addmaster.jsp" target="owner">添加主人信息</a></td>
        </tr>

        <tr>
            <td><a href="masterbox/delmaster.jsp" target="owner">删除主人信息</a></td>
        </tr>

    </table>
</div>

 </div>

 <div>
     <table align="center">
         <h2 class="h2">医生信息</h2>
         <tr>
             <td><a href="doctor/selectsearchdoctor.jsp" target="owner">查看医生信息</a></td>
         </tr>

         <tr>
             <td><a href="doctor/selectupdatedoctor.jsp" target="owner">修改医生信息</a></td>
         </tr>

         <tr>
             <td><a href="doctor/adddoctor.jsp" target="owner">添加医生信息</a></td>
         </tr>

         <tr>
             <td><a href="doctor/deldoctor.jsp" target="owner">删除医生信息</a></td>
         </tr>

     </table>
 </div>

 <div>
     <table align="center">
         <h2 class="h2">宠物信息</h2>
         <tr>
             <td><a href="pet/selectsearchpet.jsp" target="owner">查看宠物信息</a></td>
         </tr>

         <tr>
             <td><a href="pet/selectupdatepet.jsp" target="owner">修改宠物信息</a></td>
         </tr>

         <tr>
             <td><a href="pet/addpet.jsp" target="owner">添加宠物信息</a></td>
         </tr>

         <tr>
             <td><a href="pet/delpet.jsp" target="owner">删除宠物信息</a></td>
         </tr>

     </table>
 </div>

</body>
</html>
