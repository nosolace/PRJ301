<%-- 
    Document   : output.jsp
    Created on : Feb 10, 2025, 2:12:19 PM
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
        <%
            int n = (int) request.getAttribute("n");
        %>

        <h3>
            Bảng cửu chương <%=n%>
        </h3>

        <%
            for (int i = 1; i <= 10; i++) {
        %>
        <%=n%> * <%=i%> = <%=n * i%> <br/>
        <%
            }
        %>
    </body>
</html>
