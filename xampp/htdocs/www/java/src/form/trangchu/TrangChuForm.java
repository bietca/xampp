package form.trangchu;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.admin.CapBac;
import model.bean.admin.LoaiCongViec;
import model.bean.admin.Luong;
import model.bean.admin.Nganh;
import model.bean.admin.NoiLamViec;
import model.bean.tuyendung.BaiTuyenDung1;

public class TrangChuForm extends ActionForm{
	private static final long serialVersionUID = 1L;
	private int maBaiViet;
	private  ArrayList<BaiTuyenDung1> baiTuyenDungs;
	private BaiTuyenDung1 baiTuyenDung;
	private int soTrang=1;
	private int tongTrang;
	//Ma nganh proproty de tim kiem
	private String maNganh;
	private String maNoiLamViec;
	private int soluongbaituyendung;
	
	private ArrayList<BaiTuyenDung1> top10BaiThucTap;
	private ArrayList<BaiTuyenDung1> top10BaiToanThoiGian;
	private ArrayList<BaiTuyenDung1> top10BaiBanThoiGian;
	private ArrayList<BaiTuyenDung1> top10BaiTuyenDungMoi;
	/**
	 * Dang ki viec lam 
	 */
	private String email;
	private String chuyenNganh;
	private String noiLamViec;
	private String loaiCongViec	;
	private String capBac;
	private String luong;
	private String submit;
	
	private ArrayList<Nganh> listNganh;
	private ArrayList<NoiLamViec> listNoiLamViec;
	private ArrayList<CapBac> listCapBac;
	private ArrayList<LoaiCongViec> listLoaiHinhCongViec;
	private ArrayList<Luong> listLuong;
	
	
	
	
	public int getSoluongbaituyendung() {
		return soluongbaituyendung;
	}
	public void setSoluongbaituyendung(int soluongbaituyendung) {
		this.soluongbaituyendung = soluongbaituyendung;
	}
	public ArrayList<BaiTuyenDung1> getTop10BaiTuyenDungMoi() {
		return top10BaiTuyenDungMoi;
	}
	public void setTop10BaiTuyenDungMoi(ArrayList<BaiTuyenDung1> top10BaiTuyenDungMoi) {
		this.top10BaiTuyenDungMoi = top10BaiTuyenDungMoi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	
	public ArrayList<CapBac> getListCapBac() {
		return listCapBac;
	}
	public void setListCapBac(ArrayList<CapBac> listCapBac) {
		this.listCapBac = listCapBac;
	}
	public ArrayList<LoaiCongViec> getListLoaiHinhCongViec() {
		return listLoaiHinhCongViec;
	}
	public void setListLoaiHinhCongViec(ArrayList<LoaiCongViec> listLoaiHinhCongViec) {
		this.listLoaiHinhCongViec = listLoaiHinhCongViec;
	}
	public ArrayList<Luong> getListLuong() {
		return listLuong;
	}
	public void setListLuong(ArrayList<Luong> listLuong) {
		this.listLuong = listLuong;
	}
	/**
	 * 
	 *  /het
	 */
	
	
	public ArrayList<BaiTuyenDung1> getTop10BaiBanThoiGian() {
		return top10BaiBanThoiGian;
	}
	public void setTop10BaiBanThoiGian(ArrayList<BaiTuyenDung1> top10BaiBanThoiGian) {
		this.top10BaiBanThoiGian = top10BaiBanThoiGian;
	}
	public ArrayList<BaiTuyenDung1> getTop10BaiThucTap() {
		return top10BaiThucTap;
	}
	public void setTop10BaiThucTap(ArrayList<BaiTuyenDung1> top10BaiThucTap) {
		this.top10BaiThucTap = top10BaiThucTap;
	}
	public ArrayList<BaiTuyenDung1> getTop10BaiToanThoiGian() {
		return top10BaiToanThoiGian;
	}
	public void setTop10BaiToanThoiGian(ArrayList<BaiTuyenDung1> top10BaiToanThoiGian) {
		this.top10BaiToanThoiGian = top10BaiToanThoiGian;
	}
	public String getMaNoiLamViec() {
		return maNoiLamViec;
	}
	public void setMaNoiLamViec(String maNoiLamViec) {
		this.maNoiLamViec = maNoiLamViec;
	}
	public ArrayList<NoiLamViec> getListNoiLamViec() {
		return listNoiLamViec;
	}
	public void setListNoiLamViec(ArrayList<NoiLamViec> listNoiLamViec) {
		this.listNoiLamViec = listNoiLamViec;
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
	public String getMaNganh() {
		return maNganh;
	}
	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}
	
	
	public ArrayList<Nganh> getListNganh() {
		return listNganh;
	}
	public void setListNganh(ArrayList<Nganh> listNganh) {
		this.listNganh = listNganh;
	}
	public BaiTuyenDung1 getBaiTuyenDung() {
		return baiTuyenDung;
	}
	public void setBaiTuyenDung(BaiTuyenDung1 baiTuyenDung) {
		this.baiTuyenDung = baiTuyenDung;
	}
	public int getMaBaiViet() {
		return maBaiViet;
	}
	public void setMaBaiViet(int maBaiViet) {
		this.maBaiViet = maBaiViet;
	}
	public ArrayList<BaiTuyenDung1> getBaiTuyenDungs() {
		return baiTuyenDungs;
	}
	public void setBaiTuyenDungs(ArrayList<BaiTuyenDung1> baiTuyenDungs) {
		this.baiTuyenDungs = baiTuyenDungs;
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
