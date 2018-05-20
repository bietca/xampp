package model.bean.admin;

public class NoiLamViec {	
	private String maNoiLamViec;
	private String tenNoiLamViec;
	
	
	public NoiLamViec() {
		super();
	}
	public NoiLamViec(String maNoiLamViec, String tenNoiLamViec) {
		super();
		this.maNoiLamViec = maNoiLamViec;
		this.tenNoiLamViec = tenNoiLamViec;
	}
	public String getMaNoiLamViec() {
		return maNoiLamViec;
	}
	public void setMaNoiLamViec(String maNoiLamViec) {
		this.maNoiLamViec = maNoiLamViec;
	}
	public String getTenNoiLamViec() {
		return tenNoiLamViec;
	}
	public void setTenNoiLamViec(String tenNoiLamViec) {
		this.tenNoiLamViec = tenNoiLamViec;
	}
	
}
