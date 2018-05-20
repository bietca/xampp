package action.admin;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.tuyendung.DanhSachBaiTuyenDungForm;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bo.tuyendung.TuyenDungBO;

public class PheDuyetBaiTuyenDungAction extends Action{
 @Override
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	   DanhSachBaiTuyenDungForm baiTuyenDungForm=(DanhSachBaiTuyenDungForm) form;
	   
	   TuyenDungBO tuyendungBO=new TuyenDungBO();
	   ArrayList<BaiTuyenDung1> geTuyenDung1s=tuyendungBO.getAllBaiuyennDung();
	   baiTuyenDungForm.setListBaiTuyenDung(geTuyenDung1s);
	   return mapping.findForward("dsduyet");
}
}
