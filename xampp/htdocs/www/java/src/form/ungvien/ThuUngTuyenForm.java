package form.ungvien;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.ungvien.HoSo;
import model.bean.ungvien.ThuUngTuyenNhanh;

public class ThuUngTuyenForm extends  ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maThu;
	private String emailNhaTuyenDung;
	private String emaiNguoiTimViec	;
	private int maBaiViet;
	private int maCV	;
	private String tieuDe;
	private String noiDung;	;
	private String ngayUngTuyen	;
	private int trangThai;
	private ArrayList<HoSo> listHoSo;
	private String submit;
	
	
	//xem chi tiet thu ung tuyen
	private ArrayList<ThuUngTuyenNhanh> listThuUngTuyenNhanh;
	// De lay thu ung tuyen can xe,
	private  ThuUngTuyenNhanh thuUngTuyenNhanh;
	
	
	public ArrayList<ThuUngTuyenNhanh> getListThuUngTuyenNhanh() {
		return listThuUngTuyenNhanh;
	}
	public void setListThuUngTuyenNhanh(ArrayList<ThuUngTuyenNhanh> listThuUngTuyenNhanh) {
		this.listThuUngTuyenNhanh = listThuUngTuyenNhanh;
	}
	public ThuUngTuyenNhanh getThuUngTuyenNhanh() {
		return thuUngTuyenNhanh;
	}
	public void setThuUngTuyenNhanh(ThuUngTuyenNhanh thuUngTuyenNhanh) {
		this.thuUngTuyenNhanh = thuUngTuyenNhanh;
	}
	public int getMaThu() {
		return maThu;
	}
	public void setMaThu(int maThu) {
		this.maThu = maThu;
	}
	public String getEmailNhaTuyenDung() {
		return emailNhaTuyenDung;
	}
	public void setEmailNhaTuyenDung(String emailNhaTuyenDung) {
		this.emailNhaTuyenDung = emailNhaTuyenDung;
	}
	public String getEmaiNguoiTimViec() {
		return emaiNguoiTimViec;
	}
	public void setEmaiNguoiTimViec(String emaiNguoiTimViec) {
		this.emaiNguoiTimViec = emaiNguoiTimViec;
	}
	
	public int getMaBaiViet() {
		return maBaiViet;
	}
	public void setMaBaiViet(int maBaiViet) {
		this.maBaiViet = maBaiViet;
	}
	public int getMaCV() {
		return maCV;
	}
	public void setMaCV(int maCV) {
		this.maCV = maCV;
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
	public String getNgayUngTuyen() {
		return ngayUngTuyen;
	}
	public void setNgayUngTuyen(String ngayUngTuyen) {
		this.ngayUngTuyen = ngayUngTuyen;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	public ArrayList<HoSo> getListHoSo() {
		return listHoSo;
	}
	public void setListHoSo(ArrayList<HoSo> listHoSo) {
		this.listHoSo = listHoSo;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
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
