package action.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.KiemTraDuLieu;
import form.admin.DangKyAdminForm;
import model.bo.admin.AdminBO;

public class DangKyAdminAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		DangKyAdminForm dkForm = (DangKyAdminForm) form;
		
		AdminBO abo = new AdminBO();
		
		String Email = dkForm.getEmail();
		String Pass = dkForm.getMatKhau();
		
		if(!abo.checkAdmin(Email) && !KiemTraDuLieu.ktRong(Email) && !KiemTraDuLieu.ktRong(Pass)){
				abo.insertAdmin(Email, Pass);
				dkForm.setThongBao("Đăng Ký Thành Công");
				return mapping.findForward("thanhCong");	
		}
		else{
			dkForm.setThongBao("Tai Đã Tồn Tại");
		}
	

		return mapping.findForward("thatBai");	

		
	}
}
