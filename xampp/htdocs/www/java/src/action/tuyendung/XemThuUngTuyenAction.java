package action.tuyendung;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class XemThuUngTuyenAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			//ThuUngTuyenForm form2=(ThuUngTuyenForm) form;
			// Phuong thuc lay thu ung tuyen theo is đẻ hien thi chi tiet xem va tra loi yeu cau ứng viên
			return mapping.findForward("xemctthu");
	}
}
