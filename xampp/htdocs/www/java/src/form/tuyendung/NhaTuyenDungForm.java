package form.tuyendung;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.tuyendung.NhaTuyenDung;

public class NhaTuyenDungForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maID;
	private String tenNhaTuyenDung;
	private String soDienThoai;
	private String email;
	private String diaChi;
	private String website	;
	private String tenCongTY;
	private String matkhau;
	NhaTuyenDung nhaTuyenDung;
	NhaTuyenDung nhaTuyenDung1;
	
	public NhaTuyenDung getNhaTuyenDung1() {
		return nhaTuyenDung1;
	}
	public void setNhaTuyenDung1(NhaTuyenDung nhaTuyenDung1) {
		this.nhaTuyenDung1 = nhaTuyenDung1;
	}
	public NhaTuyenDung getNhaTuyenDung() {
		return nhaTuyenDung;
	}
	public void setNhaTuyenDung(NhaTuyenDung nhaTuyenDung) {
		this.nhaTuyenDung = nhaTuyenDung;
	}
	public int getMaID() {
		return maID;
	}
	public void setMaID(int maID) {
		this.maID = maID;
	}
	public String getTenNhaTuyenDung() {
		return tenNhaTuyenDung;
	}
	public void setTenNhaTuyenDung(String tenNhaTuyenDung) {
		this.tenNhaTuyenDung = tenNhaTuyenDung;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getTenCongTY() {
		return tenCongTY;
	}
	public void setTenCongTY(String tenCongTY) {
		this.tenCongTY = tenCongTY;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
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
