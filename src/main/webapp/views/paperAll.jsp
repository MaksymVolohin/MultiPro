<%--
  Created by IntelliJ IDEA.
  User: Genabra
  Date: 29.08.2016
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page contentType="text/html;charset=ISO-8859-5" language="java" %>--%>
<%--<%@ page contentType="text/html;charset=CP1251"%>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Брбакад
<c:forEach var="p" items="${papers}">
    <a href="/paper/page/${p.id}">
        <div style="width: 300px; height: 300px; background-color: darkgrey; border: 1px solid black; border-radius: 15%;margin: 10px; float: left">
            <p style="text-align: center; font-size: 24pt;">${p.title}</p>
            <p style="text-align: center; font-size: 24pt;">${p.description}</p>
            <p style="text-align: center; font-size: 24pt;">${p.content}</p>
            <p style="text-align: center; font-size: 24pt;">${p.magicnumber}</p>
        </div>
    </a>
</c:forEach>
<p style="clear: both"><sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/paper/new">Create new Statte</a></sec:authorize> </p>
</body>
</html>