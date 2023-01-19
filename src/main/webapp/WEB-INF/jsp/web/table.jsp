<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 9/3/19
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dynamic Table Generator</title>
</head>
<body>
    <h1>Dynamic Table Generator</h1>

    <form method="post" action="table">
        Row: <input type="text" name="row"> <br/>
        Column: <input type="text" name="column"> <br/>
        <input type="submit" value="Generate">
    </form>
</body>
</html>
