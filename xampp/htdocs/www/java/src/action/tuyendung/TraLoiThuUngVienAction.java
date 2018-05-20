package action.tuyendung;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.admin.TraLoiThuForm;
import model.bean.tuyendung.TraLoiThuUngVien;
import model.bo.tuyendung.ThuTraLoiUngVienBO;

public class TraLoiThuUngVienAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			TraLoiThuForm tl=(TraLoiThuForm) form;
			
			String emailUV=tl.getEmaiNguoiTimViec();
			System.out.println("Email Nguoi tinm viec: "+emailUV);
			HttpSession session=request.getSession();
			String emailNTD=(String) session.getAttribute("tenDangNhap");
			System.out.println("Email Nha tuyeeynf Dung "+emailNTD);
			if("submit".equals(tl.getSubmit())){
				Date date=new Date(System.currentTimeMillis());
				
				SimpleDateFormat  dt=new SimpleDateFormat("yyyy/MM/dd");
				String dt1=dt.format(date);
				System.out.println("Ngay tra Loi :"+dt1);
				TraLoiThuUngVien traloi=new TraLoiThuUngVien(
						tl.getEmailNhaTuyenDung(),tl.getEmaiNguoiTimViec(),tl.getTieuDe(),
						tl.getNoiDung(),dt1,tl.getTrangThai(),tl.getTrangThai2());
				ThuTraLoiUngVienBO  ttluv=new ThuTraLoiUngVienBO();
				if(ttluv.traLoiThuUngTuyen(traloi)){
					System.out.println("Tra loi thu thanh cong");
					return mapping.findForward("traloithanhcong");
				}
			}
			tl.setEmailNhaTuyenDung(emailNTD);
			tl.setEmaiNguoiTimViec(emailUV);
			return mapping.findForward("traloithu");
	}
}
