package model.bo.admin;

import java.util.ArrayList;

import model.bean.admin.LoaiCongViec;
import model.dao.admin.LoaiConhViecDAO;

public class LoaiCongViecBO {
	LoaiConhViecDAO loaiConhViecDAO=new LoaiConhViecDAO();
	public ArrayList<LoaiCongViec> getListLoaiCongViec(){
			return loaiConhViecDAO.getListLoaiCongViec();
	}
}
