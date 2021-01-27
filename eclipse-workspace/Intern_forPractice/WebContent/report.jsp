<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Report</title>
<style>
table, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 60%;
}

th {
	height: 30px;
}

.button-update {
	background-color: #99FFCC;
	color: black;
}

.button-delete {
	background-color: #6666FF;
	color: white;
}
</style>
</head>
<body>
		<div style="margin-top: 40px;">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>ID</th>
						<th>Name</th>
						<th>Value</th>
						<th>Action</th>
					</tr>
				</thead>
				<s:iterator var="vuong" value="codeList">
					<tr>
						<td>${vuong.codeId }</td>
						<td>${vuong.codeName }</td>
						<td>${vuong.codeValue }</td>
						<td><a
							href="<s:url action="Update"></s:url>?codeID=${vuong.codeId}"><button
									class="button-update">Update</button></a> <a
							href='<s:url action="Delete"></s:url>?codeID=${vuong.codeId}'><button
									class="button-delete">Delete</button></a></td>
					</tr>
				</s:iterator>
			</table>
		</div>

</body>
</html>
