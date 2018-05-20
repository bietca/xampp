package action.ungvien;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ungvien.TrangCVDaTaoForm;
import model.bean.ungvien.HoSo;
import model.bo.ungvien.HoSoBO;

public class TrangXemCVAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			TrangCVDaTaoForm taoCVForm=(TrangCVDaTaoForm) form;
			//int macv=taoCVForm.getMacv();
			//System.out.println("ma cv"+macv);
			HoSoBO hoSoBO=new HoSoBO();
			HttpSession session=request.getSession();
			String email=(String) session.getAttribute("tenDangNhap");
			System.out.println("ma Can Xem CT: "+taoCVForm.getMaCV() +" Email: "+email);
			HoSo hoSo=hoSoBO.getListHoSoMaHoSo(taoCVForm.getMaCV(),email);
			taoCVForm.setHoSo(hoSo);
			return mapping.findForward("xemcv");
	}
}
