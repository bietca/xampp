package model.bean.ungvien;

public class DangKiTimViec {
	private int maTimViec;
	private String email;
	private String chuyenNganh;
	private String noiLamViec;
	private String loaiCongViec	;
	private String capBac;
	private String luong;
	
	
	public DangKiTimViec() {
		super();
	}
	public DangKiTimViec(int maTimViec, String email, String chuyenNganh, String noiLamViec, String loaiCongViec,
			String capBac, String luong) {
		super();
		this.maTimViec = maTimViec;
		this.email = email;
		this.chuyenNganh = chuyenNganh;
		this.noiLamViec = noiLamViec;
		this.loaiCongViec = loaiCongViec;
		this.capBac = capBac;
		this.luong = luong;
	}
	public DangKiTimViec(String email, String chuyenNganh, String noiLamViec, String loaiCongViec, String capBac,
			String luong) {
		super();
		this.email = email;
		this.chuyenNganh = chuyenNganh;
		this.noiLamViec = noiLamViec;
		this.loaiCongViec = loaiCongViec;
		this.capBac = capBac;
		this.luong = luong;
	}
	public int getMaTimViec() {
		return maTimViec;
	}
	public void setMaTimViec(int maTimViec) {
		this.maTimViec = maTimViec;
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
	@Override
	public String toString() {
		return "DangKiTimViec [maTimViec=" + maTimViec + ", email=" + email + ", chuyenNganh=" + chuyenNganh
				+ ", noiLamViec=" + noiLamViec + ", loaiCongViec=" + loaiCongViec + ", capBac=" + capBac + ", luong="
				+ luong + "]";
	}
	
	
}
