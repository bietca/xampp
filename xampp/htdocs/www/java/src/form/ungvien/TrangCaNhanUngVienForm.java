package form.ungvien;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.ungvien.UngVien;

public class TrangCaNhanUngVienForm extends ActionForm{

		
	private static final long serialVersionUID = 1L;
	UngVien ungVien;
	
	public UngVien getUngVien() {
		return ungVien;
	}

	public void setUngVien(UngVien ungVien) {
		this.ungVien = ungVien;
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
