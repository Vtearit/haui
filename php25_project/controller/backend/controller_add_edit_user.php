<?php 
	class controller_add_edit_user{
		public $model;
		public function __construct(){
			$this->model = new model();
			//-------
			$act = isset($_GET["act"])?$_GET["act"]:"";
			switch($act){
				case "edit":
				//lay 1 ban ghi trong tbl_user tuong ung voi id truyen vao. Ham fetch_one($sql) se tra ve mot ban ghi
				//ham is_numeric(kytu) se tra ve true neu kytu la so, tra ve false neu kytu khong phai la so
				$id = isset($_GET["id"])&&is_numeric($_GET["id"])?$_GET["id"]:0;
				$arr = $this->model->fetch_one("select * from tbl_user where pk_user_id=$id");	
				//tao bien $form_action de chi duong dan ma form submit den khi thuc hien chuc nang add hay edit
				$form_action = "admin.php?controller=add_edit_user&act=do_edit&id=$id";
				break;	
				case "do_edit":
					$id = isset($_GET["id"])&&is_numeric($_GET["id"])?$_GET["id"]:0;
					$c_fullname = $_POST["c_fullname"];
					//----
					$c_fullname = str_replace("'", "\'", $c_fullname);
					$c_fullname = str_replace("<", "&lt", $c_fullname);
					//----
					$c_email = $_POST["c_email"];
					$c_password = $_POST["c_password"];
					//update tbl_user
					$this->model->execute("update tbl_user set c_fullname='$c_fullname',c_email='$c_email' where pk_user_id=$id");
					//kiem tra, neu password khong rong thi update password
					if($c_password != ""){
						$c_password = md5($c_password);
						$this->model->execute("update tbl_user set c_password='$c_password' where pk_user_id=$id");
					}
					header('location:admin.php?controller=user');
				break;
				case "add":
					$form_action = "admin.php?controller=add_edit_user&act=do_add";
				break;
				case "do_add":
					$c_fullname = $_POST["c_fullname"];
					$c_email = $_POST["c_email"];
					$c_password = $_POST["c_password"];
					//insert ban ghi
					$this->model->execute("insert into tbl_user(c_fullname,c_email,c_password) values('$c_fullname','$c_email','$c_password')");
					header('location:admin.php?controller=user');
				break;
			}	
			//-------
			//load view
			include "view/backend/view_add_edit_user.php";
		}
	}
	new controller_add_edit_user();
 ?>