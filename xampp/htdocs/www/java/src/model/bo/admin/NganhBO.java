package model.bo.admin;

import java.util.ArrayList;

import model.bean.admin.Nganh;
import model.dao.admin.NganhDAO;

public class NganhBO {
	
	
	NganhDAO nganhDAO=new NganhDAO();
	public ArrayList<Nganh> getListNganh(){
		return nganhDAO.getListNganh();
	}
	public String getTenNganhID(String ma){
		return nganhDAO.getTenNganhID(ma);
	}
}
