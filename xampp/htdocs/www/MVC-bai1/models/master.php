<?php 
	/**
	* 
	*/
	class MasterModel
	{
		public function getAll($table)
		{
			$db = Database::connect();
			$sql = "SELECT * FROM $table";
			$stml = $db->prepare($sql);
			$stml->execute();
			$result = $stml->fetchAll(PDO::FETCH_ASSOC);
			$stml->closeCursor();
			return $result;
		}

		public function deleteById($table,$column,$value)
		{
			$db = Database::connect();
			$sql = "DELETE FROM $table WHERE $column = :value";
			$stml = $db->prepare($sql);
			$stml->bindParam(':value', $value);
			$stml->execute();
			$stml->closeCursor();	
		}
	}


 ?>