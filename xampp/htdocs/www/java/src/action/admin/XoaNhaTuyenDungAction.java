package action.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.admin.DanhSachNhaTuyenDungForm;
import model.bo.tuyendung.NhaTuyenDungBO;


public class XoaNhaTuyenDungAction extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		DanhSachNhaTuyenDungForm dsuv = (DanhSachNhaTuyenDungForm) form;
		
		String email = dsuv.getEmail();
		
		NhaTuyenDungBO uvBo = new NhaTuyenDungBO();
		
		uvBo.xoaNhaTuyenDung(email);
		
		return mapping.findForward("thanhCong");
	}
}
