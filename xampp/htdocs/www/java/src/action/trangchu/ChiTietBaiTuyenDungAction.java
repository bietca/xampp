package action.trangchu;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.tuyendung.DanhSachBaiTuyenDungForm;
import model.bean.admin.Nganh;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bo.admin.NganhBO;
import model.bo.tuyendung.TuyenDungBO;

public class ChiTietBaiTuyenDungAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			System.out.println("Ma Bai Dang:");
			DanhSachBaiTuyenDungForm trangChuForm=(DanhSachBaiTuyenDungForm) form;
			TuyenDungBO tuyenDungBO=new TuyenDungBO();
			int maBaiViet=trangChuForm.getMaBaiViet();
			System.out.println("Ma Bai Dang:"+maBaiViet);
			NganhBO nganhBO=new NganhBO();
			
			//Tang luoc xem
			tuyenDungBO.tangLuotXem(maBaiViet);
			
			BaiTuyenDung1 arrayList=tuyenDungBO.getListALLBaiTuyenDungID(maBaiViet);
			
			ArrayList<BaiTuyenDung1> baituyendung=tuyenDungBO.getTop10BaiTuyenDungMoi();
			trangChuForm.setBaiTuyenDungs(baituyendung);
			
			ArrayList<Nganh> listNganh=nganhBO.getListNganh();
			trangChuForm.setListNganh(listNganh);
			trangChuForm.setBaiTuyenDung(arrayList);
			HttpSession httpSession=request.getSession();
			String email=(String) httpSession.getAttribute("tenDangNhap");
			if(email!=null){
				return mapping.findForward("xemtdung");
			}
			return mapping.findForward("ctbaituyendung");
	}
}
