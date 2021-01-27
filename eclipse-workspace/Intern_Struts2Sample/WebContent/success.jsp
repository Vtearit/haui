<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="t"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
	<%-- 	Welcome: ${userName } --%>
	<!-- 	<br />  -->
	<%-- 	Welcome:<t:property value="userName" /> <br/> --%>
	<!-- 	Welcome: -->
	<%-- 	<%=request.getAttribute("userName")%> --%>
	<!-- 	<br/> -->
	<%-- 	Welcome: <%=session.getAttribute("userName") %><br/> --%>
	<t:form action="loadCode">
		<t:submit value="load_Code"></t:submit>
	</t:form>
</body>
</html>

