package action.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import model.dao.admin.ConnectData;

public class DangXuatAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		HttpSession ss = request.getSession();
		ss.setAttribute("admin", null);
		ConnectData.connection = null;
		System.out.println(ss.getAttribute("admin"));
		return mapping.findForward("thanhCong");
	}
}
