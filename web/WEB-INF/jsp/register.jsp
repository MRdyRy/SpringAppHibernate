<%-- 
    Document   : register
    Created on : 12-Dec-2017, 16:17:49
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Form Registration</h1>
        <form:form action="register/save" modelAttribute="registerBean" method="Post">
            <form:label path="firstname">First Name</form:label>
            <form:input path="firstname"/><br/>
            <form:label path="lastname">Last Name</form:label>
            <form:input path="lastname"/><br/>
            <form:label path="username">Username</form:label>
            <form:input path="username"/><br/>
            <form:label path="password">Password</form:label>
            <form:password path="password"/><br/>
            <p>
                <form:button name="submitButton" value="Submit">Submit</form:button>
            </p>
        </form:form>
    </body>
</html>
