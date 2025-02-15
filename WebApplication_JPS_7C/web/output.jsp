<%-- 
    Document   : output
    Created on : Feb 10, 2025, 2:35:06 PM
    Author     : no-solace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <%int n = (int) request.getAttribute("n"); %>
    n là số
    <%if (n % 2 == 0) {%> chẵn
    <% }else%>lẻ

</html>
