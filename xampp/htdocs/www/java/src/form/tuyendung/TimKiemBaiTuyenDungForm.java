package form.tuyendung;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.admin.CapBac;
import model.bean.admin.KinhNghiem;
import model.bean.admin.LoaiCongViec;
import model.bean.admin.Luong;
import model.bean.admin.Nganh;
import model.bean.admin.NoiLamViec;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.tuyendung.TimKiemLoc;

public class TimKiemBaiTuyenDungForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maBaiViet;
	private String tieuDe;
	private String maNganh;
	private String maNoiLamViec;
	private int SoLuongCanTuyen;
	private String maTD;
	private String maLoaiCongViec;
	private String gioiTinh;
	private String maKinhNghiem;
	private String maLuong;
	private String hanNopHoSo;
	private String tenNguoiNhanHoSo;
	private String email;
	private String soDienThoai;
	private String gioiThieuCty;
	private String motaCongViec;
	private String yeuCauUngVien;
	private String quyenLoiUngVien;
	private String kyNang;
	private int luotXem	;
	private int pheDuyet;
	  //Loc
	   private int locNganh;
	   private int locNoiLamViec1;
	   private int locKinhNghiem;
	   private int locCapBac;
	   private int locLoaiCongViec;
	   private int locLuong;
	      
	   
	//Loc
	
	public int getLocNganh() {
		return locNganh;
	}
	public void setLocNganh(int locNganh) {
		this.locNganh = locNganh;
	}
	public int getLocNoiLamViec() {
		return locNoiLamViec1;
	}
	public void setLocNoiLamViec(int locNoiLamViec) {
		this.locNoiLamViec1 = locNoiLamViec;
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


	private TimKiemLoc timKiemLoc;
	
	public TimKiemLoc getTimKiemLoc() {
		return timKiemLoc;
	}
	public void setTimKiemLoc(TimKiemLoc timKiemLoc) {
		this.timKiemLoc = timKiemLoc;
	}


	private int soTrang=1;
	private int tongTrang;
	
	
	ArrayList<BaiTuyenDung1>listBaiTuyenDung;
	ArrayList<Nganh> listNganh;
	ArrayList<NoiLamViec> listNoiLamViec;
	ArrayList<KinhNghiem> listKinhNghiem;	
	ArrayList<CapBac> listCapBac;
	ArrayList<LoaiCongViec> listLoaiCongViec;
	ArrayList<Luong> listLuong;
	
	
	//Dangki tim viec 
	private String email1;
	private String chuyenNganh;
	private String noiLamViec;
	private String loaiCongViec	;
	private String capBac;
	private String luong;
	private String submit;
	
	
	
	ArrayList<BaiTuyenDung1> listBaiTuyenDungPhuHop;
	ArrayList<BaiTuyenDung1> listBaiTuyenDungMoi;
	
	
	
	//Danh ki tiem viec
	
	
	
	public ArrayList<BaiTuyenDung1> getListBaiTuyenDungMoi() {
		return listBaiTuyenDungMoi;
	}
	public void setListBaiTuyenDungMoi(ArrayList<BaiTuyenDung1> listBaiTuyenDungMoi) {
		this.listBaiTuyenDungMoi = listBaiTuyenDungMoi;
	}
	public ArrayList<BaiTuyenDung1> getListBaiTuyenDungPhuHop() {
		return listBaiTuyenDungPhuHop;
	}
	public void setListBaiTuyenDungPhuHop(ArrayList<BaiTuyenDung1> listBaiTuyenDungPhuHop) {
		this.listBaiTuyenDungPhuHop = listBaiTuyenDungPhuHop;
	}
	public String getMaNoiLamViec() {
		return maNoiLamViec;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public String getNoiLamViec() {
		return noiLamViec;
	}
	public void setNoiLamViec(String noiLamViec) {
		this.noiLamViec = noiLamViec;
	}
	public String getLoaiCongViec() {
		return loaiCongViec;
	}
	public void setLoaiCongViec(String loaiCongViec) {
		this.loaiCongViec = loaiCongViec;
	}
	public String getCapBac() {
		return capBac;
	}
	public void setCapBac(String capBac) {
		this.capBac = capBac;
	}
	public String getLuong() {
		return luong;
	}
	public void setLuong(String luong) {
		this.luong = luong;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public void setMaNoiLamViec(String maNoiLamViec) {
		this.maNoiLamViec = maNoiLamViec;
	}
	public String getMaKinhNghiem() {
		return maKinhNghiem;
	}
	public void setMaKinhNghiem(String maKinhNghiem) {
		this.maKinhNghiem = maKinhNghiem;
	}
	public String getMaTD() {
		return maTD;
	}
	public void setMaTD(String maTD) {
		this.maTD = maTD;
	}
	public String getMaLuong() {
		return maLuong;
	}
	public void setMaluong(String maluong) {
		this.maLuong = maluong;
	}
	public ArrayList<LoaiCongViec> getListLoaiCongViec() {
		return listLoaiCongViec;
	}
	public void setListLoaiCongViec(ArrayList<LoaiCongViec> listLoaiCongViec) {
		this.listLoaiCongViec = listLoaiCongViec;
	}
	
	public ArrayList<CapBac> getListCapBac() {
		return listCapBac;
	}
	public void setListCapBac(ArrayList<CapBac> listCapBac) {
		this.listCapBac = listCapBac;
	}
	public void setMaLuong(String maLuong) {
		this.maLuong = maLuong;
	}
	public ArrayList<KinhNghiem> getListKinhNghiem() {
		return listKinhNghiem;
	}
	public void setListKinhNghiem(ArrayList<KinhNghiem> listKinhNghiem) {
		this.listKinhNghiem = listKinhNghiem;
	}
	
	public String getMaLoaiCongViec() {
		return maLoaiCongViec;
	}
	
	public String getMaNganh() {
		return maNganh;
	}
	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}
	public void setMaLoaiCongViec(String maLoaiCongViec) {
		this.maLoaiCongViec = maLoaiCongViec;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public int getTongTrang() {
		return tongTrang;
	}
	public void setTongTrang(int tongTrang) {
		this.tongTrang = tongTrang;
	}
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
	
	public int getSoLuongCanTuyen() {
		return SoLuongCanTuyen;
	}
	public void setSoLuongCanTuyen(int soLuongCanTuyen) {
		SoLuongCanTuyen = soLuongCanTuyen;
	}
	
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public ArrayList<Luong> getListLuong() {
		return listLuong;
	}
	public void setListLuong(ArrayList<Luong> listLuong) {
		this.listLuong = listLuong;
	}
	public String getHanNopHoSo() {
		return hanNopHoSo;
	}
	public void setHanNopHoSo(String hanNopHoSo) {
		this.hanNopHoSo = hanNopHoSo;
	}
	public String getTenNguoiNhanHoSo() {
		return tenNguoiNhanHoSo;
	}
	public void setTenNguoiNhanHoSo(String tenNguoiNhanHoSo) {
		this.tenNguoiNhanHoSo = tenNguoiNhanHoSo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getGioiThieuCty() {
		return gioiThieuCty;
	}
	public void setGioiThieuCty(String gioiThieuCty) {
		this.gioiThieuCty = gioiThieuCty;
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
	public String getQuyenLoiUngVien() {
		return quyenLoiUngVien;
	}
	public void setQuyenLoiUngVien(String quyenLoiUngVien) {
		this.quyenLoiUngVien = quyenLoiUngVien;
	}
	public String getKyNang() {
		return kyNang;
	}
	public void setKyNang(String kyNang) {
		this.kyNang = kyNang;
	}
	public int getLuotXem() {
		return luotXem;
	}
	public void setLuotXem(int luotXem) {
		this.luotXem = luotXem;
	}
	public int getPheDuyet() {
		return pheDuyet;
	}
	public void setPheDuyet(int pheDuyet) {
		this.pheDuyet = pheDuyet;
	}
	public ArrayList<BaiTuyenDung1> getListBaiTuyenDung() {
		return listBaiTuyenDung;
	}
	public void setListBaiTuyenDung(ArrayList<BaiTuyenDung1> listBaiTuyenDung) {
		this.listBaiTuyenDung = listBaiTuyenDung;
	}
	public ArrayList<Nganh> getListNganh() {
		return listNganh;
	}
	public void setListNganh(ArrayList<Nganh> listNganh) {
		this.listNganh = listNganh;
	}
	public ArrayList<NoiLamViec> getListNoiLamViec() {
		return listNoiLamViec;
	}
	public void setListNoiLamViec(ArrayList<NoiLamViec> listNoiLamViec) {
		this.listNoiLamViec = listNoiLamViec;
	}

	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
}
