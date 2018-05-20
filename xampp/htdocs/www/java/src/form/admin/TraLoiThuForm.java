package form.admin;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class TraLoiThuForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int maPhanHoi;
	private String emailNhaTuyenDung;
	private String emaiNguoiTimViec;
	private String tieuDe;
	private String noiDung;
	private String ngayPhanHoi;
	private int trangThai;
	private int trangThai2;
	
	
	public int getTrangThai2() {
		return trangThai2;
	}
	public void setTrangThai2(int trangThai2) {
		this.trangThai2 = trangThai2;
	}

	private String submit;
	
	public String getEmaiNguoiTimViec() {
		return emaiNguoiTimViec;
	}
	public void setEmaiNguoiTimViec(String email) {
		this.emaiNguoiTimViec = email;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public int getMaPhanHoi() {
		return maPhanHoi;
	}
	public void setMaPhanHoi(int maPhanHoi) {
		this.maPhanHoi = maPhanHoi;
	}
	public String getEmailNhaTuyenDung() {
		return emailNhaTuyenDung;
	}
	public void setEmailNhaTuyenDung(String emailNhaTuyenDung) {
		this.emailNhaTuyenDung = emailNhaTuyenDung;
	}
	
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public String getNgayPhanHoi() {
		return ngayPhanHoi;
	}
	public void setNgayPhanHoi(String ngayPhanHoi) {
		this.ngayPhanHoi = ngayPhanHoi;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
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
