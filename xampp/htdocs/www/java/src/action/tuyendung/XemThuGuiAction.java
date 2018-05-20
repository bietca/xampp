package action.tuyendung;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ungvien.HopThuUngVienForm;
import model.bean.tuyendung.TraLoiThuUngVien;
import model.bo.tuyendung.ThuTraLoiUngVienBO;

public class XemThuGuiAction extends Action{
		@Override
		public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			HopThuUngVienForm trangCVDaUngTuyenForm = (HopThuUngVienForm) form;
		
			TraLoiThuUngVien thuUNgVien=null;
			try {
			
				int maPhanHoi = trangCVDaUngTuyenForm.getMaPhanHoi();
				ThuTraLoiUngVienBO bo=new ThuTraLoiUngVienBO();
				 thuUNgVien=bo.getTraLoiThuUngVienID(maPhanHoi);
			} catch (Exception e) {
				System.out.println(e.toString());
				// TODO: handle exception
			}
			
			trangCVDaUngTuyenForm.setTraLoiThuUngVien(thuUNgVien);
		
			return mapping.findForward("xemthugui");
		}
}
