<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="">
</head>
<body>
	<header id="header" class="">
		<a href="." >Home</a>
		<a href="?controller=employee&action=index">Nhân Viên</a>
	</header><!-- /header -->
	<main>
		<?php require_once(dirname(dirname(__FILE__)).'/routes.php') ?>
	</main>
</body>
</html>