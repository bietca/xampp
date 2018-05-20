package model.bean.admin;

public class TrinhDo {	
	private String maTD;
	private String tenTrinhDo;
	
	public TrinhDo() {
		super();
	}
	public TrinhDo(String maTD, String tenTrinhDo) {
		super();
		this.maTD = maTD;
		this.tenTrinhDo = tenTrinhDo;
	}
	public String getMaTD() {
		return maTD;
	}
	public void setMaTD(String maTD) {
		this.maTD = maTD;
	}
	public String getTenTrinhDo() {
		return tenTrinhDo;
	}
	public void setTenTrinhDo(String tenTrinhDo) {
		this.tenTrinhDo = tenTrinhDo;
	}
	
}
