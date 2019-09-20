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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="javascript/addBook.js" type="text/javascript"></script>
</head>
<body>
<h2>Add book</h2>
        <p>
            <label for="bookTittle">Book Tittle</label>
            <input id="bookTittle" name="bookTittle">
        </p>
       <p>
           <label for="isbn">ISBN</label>
           <input id="isbn" name="isbn">
       </p>
        <button id="submit" name="submit">Add Book</button>

        <p>
            <img src="<c:url value = "/images/heart.gif"/>" id="loader"/>
        </p>
        <hr>
        <table id="bookTable" >
            <tr>
                <th>Book Name</th>
                <th>ISBN</th>
            </tr>
            <tr>

            </tr>
        </table>
</body>
</html>
