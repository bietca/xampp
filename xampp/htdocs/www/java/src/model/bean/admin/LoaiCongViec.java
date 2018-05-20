package model.bean.admin;

public class LoaiCongViec {
	private String maLoaiCongViec;
	private String tenLoaiCongViec;
	
	public LoaiCongViec() {
		super();
	}
	public LoaiCongViec(String maLoaiCongViec, String tenLoaiCongViec) {
		super();
		this.maLoaiCongViec = maLoaiCongViec;
		this.tenLoaiCongViec = tenLoaiCongViec;
	}
	public String getMaLoaiCongViec() {
		return maLoaiCongViec;
	}
	public void setMaLoaiCongViec(String maLoaiCongViec) {
		this.maLoaiCongViec = maLoaiCongViec;
	}
	public String getTenLoaiCongViec() {
		return tenLoaiCongViec;
	}
	public void setTenLoaiCongViec(String tenLoaiCongViec) {
		this.tenLoaiCongViec = tenLoaiCongViec;
	}
	
}
