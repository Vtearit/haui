<?php 
	//start session
	session_start();
	//load file model
	include "model/model.php";
	//khởi tạo giỏ hàng
	if(!isset($_SESSION['cart'])) $_SESSION['cart'] = array();
	//===========
	//kiểm tra, nếu usẻ chưa đăng nhập thì yêu cầu phải đăng nhập trước khi truy cập trang admin
	if(isset($_SESSION["c_email"]) == false){
		include "controller/backend/controller_login.php";
	}else{
		//lay bien $_GET["controller"] tu url, sau do gan duong dan de ra duong dan thuc cua file. VD: tren url co controller=logout, khi do se gan duong dan thanh controller_logout.php
		$controller = isset($_GET["controller"])?$_GET["controller"]:"";
		if($controller != "")
			$controller = "controller/backend/controller_$controller.php";
		//load layout
		include "view/backend/view_layout.php";
	}
 ?>