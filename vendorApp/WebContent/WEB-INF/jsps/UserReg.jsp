<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to User Regsiter Page!!</h1>
<form action="insertUser" method="post">
<pre>
Enter Name   : <input type="text" name="userName"/>
Enter Email  : <input type="text" name="userEmail"/>
Enter Mobile : <input type="text" name="mobileNum"/>
Enter Address: <textarea rows="2" cols="5" name="address"></textarea>

<input type="submit" value="Insert"/><input type="reset" value="Clear"/>
</pre>
</form>
${msg}
</body>
</html>




