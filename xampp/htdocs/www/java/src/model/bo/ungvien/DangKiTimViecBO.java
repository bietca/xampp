package model.bo.ungvien;

import java.util.ArrayList;

import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.ungvien.DangKiTimViec;
import model.dao.ungvien.DangKiTimViecDAO;

public class DangKiTimViecBO {
	DangKiTimViecDAO dangKiTimViecDAO=new DangKiTimViecDAO();
	public boolean themDangKiTimViec(DangKiTimViec kiTimViec){
		return dangKiTimViecDAO.themDangKiTimViec(kiTimViec);
	}
	public boolean kiemtraTonTai(String email){
		return dangKiTimViecDAO.kiemtraTonTai(email);
	}
	public boolean kiemtraTonTaiTrongDK(String email){
		return dangKiTimViecDAO.kiemtraTonTaiTrongDK(email);
	}
	public boolean suaDangKiTimViec(DangKiTimViec kiTimViec){
		return dangKiTimViecDAO.suaDangKiTimViec(kiTimViec);
	}
	public ArrayList<BaiTuyenDung1> getTop10BTDTheoDangKi(DangKiTimViec kiTimViec){
		return dangKiTimViecDAO.getTop10BTDTheoDangKi(kiTimViec);
	}
	
	public DangKiTimViec getDangKiTimViecID(String email){
		return dangKiTimViecDAO.getDangKiTimViecID(email);
	}
}
