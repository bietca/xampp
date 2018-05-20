package action.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.admin.DanhSachNhaTuyenDungForm;
import model.bo.tuyendung.NhaTuyenDungBO;

public class DanhSachNhaTuyenDungAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		DanhSachNhaTuyenDungForm ad = (DanhSachNhaTuyenDungForm) form;
		HttpSession ss = request.getSession();

		if (ss.getAttribute("admin") != null) {
			NhaTuyenDungBO nthBo = new NhaTuyenDungBO();

			String ten = ad.getTenNhaTuyenDung();

			ad.setSoLuong(nthBo.getSoLuongNhaTuyenDung());

			if (ten == null || ten.length() == 0) {
				ad.setListNhaTuyenDung(nthBo.getlistNhaTuyenDung());
			} else
				ad.setListNhaTuyenDung(nthBo.getlistNhaTuyenDung(ten));

			System.out.println("Da Qua1");

			return mapping.findForward("thanhCong");
		} else
			return mapping.findForward("thatTinh");
	}
}
