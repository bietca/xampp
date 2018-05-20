package action.tuyendung;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.tuyendung.ThemBaiTuyenDungForm;
import model.bean.admin.CapBac;
import model.bean.admin.KiNang;
import model.bean.admin.KinhNghiem;
import model.bean.admin.LoaiCongViec;
import model.bean.admin.Luong;
import model.bean.admin.Nganh;
import model.bean.admin.NoiLamViec;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bo.admin.CapBacBO;
import model.bo.admin.KiNangBO;
import model.bo.admin.KinhNghiemBO;
import model.bo.admin.LoaiCongViecBO;
import model.bo.admin.LuongBO;
import model.bo.admin.NganhBO;
import model.bo.admin.NoiLamViecBO;
import model.bo.tuyendung.TuyenDungBO;

public class SuaBaiTuyenDungAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			ThemBaiTuyenDungForm ttd=(ThemBaiTuyenDungForm) form;
			int baiBaiViet=ttd.getMabaiViet1();		
			System.out.println("Ma Bai Tuyen Dung Sua:"+baiBaiViet);
			
			NganhBO nganhBO=new NganhBO();
			ArrayList<Nganh> listNganh=nganhBO.getListNganh();
			ttd.setListNganh(listNganh);
			
			//get List Noi lam Viec
			NoiLamViecBO lamViecBO=new NoiLamViecBO();
			 ArrayList<NoiLamViec> listNoiLamViec=lamViecBO.getListNoiLamViec();
			 ttd.setListNoiLamViec(listNoiLamViec);
			 
			 //Get List Trinh Do
			 LuongBO luongBO=new LuongBO();
			 ArrayList<Luong> listLuong=luongBO.getListLuong();
			 ttd.setListLuong(listLuong);
			 
			 //Get List LoaiCong Viiec
			 LoaiCongViecBO congViecBO=new LoaiCongViecBO();
			 ArrayList<LoaiCongViec> listLoaiCongViec=congViecBO.getListLoaiCongViec();
			 ttd.setListLoaiCongViec(listLoaiCongViec);
			 //Get List kinh nghiem
			 KinhNghiemBO kinhNghiemBO=new KinhNghiemBO();
			 ArrayList<KinhNghiem> listKinhNghiem=kinhNghiemBO.getListKinhNghiem();
			 ttd.setListKinhNghiem(listKinhNghiem);
			 //get List Ki Nang
			 KiNangBO kiNangBO=new KiNangBO();
			 ArrayList<KiNang> listKiNang=kiNangBO.getListKiNang();
			 ttd.setListKiNang(listKiNang);
			 
			 //
			 CapBacBO capBacBO=new CapBacBO();
			 ArrayList<CapBac> listCapbac=capBacBO.getListCapBac();
			 ttd.setListCapBac(listCapbac);
			 
			 TuyenDungBO dungBO=new TuyenDungBO();
			 
			 BaiTuyenDung1 dung1=dungBO.getListALLBaiTuyenDungID(baiBaiViet);
			 
			 ttd.setBaiTuyenDung1(dung1);
			 
			return mapping.findForward("suabaituyendung");
	}	
}
