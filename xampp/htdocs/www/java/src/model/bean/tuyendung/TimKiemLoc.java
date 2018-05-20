package model.bean.tuyendung;

public class TimKiemLoc {
   private int locNganh;
   private int locNoiLamViec;
   private int locKinhNghiem;
   private int locCapBac;
   private int locLoaiCongViec;
   private int locLuong;
   
public TimKiemLoc() {
	super();
}
public TimKiemLoc(int locNganh, int locNoiLamViec, int locKinhNghiem, int locCapBac, int locLoaiCongViec,
		int locLuong) {
	super();
	this.locNganh = locNganh;
	this.locNoiLamViec = locNoiLamViec;
	this.locKinhNghiem = locKinhNghiem;
	this.locCapBac = locCapBac;
	this.locLoaiCongViec = locLoaiCongViec;
	this.locLuong = locLuong;
}
public int getLocNganh() {
	return locNganh;
}
public void setLocNganh(int locNganh) {
	this.locNganh = locNganh;
}
public int getLocNoiLamViec() {
	return locNoiLamViec;
}
public void setLocNoiLamViec(int locNoiLamViec) {
	this.locNoiLamViec = locNoiLamViec;
}
public int getLocKinhNghiem() {
	return locKinhNghiem;
}
public void setLocKinhNghiem(int locKinhNghiem) {
	this.locKinhNghiem = locKinhNghiem;
}
public int getLocCapBac() {
	return locCapBac;
}
public void setLocCapBac(int locCapBac) {
	this.locCapBac = locCapBac;
}
public int getLocLoaiCongViec() {
	return locLoaiCongViec;
}
public void setLocLoaiCongViec(int locLoaiCongViec) {
	this.locLoaiCongViec = locLoaiCongViec;
}
public int getLocLuong() {
	return locLuong;
}
public void setLocLuong(int locLuong) {
	this.locLuong = locLuong;
}
@Override
public String toString() {
	return "TimKiemLoc [locNganh=" + locNganh + ", locNoiLamViec=" + locNoiLamViec + ", locKinhNghiem=" + locKinhNghiem
			+ ", locCapBac=" + locCapBac + ", locLoaiCongViec=" + locLoaiCongViec + ", locLuong=" + locLuong + "]";
}
   
   
}
