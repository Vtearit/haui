<?php 
	class controller_search{
		public $model;
		public function __construct(){
			$this->model = new model();
			$key = isset($_GET["key"])?$_GET["key"]:"";	
			//so ban ghi tren mot trang
			$record_per_page = 12;
			//tinh tong so ban ghi
			$total = $this->model->count("select * from tbl_product where c_name like '%$key%'");
			//tinh so trang = tongsobanghi/sobanghitrenmottrang
			$num_page = ceil($total/$record_per_page);
			//lay bien trang tu url
			$page = isset($_GET["p"])&&$_GET["p"]>0?$_GET["p"]-1:0;
			//lay tu ban ghi bao nhieu tuong ung trang bao nhieu = tranghientai * soluongbanghi
			$from = $page*$record_per_page;
			//lay tat ca cac ban ghi bang ham fetch
			$arr = $this->model->fetch("select * from tbl_product where c_name like '%$key%' order by pk_product_id desc limit $from,$record_per_page");
			//--------
			//load view
			include "view/frontend/view_search.php";
		}
	}
	new controller_search();
 ?>