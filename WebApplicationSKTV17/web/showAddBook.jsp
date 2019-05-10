<%-- 
    Document   : newjspshowAddBook
    Created on : May 9, 2019, 7:33:54 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавление книги</title>
    </head>
    <body>
        <h1>Cоздать лнигу</h1>
        <form action="createBook" method="POST">
            Название книги:<br>
            <input type="text" name="name"><br>
            Автор книги :<br>
            <input type="text" name="author"><br>
            Год издания книги :<br>
            <input type="text" name="publishedYear"><br>
            ISBN киниги :<br>
            <input type="text" name="isbn"><br>
            Колличество книг :<br>
            <input type="text" name="quantity"><br>
            
            <input type="submit" value="Создать">
        </form>

    </body>
</html>
