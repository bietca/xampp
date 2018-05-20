package model.bean.admin;

public class CapBac {
	private String maCapBac;
	private String tenCapBac;
	
	
	public CapBac() {
		super();
	}
	public CapBac(String maCapBac, String tenCapBac) {
		super();
		this.maCapBac = maCapBac;
		this.tenCapBac = tenCapBac;
	}
	public String getMaCapBac() {
		return maCapBac;
	}
	public void setMaCapBac(String maCapBac) {
		this.maCapBac = maCapBac;
	}
	public String getTenCapBac() {
		return tenCapBac;
	}
	public void setTenCapBac(String tenCapBac) {
		this.tenCapBac = tenCapBac;
	}
	
	
}
