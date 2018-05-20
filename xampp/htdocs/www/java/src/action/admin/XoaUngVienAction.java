package action.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.admin.DanhSachUngVienForm;
import model.bo.ungvien.UngVienBO;


public class XoaUngVienAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		DanhSachUngVienForm dsuv = (DanhSachUngVienForm) form;
		
		String email = dsuv.getEmail();
		
		UngVienBO uvBo = new UngVienBO();
		
		uvBo.xoaUngVien(email);
		
		return mapping.findForward("xoaThanhCong");
	}
}
