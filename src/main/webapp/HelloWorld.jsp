<%-- 
    Document   : HelloWorld
    Created on : Oct 10, 2019, 11:58:31 PM
    Author     : Thanh Tran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Counter</title>
    </head>
    <body>
        <%! int counter = 0; %>
        <h1>Hello World from JSP!</h1>
        <h2>You got here on <%= new java.util.Date()%></h2>
        <h2> You refreshed this page <%= ++counter %></h2>
    </body>
</html>
