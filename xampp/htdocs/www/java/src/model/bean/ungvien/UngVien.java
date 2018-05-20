package model.bean.ungvien;

public class UngVien {
	private int maID;;
	private String tenNguoiDung;
	private String ngaySinh;
	private String  gioiTinh;
	private String soDienThoai;
	private String queQuan;
	private String email;
	private String matKhau;
	
	
	public UngVien() {
		super();
	}
	public UngVien( String tenNguoiDung, String ngaySinh, String gioiTinh, String soDienThoai, String queQuan,
			String email) {
		super();
		this.tenNguoiDung = tenNguoiDung;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.queQuan = queQuan;
		this.email = email;
	}
	public UngVien(int maID, String tenNguoiDung, String ngaySinh, String gioiTinh, String soDienThoai, String queQuan,
			String email, String matKhau) {
		super();
		this.maID = maID;
		this.tenNguoiDung = tenNguoiDung;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.queQuan = queQuan;
		this.email = email;
		this.matKhau = matKhau;
	}
	public UngVien(String tenNguoiDung, String ngaySinh, String gioiTinh, String soDienThoai, String queQuan,
			String email, String matKhau) {
		super();
		this.tenNguoiDung = tenNguoiDung;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.queQuan = queQuan;
		this.email = email;
		this.matKhau = matKhau;
	}
	public int getMaID() {
		return maID;
	}
	public void setMaID(int maID) {
		this.maID = maID;
	}
	public String getTenNguoiDung() {
		return tenNguoiDung;
	}
	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	
	@Override
	public String toString() {
		return "UngVien [maID=" + maID + ", tenNguoiDung=" + tenNguoiDung + ", ngaySinh=" + ngaySinh + ", gioiTinh="
				+ gioiTinh + ", soDienThoai=" + soDienThoai + ", queQuan=" + queQuan + ", email=" + email + ", matKhau="
				+ matKhau + "]";
	}
	
	
}
