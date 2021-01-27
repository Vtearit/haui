<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%> --%>
<%@taglib uri="/struts-tags" prefix="s"%>
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
	<h1>CODE DATA</h1>
	<%-- 	<f:form action="" modelAttribute="user"> --%>
	<%-- 		<f:input path="userName" /> --%>
	<%-- 		<f:select path="subjects" items="${subjects}"></f:select> --%>

	<%-- 		<f:button>Submit</f:button> --%>

<!-- 	<table> -->
<%-- 		<f:form action="showCode" method="post"> --%>

<!-- 			<tr> -->
<!-- 				<th>STT</th> -->
<!-- 				<th>ID</th> -->
<!-- 				<th>Name</th> -->
<!-- 				<th>Value</th> -->
<!-- 			</tr> -->
<%-- 			<s:iterator var="code" value="codeList"> --%>
<!-- 				<tr> -->
<%-- 					<td>${code.codeId }</td> --%>
<%-- 					<td>${code.codeName }</td> --%>
<%-- 					<td>${code.codeValue }</td> --%>
<!-- 				</tr> -->
<%-- 			</s:iterator> --%>

			<%--       <c:forEach var="customer" items="${listCustomer}"> --%>
			<!--         <tr style="border: 1px black solid"> -->
			<%--           <td>${customer.id}</td> --%>
			<%--           <td>${customer.name}</td> --%>
			<%--           <td>${customer.address}</td> --%>
			<%--           <td> <a href="${urlView}/${customer.id}">View</a></td> --%>
			<%--           <td> <a href="${urlUpdate}/${customer.id}">Edit</a></td> --%>
			<%--           <td> <a href="${urlDelete}/${customer.id}">Delete</a></td> --%>
			<!--         </tr> -->
			<%--       </c:forEach> --%>
			
<%-- 		</f:form> --%>
<!-- 	</table> -->

	<f:form action="showCode" modelAttribute="vuong">
		<table border="1">
			<tr>
				<th>Code ID</th>
				<th>Code Name</th>
				<th>Code Value</th>
			</tr>
			<c:forEach var="v" items="${vuong}">
				<tr>
					<td>${v.codeId}</td>
					<td>${v.codeName}</td>
					<td>${v.codeValue}</td>
				</tr>
			</c:forEach>
		</table>
	</f:form>

</body>
</html>
