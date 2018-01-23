<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validateCustData(){
	if(document.custForm.custType.value==-1){
		document.getElementById("typeErr").innerHTML='**choose some type';
		return false;
	}
	return true;
	
}
</script>
<style type="text/css">
#typeErr{
	color: red;
}
</style>
</head>

<body>
<%@include file="Master.jsp" %>
<h1>Welcome to Customer Register Page</h1>
<form name="custForm" action="insertCust" method="post" onsubmit="return validateCustData();">
<pre>
Name   :<input type="text" name="custName"/>  
Email  :<input type="text" name="custEmail"/>
Reg Num:<input type="text" name="custRegNum"/>
Address:<textarea rows="2" cols="5" name="address"></textarea>
Type   :<select name="custType">
		 <option value="-1">--select--</option>
		 <option value="SELLER">Seller</option>
		 <option value="CONSUMER">Consumer</option>
		</select><span id="typeErr"></span>
<input type="submit" value="Insert"/> <input type="reset" value="Clear"/>		
</pre>
</form>
${msg}
</body>
</html>