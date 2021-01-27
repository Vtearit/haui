<?php 
	class controller_introduce{
		public $model;
		public function __construct(){
			include "view/frontend/view_introduce.php";
		}
	}
	new controller_introduce();
 ?>