<%--
  Created by IntelliJ IDEA.
  User: Genabra
  Date: 29.08.2016
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form action="/registration" method="post" modelAttribute="user">
    <form:input path="name"/>
    <form:input path="secondname"/>
    <form:input path="email"/>
    <form:input path="phone"/>
    <form:input path="password"/>
    <form:button>Sign up</form:button>
</form:form>