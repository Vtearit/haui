<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success Page</title>
<style type="text/css">
table, th, td {
	border: 1px solid red;
}
</style>
</head>
<body>
	<h3>Hello ${user.userName}</h3>
	<h1>LOGIN SUCCESSFUL!</h1>
<%-- 	<f:form action="showCodeSuccess"> --%>
<!-- 		<input type="submit" value="Code"><br/> -->
<!-- <!-- 		<a href="showCodeSuccess.jsp">Code</a> --> 
		
<%-- 	</f:form> --%>
	
		<a href="/showCodeSuccess.jsp">ab</a>
</body>
</html>
