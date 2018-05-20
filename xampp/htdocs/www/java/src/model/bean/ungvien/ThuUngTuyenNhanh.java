package model.bean.ungvien;

public class ThuUngTuyenNhanh {
	private int maThu;
	private String emailNhaTuyenDung;
	private String emaiNguoiTimViec	;
	private int maBaiTuyenDung	;
	private int maCV	;
	private String tieuDe;
	private String noiDung;	;
	private String ngayUngTuyen	;
	private int trangThai;
	
	
	public ThuUngTuyenNhanh() {
		super();
	}
	
	public ThuUngTuyenNhanh(int maThu, String emailNhaTuyenDung, String emaiNguoiTimViec, int maBaiTuyenDung, int maCV,
			String tieuDe, String noiDung, String ngayUngTuyen, int trangThai) {
		super();
		this.maThu = maThu;
		this.emailNhaTuyenDung = emailNhaTuyenDung;
		this.emaiNguoiTimViec = emaiNguoiTimViec;
		this.maBaiTuyenDung = maBaiTuyenDung;
		this.maCV = maCV;
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.ngayUngTuyen = ngayUngTuyen;
		this.trangThai = trangThai;
	}

	public int getMaThu() {
		return maThu;
	}

	public void setMaThu(int maThu) {
		this.maThu = maThu;
	}

	public ThuUngTuyenNhanh(String emailNhaTuyenDung, String emaiNguoiTimViec, int maBaiTuyenDung, int maCV,
			String tieuDe, String noiDung, String ngayUngTuyen, int trangThai) {
		super();
		this.emailNhaTuyenDung = emailNhaTuyenDung;
		this.emaiNguoiTimViec = emaiNguoiTimViec;
		this.maBaiTuyenDung = maBaiTuyenDung;
		this.maCV = maCV;
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.ngayUngTuyen = ngayUngTuyen;
		this.trangThai = trangThai;
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
	public int getMaBaiTuyenDung() {
		return maBaiTuyenDung;
	}
	public void setMaBaiTuyenDung(int maBaiTuyenDung) {
		this.maBaiTuyenDung = maBaiTuyenDung;
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
	
	@Override
	public String toString() {
		return "ThuUngTuyenNhanh [maThu=" + maThu + ", emailNhaTuyenDung=" + emailNhaTuyenDung + ", emaiNguoiTimViec="
				+ emaiNguoiTimViec + ", maBaiTuyenDung=" + maBaiTuyenDung + ", maCV=" + maCV + ", tieuDe=" + tieuDe
				+ ", noiDung=" + noiDung + ", ngayUngTuyen=" + ngayUngTuyen + ", trangThai=" + trangThai + "]";
	}

	public String toJSONString1(){
		return "{\"emaiNguoiTimViec\":\"" + emaiNguoiTimViec
				+ "\", \"maBaiTuyenDung\":\"" + maBaiTuyenDung
				+ "\", \"maCV\":\"" + maCV 
				+ "\", \"tieuDe\":\"" + tieuDe 
				+ "\", \"ngayUngTuyen\":\"" + ngayUngTuyen + "\"}";
	}
}
