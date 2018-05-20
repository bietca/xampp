package action.ungvien;

import java.util.ArrayList;

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

public class TrangCVDaTaoAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			TrangCVDaTaoForm cvf=(TrangCVDaTaoForm) form;
			
			HoSoBO hoSoBO=new HoSoBO();
			HttpSession httpSession=request.getSession();
			String email=(String) httpSession.getAttribute("tenDangNhap");
			System.out.println(email);
			ArrayList<HoSo> hoSos=hoSoBO.getListHoSoID(email);
			//System.err.println(hoSos.size());
			cvf.setListHoSo(hoSos);
			return mapping.findForward("trangcvdatao");
	}
}
