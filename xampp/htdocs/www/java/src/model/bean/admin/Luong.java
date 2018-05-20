package model.bean.admin;

public class Luong {
	private String maLuong;
	private String tenLuong;

	public Luong() {
		super();
	}
	public Luong(String maLuong, String tenLuong) {
		super();
		this.maLuong = maLuong;
		this.tenLuong = tenLuong;
	}
	public String getMaLuong() {
		return maLuong;
	}
	public void setMaLuong(String maLuong) {
		this.maLuong = maLuong;
	}
	public String getTenLuong() {
		return tenLuong;
	}
	public void setTenLuong(String tenLuong) {
		this.tenLuong = tenLuong;
	}
	
}
