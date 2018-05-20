package action.tuyendung;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.KiemTraDuLieu;
import form.tuyendung.NhaTuyenDungForm;
import model.bean.tuyendung.NhaTuyenDung;
import model.bo.tuyendung.NhaTuyenDungBO;


public class SuaNhaTuyenDungAction extends Action{
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	   NhaTuyenDungForm form2=(NhaTuyenDungForm) form;
	   String email=form2.getEmail();
	   System.out.println("EMail :"+email);
	   if(KiemTraDuLieu.ktSoDienThoai(form2.getSoDienThoai())){
		   ActionErrors errors=new ActionErrors();
		   errors.add("loisdt", new ActionMessage("loi.Sodt"));
		   saveErrors(request, errors);
		   System.out.println("Loi sdt");
		   return mapping.findForward("suathongtin");
	   }
	   if(email.length()>0){
		   NhaTuyenDung nhatd=new NhaTuyenDung(form2.getTenNhaTuyenDung(),
				   form2.getSoDienThoai(),
				   form2.getEmail(),
				   form2.getDiaChi(),
				   form2.getWebsite(),
				   form2.getTenCongTY(),
				   form2.getMatkhau());
		   NhaTuyenDungBO bo=new NhaTuyenDungBO();
		   if(bo.suaNhaTuyenDung(nhatd)){
			   ActionErrors errors=new ActionErrors();
			   errors.add("suaok", new ActionMessage("loi.sua"));
			   saveErrors(request, errors);
			   return mapping.findForward("suathongtin");
		   }else {
			System.out.println("Loi sua");
			return mapping.findForward("suathongtin");
		}
	   }
	  return mapping.findForward("suathongtin");
}
}
