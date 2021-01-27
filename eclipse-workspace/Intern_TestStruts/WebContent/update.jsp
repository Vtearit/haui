<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Trainee</title>
</head>
<body>
	<%session.setAttribute("id", request.getParameter("traineeID")); %>
	<form action="update" method="post">
		TraineeID: <input name="traineeID" type="text" value="<%=session.getAttribute("id") %>" disabled />
		<br>
		TraineeName: <input type="text" name="traineeName" id="name" value="<%=request.getParameter("traineeName") %>" />
		<br>
		Birth: <input type="date" name="birth" value="<%=request.getParameter("birth") %>" />
		<br>
		Phone: <input type="text" name="phone" value="<%=request.getParameter("phone") %>" />
		<br>
		Email: <input type="text" name="email" value="<%=request.getParameter("email") %>" />
		<br>
		ProjectID: <input type="text" name="projectID" value="<%=request.getParameter("projectID") %>" />
		<br>
		TeamID: <input type="text" name="teamID" value="<%=request.getParameter("teamID") %>" />
		<br>
		<input type="submit" value="Update">
	<form>
	<script type="text/javascript">

	</script>
</body>
</html>
