<?php 
	class controller_add_edit_product{
		public $model;
		public function __construct(){
			$this->model = new model();
			//-------
			$act = isset($_GET["act"])?$_GET["act"]:"";
			switch($act){
				case "edit":
				//lay 1 ban ghi trong tbl_product tuong ung voi id truyen vao. Ham fetch_one($sql) se tra ve mot ban ghi
				//ham is_numeric(kytu) se tra ve true neu kytu la so, tra ve false neu kytu khong phai la so
				$id = isset($_GET["id"])&&is_numeric($_GET["id"])?$_GET["id"]:0;
				$arr = $this->model->fetch_one("select * from tbl_product where pk_product_id=$id");	
				//tao bien $form_action de chi duong dan ma form submit den khi thuc hien chuc nang add hay edit
				$form_action = "admin.php?controller=add_edit_product&act=do_edit&id=$id";
				break;	
				case "do_edit":
					$id = isset($_GET["id"])&&is_numeric($_GET["id"])?$_GET["id"]:0;
					//--------
					$c_name = $_POST["c_name"];
					$c_description = $_POST["c_description"];
					$c_content = $_POST["c_content"];
					$c_hotproduct = isset($_POST["c_hotproduct"])?1:0;
					$fk_category_product_id=$_POST["fk_category_product_id"];
					$c_price=$_POST["c_price"];
					//update ban ghi
					$this->model->execute("update tbl_product set c_name='$c_name',c_description='$c_description',c_content='$c_content',c_hotproduct=$c_hotproduct,fk_category_product_id=$fk_category_product_id,c_price=$c_price where pk_product_id=$id");
					//--------
					//kiem tra, neu user browse anh thi thuc hien upload anh
					if($_FILES["c_img"]["name"] != ""){
						//---------
						//lay duong dan anh cu de xoa
						$old_img = $this->model->fetch_one("select c_img from tbl_product where pk_product_id=$id");
						if(file_exists("public/upload/product/".$old_img->c_img)){
							//ham unlink(duongdan) se thuc hien viec xoa file theo duongdan
							unlink("public/upload/product/".$old_img->c_img);
						}
						//---------
						$c_img = $_FILES["c_img"]["name"];
						// ham time() se doi thoi gian ve mot so nguyen
						$c_img = time().$c_img;
						//thuc hien viec upload anh
						$tmp_name = $_FILES["c_img"]["tmp_name"];
						move_uploaded_file($tmp_name,"public/upload/product/$c_img");
						//thuc hien edit c_img
						$this->model->execute("update tbl_product set c_img='$c_img' where pk_product_id=$id");
					}
					//--------
					header('location:admin.php?controller=product');
				break;
				case "add":
					$form_action = "admin.php?controller=add_edit_product&act=do_add";
				break;
				case "do_add":
					$c_name = $_POST["c_name"];
					$c_description = $_POST["c_description"];
					$c_content = $_POST["c_content"];
					$c_hotproduct = isset($_POST["c_hotproduct"])?1:0;
					$c_img = "";
					$fk_category_product_id=$_POST["fk_category_product_id"];
					$c_price=$_POST["c_price"];
					//neu user chon file, thuc hien upload file
					if($_FILES["c_img"]["name"] != ""){
						$c_img = $_FILES["c_img"]["name"];
						$c_img = time().$c_img;
						$tmp_name = $_FILES["c_img"]["tmp_name"];
						move_uploaded_file($tmp_name,"public/upload/product/$c_img");
					}
					//insert ban ghi
					$this->model->execute("insert into tbl_product(c_name,c_description,c_content,c_img,c_hotproduct,fk_category_product_id,c_price) values('$c_name','$c_description','$c_content','$c_img',$c_hotproduct,$fk_category_product_id,$c_price)");
					header('location:admin.php?controller=product');
				break;
			}	
			//-------
			//load view
			include "view/backend/view_add_edit_product.php";
		}
	}
	new controller_add_edit_product();
 ?>