package form.ungvien;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import model.bean.ungvien.HoSo;

public class ThemHoSoForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int MaCV	;
		private String anh;
		private String hoTen;
		private String soDienThoai;
		private String email;
		private String ngaySinh;
		private String diaChi;
		private String hocVan;
		private String chuyenNganh;
		private String mucTieuCongViec;
		private String kinhNghiem;
		private String hoatDong	;
		private String chungChi;
		private String kiNang;
		private String soThich;
		private String khoa;
		private String submit;
		private FormFile file;
		private String kinhNghiepLamViec;
		private String  chucChi;
		
		public String getKinhNghiepLamViec() {
			return kinhNghiepLamViec;
		}
		public void setKinhNghiepLamViec(String kinhNghiepLamViec) {
			this.kinhNghiepLamViec = kinhNghiepLamViec;
		}
		public String getChucChi() {
			return chucChi;
		}
		public void setChucChi(String chucChi) {
			this.chucChi = chucChi;
		}



		HoSo hoSo;
		
		public HoSo getHoSo() {
			return hoSo;
		}
		public void setHoSo(HoSo hoSo) {
			this.hoSo = hoSo;
		}



		private int maHoSo;
		
		public int getMaHoSo() {
			return maHoSo;
		}
		public void setMaHoSo(int maHoSo) {
			this.maHoSo = maHoSo;
		}
		public String getKiNang() {
			return kiNang;
		}
		public void setKiNang(String kiNang) {
			this.kiNang = kiNang;
		}
		public String getSoThich() {
			return soThich;
		}
		public void setSoThich(String soThich) {
			this.soThich = soThich;
		}
		public FormFile getFile() {
			return file;
		}
		public void setFile(FormFile file) {
			this.file = file;
		}
		public String getSubmit() {
			return submit;
		}
		public void setSubmit(String submit) {
			this.submit = submit;
		}
		public ThemHoSoForm() {
			super();
		}
		public ThemHoSoForm(String anh, String hoTen, String soDienThoai, String email, String ngaySinh, String diaChi,
				String hocVan, String chuyenNganh, String mucTieuCongViec, String kinhNghiepLamViec, String hoatDong,
				String chucChi, String kyNang, String khoa) {
			super();
			this.anh = anh;
			this.hoTen = hoTen;
			this.soDienThoai = soDienThoai;
			this.email = email;
			this.ngaySinh = ngaySinh;
			this.diaChi = diaChi;
			this.hocVan = hocVan;
			this.chuyenNganh = chuyenNganh;
			this.mucTieuCongViec = mucTieuCongViec;
			this.kinhNghiem = kinhNghiepLamViec;
			this.hoatDong = hoatDong;
			this.chungChi = chucChi;
			this.kiNang = kyNang;
			this.khoa = khoa;
		}
		public int getMaCV() {
			return MaCV;
		}
		public void setMaCV(int maCV) {
			MaCV = maCV;
		}
		public String getAnh() {
			return anh;
		}
		public void setAnh(String anh) {
			this.anh = anh;
		}
		public String getHoTen() {
			return hoTen;
		}
		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}
		public String getSoDienThoai() {
			return soDienThoai;
		}
		public void setSoDienThoai(String soDienThoai) {
			this.soDienThoai = soDienThoai;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNgaySinh() {
			return ngaySinh;
		}
		public void setNgaySinh(String ngaySinh) {
			this.ngaySinh = ngaySinh;
		}
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		public String getHocVan() {
			return hocVan;
		}
		public void setHocVan(String hocVan) {
			this.hocVan = hocVan;
		}
		public String getChuyenNganh() {
			return chuyenNganh;
		}
		public void setChuyenNganh(String chuyenNganh) {
			this.chuyenNganh = chuyenNganh;
		}
		public String getMucTieuCongViec() {
			return mucTieuCongViec;
		}
		public void setMucTieuCongViec(String kinhNghiem) {
			this.mucTieuCongViec = kinhNghiem;
		}
		public String getKinhNghiem() {
			return kinhNghiem;
		}
		public void setKinhNghiem(String kinhNghiem) {
			this.kinhNghiem = kinhNghiem;
		}
		public String getHoatDong() {
			return hoatDong;
		}
		public void setHoatDong(String hoatDong) {
			this.hoatDong = hoatDong;
		}
		public String getChungChi() {
			return chungChi;
		}
		public void setChungChi(String chucChi) {
			this.chungChi = chucChi;
		}
		public String getKyNang() {
			return kiNang;
		}
		public void setKyNang(String kyNang) {
			this.kiNang = kyNang;
		}
		public String getKhoa() {
			return khoa;
		}
		public void setKhoa(String khoa) {
			this.khoa = khoa;
		}
		
		

		@Override
		public void reset(ActionMapping mapping, HttpServletRequest request) {
			try {
				request.setCharacterEncoding("UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		/*@Override
		public ActionErrors validate(ActionMapping mapping,
				HttpServletRequest request) {
			 ActionErrors errors = new ActionErrors();
		        if(file.getFileSize() == 0){
		        	errors.add("uploadedFile", new ActionMessage("errors.file.notselected"));
		        	System.out.println("loi upfile abc");
		        }
		               
		        if(errors.isEmpty()){
		            if(!file.getContentType().equalsIgnoreCase("image/jpeg") && !file.getContentType().equalsIgnoreCase("image/jpg")
		            && !file.getContentType().equalsIgnoreCase("image/pjpeg")){
		            	 errors.add("uploadedFile", new ActionMessage("errors.file.type", file.getFileName(),file.getContentType()));
			            	System.out.println("loi images abc"+file.getFileName()+" "+file.getContentType());
		            }
		               
		            if(file.getFileSize() > 500000){
		            	  errors.add("uploadedFile", new ActionMessage("errors.file.size",file.getFileName(),file.getFileSize()));
		            	  System.out.println("loi images size "+file.getFileName()+" "+file.getFileSize());
		            }
		              
		        }
		        return errors;
		}*/
}
