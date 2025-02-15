
<%-- 
    Document   : example03
    Created on : Feb 10, 2025, 1:26:07 PM
    Author     : no-solace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! int a = 100;
            String result;%>
        <%=a%><%
            if (a % 2 == 0) {
        %> là số chẵn<%
        } else {
        %> là số lẻ <%
            }%>

    </body>
</html>
