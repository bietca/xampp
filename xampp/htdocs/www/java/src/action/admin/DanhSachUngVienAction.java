package action.admin;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.admin.DanhSachUngVienForm;
import model.bean.ungvien.UngVien;
import model.bo.ungvien.UngVienBO;

public class DanhSachUngVienAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DanhSachUngVienForm dbform = (DanhSachUngVienForm) form;

		UngVienBO uvBo = new UngVienBO();
		HttpSession ss = request.getSession();

		if (ss.getAttribute("admin") != null) {
			System.out.println("Chart"+ss.getAttribute("admin"));
			String emailll = "" + dbform.getEmaill();
			System.out.println("email:" + emailll);
			System.out.println(uvBo.getSoLuongUngVien());
			ArrayList<UngVien> listUngVien = new ArrayList<>();

			if (emailll.length() > 0) {
				listUngVien = uvBo.getlistUngVienID(emailll);
			} else {
				listUngVien = uvBo.getlistUngVienID();

			}
			dbform.setSoLuong(uvBo.getSoLuongUngVien());
			dbform.setListUngVien(listUngVien);
			return mapping.findForward("thanhCong");
		}

		else
			return mapping.findForward("thatTinh");

	}
}
