package form.ungvien;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.tuyendung.TraLoiThuUngVien;
import model.bean.ungvien.ThuUngTuyenNhanh;

public class HopThuUngVienForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maThu;
	private int maCV;
	private int trangthai;
	ArrayList<BaiTuyenDung1> xemChiTiet;

	private int maBaiTuyenDung;

	BaiTuyenDung1 baiTuyenDung1;
	ArrayList<ThuUngTuyenNhanh> listThuUngTuyenNhanh;

	ArrayList<TraLoiThuUngVien> listThuUngVienNhan;
	
	ArrayList<TraLoiThuUngVien> listThuUngVienDagui;
	
	
	public ArrayList<TraLoiThuUngVien> getListThuUngVienDagui() {
		return listThuUngVienDagui;
	}

	public void setListThuUngVienDagui(ArrayList<TraLoiThuUngVien> listThuUngVienDagui) {
		this.listThuUngVienDagui = listThuUngVienDagui;
	}

	TraLoiThuUngVien traLoiThuUngVien;
	TraLoiThuUngVien thuDaGui;
	

	public TraLoiThuUngVien getThuDaGui() {
		return thuDaGui;
	}

	public void setThuDaGui(TraLoiThuUngVien thuDaGui) {
		this.thuDaGui = thuDaGui;
	}

	private int maPhanHoi;

	public HopThuUngVienForm() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public HopThuUngVienForm(int maThu, int maCV, String trangthai, ArrayList<BaiTuyenDung1> xemChiTiet,
//			int maBaiTuyenDung, BaiTuyenDung1 baiTuyenDung1, ArrayList<ThuUngTuyenNhanh> listThuUngTuyenNhanh,
//			ArrayList<TraLoiThuUngVien> listThuUngVienNhan, TraLoiThuUngVien traLoiThuUngVien, int maPhanHoi) {
//		super();
//		this.maThu = maThu;
//		this.maCV = maCV;
//		this.trangthai = trangthai;
//		this.xemChiTiet = xemChiTiet;
//		this.maBaiTuyenDung = maBaiTuyenDung;
//		this.baiTuyenDung1 = baiTuyenDung1;
//		this.listThuUngTuyenNhanh = listThuUngTuyenNhanh;
//		this.listThuUngVienNhan = listThuUngVienNhan;
//		this.traLoiThuUngVien = traLoiThuUngVien;
//		this.maPhanHoi = maPhanHoi;
//	}

	public int getMaPhanHoi() {
		return maPhanHoi;
	}

	public void setMaPhanHoi(int maPhanHoi) {
		this.maPhanHoi = maPhanHoi;
	}

	public TraLoiThuUngVien getTraLoiThuUngVien() {
		return traLoiThuUngVien;
	}

	public void setTraLoiThuUngVien(TraLoiThuUngVien traLoiThuUngVien) {
		this.traLoiThuUngVien = traLoiThuUngVien;
	}

	public ArrayList<TraLoiThuUngVien> getListThuUngVienNhan() {
		return listThuUngVienNhan;
	}

	public void setListThuUngVienNhan(ArrayList<TraLoiThuUngVien> listThuUngVienNhan) {
		this.listThuUngVienNhan = listThuUngVienNhan;
	}

	public BaiTuyenDung1 getBaiTuyenDung1() {
		return baiTuyenDung1;
	}

	public void setBaiTuyenDung1(BaiTuyenDung1 baiTuyenDung1) {
		this.baiTuyenDung1 = baiTuyenDung1;
	}

	public int getMaBaiTuyenDung() {
		return maBaiTuyenDung;
	}

	public void setMaBaiTuyenDung(int maBaiTuyenDung) {
		this.maBaiTuyenDung = maBaiTuyenDung;
	}

	public ArrayList<BaiTuyenDung1> getXemChiTiet() {
		return xemChiTiet;
	}

	public void setXemChiTiet(ArrayList<BaiTuyenDung1> xemChiTiet) {
		this.xemChiTiet = xemChiTiet;
	}

	public int getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
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
