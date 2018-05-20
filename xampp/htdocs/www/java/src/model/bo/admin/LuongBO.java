package model.bo.admin;

import java.util.ArrayList;

import model.bean.admin.Luong;
import model.dao.admin.LuongDAO;

public class LuongBO {
	LuongDAO  luongDAO=new LuongDAO();
	public ArrayList<Luong> getListLuong(){
		return luongDAO.getListLuong();
	}
}
