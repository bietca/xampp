package form.trangchu;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class TrangDangKiTaiKhangForm extends ActionForm{

	private static final long serialVersionUID = 1L;
	private String email;
	private String matKhau;
	private String xacNhan;
	private String loaiTK;
	private String submit;
	
	
	public String getXacNhan() {
		return xacNhan;
	}
	public void setXacNhan(String xacNhan) {
		this.xacNhan = xacNhan;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
