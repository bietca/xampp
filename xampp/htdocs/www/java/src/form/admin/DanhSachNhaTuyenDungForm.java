package form.admin;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.tuyendung.NhaTuyenDung;

public class DanhSachNhaTuyenDungForm extends ActionForm{
	private String tenNhaTuyenDung;
	private String email;
	private ArrayList<NhaTuyenDung> listNhaTuyenDung;
	private int soLuong;
	
	public String getTenNhaTuyenDung() {
		return tenNhaTuyenDung;
	}
	public void setTenNhaTuyenDung(String tenNhaTuyenDung) {
		this.tenNhaTuyenDung = tenNhaTuyenDung;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<NhaTuyenDung> getListNhaTuyenDung() {
		return listNhaTuyenDung;
	}
	public void setListNhaTuyenDung(ArrayList<NhaTuyenDung> listNhaTuyenDung) {
		this.listNhaTuyenDung = listNhaTuyenDung;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	
}
