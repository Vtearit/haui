<?php 
	class controller_add_edit_news{
		public $model;
		public function __construct(){
			$this->model = new model();
			//-------
			$act = isset($_GET["act"])?$_GET["act"]:"";
			switch($act){
				case "edit":
				//lay 1 ban ghi trong tbl_news tuong ung voi id truyen vao. Ham fetch_one($sql) se tra ve mot ban ghi
				//ham is_numeric(kytu) se tra ve true neu kytu la so, tra ve false neu kytu khong phai la so
				$id = isset($_GET["id"])&&is_numeric($_GET["id"])?$_GET["id"]:0;
				$arr = $this->model->fetch_one("select * from tbl_news where pk_news_id=$id");	
				//tao bien $form_action de chi duong dan ma form submit den khi thuc hien chuc nang add hay edit
				$form_action = "admin.php?controller=add_edit_news&act=do_edit&id=$id";
				break;	
				case "do_edit":
					$id = isset($_GET["id"])&&is_numeric($_GET["id"])?$_GET["id"]:0;
					//--------
					$c_name = $_POST["c_name"];
					$c_description = $_POST["c_description"];
					$c_content = $_POST["c_content"];
					$c_hotnews = isset($_POST["c_hotnews"])?1:0;
					//update ban ghi
					$this->model->execute("update tbl_news set c_name='$c_name',c_description='$c_description',c_content='$c_content',c_hotnews=$c_hotnews where pk_news_id=$id");
					//--------
					//kiem tra, neu user browse anh thi thuc hien upload anh
					if($_FILES["c_img"]["name"] != ""){
						//---------
						//lay duong dan anh cu de xoa
						$old_img = $this->model->fetch_one("select c_img from tbl_news where pk_news_id=$id");
						if(file_exists("public/upload/news/".$old_img->c_img)){
							//ham unlink(duongdan) se thuc hien viec xoa file theo duongdan
							unlink("public/upload/news/".$old_img->c_img);
						}
						//---------
						$c_img = $_FILES["c_img"]["name"];
						// ham time() se doi thoi gian ve mot so nguyen
						$c_img = time().$c_img;
						//thuc hien viec upload anh
						$tmp_name = $_FILES["c_img"]["tmp_name"];
						move_uploaded_file($tmp_name,"public/upload/news/$c_img");
						//thuc hien edit c_img
						$this->model->execute("update tbl_news set c_img='$c_img' where pk_news_id=$id");
					}
					//--------
					header('location:admin.php?controller=news');
				break;
				case "add":
					$form_action = "admin.php?controller=add_edit_news&act=do_add";
				break;
				case "do_add":
					$c_name = $_POST["c_name"];
					$c_description = $_POST["c_description"];
					$c_content = $_POST["c_content"];
					$c_hotnews = isset($_POST["c_hotnews"])?1:0;
					$c_img = "";
					//neu user chon file, thuc hien upload file
					if($_FILES["c_img"]["name"] != ""){
						$c_img = $_FILES["c_img"]["name"];
						$c_img = time().$c_img;
						$tmp_name = $_FILES["c_img"]["tmp_name"];
						move_uploaded_file($tmp_name,"public/upload/news/$c_img");
					}
					//insert ban ghi
					$this->model->execute("insert into tbl_news(c_name,c_description,c_content,c_img,c_hotnews) values('$c_name','$c_description','$c_content','$c_img',$c_hotnews)");
					header('location:admin.php?controller=news');
				break;
			}	
			//-------
			//load view
			include "view/backend/view_add_edit_news.php";
		}
	}
	new controller_add_edit_news();
 ?>