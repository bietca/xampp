package model.bean.ungvien;

public class HoSo {
	private int MaCV;
	private String anh;
	private String hoTen;
	private String soDienThoai;
	private String email;
	private String ngaySinh;
	private String diaChi;
	private String hocVan;
	private String chuyenNganh;
	private String mucTieuCongViec;
	private String kinhNghiepLamViec;
	private String hoatDong	;
	private String chucChi;
	private String kiNang;
	private String soThich;
	private int khoa;
	
	public HoSo() {
		super();
	}
	
	public HoSo(String anh) {
		super();
		this.anh = anh;
	}

	
	public String getSoThich() {
		return soThich;
	}

	public void setSoThich(String soThich) {
		this.soThich = soThich;
	}
	
	public HoSo(int maCV, String anh, String hoTen, String soDienThoai, String email, String ngaySinh, String diaChi,
			String hocVan, String chuyenNganh, String mucTieuCongViec, String kinhNghiepLamViec, String hoatDong,
			String chucChi, String kiNang, String soThich, int khoa) {
		super();
		MaCV = maCV;
		this.anh = anh;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.hocVan = hocVan;
		this.chuyenNganh = chuyenNganh;
		this.mucTieuCongViec = mucTieuCongViec;
		this.kinhNghiepLamViec = kinhNghiepLamViec;
		this.hoatDong = hoatDong;
		this.chucChi = chucChi;
		this.kiNang = kiNang;
		this.soThich = soThich;
		this.khoa = khoa;
	}

	public HoSo(String anh, String hoTen, String soDienThoai, String email, String ngaySinh, String diaChi,
			String hocVan, String chuyenNganh, String mucTieuCongViec, String kinhNghiepLamViec, String hoatDong,
			String chucChi, String kyNang, String soThich, int khoa) {
		super();
		this.anh = anh;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.hocVan = hocVan;
		this.chuyenNganh = chuyenNganh;
		this.mucTieuCongViec = mucTieuCongViec;
		this.kinhNghiepLamViec = kinhNghiepLamViec;
		this.hoatDong = hoatDong;
		this.chucChi = chucChi;
		this.kiNang = kyNang;
		this.soThich = soThich;
		this.khoa = khoa;
	}
   
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getMaCV() {
		return MaCV;
	}
	public void setMaCV(int maCV) {
		MaCV = maCV;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
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
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getHocVan() {
		return hocVan;
	}
	public void setHocVan(String hocVan) {
		this.hocVan = hocVan;
	}
	public String getMucTieuCongViec() {
		return mucTieuCongViec;
	}
	public void setMucTieuCongViec(String mucTieuCongViec) {
		this.mucTieuCongViec = mucTieuCongViec;
	}
	public String getKinhNghiepLamViec() {
		return kinhNghiepLamViec;
	}
	public void setKinhNghiepLamViec(String kinhNghiepLamViec) {
		this.kinhNghiepLamViec = kinhNghiepLamViec;
	}
	public String getHoatDong() {
		return hoatDong;
	}
	public void setHoatDong(String hoatDong) {
		this.hoatDong = hoatDong;
	}
	public String getChucChi() {
		return chucChi;
	}
	public void setChucChi(String chucChi) {
		this.chucChi = chucChi;
	}
	public String getKiNang() {
		return kiNang;
	}
	public void setKiNang(String kyNang) {
		this.kiNang = kyNang;
	}
	public int getKhoa() {
		return khoa;
	}
	public void setKhoa(int khoa) {
		this.khoa = khoa;
	}

	@Override
	public String toString() {
		return "HoSo [MaCV=" + MaCV + ", anh=" + anh + ", hoTen=" + hoTen + ", soDienThoai=" + soDienThoai + ", email="
				+ email + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", hocVan=" + hocVan + ", chuyenNganh="
				+ chuyenNganh + ", mucTieuCongViec=" + mucTieuCongViec + ", kinhNghiepLamViec=" + kinhNghiepLamViec
				+ ", hoatDong=" + hoatDong + ", chucChi=" + chucChi + ", kiNang=" + kiNang + ", soThich=" + soThich
				+ ", khoa=" + khoa + "]";
	}
	
	
}
