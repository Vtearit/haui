<?php
	$hostname = "localhost";
	$user = "root";
	$password = "";
	$database = "sinhviendb2";
	$db = mysqli_connect($hostname, $user, $password, $database) or die("Lỗi kết nối đến server");
	mysqli_set_charset($db, "UTF8");
?>
