package action.tuyendung;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import form.tuyendung.DanhSachBaiTuyenDungForm;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.ungvien.HoSo;
import model.bo.tuyendung.TuyenDungBO;
import model.bo.ungvien.HoSoBO;

public class QLXemChiTietAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			DanhSachBaiTuyenDungForm trangChuForm=(DanhSachBaiTuyenDungForm) form;
			TuyenDungBO tuyenDungBO=new TuyenDungBO();
			int maBaiViet=trangChuForm.getMaBaiViet();
			System.out.println("Ma Bai Dang :"+maBaiViet);
			int maCV=trangChuForm.getMaCV();
			System.out.println("Macv :+"+maCV);
			String emiel=trangChuForm.getEmailungvien();
			System.out.println("EMail :"+emiel);
			if(maCV>0){
				
				HoSoBO bo=new HoSoBO();
				HoSo hoSo=bo.getListHoSoMaHoSoMacv(maCV);
				trangChuForm.setHoSo(hoSo);
				return mapping.findForward("qlxemchitietcv");
			
			}
			
			/*//Tang luoc xem
			tuyenDungBO.tangLuotXem(maBaiViet);*/
			
			BaiTuyenDung1 arrayList=tuyenDungBO.getListALLBaiTuyenDungID(maBaiViet);
		/*	ArrayList<Nganh> listNganh=nganhBO.getListNganh();
			trangChuForm.setListNganh(listNganh);*/
			trangChuForm.setBaiTuyenDung(arrayList);
			return mapping.findForward("qlxemchitiet");
	}
}
