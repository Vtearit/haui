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
	<form action="add" method="get">
		TraineeID:<input name="traineeID" type="text" />
		<br>
		TraineeName: <input type="text" name="traineeName" id="name"/>
		<br>
		Birth: <input type="date" name="birth" id="birth"/>
		<br>
		Phone: <input type="text" name="phone" id="phone"/>
		<br>
		Email: <input type="text" name="email" id="email"/>
		<br>
		ProjectID: <input type="text" name="projectID" id="projectID"/>
		<br>
		TeamID: <input type="text" name="teamID" id="teamID"/>
		<br>
		<input type="submit" value="Add" onclick="nhap()">
	<form>
	<script type="text/javascript">
		function nhap() {
			if(document.getElementById("name").value.trim()==""){
				alert("Nhap traineeName");
				return false;
			}
			if(document.getElementById("birth").value.trim()==""){
				alert("Nhap birth");
				return false;
			}
			if(document.getElementById("phone").value.trim()==""){
				alert("Nhap phone");
				return false;
			}
			if(document.getElementById("email").value.trim()==""){
				alert("Nhap email");
				return false;
			}
			if(document.getElementById("projectID").value.trim()==""){
				alert("Nhap projectID");
				return false;
			}
			if(document.getElementById("teamID").value.trim()==""){
				alert("Nhap teamID");
				return false;
			}
		}
	
	</script>
</body>
</html>
