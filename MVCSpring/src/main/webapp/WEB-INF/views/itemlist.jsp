<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Your Items Detail :</h2>
<table border="2">
<tr>
<td> Item Id </td>
<td> Name </td>
<td> Category </td>
<td> Rate </td>
<td> Quantity </td>
</tr>

<tr>
<td> ${item.itemId}</td>
<td> ${item.name}</td>
<td> ${item.category} </td>
<td> ${item.rate}</td>
<td> ${item.quantity}</td>
</tr>
</table>
</body>
</html>