<%--
  Created by IntelliJ IDEA.
  User: ishopjapan
  Date: 22/08/2022
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name:</td>
        <td>${requestScope["product"].name}</td>
    </tr>
    <tr>
        <td>Price:</td>
        <td>${requestScope["product"].price}</td>
    </tr>
    <tr>
        <td>Description:</td>
        <td>${requestScope["product"].description}</td>
    </tr>
</table>
</body>
</html>
