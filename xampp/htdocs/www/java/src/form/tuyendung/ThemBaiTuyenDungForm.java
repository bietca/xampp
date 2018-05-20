package form.tuyendung;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.admin.CapBac;
import model.bean.admin.KiNang;
import model.bean.admin.KinhNghiem;
import model.bean.admin.LoaiCongViec;
import model.bean.admin.Luong;
import model.bean.admin.Nganh;
import model.bean.admin.NoiLamViec;
import model.bean.admin.TrinhDo;
import model.bean.tuyendung.BaiTuyenDung1;

public class ThemBaiTuyenDungForm extends ActionForm{
	private static final long serialVersionUID = 1L;
	private int maBaiViet;
	private String tieuDe;
	private String maNganh;
	private String maNganh1;
	private String maNganh2;
	private String maNoiLamViec;
	private String maNoiLamViec1;
	private String maNoiLamViec2;
	private int soLuongCanTuyen;
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
	private String kyNang1;
	private String kyNang2;
	private int luotxem;
	private int trangthai;
	
	
	BaiTuyenDung1 baiTuyenDung1;
	
	
	public BaiTuyenDung1 getBaiTuyenDung1() {
		return baiTuyenDung1;
	}
	public void setBaiTuyenDung1(BaiTuyenDung1 baiTuyenDung1) {
		this.baiTuyenDung1 = baiTuyenDung1;
	}

	private int mabaiViet1;
	
	public int getMabaiViet1() {
		return mabaiViet1;
	}
	public void setMabaiViet1(int mabaiViet1) {
		this.mabaiViet1 = mabaiViet1;
	}
	public String getMaNganh1() {
		return maNganh1;
	}
	public void setMaNganh1(String maNganh1) {
		this.maNganh1 = maNganh1;
	}
	public String getMaNganh2() {
		return maNganh2;
	}
	public void setMaNganh2(String maNganh2) {
		this.maNganh2 = maNganh2;
	}
	public int getLuotxem() {
		return luotxem;
	}
	public void setLuotxem(int luotxem) {
		this.luotxem = luotxem;
	}
	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}

	private String submit;
	
	private ArrayList<Nganh> listNganh;
	private ArrayList<NoiLamViec> listNoiLamViec;
	private ArrayList<TrinhDo> listTrinhDo;
	private ArrayList<LoaiCongViec> listLoaiCongViec;
	private ArrayList<KinhNghiem> listKinhNghiem;
	private ArrayList<KiNang> listKiNang;
	private ArrayList<CapBac> listCapBac;
	private ArrayList<Luong> listLuong;
	
	
	public ArrayList<Luong> getListLuong() {
		return listLuong;
	}
	public void setListLuong(ArrayList<Luong> listLuong) {
		this.listLuong = listLuong;
	}
	public ArrayList<CapBac> getListCapBac() {
		return listCapBac;
	}
	public void setListCapBac(ArrayList<CapBac> listCapBac) {
		this.listCapBac = listCapBac;
	}
	public int getSoLuongCanTuyen() {
		return soLuongCanTuyen;
	}
	public void setSoLuongCanTuyen(int soLuongCanTuyen) {
		this.soLuongCanTuyen = soLuongCanTuyen;
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
	public String getMaNganh() {
		return maNganh;
	}
	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}
	public String getMaNoiLamViec() {
		return maNoiLamViec;
	}
	public void setMaNoiLamViec(String maNoiLamViec) {
		this.maNoiLamViec = maNoiLamViec;
	}
	public String getMaNoiLamViec1() {
		return maNoiLamViec1;
	}
	public void setMaNoiLamViec1(String maNoiLamViec1) {
		this.maNoiLamViec1 = maNoiLamViec1;
	}
	public String getMaNoiLamViec2() {
		return maNoiLamViec2;
	}
	public void setMaNoiLamViec2(String maNoiLamViec2) {
		this.maNoiLamViec2 = maNoiLamViec2;
	}
	
	public String getMaTD() {
		return maTD;
	}
	public void setMaTD(String maTD) {
		this.maTD = maTD;
	}
	public String getMaLoaiCongViec() {
		return maLoaiCongViec;
	}
	public void setMaLoaiCongViec(String maLoaiCongViec) {
		this.maLoaiCongViec = maLoaiCongViec;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getMaKinhNghiem() {
		return maKinhNghiem;
	}
	public void setMaKinhNghiem(String maKinhNghiem) {
		this.maKinhNghiem = maKinhNghiem;
	}
	public String getMaLuong() {
		return maLuong;
	}
	public void setMaLuong(String maLuong) {
		this.maLuong = maLuong;
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
	public String getKyNang1() {
		return kyNang1;
	}
	public void setKyNang1(String kyNang1) {
		this.kyNang1 = kyNang1;
	}
	public String getKyNang2() {
		return kyNang2;
	}
	public void setKyNang2(String kyNang2) {
		this.kyNang2 = kyNang2;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
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
	public ArrayList<TrinhDo> getListTrinhDo() {
		return listTrinhDo;
	}
	public void setListTrinhDo(ArrayList<TrinhDo> listTrinhDo) {
		this.listTrinhDo = listTrinhDo;
	}
	public ArrayList<LoaiCongViec> getListLoaiCongViec() {
		return listLoaiCongViec;
	}
	public void setListLoaiCongViec(ArrayList<LoaiCongViec> listLoaiCongViec) {
		this.listLoaiCongViec = listLoaiCongViec;
	}
	public ArrayList<KinhNghiem> getListKinhNghiem() {
		return listKinhNghiem;
	}
	public void setListKinhNghiem(ArrayList<KinhNghiem> listKinhNghiem) {
		this.listKinhNghiem = listKinhNghiem;
	}
	public ArrayList<KiNang> getListKiNang() {
		return listKiNang;
	}
	public void setListKiNang(ArrayList<KiNang> listKiNang) {
		this.listKiNang = listKiNang;
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
