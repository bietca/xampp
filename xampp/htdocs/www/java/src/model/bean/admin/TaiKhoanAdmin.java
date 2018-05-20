package model.bean.admin;

public class TaiKhoanAdmin {
	private String tenDangNhap;
	private String matKhau;
	
	public TaiKhoanAdmin() {
		super();
	}
	public TaiKhoanAdmin(String tenDangNhap, String matKhau) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
}
