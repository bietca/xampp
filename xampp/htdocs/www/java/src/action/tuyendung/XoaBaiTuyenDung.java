package action.tuyendung;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.tuyendung.DanhSachBaiTuyenDungForm;
import model.bo.tuyendung.TuyenDungBO;

public class XoaBaiTuyenDung extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DanhSachBaiTuyenDungForm baiTuyenDungForm=(DanhSachBaiTuyenDungForm) form;
		HttpSession httpSession=request.getSession();
		String email=(String) httpSession.getAttribute("tenDangNhap");

		int mabai= baiTuyenDungForm.getMaBaiViet1();
		System.out.println("Ma bai tuyen dung "+mabai);
		TuyenDungBO bo=new TuyenDungBO();
		if(bo.xoaBaiTuyenDung(email, mabai)){
			return mapping.findForward("xoathanhcong");
		}else {
			return mapping.findForward("xoathanhcong");
		}
		
	}
}
