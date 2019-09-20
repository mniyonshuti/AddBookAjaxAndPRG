<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 19/09/2019
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Table</title>
</head>
</head>
<body>
    <h1>List of all the Books</h1>
    <table>
        <th>
            <td>Book Tittle</td>
            <td>Book ISBN</td>
        </th>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.bookTittle}</td>
                <td>${book.isbn}</td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
