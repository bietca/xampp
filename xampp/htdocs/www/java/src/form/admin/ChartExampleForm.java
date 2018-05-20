package form.admin;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.admin.NgayDang;
import model.bean.admin.TheLoaiNgayDang;

public class ChartExampleForm extends ActionForm{
	
	private String tuNgay;
	private String denNgay;
	private float admin;
	private float candidate;
	private float employer;
	private String thongBao;
	
	private ArrayList<TheLoaiNgayDang> listNgayDang;
	
	public float getAdmin() {
		return admin;
	}
	public void setAdmin(float admin) {
		this.admin = admin;
	}
	public float getCandidate() {
		return candidate;
	}
	public void setCandidate(float candidate) {
		this.candidate = candidate;
	}
	public float getEmployer() {
		return employer;
	}
	public void setEmployer(float employer) {
		this.employer = employer;
	}
	public String getTuNgay() {
		return tuNgay;
	}
	public void setTuNgay(String tuNgay) {
		this.tuNgay = tuNgay;
	}
	public String getDenNgay() {
		return denNgay;
	}
	public void setDenNgay(String denNgay) {
		this.denNgay = denNgay;
	}
	public ArrayList<TheLoaiNgayDang> getListNgayDang() {
		return listNgayDang;
	}
	public void setListNgayDang(ArrayList<TheLoaiNgayDang> listNgayDang) {
		this.listNgayDang = listNgayDang;
	}
	public String getThongBao() {
		return thongBao;
	}
	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}
	
	
}
