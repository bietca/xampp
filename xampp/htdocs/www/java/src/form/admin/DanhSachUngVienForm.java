package form.admin;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.ungvien.UngVien;

public class DanhSachUngVienForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String emaill;
	private String email;
	private ArrayList<UngVien> listUngVien;
	private int soLuong;
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public ArrayList<UngVien> getListUngVien() {
		return listUngVien;
	}

	public String getEmaill() {
		return emaill;
	}


	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}
	public void setListUngVien(ArrayList<UngVien> listUngVien) {
		this.listUngVien = listUngVien;
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
