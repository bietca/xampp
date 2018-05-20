package model.bo.admin;

import java.util.ArrayList;

import model.bean.admin.CapBac;
import model.dao.admin.CapBacDAO;

public class CapBacBO {
	CapBacDAO capBacDAO=new CapBacDAO();
	/**
	 * get List Cap bac
	 * @return
	 */
	public ArrayList<CapBac> getListCapBac(){
		return capBacDAO.getListCapBac();
	}
}
