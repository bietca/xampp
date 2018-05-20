package model.bo.ungvien;

import java.util.ArrayList;

import model.bean.ungvien.ThuUngTuyenNhanh;
import model.bean.ungvien.UngVien;
import model.dao.ungvien.UngVienDAO;

public class UngVienBO {
	UngVienDAO ungVienDAO=new UngVienDAO();
	/**
	 * Kiem tra Dang Nhap
	 * @param tenDangNhap
	 * @param matKhau
	 * @return
	 */
	public boolean kiemtraDangNhap(String tenDangNhap,String matKhau){
		return ungVienDAO.kiemtraDangNhap(tenDangNhap,matKhau);
	}
	/**
	 * Them tai khoan
	 * @param email
	 * @param matKhau
	 * @return
	 */
	public boolean themUngVien(String email,String matKhau){
		return ungVienDAO.themUngVien( email, matKhau);
	}
	/**
	 * Kiem tra email 
	 * @param email
	 * @return
	 */
	public boolean ktEmailUngVien(String email){
		return ungVienDAO.ktEmailUngVien( email);
		
	}
	public UngVien getUngVienID(String email){
		return ungVienDAO.getUngVienID(email);
	}
	/**
	 * them thu ung tuyen nhan
	 * @param tuyenNhanh
	 * @return
	 */
	public boolean themThuUngTuyen(ThuUngTuyenNhanh tuyenNhanh){
		return ungVienDAO.themThuUngTuyen(tuyenNhanh);
	}
	/**
	 * get list thu ung vien da gui cho nha ung tuyen
	 * @param email
	 * @return
	 */
	public ArrayList<ThuUngTuyenNhanh> getListThuDaUngTuyen(String email){
		return ungVienDAO.getListThuDaUngTuyen(email);
	}
	/**
	 * Hien thi danh sach thu ung vien ung tuyen tren thu nha tuyen dung
	 * @param email
	 * @return
	 */
	public ArrayList<ThuUngTuyenNhanh> getListThuGuiUngTuyen(String email){
		return ungVienDAO.getListThuGuiUngTuyen(email);
	}
	/**
	 * get danh sach thu gui nha tuyen dung
	 * @param nhanh
	 * @return
	 */
	public boolean kiemTraThuUngTuyen(ThuUngTuyenNhanh nhanh){
		return ungVienDAO.kiemTraThuUngTuyen(nhanh);
	}
	
	public boolean suaUngVien(UngVien  ungVien){
		return ungVienDAO.suaUngVien(ungVien);
	}
	public void xoaUngVien(String email) {
         ungVienDAO.xoaUngVien(email);
		
	}
	public ArrayList<UngVien>  getlistUngVienID(){
		return ungVienDAO.getlistUngVienID();
	}
	public ArrayList<ThuUngTuyenNhanh> getListThuGuiUngTuyenTrangthai(String email, int trangthai) {
		
		return ungVienDAO.getListThuGuiUngTuyenTrangthai(email, trangthai);
	}
	public int getSoLuongUngVien(){
		return ungVienDAO.gegetSoLuongUngVien();
	}
	public ArrayList<UngVien> getlistUngVienID(String Email) {
		// TODO Auto-generated method stub
		return ungVienDAO.getlistUngVienID(Email);
	}
}
