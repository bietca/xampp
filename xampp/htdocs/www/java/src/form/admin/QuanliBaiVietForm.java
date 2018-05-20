package form.admin;


import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.admin.BaiViet;




public class QuanliBaiVietForm extends ActionForm {

	/**
	 * 
	 */
	private int maBaiViet;
	private String tieuDe;
	private String congTy;
	private String soDienThoai;
	private String motaCongViec;
	private String yeuCauUngVien;
	private int pheDuyet;
	private String tenPheDuyet;
	private String action;
	private String submit;
	private BaiViet baiViet;
	

	public QuanliBaiVietForm() {
		super();
	}


	public QuanliBaiVietForm(int maBaiViet, String tieuDe, String congTy, String soDienThoai, String motaCongViec,
			String yeuCauUngVien, int pheDuyet, String action, String submit, BaiViet baiViet,String tenPheDuyet) {
		super();
		this.maBaiViet = maBaiViet;
		this.tieuDe = tieuDe;
		this.congTy = congTy;
		this.soDienThoai = soDienThoai;
		this.motaCongViec = motaCongViec;
		this.yeuCauUngVien = yeuCauUngVien;
		this.pheDuyet = pheDuyet;
		this.action = action;
		this.submit = submit;
		this.baiViet = baiViet;
		this.tenPheDuyet=tenPheDuyet;
	}


	public String getTenPheDuyet() {
		return tenPheDuyet;
	}


	public void setTenPheDuyet(String tenPheDuyet) {
		this.tenPheDuyet = tenPheDuyet;
	}


	public int getMaBaiViet() {
		return maBaiViet;
	}


	public void setMaBaiViet(int maBaiViet) {
		this.maBaiViet = maBaiViet;
	}


	public String getTieuDe() {
		return tieuDe;
	}


	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}


	public String getCongTy() {
		return congTy;
	}


	public void setCongTy(String congTy) {
		this.congTy = congTy;
	}


	public String getSoDienThoai() {
		return soDienThoai;
	}


	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}


	public String getMotaCongViec() {
		return motaCongViec;
	}


	public void setMotaCongViec(String motaCongViec) {
		this.motaCongViec = motaCongViec;
	}


	public String getYeuCauUngVien() {
		return yeuCauUngVien;
	}


	public void setYeuCauUngVien(String yeuCauUngVien) {
		this.yeuCauUngVien = yeuCauUngVien;
	}


	public int getPheDuyet() {
		return pheDuyet;
	}


	public void setPheDuyet(int pheDuyet) {
		this.pheDuyet = pheDuyet;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public String getSubmit() {
		return submit;
	}


	public void setSubmit(String submit) {
		this.submit = submit;
	}


	public BaiViet getBaiViet() {
		return baiViet;
	}


	public void setBaiViet(BaiViet baiViet) {
		this.baiViet = baiViet;
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
