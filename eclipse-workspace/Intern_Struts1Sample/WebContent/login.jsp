<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<html:form action="/login" method="post">
		Username:<input type="text" name="userName" />
		<br>
		Password :<input type="text" name="passWord" />
		<br>
		<input type="submit" value="login" >
	</html:form>
</body>
</html>
