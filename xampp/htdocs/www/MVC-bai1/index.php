<?php 
	require_once 'config/db.php';
	
	if( isset($_GET['controller'], $_GET['action'] ))
	{
		$controller = $_GET['controller'];
		$action = $_GET['action'];
	}
	else
	{
		$controller = 'home';
		$action = 'index';
	}

	require_once 'views/layout.php';
	
?>