package model.bean.tuyendung;

public class NhaTuyenDung {
	private String tenNhaTuyenDung;
	private String soDienThoai;
	private String email;
	private String diaChi;
	private String website	;
	private String tenCongTY;
	private String matkhau;
	
	
	public NhaTuyenDung() {
		super();
	}
	public NhaTuyenDung(String tenNhaTuyenDung, String soDienThoai, String email, String diaChi, String website,
			String tenCongTY, String matkhau) {
		super();
		this.tenNhaTuyenDung = tenNhaTuyenDung;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.diaChi = diaChi;
		this.website = website;
		this.tenCongTY = tenCongTY;
		this.matkhau = matkhau;
	}
	
	public NhaTuyenDung(String tenNhaTuyenDung, String soDienThoai, String email, String diaChi, String website,
			String tenCongTY) {
		super();
		this.tenNhaTuyenDung = tenNhaTuyenDung;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.diaChi = diaChi;
		this.website = website;
		this.tenCongTY = tenCongTY;
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
	public String toString() {
		return "NhaTuyenDung 1 [tenNhaTuyenDung=" + tenNhaTuyenDung + ", soDienThoai=" + soDienThoai + ", email=" + email
				+ ", diaChi=" + diaChi + ", website=" + website + ", tenCongTY=" + tenCongTY + ", matkhau=" + matkhau
				+ ", getTenNhaTuyenDung()=" + getTenNhaTuyenDung() + ", getSoDienThoai()=" + getSoDienThoai()
				+ ", getEmail()=" + getEmail() + ", getDiaChi()=" + getDiaChi() + ", getWebsite()=" + getWebsite()
				+ ", getTenCongTY()=" + getTenCongTY() + ", getMatkhau()=" + getMatkhau() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
