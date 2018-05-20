package action.ungvien;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.KiemTraDuLieu;
import form.ungvien.UngVienForm;
import model.bean.ungvien.UngVien;
import model.bo.ungvien.UngVienBO;


public class SuaThongTinAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			UngVienForm uv=(UngVienForm) form;
			String email=uv.getEmail();
			System.out.println("EMail :"+email);
			UngVienBO  bo=new UngVienBO();
			UngVien ungVien=new UngVien(uv.getTenNguoiDung(),uv.getNgaySinh(),
					uv.getGioiTinh(),
					uv.getSoDienThoai(),uv.getQueQuan(), uv.getEmail(),uv.getMatKhau());
			System.out.println("Ngay sinh : "+uv.getNgaySinh());
			/*if(KiemTraDuLieu.ktNgay(uv.getNgaySinh())==false){
				ActionErrors errors=new ActionErrors();
				errors.add("loingay", new ActionMessage("loi.Ngaysinh"));
				saveErrors(request, errors);
				return mapping.findForward("suaungvien");
			}*/
			if(KiemTraDuLieu.ktSoDienThoai(uv.getSoDienThoai())){
				ActionErrors errors=new ActionErrors();
				errors.add("loiso", new ActionMessage("loi.Sodt"));
				saveErrors(request, errors);
				return mapping.findForward("suaungvien");
			}
			if(bo.suaUngVien(ungVien)==false){
				ActionErrors errors=new ActionErrors();
				errors.add("loisua", new ActionMessage("loi.sua"));
				saveErrors(request, errors);
				//return mapping.findForward("suaungvien");
			}		
			ActionErrors errors=new ActionErrors();
			errors.add("loisua", new ActionMessage("loi.ok"));
			saveErrors(request, errors);
			return mapping.findForward("suaungvien");
	}
}
