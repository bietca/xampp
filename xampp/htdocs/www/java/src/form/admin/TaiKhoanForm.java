package form.admin;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.tuyendung.NhaTuyenDung;
import model.bean.ungvien.UngVien;

public class TaiKhoanForm extends ActionForm{
	
	private String ten;
	private ArrayList<UngVien> listUV;
	private ArrayList<NhaTuyenDung> listNTD;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public ArrayList<UngVien> getListUV() {
		return listUV;
	}
	public void setListUV(ArrayList<UngVien> listUV) {
		this.listUV = listUV;
	}
	public ArrayList<NhaTuyenDung> getListNTD() {
		return listNTD;
	}
	public void setListNTD(ArrayList<NhaTuyenDung> listNTD) {
		this.listNTD = listNTD;
	}
	
	
}
