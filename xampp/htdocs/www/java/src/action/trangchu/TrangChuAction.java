package action.trangchu;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.trangchu.TrangChuForm;
import model.bean.admin.Nganh;
import model.bean.admin.NoiLamViec;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bo.admin.CapBacBO;
import model.bo.admin.LoaiCongViecBO;
import model.bo.admin.LuongBO;
import model.bo.admin.NganhBO;
import model.bo.admin.NoiLamViecBO;
import model.bo.tuyendung.TuyenDungBO;

public class TrangChuAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			TrangChuForm trangChuForm=(TrangChuForm) form;
			
			System.out.println(trangChuForm.toString() + "Form trang chu");
			
			int page = 0;
			int x = trangChuForm.getSoTrang();
			System.out.println("So trang :"+x);
			if (x >= 1)
				page = x - 1;
			//ArrayList<BaiTuyenDung> arrayList=tuyenDungBO.getListALLBaiTuyenDung();
			TuyenDungBO tuyenDungBO=new TuyenDungBO();
			ArrayList<BaiTuyenDung1> arrayList=tuyenDungBO.getListALLBaiTuyenDung1PT(page);
			int soluong=arrayList.size();
			trangChuForm.setSoluongbaituyendung(soluong);
			trangChuForm.setBaiTuyenDungs(arrayList);
			
			//get top 10 bai thuc tap
			ArrayList<BaiTuyenDung1> top10thuctap=tuyenDungBO.getListTop10BaiTHucTap();
			trangChuForm.setTop10BaiThucTap(top10thuctap);
			//get top 10 Ban thoi gian
			ArrayList<BaiTuyenDung1> top10Toanthoigian=tuyenDungBO.getListTop10ToanThoiGian();
			trangChuForm.setTop10BaiToanThoiGian(top10Toanthoigian);
			//get top 10 Ban thoi gian
			ArrayList<BaiTuyenDung1> top10BanThoigian=tuyenDungBO.getListTop10BanThoiGian();
			trangChuForm.setTop10BaiBanThoiGian(top10BanThoigian);
			
			
			// get list 10 bai tuyen dung moi
			ArrayList<BaiTuyenDung1> top10Baimoi=tuyenDungBO.getTop10BaiTuyenDungMoi();
			trangChuForm.setTop10BaiTuyenDungMoi(top10Baimoi);
			
			//Lay all Nganh
			NganhBO nganhBO=new NganhBO();
			ArrayList<Nganh> listNganh=nganhBO.getListNganh();
			trangChuForm.setListNganh(listNganh);
			// lay all noi lam viec
			NoiLamViecBO lamViecBO=new NoiLamViecBO();
			ArrayList<NoiLamViec> listNoiLamViec=lamViecBO.getListNoiLamViec();
			trangChuForm.setListNoiLamViec(listNoiLamViec);
			
			//Lay List Cap Bac
			CapBacBO doBO=new CapBacBO();
			trangChuForm.setListCapBac(doBO.getListCapBac());
			
			//Lay List Loai Cong Viec
			LoaiCongViecBO loaiCViecBO=new LoaiCongViecBO();
			trangChuForm.setListLoaiHinhCongViec(loaiCViecBO.getListLoaiCongViec());
			
			//Lay list luong
			LuongBO luongBO=new LuongBO();
			trangChuForm.setListLuong(luongBO.getListLuong());
			
			return mapping.findForward("gdtrangchu");
	}
}
