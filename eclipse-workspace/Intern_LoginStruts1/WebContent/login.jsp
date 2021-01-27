<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link href="css/login.css" rel="stylesheet" type="text/css" />
<link href="css/all.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<html:form action="/login" method="post">
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3 mybg">
					<form name="frmlogin" class="frmlogin" action="" method="">
						<div class="row">
							<!-- Text-center được định nghĩa sẵn trong bootstrap -->
							<div class="col-md-12 text-center mytitle">
								<i class="fas fa-user"></i> Login
							</div>
						</div>

						<!-- Tự động -->
						<div class="form-group row">

							<label for="inputName" class="col-sm-4 col-form-label text-right">Username</label>
							<div class="col-sm-8">
								<html:text property="userName"></html:text>
							</div>
						</div>
						<div class="form-group row">
							<label for="inputPassword"
								class="col-sm-4 col-form-label text-right">Password</label>
							<div class="col-sm-8">
								<input type="password" name="passWord" />
							</div>
						</div>

						<div class="form-group row">
							<div class="col-sm-4"></div>
							<div class="col-sm-8">
								<div class="form-check">
									<input class="form-check-input " type="checkbox" id="chkSave">
									<label class="form-check-label" for="chkSave"> Save
										account in this PC? </label>
								</div>
							</div>
						</div>

						<div class="form-group row">
							<div class="col-sm-12 text-center">
								<a href="#"> Password forget?</a> &nbsp; &nbsp; | &nbsp; &nbsp;
								<a href="#"> Sign up!</a> &nbsp; &nbsp; | &nbsp; &nbsp; <a
									href="#"> Help</a>
							</div>

						</div>

						<div class="form-group row">
							<div class="col-sm-12 text-center">
								<button type="submit" class="btn btn-primary">
									<i class="fas fa-sign-in-alt"></i> Login
								</button>
								<button type="submit" class="btn btn-primary">
									<i class="fas fa-sign-out-alt"></i> Exit
								</button>
							</div>
						</div>

						<div class="form-group row">
							<div class="col-sm-12 text-right">
								<a href="#">Tiếng Việt</a>
							</div>
						</div>

					</form>
				</div>
			</div>

		</div>
	</html:form>

</body>
</html>
