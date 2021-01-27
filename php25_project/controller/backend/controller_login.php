<?php 
	class controller_login{
		public $model;
		public function __construct(){
			//------
			//bán biến model có giá trị là một object của class model
			$this->model = new model();
			//------
			if($_SERVER["REQUEST_METHOD"] == "POST"){
				$c_email = $_POST["c_email"];
				$c_password = $_POST["c_password"];
				$c_password = md5($c_password);
				//so sanh thong tin voi cac ban ghi trong csdl
				$check = $this->model->fetch_one("select c_email,c_password from tbl_user where c_email='$c_email'");
				if($check->c_password == $c_password){
					//dang nhap thanh cong
					$_SESSION["c_email"] =$c_email;
				}
				//quay lai trang admin.php
				header("location:admin.php");
			}
			//------
			//load view
			include "view/backend/view_login.php";
		}
	}
	new controller_login();
 ?>