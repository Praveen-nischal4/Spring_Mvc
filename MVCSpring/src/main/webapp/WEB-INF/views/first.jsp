<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello ${name} This Project is just a Demo</h1>

<c:forEach var="name" items="${list}">
<br>
<c:out value="${name}"></c:out>
</c:forEach>

<a href="itemform">Item Form</a>
<a href="data"> Item List</a>
</body>
</html>