package model.bean.tuyendung;

public class ThemMoTa {
	private int maBaiBiet;
	private String moTa;
	//private int KhoaNgoai;
	
	public ThemMoTa() {
		super();
	}
	public ThemMoTa(int maBaiBiet, String moTa) {
		super();
		this.maBaiBiet = maBaiBiet;
		this.moTa = moTa;
	}
	public int getMaBaiBiet() {
		return maBaiBiet;
	}
	public void setMaBaiBiet(int maBaiBiet) {
		this.maBaiBiet = maBaiBiet;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
}
