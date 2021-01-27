<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link href="css/login.css" rel="stylesheet" type="text/css" />
<link href="css/all.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css" />
<link href="css/main_older.css" rel="stylesheet" type="text/css" />
</head>
<!-- <body> -->
<!-- 	<h1>LOGIN FORM</h1> -->
<!-- 	<form action="hello" method="post"> -->
<!-- 		<input type="submit" value="Hello" /> -->
<!-- 	</form> -->

<!-- 	<table border="1"> -->
<!-- 		<form action="login" method="post"> -->
<!-- 			<tr> -->
<!-- 				<td>Username:</td> -->
<!-- 				<td><input type="text" name="userName"></td> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td>Password:</td> -->
<!-- 				<td><input type="password" name="passWord"></td> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td><input type="submit" value="login"></td> -->
<!-- 				<td></td> -->
<!-- 			</tr> -->
<!-- 		</form> -->
<!-- 	</table> -->
<!-- </body> -->

<body>
	<form action="login" method="post">
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3 mybg">
					<form name="frmlogin" class="frmlogin" action="" method="">
						<div class="row">
							<!-- Text-center được định nghĩa sẵn trong bootstrap -->
							<div class="col-md-12 text-center mytitle">
								<i class="fas fa-user"></i> Login <!-- ??? Find the reason why The web font can't be call in this login.jsp view -->
							</div>
						</div>

						<!-- Tự động -->
						<div class="form-group row">

							<label for="inputName" class="col-sm-4 col-form-label text-right">Username</label>
							<div class="col-sm-8">
								<input type="text" name="userName">
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
	</form>
</body>

</html>
