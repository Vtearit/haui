<?php 
	class controller_product{
		public $model;
		public function __construct(){
			$this->model = new model();
			$category_id = isset($_GET["category_id"])?$_GET["category_id"]:0;			
			//so ban ghi tren mot trang
			$record_per_page = 12;
			//tinh tong so ban ghi
			$total = $this->model->count("select * from tbl_product where fk_category_product_id=$category_id");
			//tinh so trang = tong so ban ghi/so ban ghi tren mot trang
			$num_page = ceil($total/$record_per_page);
			//lay bien trang tu url
			$page = isset($_GET["p"])&&$_GET["p"]>0?$_GET["p"]-1:0;
			//lay tu ban ghi bao nhieu tuong ung trang bao nhieu = tranghientai * soluongbanghi
			$from = $page*$record_per_page;
			//lay tat ca cac ban ghi bang ham fetch
			$arr = $this->model->fetch("select * from tbl_product where fk_category_product_id=$category_id order by pk_product_id desc limit $from,$record_per_page");
			//--------
			//load view
			include "view/frontend/view_product.php";
		}
	}
	new controller_product();
 ?>