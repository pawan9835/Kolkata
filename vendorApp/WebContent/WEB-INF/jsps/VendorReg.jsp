<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Register</title>
</head>
<body>
	<%@include file="Master.jsp"%>
	<h1>welcome to Vendor Reg</h1>
	<form action="insertVen" method="post" enctype="multipart/form-data">
	
<!-- Id   : <input type="text" name="venId"/> -->
Name : <input type="text" name="venName" />
Email: <input type="text" name="venEmail" />
Loc  : <select name="loc.locId">
      
        <option value="-1">--select--</option>
       <c:forEach items="${locListObj}" var="loc">
        <option value="${loc.locId}"><c:out value="${loc.locName}"/></option>
       </c:forEach>
</select>
<input type="file" name="inpFile" />
<input type="submit" value="Insert" /> <input type="reset"
				value="Clear" />

	</form>
	${msg}
	<br />
	<a href="viewAllVen">View All Vendors</a>
</body>
</html>