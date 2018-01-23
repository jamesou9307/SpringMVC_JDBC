<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2018-01-22
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Country Form</title>
</head>
<body>
<form action="country" method="post">
    <select name="code" id="code">
        <c:forEach items="${countries}" var="country">
            <option value="${country.countryCode}">${country.countryName}</option>
        </c:forEach>
    </select>
    <input value="submit" type="submit"/>
</form>
</body>
</html>
