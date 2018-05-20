package action.ungvien;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ungvien.HopThuUngVienForm;
import model.bean.tuyendung.TraLoiThuUngVien;
import model.bo.tuyendung.ThuTraLoiUngVienBO;

public class XemThuDaGuiAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			HopThuUngVienForm loiThuForm=(HopThuUngVienForm) form;
			
			ThuTraLoiUngVienBO loiUngVienBO=new ThuTraLoiUngVienBO();
			
			int maPhaHoi=loiThuForm.getMaPhanHoi();
			TraLoiThuUngVien thugui=loiUngVienBO.getThuDaGui(maPhaHoi);
			loiThuForm.setThuDaGui(thugui);
			return mapping.findForward("xemthugui");
	}
}
