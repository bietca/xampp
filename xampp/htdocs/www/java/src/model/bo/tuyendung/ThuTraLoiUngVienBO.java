package model.bo.tuyendung;

import java.util.ArrayList;

import model.bean.tuyendung.TraLoiThuUngVien;
import model.dao.tuyendung.ThuTraLoiUngVienDAO;

public class ThuTraLoiUngVienBO {
	ThuTraLoiUngVienDAO traloi=new ThuTraLoiUngVienDAO();	
	/**
	 * Lay danh sach ung vien
	 * @param thuUngVien
	 * @return
	 */
	public boolean traLoiThuUngTuyen(TraLoiThuUngVien thuUngVien){
		return traloi.traLoiThuUngTuyen(thuUngVien);
	}
	/**
	 * Get list thu unung tuyen nhanh
	 * @param email
	 * @return
	 */
	public ArrayList<TraLoiThuUngVien> getlistThuUng(String email){
		return traloi.getlistThuUngTuyenNhanh(email);
	}
	/**
	 * get lich thu da nhan tu nha ung tuyen
	 * @param email
	 * @return
	 */
	public ArrayList<TraLoiThuUngVien> getlistThuUngVienDaNhan(String email){
		return traloi.getlistThuUngVienDaNhan(email);
	}
	
	/**
	 * get lich thu da nhan tu nha ung tuyen
	 * @param email
	 * @return
	 */
	public ArrayList<TraLoiThuUngVien> getlistTLocThuUngVien(String email,int trangthai){
		return traloi.getlistTLocThuUngVien(email,trangthai);
	}
	/**
	 * Thu thu nha tuyen dung thu nao xem va chua xem
	 * @param email
	 * @param trangthai
	 * @return
	 */
	public ArrayList<TraLoiThuUngVien> getlistTLocThuNhatuyenDung(String email,int trangthai){
		return traloi.getlistTLocThuNhatuyenDung(email,trangthai);
	}
	/**
	 * get thu theo ID
	 * @param maPhanHoi
	 * @return
	 */
	public TraLoiThuUngVien getTraLoiThuUngVienID(int maPhanHoi){
		return traloi.getTraLoiThuUngVienID(maPhanHoi);
	}
	/**
	 * ung vien tra loi thu nha tuyen dung
	 * @param thuUngVien
	 * @return
	 */
	public boolean traLoiThuNhaTuyenDung(TraLoiThuUngVien thuUngVien){
		return traloi.traLoiThuNhaTuyenDung(thuUngVien);
	}
	/**
	 * Get danh sach ung vien da gui cho nha tuyen dung
	 * @param email
	 * @return
	 */
	public ArrayList<TraLoiThuUngVien> getListThuUngTuyenDaGui(String email){
		return traloi.getListThuUngTuyenDaGui(email);
	}
	/**
	 * Get Danh sach thu da gui cho nha tuyen dung cua ung vien
	 * @param maPhaHoi
	 * @return
	 */
	public TraLoiThuUngVien getThuDaGui(int maPhaHoi){
		return traloi.getThuDaGui(maPhaHoi);
	}
	public TraLoiThuUngVien getThuDaGui1(int maPhaHoi){
		return traloi.getThuDaGui1(maPhaHoi);
	}
	/**
	 * Get Thu nha tuyen dung nhan dc tu ung vien tra loi
	 * @param maPhaHoi
	 * @return
	 */			
	public  ArrayList<TraLoiThuUngVien>  getThuNhaTuyenDungNhan(String email){
		return traloi.getThuNhaTuyenDungNhan(email);
	}
	/**
	 * thay doi tai thai thu da nhan cua ung vien
	 * @param maPhanHoi
	 */
	public void thayDoiTrangThaiThu(int maPhanHoi){
			traloi.thayDoiTrangThaiThu(maPhanHoi);
	}
	/**
	 * thay doi tai thai thu da nhan cua ung vien
	 * @param maPhanHoi
	 */
	public void thayDoiTrangThaiThuNhaTuyenDung(int maPhanHoi){
			traloi.thayDoiTrangThaiThuNhaTuyenDung(maPhanHoi);
	}
	
}
