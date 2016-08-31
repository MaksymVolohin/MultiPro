<%--
  Created by IntelliJ IDEA.
  User: Genabra
  Date: 29.08.2016
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
  <%--  <link rel="stylesheet" href="/resources/css/style.css">--%>
</head>
<body>
<h1>Hello, MAzafaka!</h1>
<a href="/paper/all">Papers all</a>
<sec:authorize access="isAnonymous()"><a href="/login">Login</a></sec:authorize>
<sec:authorize access="isAuthenticated()">
    Hello,<sec:authentication property="name"/>
    <form:form action="/logout" method="post">
        <button type="submit">Logout</button>
    </form:form>
</sec:authorize>
</body>
</html>