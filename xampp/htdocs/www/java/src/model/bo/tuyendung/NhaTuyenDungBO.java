package model.bo.tuyendung;



import java.util.ArrayList;

import model.bean.tuyendung.NhaTuyenDung;

import model.dao.tuyendung.NhaTuyenDungDAO;

public class NhaTuyenDungBO {
	NhaTuyenDungDAO nhaTuyenDungDAO=new NhaTuyenDungDAO();
	/**
	 * get danh sach nha tuyen dung
	 * @return
	 */
	public ArrayList<NhaTuyenDung> getListNhaTuyenDung(){
		return nhaTuyenDungDAO.getListNhaTuyenDung();
		
	}
	/**
	 * Get Nha tuyen dung theo ID
	 * @param email
	 * @return
	 */
	public NhaTuyenDung getNhaTuyenDungID(String email){
		return nhaTuyenDungDAO.getNhaTuyenDungID(email);
		
	}
	public ArrayList<NhaTuyenDung> getlistNhaTuyenDung() {
		// TODO Auto-generated method stub
		return nhaTuyenDungDAO.getlistNhaTuyenDung();
	}
	public boolean suaNhaTuyenDung(NhaTuyenDung dung){
		return nhaTuyenDungDAO.suaNhaTuyenDung(dung);
	}
	public ArrayList<NhaTuyenDung> getlistNhaTuyenDung(String ten) {
		return nhaTuyenDungDAO.getlistNhaTuyenDung(ten);
	}
	public void xoaNhaTuyenDung(String email){
		nhaTuyenDungDAO.xoaNhaTuyenDung(email);
	}
	
	public int getSoLuongNhaTuyenDung(){
		return nhaTuyenDungDAO.getSoLuongNhaTuyenDung();
	}
	public int getSoLuongUngVien(){
		return nhaTuyenDungDAO.getSoLuongNhaTuyenDung();
	}
}
