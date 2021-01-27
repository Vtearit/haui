<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Delete</title>
</head>
<body>
	<h2>Delete Code Data using JDBC</h2>
	<span><s:property value="msg" /></span><br><br>
	<a href="report">
		<button type="button">Report</button>
	</a>
	
	<s:form action="loadSuccess">
		<s:submit value="Code"></s:submit>
	</s:form>
</body>
</html>
