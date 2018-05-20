package action.tuyendung;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.tuyendung.NhaTuyenDungForm;
import model.bean.tuyendung.NhaTuyenDung;
import model.bo.tuyendung.NhaTuyenDungBO;

public class QuanLyTrangCaNhan extends Action{
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	    NhaTuyenDungForm nhatuyendung=(NhaTuyenDungForm) form;
	    NhaTuyenDungBO bo=new NhaTuyenDungBO();
	    HttpSession session=request.getSession();
	    String email=(String) session.getAttribute("tenDangNhap");
	    System.out.println("Ten Dang Nhap :"+email);
	  
	  NhaTuyenDung  nhaTuyenDung2=bo.getNhaTuyenDungID(email);

	  nhatuyendung.setNhaTuyenDung1(nhaTuyenDung2);
	   System.out.println("Da qua day");
	   return mapping.findForward("trangcanhan");
}
}
