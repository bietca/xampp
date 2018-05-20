package model.bean.tuyendung;

public class BaiTuyenDung1 {
	private int maBaiViet;
	private String tieuDe;
	private String nganh;
	private String nganh1;
	private String nganh2;
	private String noiLamViec;
	private String noiLamViec1;
	private String noiLamViec2;
	private int SoLuongCanTuyen;
	private String capBac;
	private String loaiHinhLamViec;
	private String gioiTinh;
	private String kinhghiem;
	private String luong;
	private String hanNopHoSo;
	private String tenNguoiNhanHoSo;
	private String email;
	private String soDienThoai	;
	private String gioiThieuCty;
	private String motaCongViec;
	private String yeuCauUngVien;
	private String quyenLoiUngVien;
	private String kyNang;
	private String kyNang1;
	private String kyNang2;
	private int luotXem	;
	private int pheDuyet;
	private String ngayDang;
	
	
	
	public String getNgayDang() {
		return ngayDang;
	}

	public void setNgayDang(String ngayDang) {
		this.ngayDang = ngayDang;
	}

	public BaiTuyenDung1(String tieuDe, String nganh, String nganh1, String nganh2, String noiLamViec,
			String noiLamViec1, String noiLamViec2, int soLuongCanTuyen, String capBac, String loaiHinhLamViec,
			String gioiTinh, String kinhghiem, String luong, String hanNopHoSo, String tenNguoiNhanHoSo, String email,
			String soDienThoai, String gioiThieuCty, String motaCongViec, String yeuCauUngVien, String quyenLoiUngVien,
			String kyNang, String kyNang1, String kyNang2, int luotXem, int pheDuyet,String ngayDang) {
		super();
		this.tieuDe = tieuDe;
		this.nganh = nganh;
		this.nganh1 = nganh1;
		this.nganh2 = nganh2;
		this.noiLamViec = noiLamViec;
		this.noiLamViec1 = noiLamViec1;
		this.noiLamViec2 = noiLamViec2;
		this.SoLuongCanTuyen = soLuongCanTuyen;
		this.capBac = capBac;
		this.loaiHinhLamViec = loaiHinhLamViec;
		this.gioiTinh = gioiTinh;
		this.kinhghiem = kinhghiem;
		this.luong = luong;
		this.hanNopHoSo = hanNopHoSo;
		this.tenNguoiNhanHoSo = tenNguoiNhanHoSo;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.gioiThieuCty = gioiThieuCty;
		this.motaCongViec = motaCongViec;
		this.yeuCauUngVien = yeuCauUngVien;
		this.quyenLoiUngVien = quyenLoiUngVien;
		this.kyNang = kyNang;
		this.kyNang1 = kyNang1;
		this.kyNang2 = kyNang2;
		this.luotXem = luotXem;
		this.pheDuyet = pheDuyet;
		this.ngayDang=ngayDang;
	}

	public BaiTuyenDung1(int maBaiViet, String tieuDe, String nganh, String noiLamViec, int soLuongCanTuyen,
			String loaiHinhLamViec, String luong, String hanNopHoSo, int luotXem) {
		super();
		this.maBaiViet = maBaiViet;
		this.tieuDe = tieuDe;
		this.nganh = nganh;
		this.noiLamViec = noiLamViec;
		this.SoLuongCanTuyen = soLuongCanTuyen;
		this.loaiHinhLamViec = loaiHinhLamViec;
		this.luong = luong;
		this.hanNopHoSo = hanNopHoSo;
		this.luotXem = luotXem;
	}

   

	public BaiTuyenDung1(int maBaiViet, String tieuDe, String noiLamViec, int soLuongCanTuyen, String loaiHinhLamViec,
			String luong, String hanNopHoSo, int luotXem, String ngayDang) {
		super();
		this.maBaiViet = maBaiViet;
		this.tieuDe = tieuDe;
		this.noiLamViec = noiLamViec;
		this.SoLuongCanTuyen = soLuongCanTuyen;
		this.loaiHinhLamViec = loaiHinhLamViec;
		this.luong = luong;
		this.hanNopHoSo = hanNopHoSo;
		this.luotXem = luotXem;
		this.ngayDang = ngayDang;
	}
	public BaiTuyenDung1(int maBaiViet, String tieuDe, String nganh,String noiLamViec, int soLuongCanTuyen, String loaiHinhLamViec,
			String luong, String hanNopHoSo, int luotXem, String ngayDang) {
		super();
		this.maBaiViet = maBaiViet;
		this.tieuDe = tieuDe;
		this.nganh=nganh;
		this.noiLamViec = noiLamViec;
		SoLuongCanTuyen = soLuongCanTuyen;
		this.loaiHinhLamViec = loaiHinhLamViec;
		this.luong = luong;
		this.hanNopHoSo = hanNopHoSo;
		this.luotXem = luotXem;
		this.ngayDang = ngayDang;
	}

	public BaiTuyenDung1(int maBaiViet,String tieuDe, String nganh, String noiLamViec, int soLuongCanTuyen, String capBac, String loaiHinhLamViec, String gioiTinh, String kinhghiem, String luong,
			String hanNopHoSo, String tenNguoiNhanHoSo, String email, String soDienThoai, String gioiThieuCty,
			String motaCongViec, String yeuCauUngVien, String quyenLoiUngVien, String kyNang,  int luotXem, int pheDuyet,String ngayDang) {
		super();
		this.maBaiViet=maBaiViet;
		this.tieuDe = tieuDe;
		this.nganh = nganh;
		this.noiLamViec = noiLamViec;
		this.SoLuongCanTuyen = soLuongCanTuyen;
		this.capBac = capBac;
		this.loaiHinhLamViec = loaiHinhLamViec;
		this.gioiTinh = gioiTinh;
		this.kinhghiem = kinhghiem;
		this.luong = luong;
		this.hanNopHoSo = hanNopHoSo;
		this.tenNguoiNhanHoSo = tenNguoiNhanHoSo;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.gioiThieuCty = gioiThieuCty;
		this.motaCongViec = motaCongViec;
		this.yeuCauUngVien = yeuCauUngVien;
		this.quyenLoiUngVien = quyenLoiUngVien;
		this.kyNang = kyNang;
		this.luotXem = luotXem;
		this.pheDuyet = pheDuyet;
		this.ngayDang=ngayDang;
	}
	public int getMaBaiViet() {
		return maBaiViet;
	}


	public void setMaBaiViet(int maBaiViet) {
		this.maBaiViet = maBaiViet;
	}


	public BaiTuyenDung1() {
		super();
	}

	public BaiTuyenDung1(int maBaiViet, String tieuDe, String email, String ngayDang) {
		super();
		this.maBaiViet = maBaiViet;
		this.tieuDe = tieuDe;
		this.email = email;
		this.ngayDang = ngayDang;
	}

	public String getNganh1() {
		return nganh1;
	}


	public void setNganh1(String nganh1) {
		this.nganh1 = nganh1;
	}


	public String getNganh2() {
		return nganh2;
	}


	public void setNganh2(String nganh2) {
		this.nganh2 = nganh2;
	}
	
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public String getNoiLamViec() {
		return noiLamViec;
	}
	public void setNoiLamViec(String noiLamViec) {
		this.noiLamViec = noiLamViec;
	}
	public String getNoiLamViec1() {
		return noiLamViec1;
	}
	public void setNoiLamViec1(String noiLamViec1) {
		this.noiLamViec1 = noiLamViec1;
	}
	public String getNoiLamViec2() {
		return noiLamViec2;
	}
	public void setNoiLamViec2(String noiLamViec2) {
		this.noiLamViec2 = noiLamViec2;
	}
	public int getSoLuongCanTuyen() {
		return SoLuongCanTuyen;
	}
	public void setSoLuongCanTuyen(int soLuongCanTuyen) {
		SoLuongCanTuyen = soLuongCanTuyen;
	}
	public String getCapBac() {
		return capBac;
	}
	public void setCapBac(String capBac) {
		this.capBac = capBac;
	}
	public String getLoaiHinhLamViec() {
		return loaiHinhLamViec;
	}
	public void setLoaiHinhLamViec(String loaiHinhLamViec) {
		this.loaiHinhLamViec = loaiHinhLamViec;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getKinhghiem() {
		return kinhghiem;
	}
	public void setKinhghiem(String kinhghiem) {
		this.kinhghiem = kinhghiem;
	}
	public String getLuong() {
		return luong;
	}
	public void setLuong(String luong) {
		this.luong = luong;
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
	
	
	@Override
	public String toString() {
		return "BaiTuyenDung1 [maBaiViet=" + maBaiViet + ", tieuDe=" + tieuDe + ", nganh=" + nganh + ", nganh1="
				+ nganh1 + ", nganh2=" + nganh2 + ", noiLamViec=" + noiLamViec + ", noiLamViec1=" + noiLamViec1
				+ ", noiLamViec2=" + noiLamViec2 + ", SoLuongCanTuyen=" + SoLuongCanTuyen + ", capBac=" + capBac
				+ ", loaiHinhLamViec=" + loaiHinhLamViec + ", gioiTinh=" + gioiTinh + ", kinhghiem=" + kinhghiem
				+ ", luong=" + luong + ", hanNopHoSo=" + hanNopHoSo + ", tenNguoiNhanHoSo=" + tenNguoiNhanHoSo
				+ ", email=" + email + ", soDienThoai=" + soDienThoai + ", gioiThieuCty=" + gioiThieuCty
				+ ", motaCongViec=" + motaCongViec + ", yeuCauUngVien=" + yeuCauUngVien + ", quyenLoiUngVien="
				+ quyenLoiUngVien + ", kyNang=" + kyNang + ", kyNang1=" + kyNang1 + ", kyNang2=" + kyNang2
				+ ", luotXem=" + luotXem + ", pheDuyet=" + pheDuyet + "]";
	}

	public String toJSONString(){
		return "{\"maBaiViet\":\"" + maBaiViet
				+ "\", \"tieuDe\":\"" + tieuDe
				+ "\", \"nganh\":\"" + nganh
				+ "\", \"noiLamViec\":\"" + noiLamViec 
				+ "\", \"SoLuongCanTuyen\":\"" + SoLuongCanTuyen 
				+ "\", \"capBac\":\"" + capBac 
				+ "\", \"loaiHinhLamViec\":\"" + loaiHinhLamViec 
				+ "\", \"gioiTinh\":\"" + gioiTinh 
				+ "\", \"kinhghiem\":\"" + kinhghiem 
				+ "\", \"luong\":\"" + luong 
				+ "\", \"hanNopHoSo\":\"" + hanNopHoSo 
				+ "\", \"tenNguoiNhanHoSo\":\"" + tenNguoiNhanHoSo 
				+ "\", \"email\":\"" + email 
				+ "\", \"soDienThoai\":\"" + soDienThoai 
				+ "\", \"gioiThieuCty\":\"" + gioiThieuCty 
				+ "\", \"motaCongViec\":\"" + motaCongViec 
				+ "\", \"yeuCauUngVien\":\"" + yeuCauUngVien 
				+ "\", \"quyenLoiUngVien\":\"" + quyenLoiUngVien 
				+ "\", \"kyNang\":\"" + kyNang 
				+ "\", \"luotXem\":\"" + luotXem 
				+ "\", \"pheDuyet\":\"" + pheDuyet + "\"}";
	}
	public String toJSONString1(){
		return "{\"maBaiViet\":\"" + maBaiViet
				+ "\", \"tieuDe\":\"" + tieuDe
				+ "\", \"nganh\":\"" + nganh 
				+ "\", \"noiLamViec\":\"" + noiLamViec 
				+ "\", \"SoLuongCanTuyen\":\"" + SoLuongCanTuyen 
				+ "\", \"loaiHinhLamViec\":\"" + loaiHinhLamViec 
				+ "\", \"luong\":\"" + luong 
				+ "\", \"hanNopHoSo\":\"" + hanNopHoSo 
				+ "\", \"luotXem\":\"" + luotXem 
				+ "\", \"ngayDang\":\"" + ngayDang + "\"}";
	}
	
}
