package model.bo.tuyendung;

import java.util.ArrayList;

import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.tuyendung.TimKiemLoc;
import model.dao.tuyendung.TuyenDungDAO;

public class TuyenDungBO {
	TuyenDungDAO tuyenDungDAO=new TuyenDungDAO();
	/**
	 * kiem tra dang Nhao
	 * @param tenDangNhap
	 * @param matKhau
	 * @return
	 */
	public boolean kiemtraDangNhap(String tenDangNhap,String matKhau){
		return tuyenDungDAO.kiemtraDangNhap(tenDangNhap,matKhau);
	}
	/**
	 * Get Bai biet theo id
	 * @param maBaiDang
	 * @return
	 */
	public BaiTuyenDung1 getListALLBaiTuyenDungID(int maBaiDang){
		return	tuyenDungDAO.getListALLBaiTuyenDungID(maBaiDang);
	}
	/**
	 * tang luoc xem
	 * @param maBaiViet
	 */
	public void tangLuotXem(int maBaiViet){
		tuyenDungDAO.tangLuotXem(maBaiViet);
	}
	/**
	 * tim kiem bai tuyen dung
	 * @param baiTuyenDung
	 * @return
	 *//*
	
	*//**
	 * them bai toai khoan nha tuyen dung
	 * @param email
	 * @param matKhau
	 * @return
	 */
	public boolean themNhaTuyenDung(String email,String matKhau){
		return tuyenDungDAO.themNhaTuyenDung(email,matKhau);
	}
	/**
	 * kiem tra email da ton tai chua
	 * @param email
	 * @return
	 */
	public boolean kiemTraEmail(String email){
		return tuyenDungDAO.kiemTraEmail(email);
	}
	/**
	 * Them bai tuyen dung
	 * @param baiTuyenDung1
	 * @return
	 */
	public boolean themBaiTuyenDung(BaiTuyenDung1 baiTuyenDung1){
		return tuyenDungDAO.themBaiTuyenDung1(baiTuyenDung1);
	}
	
	/**
	 * get list danh sach co phan trang 1
	 * @param page
	 * @return
	 */
	public ArrayList<BaiTuyenDung1> getListALLBaiTuyenDung1PT(int page){
		return	tuyenDungDAO.getListALLBaiTuyenDung1PT(page);
	}
   public ArrayList<BaiTuyenDung1> timkiemLoc1(BaiTuyenDung1 baiTuyenDung){
		return tuyenDungDAO.timkiemLoc1(baiTuyenDung);
	   }
	/**
	 * get list bai tuyen dung theo email
	 * @param email
	 * @return
	 */
	public ArrayList<BaiTuyenDung1> getListALLBaiTuyenDungEmail(String email){
		return	tuyenDungDAO.getListALLBaiTuyenDungEmail(email);
	}
	/**
	 * Top 10 Bao thuc top theo luoc xem
	 * @return
	 */
	public ArrayList<BaiTuyenDung1> getListTop10BaiTHucTap(){
		return	tuyenDungDAO.getListTop10BaiTHucTap();
	}
	/**
	 * top 10 bao tuyen dung toan thoi gian
	 * @return
	 */
	public ArrayList<BaiTuyenDung1> getListTop10ToanThoiGian(){
		return	tuyenDungDAO.getListTop10ToanThoiGian();
	}
	/**
	 * top 10 bao tuyen dung Ban thoi gian
	 * @return
	 */
	public ArrayList<BaiTuyenDung1> getListTop10BanThoiGian(){
		return	tuyenDungDAO.getListTop10BanThoiGian();
	}
	/**
	 * Xoa bai tuyen dung
	 * @param maBaiDang
	 * @return
	 */
	public boolean xoaBaiTuyenDung(String email,int mabai){
		return	tuyenDungDAO.xoaBaiTuyenDUng(email,mabai);
	}
	/**
	 * get bai tuyen dung theo ID
	 * @param maBaiViet
	 * @return
	 */
	public ArrayList<BaiTuyenDung1> getTop10BaiTuyenDungMoi(){
		return tuyenDungDAO.getTop10BaiTuyenDungMoi();
	}
	public ArrayList<BaiTuyenDung1> getAllBaiuyennDung() {
		return tuyenDungDAO.getAllBaiuyennDung();
	}
}
