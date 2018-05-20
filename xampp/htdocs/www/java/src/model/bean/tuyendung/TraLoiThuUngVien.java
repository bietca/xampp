package model.bean.tuyendung;

public class TraLoiThuUngVien {
	private int maPhanHoi;
	private String emailNhaTuyenDung;
	private String emailNguoiTimViec;
	private String tieuDe;
	private String noiDung;
	private String ngayPhanHoi;
	private int trangThai;
	private int trangThai2;
	public int getMaPhanHoi() {
		return maPhanHoi;
	}
	public void setMaPhanHoi(int maPhanHoi) {
		this.maPhanHoi = maPhanHoi;
	}
	public TraLoiThuUngVien(int maPhanHoi, String emailNhaTuyenDung, String emailNguoiTimViec, String tieuDe,
			String noiDung, String ngayPhanHoi, int trangThai,int trangThai2) {
		super();
		this.maPhanHoi = maPhanHoi;
		this.emailNhaTuyenDung = emailNhaTuyenDung;
		this.emailNguoiTimViec = emailNguoiTimViec;
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.ngayPhanHoi = ngayPhanHoi;
		this.trangThai = trangThai;
		this.trangThai2=trangThai2;
	}
	public TraLoiThuUngVien(String emailNhaTuyenDung, String emailNguoiTimViec, String tieuDe, String noiDung,
			String ngayPhanHoi, int trangThai,int trangThai2) {
		super();
		this.emailNhaTuyenDung = emailNhaTuyenDung;
		this.emailNguoiTimViec = emailNguoiTimViec;
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.ngayPhanHoi = ngayPhanHoi;
		this.trangThai = trangThai;
		this.trangThai2=trangThai2;
	}
	
	public int getTrangThai2() {
		return trangThai2;
	}
	public void setTrangThai2(int trangThai2) {
		this.trangThai2 = trangThai2;
	}
	public String getEmailNhaTuyenDung() {
		return emailNhaTuyenDung;
	}
	public void setEmailNhaTuyenDung(String emailNhaTuyenDung) {
		this.emailNhaTuyenDung = emailNhaTuyenDung;
	}
	public String getEmailNguoiTimViec() {
		return emailNguoiTimViec;
	}
	public void setEmailNguoiTimViec(String emailNguoiTimViec) {
		this.emailNguoiTimViec = emailNguoiTimViec;
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
	public String toString() {
		return "TraLoiThuUngVien [maPhanHoi=" + maPhanHoi + ", emailNhaTuyenDung=" + emailNhaTuyenDung
				+ ", emailNguoiTimViec=" + emailNguoiTimViec + ", tieuDe=" + tieuDe + ", noiDung=" + noiDung
				+ ", ngayPhanHoi=" + ngayPhanHoi + ", trangThai=" + trangThai + "]";
	}
	public String toJSONString(){
		return "{\"maPhanHoi\":\"" + maPhanHoi
				+ "\", \"emailNhaTuyenDung\":\"" + emailNhaTuyenDung
				+ "\", \"emailNguoiTimViec\":\"" + emailNguoiTimViec 
				+ "\", \"tieuDe\":\"" + tieuDe 
				+ "\", \"ngayPhanHoi\":\"" + ngayPhanHoi + "\"}";
	}
	  
	
}
