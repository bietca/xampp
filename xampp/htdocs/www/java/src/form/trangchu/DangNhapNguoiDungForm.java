package form.trangchu;



import org.apache.struts.action.ActionForm;


public class DangNhapNguoiDungForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tenDangNhap;
	private String matKhau;
	private String loaiTK;
	private String submit;
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getLoaiTK() {
		return loaiTK;
	}
	public void setLoaiTK(String loaiTK) {
		this.loaiTK = loaiTK;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
}
