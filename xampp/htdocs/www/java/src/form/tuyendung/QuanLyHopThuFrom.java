package form.tuyendung;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.tuyendung.TraLoiThuUngVien;
import model.bean.ungvien.ThuUngTuyenNhanh;

public class QuanLyHopThuFrom extends ActionForm{
	


	private static final long serialVersionUID = 1L;
	private int maThu;
	private int maCV;
	private int maPhanHoi;
	
	private int trangthai;

	public int getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}


	ArrayList<ThuUngTuyenNhanh> listThuUngTuyenNhanh;
	ArrayList<TraLoiThuUngVien> listTraLoiThuUngVien;
	ArrayList<TraLoiThuUngVien> listThuDaNhan;
	
	
	public ArrayList<TraLoiThuUngVien> getListThuDaNhan() {
		return listThuDaNhan;
	}

	public void setListThuDaNhan(ArrayList<TraLoiThuUngVien> listThuDaNhan) {
		this.listThuDaNhan = listThuDaNhan;
	}

	public int getMaPhanHoi() {
		return maPhanHoi;
	}

	public void setMaPhanHoi(int maPhanHoi) {
		this.maPhanHoi = maPhanHoi;
	}

	public ArrayList<TraLoiThuUngVien> getListTraLoiThuUngVien() {
		return listTraLoiThuUngVien;
	}


	public void setListTraLoiThuUngVien(ArrayList<TraLoiThuUngVien> listTraLoiThuUngVien) {
		this.listTraLoiThuUngVien = listTraLoiThuUngVien;
	}
	public int getMaThu() {
		return maThu;
	}


	public void setMaThu(int maThu) {
		this.maThu = maThu;
	}


	public int getMaCV() {
		return maCV;
	}


	public void setMaCV(int maCV) {
		this.maCV = maCV;
	}


	public ArrayList<ThuUngTuyenNhanh> getListThuUngTuyenNhanh() {
		return listThuUngTuyenNhanh;
	}


	public void setListThuUngTuyenNhanh(ArrayList<ThuUngTuyenNhanh> listThuUngTuyenNhanh) {
		this.listThuUngTuyenNhanh = listThuUngTuyenNhanh;
	}


	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
