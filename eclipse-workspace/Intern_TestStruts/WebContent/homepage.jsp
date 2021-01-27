<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>
				Danh sach Trainee
			</th>
		</tr>
		<tr>
			<td>
				<button><a href="/TestStruts/add.jsp"  target="content" >Add</a></button>
			</td>
		</tr>
		<tr>
			<table border="1">
				<tr>
					<th>
						STT
					</th>
					<th>
						TraineeID
					</th>
					<th>
						TraineeName
					</th>
					<th>
						Birth
					</th>
					<th>
						PhoneE
					</th>
					<th>
						EmailE
					</th>
					<th>
						ProjectID
					</th>
					<th>
						TeamID
					</th>
					<th>
						
					</th>
					<th>
						
					</th>
				</tr>
				<s:iterator var="train" value="list">
					<tr>
						<td>1</td>
						<td>${train.traineeID }</td>
						<td>${train.traineeName }</td>
						<td>${train.birth }</td>
						<td>${train.phone }</td>
						<td>${train.email }</td>
						<td>${train.projectID }</td>
						<td>${train.teamID }</td>
						<s:url action="delete" var="id" method="post" >
					    <s:param name="traineeID">${train.traineeID }</s:param>
						</s:url>
						<td><a href="<s:property value="#id"/>"  target="content" onclick="return confirm('Ban co muon xoa khong?');">Delete</a></td>
						<td><a href="/TestStruts/update.jsp?traineeID=${train.traineeID }&traineeName=${train.traineeName }&birth=${train.birth }&phone=${train.phone }&email=${train.email }&projectID=${train.projectID }&teamID=${train.teamID }"  target="content" >Update</a></td>
					</tr>
				</s:iterator>
			</table>
		</tr>
	</table>
</body>
</html>
