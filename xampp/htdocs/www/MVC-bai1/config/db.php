<?php 
	
	class Database{
		public static $db;
		private static $dns = 'mysql:host=localhost;dbname=check2';
		private static $username = 'root';
		private static $password = '';

		public static function connect()
		{
			//Kiểm tra database đã được kết nối chưa
			if( !isset( self::$db ) )
			{
				try {
					//Tạo đối tượng kết nối database
					self::$db = new PDO(self::$dns, self::$username, self::$password);
					self::$db->exec('set names utf8');
				} catch (PDOException $e) {
					$e->getMessage();
				}
			}
			return self::$db;
		}
	}

