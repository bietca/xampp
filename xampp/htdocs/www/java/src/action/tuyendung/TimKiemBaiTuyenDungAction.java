package action.tuyendung;


import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.tuyendung.TimKiemBaiTuyenDungForm;
import model.bean.admin.KinhNghiem;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bo.admin.CapBacBO;
import model.bo.admin.KinhNghiemBO;
import model.bo.admin.LoaiCongViecBO;
import model.bo.admin.LuongBO;
import model.bo.admin.NganhBO;
import model.bo.admin.NoiLamViecBO;
import model.bo.tuyendung.TuyenDungBO;

public class TimKiemBaiTuyenDungAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("text/text;charset=utf-8");
		TimKiemBaiTuyenDungForm  tkform=(TimKiemBaiTuyenDungForm) form;
		int x = tkform.getSoTrang();
		//System.out.println("So trang :"+x);
		
		
		
		//Lay list kinh nghiem
		KinhNghiemBO kinhNghiemBO=new KinhNghiemBO();
		ArrayList<KinhNghiem> listKN=kinhNghiemBO.getListKinhNghiem();
		tkform.setListKinhNghiem(listKN);
		

		NganhBO nganhBO=new NganhBO();
		tkform.setListNganh(nganhBO.getListNganh());
		
		//lay list con viec
		NoiLamViecBO lamViecBO=new NoiLamViecBO();
		tkform.setListNoiLamViec(lamViecBO.getListNoiLamViec());
		//Lay List Cap Bac
		CapBacBO doBO=new CapBacBO();
		tkform.setListCapBac(doBO.getListCapBac());
		
		//Lay List Loai Cong Viec
		LoaiCongViecBO loaiCViecBO=new LoaiCongViecBO();
		tkform.setListLoaiCongViec(loaiCViecBO.getListLoaiCongViec());
		
		//Lay list luong
		LuongBO luongBO=new LuongBO();
		tkform.setListLuong(luongBO.getListLuong());
		
		//lay top 5 bai tuyen dung moi
		TuyenDungBO bo=new TuyenDungBO();
		ArrayList<BaiTuyenDung1> listTop5New=bo.getTop10BaiTuyenDungMoi();
		tkform.setListBaiTuyenDungMoi(listTop5New);
	
		return mapping.findForward("timkiembaiviet");
	}
}
