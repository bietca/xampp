package model.bo.admin;

import java.util.ArrayList;

import model.bean.admin.KiNang;
import model.dao.admin.KiNangDAO;

public class KiNangBO {
	
	KiNangDAO  kiNangDAO=new KiNangDAO();
	public ArrayList<KiNang> getListKiNang(){
		return kiNangDAO.getListKiNang();
	}
	public String getTenKiNangID(String ma){
		return kiNangDAO.getTenKiNangID(ma);
	}

}
