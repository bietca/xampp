package action.ungvien;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ungvien.TrangCaNhanUngVienForm;
import model.bean.ungvien.UngVien;
import model.bo.ungvien.UngVienBO;

public class TrangCaNhanUngVienAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			TrangCaNhanUngVienForm caNhanUngVienForm=(TrangCaNhanUngVienForm) form;
			HttpSession session=request.getSession();
			
			String email=(String) session.getAttribute("tenDangNhap");
			if(email==null){
				return mapping.findForward("login");
			}
			UngVienBO  bo=new UngVienBO();
			UngVien ungVien=bo.getUngVienID(email);
			//System.out.println(ungVien.toString());
			caNhanUngVienForm.setUngVien(ungVien);
			
			return mapping.findForward("trangcanhan");
	}
}
