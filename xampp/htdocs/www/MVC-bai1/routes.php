<?php 
	require_once 'models/master.php';
	require_once 'controllers/'.$controller.'.php';

	switch ($controller) {
		case 'home':
			$controller = new Home;
			break;
		case 'employee':
			$controller = new Employee;
			break;
	}

	$controller->{ $action }();
?>