package model.bo.admin;

import java.util.ArrayList;

import model.bean.admin.BaiViet;
import model.dao.admin.BaiVietDAO;






public class BaiVietBO {
BaiVietDAO baiVietDAO=new BaiVietDAO();
public ArrayList<BaiViet>quanliBaiViet(){
	return baiVietDAO.getlistquanliBaiViet();	
	
}
public void xoaBaiViet(int maBaiViet) {
	// TODO Auto-generated method stub
	baiVietDAO.xoaBaiViet(maBaiViet);
	
}
public void suaBaiViet(int maBaiViet,int trangthai) {
	// TODO Auto-generated method stub
	baiVietDAO.suaSinhVien(maBaiViet,trangthai);
}
public BaiViet getThongTinBaiViet(int  maBaiViet) {
	return baiVietDAO.getThongTinBaiViet(maBaiViet);
}
public ArrayList<BaiViet> getlistpheDuyetBaiViet(int pheDuyet) {
	// TODO Auto-generated method stub
	return baiVietDAO.getlistpheDuyetBaiViet(pheDuyet);
}
}
