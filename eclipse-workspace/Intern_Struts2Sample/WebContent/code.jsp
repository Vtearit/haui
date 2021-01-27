<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Code Page</title>
<style type="text/css">
table, th, td {
	border: 1px solid red;
	border-collapse: collapse;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th>Code_Id</th>
			<th>Code_Name</th>
			<th>Code_Value</th>
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
