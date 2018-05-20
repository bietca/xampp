package action.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.admin.QuanliBaiVietForm;
import model.bean.admin.BaiViet;
import model.bo.admin.BaiVietBO;





public class XoaBaiVietAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		QuanliBaiVietForm quanliBaiVietForm = (QuanliBaiVietForm) form;

		BaiVietBO baiVietBO = new BaiVietBO();
		
		//xoa sinh vien
		int  maBaiViet=quanliBaiVietForm.getMaBaiViet();
		BaiViet	baiViet	=new BaiViet();
		baiViet.setMaBaiViet(maBaiViet);
		if(maBaiViet>=0)
			baiVietBO.xoaBaiViet(maBaiViet);
		return mapping.findForward("xoaBaiViet");
	}
	
	

}
