package model.bo.admin;

import java.util.ArrayList;

import model.bean.admin.NoiLamViec;
import model.dao.admin.NoiLamViecDAO;

public class NoiLamViecBO {
	NoiLamViecDAO noiLamViecDAO=new NoiLamViecDAO();
	
	public ArrayList<NoiLamViec> getListNoiLamViec(){
		return noiLamViecDAO.getListNoiLamViec();
	}
	public String getTenNoiLamViecID(String ma){
		return noiLamViecDAO.getTenNoiLamViecID(ma);
	}
}
