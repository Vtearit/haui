<?php 
	class controller_contact{
		public $model;
		public function __construct(){
			include "view/frontend/view_contact.php";
		}
	}
	new controller_contact();
 ?>