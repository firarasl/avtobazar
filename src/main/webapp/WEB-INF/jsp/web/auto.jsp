<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 9/5/19
  Time: 7:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Auto Detail</title>
</head>
<body>
    <c:choose>
        <c:when test="${not empty auto}">
            ID: ${auto.id} <br/>
            Brand: ${auto.brandName} <br/>
            Model: ${auto.modelName} <br/>
            Price: ${auto.price} <br/>
        </c:when>
        <c:otherwise>
            Auto with id = ${param.id} not found!
        </c:otherwise>
    </c:choose>
</body>
</html>
