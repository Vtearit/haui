<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	table, th, td {
	border: 1px solid red;
</style>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Value</th>
		</tr>
		<s:iterator var="vuong" value="codeList">
			<tr>
				<td>${vuong.codeId }</td>
				<td>${vuong.codeName }</td>
				<td>${vuong.codeValue }</td>
			</tr>
		</s:iterator>
		
	</table>
</body>
</html>
