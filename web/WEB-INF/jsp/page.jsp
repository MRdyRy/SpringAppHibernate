<%-- 
    Document   : page
    Created on : 12-Dec-2017, 13:19:28
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Annotation Spring</title>
        <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="head.jsp"/>
        <h1 class="bg-info ">${message}</h1>
        
        <a href="register">Register</a>
    </body>
</html>
