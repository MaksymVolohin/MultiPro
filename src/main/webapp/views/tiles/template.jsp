<%--
  Created by IntelliJ IDEA.
  User: Genabra
  Date: 29.08.2016
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>--%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../resources/css/style.css">
</head>
<body>
<div class="main_blok" background-color="green">
<header>
    <tiles:insertAttribute name="header"></tiles:insertAttribute>
</header>

<nav>
    <tiles:insertAttribute name="menu"></tiles:insertAttribute>
</nav>

<section>
    <tiles:insertAttribute name="body"></tiles:insertAttribute>
</section>

<footer>
    <tiles:insertAttribute name="footer"></tiles:insertAttribute>
</footer>

</div>>
</body>
</html>

