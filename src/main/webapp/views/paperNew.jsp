<%--
  Created by IntelliJ IDEA.
  User: Genabra
  Date: 29.08.2016
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page contentType="text/html;charset=CP1251" language="java" %>--%>
<%--<%@ page contentType="text/html;charset=ISO-8859-1"%>--%>
<%--<$@ page contentType="text/html;charset=UTF-8" language="java" $>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <%--    <form action="/author/create" method="post">
            <input type="text" id="name" placeholder="name" name="name">
            <input type="text" id="secondname" placeholder="secondname" name="secondname">
            <input type="text" id="country" placeholder="country" name="country">
            <input type="number" id="age" placeholder="age" name="age">
            <button type="submit">Add</button>
        </form>--%>

    <form:form action="/paper/create" method="post" modelAttribute="paper">
        <form:label path="title">Title: </form:label>
        <form:input path="title"/>
        <form:label path="description">Description: </form:label>
        <form:input path="description"/>
        <form:label path="content">Content: </form:label>
        <form:input path="content"/>
        <form:label path="magicnumber">Magic Number: </form:label>
        <form:input path="magicnumber"/>
        <form:button>Add paper</form:button>
    </form:form>

</div>
</body>
</html>
