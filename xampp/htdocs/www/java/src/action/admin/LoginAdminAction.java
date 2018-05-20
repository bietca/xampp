package action.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.KiemTraDuLieu;

import form.admin.LoginAdminForm;
import model.bo.admin.AdminBO;

public class LoginAdminAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
			LoginAdminForm adminForm=(LoginAdminForm) form;
			
			
			
			HttpSession ss = request.getSession();
			AdminBO ab = new AdminBO();
			
			if(ss.getAttribute("admin") != null )
				return mapping.findForward("daCo");
			
			String taikhoan = adminForm.getTenDangNhap();
			String matkhau = adminForm.getMatKhau();
			if(ab.checkLogin(taikhoan, matkhau)){
				ss.setAttribute("admin", taikhoan);
				System.out.println("Da Qua");
				return mapping.findForward("daCo");
			}
			else{
				adminForm.setThongBao("Tài Khoản Không Tồn Tại");
			}
		
			
			return mapping.findForward("chuaCo");
			
	}
}
