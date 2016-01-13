<%-- 
    Document   : resultado
    Created on : 12/01/2016, 07:12:54 PM
    Author     : william.calisaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>resultado</h1>
        <%
            if(request.getAttribute("resultado").equals("ok"))
            {
                %>
                <p>op ok</p>
                <%
            }
            else
            {
                %>
                <p>op fail</p>
                <%
            }
            %>
    </body>
</html>
