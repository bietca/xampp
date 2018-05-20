<?php  
	
	/**
	* 
	*/
	class User extends MasterModel
	{
		public function get_all()
		{
			return parent::getAll('nguoitimviec');
		}

		public function deleteById($id)
		{
			parent::deleteById('nguoitimviec','id',$id);
		}
	}

?>