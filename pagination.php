<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Pagination</title>
	<link rel="stylesheet" type="text/css" href="pagination.css" />
</head>
<body>
	<div class="content">
		<div id="tnt_pagination">
			<span class="disabled_tnt_pagination">Prev</span>
				<a href="pagination.php?page=1">1</a>
				<a href ="pagination.php?page=2">2</a>
				<a href="pagination.php?page=3">3</a>
				<a href="pagination.php?page=4">4</a>
				<a href="pagination.php?page=5">5</a>
				<a href="pagination.php?page=6">6</a>
				<a href="pagination.php?page=7">7</a>
				<a href="pagination.php?page=8">8</a>
				<a href="pagination.php?page=9">9</a>
				<a href="pagination.php?page=10">10</a>
				<a href="#forward">Next</a>
		</div>
		<?php
			$page = (isset($_GET["page"])==true) ? $_GET["page"] : 0;
			
		?>
		<p class="result">Bạn đang ở trang <?php echo $page; ?> </p>
	</div>

</body>
</head>
</html>