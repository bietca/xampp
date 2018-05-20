package model.bean.admin;

public class KiNang {
	private String maKiNang;
	private String tenKiNang;
	
	
	public KiNang() {
		super();
	}
	public KiNang(String maKiNang, String tenKiNang) {
		super();
		this.maKiNang = maKiNang;
		this.tenKiNang = tenKiNang;
	}
	public String getMaKiNang() {
		return maKiNang;
	}
	public void setMaKiNang(String maKiNang) {
		this.maKiNang = maKiNang;
	}
	public String getTenKiNang() {
		return tenKiNang;
	}
	public void setTenKiNang(String tenKiNang) {
		this.tenKiNang = tenKiNang;
	}
	
}
