package model.bo.admin;

import java.util.ArrayList;

import model.bean.admin.KinhNghiem;
import model.dao.admin.KinhNghiemDAO;

public class KinhNghiemBO {
	KinhNghiemDAO kinhNghiemDAO=new KinhNghiemDAO();
	public ArrayList<KinhNghiem> getListKinhNghiem(){
		return kinhNghiemDAO.getListKinhNghiem();
	}
}
