package model.bean.admin;

public class BaiViet {
private int maBaiViet;
private String tieuDe;
private String gioiThieuCty;
private String soDienThoai;
private String motaCongViec;
private String yeuCauUngVien;
private int pheDuyet;

public int getMaBaiViet() {
	return maBaiViet;
}
public void setMaBaiViet(int maBaiViet) {
	this.maBaiViet = maBaiViet;
}
public String getTieuDe() {
	return tieuDe;
}
public void setTieuDe(String tieuDe) {
	this.tieuDe = tieuDe;
}
public String getGioiThieuCty() {
	return gioiThieuCty;
}
public void setGioiThieuCty(String gioiThieuCty) {
	this.gioiThieuCty = gioiThieuCty;
}
public String getSoDienThoai() {
	return soDienThoai;
}
public void setSoDienThoai(String soDienThoai) {
	this.soDienThoai = soDienThoai;
}
public String getMotaCongViec() {
	return motaCongViec;
}
public void setMotaCongViec(String motaCongViec) {
	this.motaCongViec = motaCongViec;
}
public String getYeuCauUngVien() {
	return yeuCauUngVien;
}
public void setYeuCauUngVien(String yeuCauUngVien) {
	this.yeuCauUngVien = yeuCauUngVien;
}
public int getPheDuyet() {
	return pheDuyet;
}
public void setPheDuyet(int pheDuyet) {
	this.pheDuyet = pheDuyet;
}
public BaiViet(int maBaiViet, String tieuDe, String gioiThieuCty, String soDienThoai, String motaCongViec,
		String yeuCauUngVien, int pheDuyet) {
	super();
	this.maBaiViet = maBaiViet;
	this.tieuDe = tieuDe;
	this.gioiThieuCty = gioiThieuCty;
	this.soDienThoai = soDienThoai;
	this.motaCongViec = motaCongViec;
	this.yeuCauUngVien = yeuCauUngVien;
	this.pheDuyet = pheDuyet;
}
public BaiViet() {
	super();
}





}