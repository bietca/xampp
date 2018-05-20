package form.admin;

import org.apache.struts.action.ActionForm;

public class DangKyAdminForm extends ActionForm{
	
	private String email;
	private String matKhau;
	private String thongBao;
	
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
	public String getThongBao() {
		return thongBao;
	}
	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}
	
	
}
