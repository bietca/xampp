package action.ungvien;

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


public class TraLoiThuNhaTuyenDungAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			TraLoiThuForm form2=(TraLoiThuForm) form;
			//System.out.println("email Nha tuyen dung "+form2.getEmailNhaTuyenDung());
			HttpSession http=request.getSession();
			
			String emailUngVien=(String) http.getAttribute("tenDangNhap");
			form2.setEmaiNguoiTimViec(emailUngVien);
			form2.setEmailNhaTuyenDung(form2.getEmailNhaTuyenDung());
			
			System.out.println("sub mit"+form2.getSubmit());
			if("submit".equals(form2.getSubmit())){
				Date date=new Date(System.currentTimeMillis());
				
				SimpleDateFormat  dt=new SimpleDateFormat("yyyy/MM/dd");
				String dt1=dt.format(date);
				ThuTraLoiUngVienBO traLoiUngVienBO=new ThuTraLoiUngVienBO();
				TraLoiThuUngVien tttuv=new TraLoiThuUngVien(form2.getEmailNhaTuyenDung(),
						form2.getEmaiNguoiTimViec(),form2.getTieuDe(),
						form2.getNoiDung(),dt1,
						form2.getTrangThai(),form2.getTrangThai2());
					if(traLoiUngVienBO.traLoiThuNhaTuyenDung(tttuv)){
						System.out.println("Thanh COng");
						return mapping.findForward("traloiok");
					}
			}
			
			return mapping.findForward("traloithuNTD");
	}
}
