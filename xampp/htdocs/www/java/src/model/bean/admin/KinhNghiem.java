package model.bean.admin;

public class KinhNghiem {
	private String maKinhNghiem;
	private String tenKinhNghiem;
	
	
	public KinhNghiem() {
		super();
	}
	public KinhNghiem(String maKinhNghiem, String tenKinhNghiem) {
		super();
		this.maKinhNghiem = maKinhNghiem;
		this.tenKinhNghiem = tenKinhNghiem;
	}
	public String getMaKinhNghiem() {
		return maKinhNghiem;
	}
	public void setMaKinhNghiem(String maKinhNghiem) {
		this.maKinhNghiem = maKinhNghiem;
	}
	public String getTenKinhNghiem() {
		return tenKinhNghiem;
	}
	public void setTenKinhNghiem(String tenKinhNghiem) {
		this.tenKinhNghiem = tenKinhNghiem;
	}
	
}
