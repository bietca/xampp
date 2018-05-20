package action.ungvien;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.tuyendung.TimKiemBaiTuyenDungForm;
import model.bean.admin.KinhNghiem;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.ungvien.DangKiTimViec;
import model.bo.admin.CapBacBO;
import model.bo.admin.KinhNghiemBO;
import model.bo.admin.LoaiCongViecBO;
import model.bo.admin.LuongBO;
import model.bo.admin.NganhBO;
import model.bo.admin.NoiLamViecBO;
import model.bo.ungvien.DangKiTimViecBO;
public class TrangChuUngVienAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("text/text;charset=utf-8");
		TimKiemBaiTuyenDungForm  tkform=(TimKiemBaiTuyenDungForm) form;
		/*int page = 0;*/
		int x = tkform.getSoTrang();
		System.out.println("So trang :"+x);
	/*	if (x >= 1){
			page = x - 1;
		}*/
		//get list nganh
		
		HttpSession session=request.getSession();
		String email=(String) session.getAttribute("tenDangNhap");
		System.out.println("Emai tragn chu :"+email);
		if(email==null){
			System.out.println("da qua day");
			//return mapping.findForward("login");
		}
		NganhBO nganhBO=new NganhBO();
		tkform.setListNganh(nganhBO.getListNganh());
		
		//lay list cong viec
		NoiLamViecBO lamViecBO=new NoiLamViecBO();
		tkform.setListNoiLamViec(lamViecBO.getListNoiLamViec());
		
		//Lay list kinh nghiem
		KinhNghiemBO kinhNghiemBO=new KinhNghiemBO();
		ArrayList<KinhNghiem> listKN=kinhNghiemBO.getListKinhNghiem();
		tkform.setListKinhNghiem(listKN);
		
		//Lay List Cap Bac
		CapBacBO doBO=new CapBacBO();
		tkform.setListCapBac(doBO.getListCapBac());
		
		//Lay List Loai Cong Viec
		LoaiCongViecBO loaiCViecBO=new LoaiCongViecBO();
		tkform.setListLoaiCongViec(loaiCViecBO.getListLoaiCongViec());
		
		//Lay list luong
		LuongBO luongBO=new LuongBO();
		tkform.setListLuong(luongBO.getListLuong());
		
		
		//get bai tuyen dung phu hop 
		DangKiTimViecBO dangKiTimViecBO=new DangKiTimViecBO();
		DangKiTimViec kiTimViec=dangKiTimViecBO.getDangKiTimViecID(email);
		ArrayList<BaiTuyenDung1> listBaiPhuHop=null;
		
		if(kiTimViec==null){
			System.out.println("Ta da qua day");
			tkform.setListBaiTuyenDungPhuHop(listBaiPhuHop);
			return mapping.findForward("trangchuungvien");
		}
		listBaiPhuHop=dangKiTimViecBO.getTop10BTDTheoDangKi(kiTimViec);
		tkform.setEmail(email);
		tkform.setListBaiTuyenDungPhuHop(listBaiPhuHop);
		return mapping.findForward("trangchuungvien");
	}
}
