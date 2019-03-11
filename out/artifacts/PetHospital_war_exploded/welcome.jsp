<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/27
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to PetHospital</title>
</head>


<frameset rows="10%,90%">
    <frame src="top.jsp" frameborder="0" noresize scrolling="no">

<frameset cols="10%,*">
    <frame src="left.jsp" frameborder="0" noresize scrolling="no">
    <frame src="masterbox/master.jsp" name="owner" frameborder="0" noresize scrolling="no">
</frameset>
</frameset>

</html>
