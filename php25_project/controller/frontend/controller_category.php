<?php 
	class controller_category{
		public $model;
		public function __construct(){
			$this->model = new model();
			//lay cac ban ghi trong tbl_category_product
			$arr = $this->model->fetch("select * from tbl_category_product order by pk_category_product_id desc");
			//load view
			include "view/frontend/view_category.php";
		}
	}
	new controller_category();
 ?>