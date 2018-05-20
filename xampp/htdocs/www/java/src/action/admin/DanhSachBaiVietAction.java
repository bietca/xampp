package action.admin;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.admin.DanhSachBaiVietForm;
import model.bean.admin.BaiViet;
import model.bean.admin.PheDuyet;
import model.bo.admin.BaiVietBO;
import model.bo.admin.PheDuyetBO;





public class DanhSachBaiVietAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		
		HttpSession ss = request.getSession();
		if(ss.getAttribute("admin") != null ){
		DanhSachBaiVietForm danhSachBaiVietForm= (DanhSachBaiVietForm)form;
		//lay danh sach cac phe duyet
				PheDuyetBO pheDuyetBO = new PheDuyetBO();
				ArrayList<PheDuyet> listPheDuyet = pheDuyetBO.getListpheDuyet();
				danhSachBaiVietForm.setListPheDuyet(listPheDuyet);
		ArrayList<BaiViet> listQuanliBaiViet;
		BaiVietBO baiVietBO = new BaiVietBO();
		int  pheDuyet=danhSachBaiVietForm.getPheDuyet();
		if(pheDuyet<0){
			listQuanliBaiViet = baiVietBO.quanliBaiViet();
		} else {
			listQuanliBaiViet = baiVietBO.getlistpheDuyetBaiViet(pheDuyet);
		}
		
		
		
		danhSachBaiVietForm.setListBaiViet(listQuanliBaiViet);
	
		return mapping.findForward("dsBaiViet");
		}
		return  mapping.findForward("thatTinh");
	}
	
}
