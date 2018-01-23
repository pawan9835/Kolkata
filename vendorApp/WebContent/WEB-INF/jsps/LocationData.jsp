<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Location Data Page</title>
<style type="text/css">
table tr th{
	color: white;
	background-color: black;
}
</style>
</head>
<body>
<%@include file="Master.jsp" %>
<h1>Location Data...</h1>
<a href="locExcelExport">Download Excel</a>
| <a href="locPdfExport">Download PDF</a>
<table border="1">
<tr>
 <th>Id</th><th>Name</th><th>Type</th>
</tr>
<c:forEach items="${locListObj}" var="loc">
<tr>
<td><a href="updateLoc?locId=<c:out value='${loc.locId}'/>">
<c:out value="${loc.locId}"/></a></td>
<td><c:out value="${loc.locName}"/></td>
<td><c:out value="${loc.locType}"/></td>
<td><a href="deleteLoc?locId=<c:out value='${loc.locId}'/>">Delete</a></td>

</tr>
</c:forEach>
</table>

</body>
</html>