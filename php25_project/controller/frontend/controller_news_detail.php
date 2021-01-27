<?php 
	class controller_news_detail{
		public $model;
		public function __construct(){
			$this->model = new model();
			//lay bien id tu url
			$id = isset($_GET["id"])&&is_numeric($_GET["id"])?$_GET["id"]:0;
			//lay 1 ban ghi tuong ung voi id
			$arr = $this->model->fetch_one("select * from tbl_news where pk_news_id=$id");
			//load view
			include "view/frontend/view_news_detail.php";
		}
	}
	new controller_news_detail();
 ?>