<?php 
	//load file config
	include "config.php";
	class model{
		//ham fetch: lay tat ca cac ban ghi
		public function fetch($sql){
			global $db;
			$result = mysqli_query($db,$sql);
			$arr = array();
			while($rows = mysqli_fetch_object($result))
				$arr[] = $rows;
			return $arr;
		}
		//ham fetch_one: lay mot ban ghi
		public function fetch_one($sql){
			global $db;
			$result = mysqli_query($db,$sql);
			$rows = mysqli_fetch_object($result);
			return $rows;
		}
		//ham count: tra ve so luong ban ghi
		public function count($sql){
			global $db;
			$result = mysqli_query($db,$sql);
			$count = mysqli_num_rows($result);
			return $count;
		}

		//thuc thi truy van update insert delete
		public function execute($sql){
			global $db;
			if(mysqli_query($db,$sql) == true)
				//lay id cua ban ghi vua insert
				return mysqli_insert_id($db);
			return 0;
		}
		//lay ban ghi vua moi insert vao
		public function get_insert_id($id_name,$table_name){
			global $db;
			$result = mysqli_query($db,"select $id_name from $table_name order by $id_name desc limit 0,1");
			$row = mysqli_fetch_array($result);
			return $row;
		}
	}

 ?>