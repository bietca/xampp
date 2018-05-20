package action.tuyendung;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.tuyendung.DanhSachBaiTuyenDungForm;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bo.tuyendung.TuyenDungBO;

public class QuanLyBaiTuyenDungAcion extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			DanhSachBaiTuyenDungForm baiTuyenDungForm=(DanhSachBaiTuyenDungForm) form;
			TuyenDungBO tuyenDungBO=new TuyenDungBO();
			HttpSession httpSession=request.getSession();
			String email=(String) httpSession.getAttribute("tenDangNhap");
			
			ArrayList<BaiTuyenDung1> tuyenDung=tuyenDungBO.getListALLBaiTuyenDungEmail(email);
			/*int mabai= baiTuyenDungForm.getMaBaiViet1();
			System.out.println("Ma bai tuyen dung "+mabai);
			if(mabai>0){
				TuyenDungBO bo=new TuyenDungBO();
				if(bo.xoaBaiTuyenDung(mabai)){
					baiTuyenDungForm.setBaiTuyenDungs(tuyenDung);
					return mapping.findForward("xoaThanhCong");
				}
				System.out.println("Xoa Bai");
			}*/
			baiTuyenDungForm.setBaiTuyenDungs(tuyenDung);
			return mapping.findForward("qlnhatuyendung");
	}
}
