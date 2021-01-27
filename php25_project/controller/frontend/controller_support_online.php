<?php 
	class controller_support_online{
		public $model;
		public function __construct(){
			$this->model = new model();
			//lay cac ban ghi trong tbl_support_online
			$arr = $this->model->fetch("select * from tbl_support_online");
			//load view
			include "view/frontend/view_support_online.php";
		}
	}
	new controller_support_online();
 ?>