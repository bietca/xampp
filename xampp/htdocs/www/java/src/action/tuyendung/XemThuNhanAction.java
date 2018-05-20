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

public class XemThuNhanAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			HopThuUngVienForm hopThuUngVienForm=(HopThuUngVienForm) form;
			
			
			int maPhanHoi=hopThuUngVienForm.getMaPhanHoi();
			ThuTraLoiUngVienBO loiUngVienBO=new ThuTraLoiUngVienBO();
			
			
			TraLoiThuUngVien  thuUngVien=loiUngVienBO.getThuDaGui1(maPhanHoi);
			
			loiUngVienBO.thayDoiTrangThaiThuNhaTuyenDung(maPhanHoi);
			
			System.out.println("thay doi trong thai 1 cho thu them "+maPhanHoi);
			hopThuUngVienForm.setThuDaGui(thuUngVien);
			
			return mapping.findForward("xemthunhan");
	}
}
