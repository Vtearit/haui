<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<t:form action="/hello" method="post">
		Username: <input type="text" name="userName" />
		<br />
		Password: <input type="password" name="passWord" />
		<input type="submit" value="login" />
	</t:form>
</body>
</html>
