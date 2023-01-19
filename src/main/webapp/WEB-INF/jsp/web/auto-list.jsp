<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 9/5/19
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Auto List</title>
    <style>
        table, th, td {
            border: 1px solid red
        }
    </style>
</head>
<body>
    <h1>Auto List</h1>

    <table>
        <tr>
            <th>ID</th>
            <th>Brand</th>
            <th>Model</th>
            <th>Price</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${autoList}" var="auto">
            <tr>
                <td>${auto.id}</td>
                <td>${auto.brandName}</td>
                <td>${auto.modelName}</td>
                <td>${auto.price}</td>
                <td><a href="auto?id=${auto.id}">View</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
