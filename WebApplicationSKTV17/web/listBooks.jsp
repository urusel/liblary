<%-- 
    Document   : listBooks
    Created on : 10.05.2019, 14:56:43
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список книг в библиотеке</title>
    </head>
    <body>
        <h1>В нашей библиотеке имеются сдедующие книги :</h1>
        <c:forEach var="book" items="${listBooks}">
            <p>${book.name}</p>
        </c:forEach>
    </body>
</html>

