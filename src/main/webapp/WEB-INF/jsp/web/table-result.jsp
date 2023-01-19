<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 9/3/19
  Time: 8:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dynamic Table</title>
    <style>
        table, td {
            border: 1px solid red
        }
    </style>
</head>
<body>
    <table>
        <c:forEach begin="1" end="${setir}" var="i">
            <tr>
                <c:forEach begin="1" end="${sutun}" var="j">
                    <td>${i*j}</td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
