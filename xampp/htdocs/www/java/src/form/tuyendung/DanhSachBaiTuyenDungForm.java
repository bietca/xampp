package form.tuyendung;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.admin.Nganh;

import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.ungvien.HoSo;

public class DanhSachBaiTuyenDungForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maBaiViet;
	private int maCV;
	private String emailungvien;
	
	private ArrayList<BaiTuyenDung1> listBaiTuyenDung;

	public ArrayList<BaiTuyenDung1> getListBaiTuyenDung() {
		return listBaiTuyenDung;
	}
	public void setListBaiTuyenDung(ArrayList<BaiTuyenDung1> listBaiTuyenDung) {
		this.listBaiTuyenDung = listBaiTuyenDung;
	}
	private int maBaiViet1;
	
	
	public int getMaBaiViet1() {
		return maBaiViet1;
	}
	public void setMaBaiViet1(int maBaiViet1) {
		this.maBaiViet1 = maBaiViet1;
	}
	public String getEmailungvien() {
		return emailungvien;
	}
	public void setEmailungvien(String emailungvien) {
		this.emailungvien = emailungvien;
	}
	public int getMaCV() {
		return maCV;
	}
	public void setMaCV(int maCV) {
		this.maCV = maCV;
	}
	private  ArrayList<BaiTuyenDung1> baiTuyenDungs;
	private BaiTuyenDung1 baiTuyenDung;
	
	private HoSo hoSo;
	
	public HoSo getHoSo() {
		return hoSo;
	}
	public void setHoSo(HoSo hoSo) {
		this.hoSo = hoSo;
	}
	private ArrayList<Nganh> listNganh;
	
	public ArrayList<Nganh> getListNganh() {
		return listNganh;
	}
	public void setListNganh(ArrayList<Nganh> listNganh) {
		this.listNganh = listNganh;
	}
	public BaiTuyenDung1 getBaiTuyenDung() {
		return baiTuyenDung;
	}
	public void setBaiTuyenDung(BaiTuyenDung1 baiTuyenDung) {
		this.baiTuyenDung = baiTuyenDung;
	}
	public int getMaBaiViet() {
		return maBaiViet;
	}
	public void setMaBaiViet(int maBaiDang) {
		this.maBaiViet = maBaiDang;
	}
	public ArrayList<BaiTuyenDung1> getBaiTuyenDungs() {
		return baiTuyenDungs;
	}
	public void setBaiTuyenDungs(ArrayList<BaiTuyenDung1> baiTuyenDungs) {
		this.baiTuyenDungs = baiTuyenDungs;
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
