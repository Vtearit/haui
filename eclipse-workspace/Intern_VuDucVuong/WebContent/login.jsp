<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>LOGIN FORM</h1>
	<form action="hello" method="post">
		<input type="submit" value="Hello" />
	</form>

	<table>
		<form action="login" method="post">
			<tr>
				<td>Username:</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="passWord"></td>
			</tr>
			<tr>
				<td><input type="submit" value="login"></td>
				<td></td>
			</tr>
		</form>
	</table>
</body>
</html>


<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%-- 	pageEncoding="UTF-8"%> --%>
<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta charset="UTF-8"> -->
<!-- <title>Login Page</title> -->
<!-- <link href="css/login.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="css/all.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="css/bootstrap.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css" /> -->
<!-- </head> -->
<!-- <body> -->
<%-- 	<f:form action="login" method="post"> --%>
<!-- 		<div class="container"> -->
<!-- 			<div class="row"> -->
<!-- 				<div class="col-md-6 offset-md-3 mybg"> -->
<%-- 					<form name="frmlogin" class="frmlogin" action="" method=""> --%>
<!-- 						<div class="row"> -->
<!-- 							Text-center được định nghĩa sẵn trong bootstrap -->
<!-- 							<div class="col-md-12 text-center mytitle"> -->
<!-- 								<i class="fas fa-user"></i> Login -->
<!-- 							</div> -->
<!-- 						</div> -->

<!-- 						Tự động -->
<!-- 						<div class="form-group row"> -->

<!-- 							<label for="inputName" class="col-sm-4 col-form-label text-right">Username</label> -->
<!-- 							<div class="col-sm-8"> -->
<!-- 								<input type="text" name="userName"> -->
<!-- 								<html:text property="userName"></html:text> -->
<!-- 							</div> -->
<!-- 						</div> -->
<!-- 						<div class="form-group row"> -->
<!-- 							<label for="inputPassword" -->
<!-- 								class="col-sm-4 col-form-label text-right">Password</label> -->
<!-- 							<div class="col-sm-8"> -->
<!-- 								<input type="password" name="passWord" /> -->
<!-- 							</div> -->
<!-- 						</div> -->

<!-- 						<div class="form-group row"> -->
<!-- 							<div class="col-sm-4"></div> -->
<!-- 							<div class="col-sm-8"> -->
<!-- 								<div class="form-check"> -->
<!-- 									<input class="form-check-input " type="checkbox" id="chkSave"> -->
<!-- 									<label class="form-check-label" for="chkSave"> Save -->
<!-- 										account in this PC? </label> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 						</div> -->

<!-- 						<div class="form-group row"> -->
<!-- 							<div class="col-sm-12 text-center"> -->
<!-- 								<a href="#"> Password forget?</a> &nbsp; &nbsp; | &nbsp; &nbsp; -->
<!-- 								<a href="#"> Sign up!</a> &nbsp; &nbsp; | &nbsp; &nbsp; <a -->
<!-- 									href="#"> Help</a> -->
<!-- 							</div> -->

<!-- 						</div> -->

<!-- 						<div class="form-group row"> -->
<!-- 							<div class="col-sm-12 text-center"> -->
<!-- 								<button type="submit" class="btn btn-primary"> -->
<!-- 									<i class="fas fa-sign-in-alt"></i> Login -->
<!-- 								</button> -->
<!-- 								<button type="submit" class="btn btn-primary"> -->
<!-- 									<i class="fas fa-sign-out-alt"></i> Exit -->
<!-- 								</button> -->
<!-- 							</div> -->
<!-- 						</div> -->

<!-- 						<div class="form-group row"> -->
<!-- 							<div class="col-sm-12 text-right"> -->
<!-- 								<a href="#">Tiếng Việt</a> -->
<!-- 							</div> -->
<!-- 						</div> -->

<%-- 					</form> --%>
<!-- 				</div> -->
<!-- 			</div> -->

<!-- 		</div> -->
<%-- 	</f:form> --%>

<%-- 	<f:form></f:form> --%>

<!-- </body> -->
<!-- </html> -->





<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%-- 	pageEncoding="UTF-8"%> --%>
<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta charset="UTF-8"> -->
<!-- <title>Spring MVC 5 - form handling</title> -->

<!-- <link href="css/login.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="css/all.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="css/bootstrap.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css" /> -->
<!-- </head> -->
<!-- <body> -->
<!-- 	<div class="container"> -->
<!-- 		<div class="col-md-offset-2 col-md-7"> -->
<!-- 			<h2 class="text-center">Spring MVC 5 Form Handling Example -Sign -->
<!-- 				up Form</h2> -->
<!-- 			<div class="panel panel-info"> -->
<!-- 				<div class="panel-heading"> -->
<!-- 					<div class="panel-title">Đăng ký tài khoản mới</div> -->
<!-- 				</div> -->
<!-- 				<div class="panel-body"> -->
<%-- 					<form:form action="saveSignUpForm" cssClass="form-horizontal" --%>
<%-- 						method="post" modelAttribute="signUpForm"> --%>

<!-- 						<div class="form-group"> -->
<!-- 							<label for="icode" class="col-md-3 control-label">Tên -->
<!-- 								đăng nhập</label> -->
<!-- 							<div class="col-md-9"> -->
<%-- 								<form:input path="userName" cssClass="form-control" /> --%>
<!-- 							</div> -->
<!-- 						</div> -->

<!-- 						<div class="form-group"> -->
<!-- 							<label for="password" class="col-md-3 control-label">Mật -->
<!-- 								khẩu</label> -->
<!-- 							<div class="col-md-9"> -->
<%-- 								<form:password path="password" cssClass="form-control" /> --%>
<!-- 							</div> -->
<!-- 						</div> -->
<!-- 						<div class="form-group"> -->
<!-- 							<label for="password" class="col-md-3 control-label">Nhập -->
<!-- 								lại mật khẩu</label> -->
<!-- 							<div class="col-md-9"> -->
<%-- 								<form:password path="password" cssClass="form-control" /> --%>
<!-- 							</div> -->
<!-- 						</div> -->

<!-- 						<div class="form-group"> -->
<!-- 							<label for="email" class="col-md-3 control-label">Email</label> -->
<!-- 							<div class="col-md-9"> -->
<%-- 								<form:input path="email" cssClass="form-control" /> --%>
<!-- 							</div> -->
<!-- 						</div> -->

<!-- 						<div class="form-group"> -->
<!-- 							Button -->
<!-- 							<div class="col-md-offset-3 col-md-9"> -->
<%-- 								<form:button cssClass="btn btn-primary">Đăng ký</form:button> --%>
<!-- 							</div> -->
<!-- 						</div> -->

<%-- 					</form:form> --%>
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->
<!-- </body> -->
<!-- </html> -->

