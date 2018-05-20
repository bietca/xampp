package action.ungvien;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import form.ungvien.TrangCVDaTaoForm;
import model.bo.ungvien.HoSoBO;

public class XoaHoSoAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			TrangCVDaTaoForm danh=(TrangCVDaTaoForm) form;
			int maCV=danh.getMaHoSo();
			HttpSession session=request.getSession();
			String email=(String) session.getAttribute("tenDangNhap");
			HoSoBO bo=new HoSoBO();
			if(bo.xoaHoSo(email, maCV)){
				System.out.println("Xoa thanh cong email :"+email +" -" +maCV);
				return mapping.findForward("xoacv");
			}
			return mapping.findForward("xoacv");
	}
}
