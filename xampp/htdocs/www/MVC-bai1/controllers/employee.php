<?php  
	require_once 'models/user.php';
	/**
	* 
	*/
	class Employee 
	{
		public function index()
		{
			$danhsach = User::get_all();
			require_once 'views/danhsachnhanvien.php';

		}

		public function delete()
		{
			if ( isset($_GET['id']) ) {
				User::deleteById($_GET['id']);
			}
			$danhsach = User::get_all();
			require_once 'views/danhsachnhanvien.php';

		}		
	}
?>