package model.bean.admin;

public class PheDuyet {
	private int pheDuyet;
	private String tenPheDuyet;
	public int getPheDuyet() {
		return pheDuyet;
	}
	public void setPheDuyet(int pheDuyet) {
		this.pheDuyet = pheDuyet;
	}
	public String getTenPheDuyet() {
		return tenPheDuyet;
	}
	public void setTenPheDuyet(String tenPheDuyet) {
		this.tenPheDuyet = tenPheDuyet;
	}
	public PheDuyet(int pheDuyet, String tenPheDuyet) {
		super();
		this.pheDuyet = pheDuyet;
		this.tenPheDuyet = tenPheDuyet;
	}
	public PheDuyet() {
		super();
	}
	

}
