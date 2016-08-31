<%--
  Created by IntelliJ IDEA.
  User: Genabra
  Date: 29.08.2016
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form action="/loginprocessing" method="post">
    <input type="text" name="username" placeholder="Login">
    <input type="password" name="password" placeholder="Password">
    <button type="submit">Sign in</button>
</form:form>
