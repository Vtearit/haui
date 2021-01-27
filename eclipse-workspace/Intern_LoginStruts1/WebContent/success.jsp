<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%-- 	pageEncoding="UTF-8"%> --%>
<%-- <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%> --%>
<%-- <%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> --%>
<%-- <%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%> --%>
<%-- <%-- <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%> --%> --%>
<%-- <%-- <%@taglib uri="http://java.sun.com/jstl/fmt" prefix="f"%> <!-- Format số, tiền tệ, ngày tháng... --> --%> --%>
<%-- <%-- <%@taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%> <!-- Hỗ trợ sql: Nhưng hạn chế dùng vì ko bảo mật --> --%> --%>
<%-- <%-- <%@taglib uri="http://java.sun.com/jstl/xml" prefix="xml"%> <!-- Làm việc với các tài liệu xml --> --%> --%>
<!-- <!DOCTYPE html> -->
<%-- <html> --%>
<!-- <head> -->
<!-- <meta charset="UTF-8"> -->
<!-- <title>Success Page</title> -->
<!-- <link href="css/main_older.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="css/all.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="css/bootstrap.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css" /> -->
<!-- <style type="text/css"> -->
/* table, th, td { */
/* 	border: 1px solid red; */
/* 	border-collapse: collapse; */
/* } */
<!-- </style> -->
<!-- </head> -->
<!-- <body> -->
<!-- 	<div class="container mybg"> -->
<!-- 		<form name="frmUser" class="frmUser" action="" method=""> -->
<!-- 			<div class="row"> -->
<!-- 				Text-center được định nghĩa sẵn trong bootstrap -->
<!-- 				<div class="col-md-12 text-center mytitle"> -->
					
<!-- 					<p style="font-size: 25px; font-weight: bold;"><i class="fas fa-table"></i>&nbsp;CODE DATA</p> -->
<!-- 				</div> -->
<!-- 			</div> -->

<!-- 			<!-- Tự động --> -->
<!-- 			<div class="form-group row"> -->
<!-- 				<div class="col-md-12"> -->
<!-- 					<h1> -->
<!-- 						Hello : -->
<%-- 						<bean:write name="userNameReq" /> --%>
<!-- 					</h1> -->
<!-- 				</div> -->
<!-- 				<div class="col-md-12"> -->
<!-- 					<button type="submit" class="btn btn-primary"> -->
<!-- 						<i class="fas fa-user-plus"></i> Add User -->
<!-- 					</button> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 			<div class="form-group row"> -->
<!-- 				<div class="col-md-12 text-center "> -->
<!-- 					<table style="margin: 0 auto;"> -->
<!-- 						<tr> -->
<!-- 							<th>STT</th> -->
<!-- 							<th>Code_Id</th> -->
<!-- 							<th>Code_Name</th> -->
<!-- 							<th>Code_Value</th> -->
<!-- 							<th>Action</th> -->
<!-- 						</tr> -->
<%-- 						<logic:iterate id="codeModel" name="codeList" indexId="idx"> --%>
<!-- 							<tr> -->
<%-- 								<td><%=idx + 1%></td> --%>
<%-- 								<td><bean:write name="codeModel" property="codeId" /></td> --%>
<%-- 								<td><bean:write name="codeModel" property="codeName" /></td> --%>
<%-- 								<td><bean:write name="codeModel" property="codeValue" /></td> --%>
<!-- 								<td><a -->
<%-- 									href='<s:url action="Update"></s:url>?codeID=${vuong.codeId}'><button --%>
<!-- 											class="button-update">Update</button></a> <a -->
<%-- 									href='<s:url action="Delete"></s:url>?codeID=${vuong.codeId}'><button --%>
<!-- 											class="button-delete">Delete</button></a></td> -->
<%-- 								<td><a href="update.jsp?id=<%=rsCode.getString("CodeId")%>">update</a></td> --%>
<!-- 								<td></td> -->
<!-- 							</tr> -->
<%-- 						</logic:iterate> --%>
<!-- 					</table> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 			<div class="form-group row"> -->
<!-- 				<div class="col-md-12 text-center"> -->
<!-- 					<a href="#"><i class="fas fa-headset"></i> Support!</a> &nbsp; -->
<!-- 					&nbsp; | &nbsp; &nbsp; <a href="#"><i class="fas fa-question"></i> -->
<!-- 						Help</a> -->
<!-- 				</div> -->

<!-- 			</div> -->

<!-- 			<div class="form-group row"> -->
<!-- 				<div class="col-md-12 text-center"> -->
<!-- 					<button type="submit" class="btn btn-primary"> -->
<!-- 						<i class="fas fa-sign-out-alt"></i> Exit -->
<!-- 					</button> -->
<!-- 				</div> -->
<!-- 			</div> -->

<!-- 			<div class="form-group row"> -->
<!-- 				<div class="col-md-12 text-right"> -->
<!-- 					<a href="#">Tiếng Việt</i></a> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 		</form> -->
<!-- 	</div> -->

<!-- </body> -->
<%-- </html> --%>

<!-- Thiết kế user reponsive với bootstrap -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%-- <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%> --%>
<%-- <%@taglib uri="http://java.sun.com/jstl/fmt" prefix="f"%> <!-- Format số, tiền tệ, ngày tháng... --> --%>
<%-- <%@taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%> <!-- Hỗ trợ sql: Nhưng hạn chế dùng vì ko bảo mật --> --%>
<%-- <%@taglib uri="http://java.sun.com/jstl/xml" prefix="xml"%> <!-- Làm việc với các tài liệu xml --> --%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<!-- viewport là cổng xem của thiết bị -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<title>User Responsive</title>
		<link href="css/main_older.css" rel="stylesheet" type="text/css" />
		<link href="css/all.css" rel="stylesheet" type="text/css" />
		<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
		<link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css" />
		
		
		<script language="javascript" src="ckeditor/ckeditor.js"></script>
	</head>

	<body>
		<div class="container mybg">
			<form name="frmUser" class="frmUser" action="" method="">
				<div class="row">
			<!-- Text-center được định nghĩa sẵn trong bootstrap -->
					<div class="col-md-12 text-center mytitle"><i class="fas fa-people-carry"></i> ACCOUNT INFORMATION</div>
				</div>
				
				<!-- Thủ công
				<div class="row">
					<div class="col-md-4">Username</div>
					<div class="col-md-8"><input type="text" /></div>
				</div>
				
				<div class="row">
					<div class="col-md-4">Password</div>
					<div class="col-md-8"><input type="text" /></div>
				</div>
				-->
				
				<!-- Tự động -->
				<div class="form-group row">
					<label for="inputName" class="col-md-2 col-form-label text-right">Username</label>
					<div class="col-md-3">
						<input type="text" class="form-control" id="inputName" name="txtUserName">
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPass" class="col-md-2 col-form-label text-right">Password</label>
					<div class="col-md-3">
						<input type="pass" class="form-control" id="inputPass1">
					</div>
					<label for="inputPass" class="col-md-2 col-form-label text-right">Confirm</label>
					<div class="col-md-3">
						<input type="pass" class="form-control" id="inputPass2" name="txtUserPassConfirm">
					</div>
				</div>
				<div class="form-group row">
					<label for="inputEmail" class="col-md-2 col-form-label text-right">Email</label>
					<div class="col-md-3">
						<input type="text" class="form-control" id="inputEmail" name="txtEmail">
					</div>
				</div>
				
				<div class="form-group row">
					<label for="inputPermission" class="col-md-2 col-form-label text-right">Permission</label>
					<div class="col-md-3">
						<select class="form-control" id="inputPermission" name="slcPermis">
							<option value="0">---</option>
							<option value="1">Members (Thành viên)</option>
							<option value="2">Authors (Tác giả)</option>
							<option value="3">Managers (Quản lý)</option>
							<option value="4">Administrator (Quản trị)</option>
							<option value="5">Super Admin (Quản trị cấp cao)</option>
						</select>
					</div>
				</div>
				
				<div class="form-group row align-items-center">
					<label for="inputPermission" class="col-md-2 col-form-label text-right">Roles</label>
					<div class="col-md-10">
						<div class="row row1">
							<div class="col-md-4">
								<input class="form-check-input " type="checkbox" id="chk1">
								<label class="form-check-label" for="chk1">
									<i class="fas fa-users"></i>
									User management
								</label>
							</div>
							<div class="col-md-4">
								<input class="form-check-input " type="checkbox" id="chk2">
								<label class="form-check-label" for="chk2">
									Section Management
								</label>
							</div>
							<div class="col-md-4">
								<input class="form-check-input " type="checkbox" id="chk3">
								<label class="form-check-label" for="chk4">
									Category Management
								</label>
							</div>
						</div>
						
						<div class="row row1">
							<div class="col-md-4">
								<input class="form-check-input " type="checkbox" id="chk4">
								<label class="form-check-label" for="chk4">
									<i class="fas fa-newspaper"></i>
									Article management
								</label>
							</div>
							<div class="col-md-4">
								<input class="form-check-input " type="checkbox" id="chk5">
								<label class="form-check-label" for="chk5">
									Product system Management
								</label>
							</div>
							<div class="col-md-4">
								<input class="form-check-input " type="checkbox" id="chk6">
								<label class="form-check-label" for="chk6">
									Product Group Management
								</label>
							</div>
						</div>
						
						<div class="row row1">
							<div class="col-md-4">
								<input class="form-check-input " type="checkbox" id="chk7">
								<label class="form-check-label" for="chk7">
									Product Category management
								</label>
							</div>
							<div class="col-md-4">
								<input class="form-check-input " type="checkbox" id="chk8">
								<label class="form-check-label" for="chk8">
									Product Management
								</label>
							</div>
							<div class="col-md-4">
								<input class="form-check-input " type="checkbox" id="chk9">
								<label class="form-check-label" for="chk9"><i class="fas fa-people-carry"></i>
									Order Management
								</label>
							</div>
						</div>
						
						<div class="row row1">
							<div class="col-md-4">
								<input class="form-check-input " type="checkbox" id="chk10">
								<label class="form-check-label" for="chk10">
									Customers management
								</label>
							</div>
						</div>	
					</div>
				</div>
				<!-- Chú ý về cho thêm icon vào các roles -->
				
				
				<div class="row">
			<!-- Text-center được định nghĩa sẵn trong bootstrap -->
					<div class="col-md-12 text-center mytitle"><i class="far fa-id-card"></i> DETAIL INFORMATION</div>
				</div>
				
				<div class="form-group row">
					<label for="inputFullname" class="col-md-2 col-form-label text-right">Fullname</label>
					<div class="col-md-3">
						<input type="text" class="form-control" id="inputFullname" name="txtFullname">
					</div>
				</div>
				
				<div class="form-group row">
					<label for="inputAlias" class="col-md-2 col-form-label text-right">Alias</label>
					<div class="col-md-3">
						<input type="text" class="form-control" id="inputAlias" name="txtAlias">
					</div>
				</div>
				
				<div class="form-group row">
					<label for="inputGender" class="col-md-2 col-form-label text-right">Gender</label>
					<div class="col-md-3">
						<select class="form-control" id="inputGender" name="slcGender">
							<option value="0">Nam</option>
							<option value="1">Nữ</option>
							<option value="2">Nữ -> Nam</option></option>
							<option value="3">Nam -> Nữ</option></option>
							<option value="4">Nam không xác định</option>
							<option value="5">Nữ không xác định</option>
							<option value="6" selected >---</option>
						</select>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="inputAddress" class="col-md-2 col-form-label text-right">Address</label>
					<div class="col-md-6">
						<input type="text" class="form-control" id="inputAddress" name="txtAddress">
					</div>
				</div>
				
				<div class="form-group row">
					<label for="inputPhone" class="col-md-2 col-form-label text-right">Phone</label>
					<div class="col-md-2">
						<input type="text" class="form-control" id="inputPhone" name="txtPhone">
					</div>
					<label for="inputOfficePhone" class="col-md-2 col-form-label text-right">Office Phone</label>
					<div class="col-md-2">
						<input type="text" class="form-control" id="inputOfficePhone" name="txtOfficePhone">
					</div>
					<label for="inputMobile" class="col-md-2 col-form-label text-right">Mobile Phone</label>
					<div class="col-md-2">
						<input type="text" class="form-control" id="inputMobile" name="txtMobile">
					</div>
				</div>
				
				
				
				<div class="form-group row align-items-center">
					<label for="inputNotes" class="col-md-2 col-form-label text-right">Notes</label>
					<div class="col-md-10">
						<textarea class="form-control" id="inputNotes" rows="8"></textarea>
					</div>
				</div>
				<script language="javascript" type="text/javascript">
					var editor = CKEDITOR.replace('inputDetail');
				</script>
				
				<div class="row">
			<!-- Text-center được định nghĩa sẵn trong bootstrap -->
					<div class="col-md-12 text-center mytitle"><i class="far fa-id-card"></i> DEPARTMENT INFORMATION</div>
				</div>
				
				<div class="form-group row">
					<label for="inputDepartName" class="col-md-2 col-form-label text-right">Name</label>
					<div class="col-md-6">
						<input type="text" class="form-control" id="inputAddress" name="txtDepartName">
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-md-12">
						<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.0526687756974!2d105.73807061533226!3d21.03057849309133!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345488b0aace91%3A0x1719b52f60206572!2sNgoc%20Mach%20Church!5e0!3m2!1sen!2s!4v1592396064314!5m2!1sen!2s" 
						width="100%" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
					</div>
				</div>
				
				
				
				<div class="form-group row">
					<div class="col-md-2"></div>
					<div class="col-md-6">
						<div class="form-check">
							<input class="form-check-input " type="checkbox" id="chkAgree">
							<label class="form-check-label" for="chkAgree">
								Are you agree with rules of provider?
							</label>
						</div>
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-md-12 text-center">
						<a href="#"><i class="fas fa-headset"></i> Support!</a> &nbsp; &nbsp; | &nbsp; &nbsp;
						<a href="#"><i class="fas fa-question"></i> Help</a>
					</div>
				
				</div>
				
				<div class="form-group row">
					<div class="col-md-12 text-center">
						<button type="submit" class="btn btn-primary"><i class="fas fa-sign-in-alt"></i> Register</button>
						<button type="submit" class="btn btn-primary"><i class="fas fa-sign-out-alt"></i> Exit</button>
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-md-12 text-right">
						<a href="#">Tiếng Việt</i></a>
					</div>
				</div>
				
			</form>
		</div>
	</body>
	
</html>
