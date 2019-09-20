<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 19/09/2019
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Add Book</title>
</head>
<body>
<h2>Add book</h2>
<form action="addBookPRG" method="post">
<p>
    <label for="bookTittle">Book Tittle</label>
    <input id="bookTittle" name="bookTittle">
</p>
<p>
    <label for="isbn">ISBN</label>
    <input id="isbn" name="isbn">
</p>
<input id="submit" name="submit" type="submit">
</form>

</body>
</html>

