<?php 
	$hostname = "localhost";
	$user = "root";
	$password = "";
	$database = "php25_project";
	$db = mysqli_connect($hostname, $user, $password, $database);
	mysqli_set_charset($db,"UTF8");
?>