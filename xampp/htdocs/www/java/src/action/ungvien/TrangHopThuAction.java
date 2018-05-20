package action.ungvien;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ungvien.HopThuUngVienForm;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.tuyendung.TraLoiThuUngVien;
import model.bean.ungvien.ThuUngTuyenNhanh;
import model.bo.tuyendung.ThuTraLoiUngVienBO;
import model.bo.tuyendung.TuyenDungBO;
import model.bo.ungvien.UngVienBO;

public class TrangHopThuAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			HopThuUngVienForm cv=(HopThuUngVienForm) form;
			
			HttpSession session=request.getSession();
			String email=(String) session.getAttribute("tenDangNhap");
			
			System.out.println("TRang thai"+cv.getTrangthai() +"-"+ cv.getMaBaiTuyenDung());
			//kiem tra co phai la xem  chi tiet khong
			if(cv.getMaBaiTuyenDung()>0){
				System.out.println("Xem Chi Tiet");
				TuyenDungBO bo=new TuyenDungBO();
				BaiTuyenDung1 list=bo.getListALLBaiTuyenDungID(cv.getMaBaiTuyenDung());
				cv.setBaiTuyenDung1(list);
				return mapping.findForward("xemchiietbatuyendung");
			}
			//get danh sach thu ung tuyen nhanh Voi nha tuyen dung
			UngVienBO ungVienBO=new UngVienBO();
			ArrayList<ThuUngTuyenNhanh> listDanhSach=ungVienBO.getListThuDaUngTuyen(email);
			System.out.println("Da qua trang danhs sach ung tuyen : "+listDanhSach.size() +"-"+email);
			cv.setListThuUngTuyenNhanh(listDanhSach);
			
			//get list thu nhan tu nha tuyen dung 
			ThuTraLoiUngVienBO loiUngVienBO=new ThuTraLoiUngVienBO();
			ArrayList<TraLoiThuUngVien> listthunhan=loiUngVienBO.getlistThuUngVienDaNhan(email);
			cv.setListThuUngVienNhan(listthunhan);
			
			//Get danh sach thu ung vien da gui cho nha tuyen sung
			ArrayList<TraLoiThuUngVien> listDagui=loiUngVienBO.getListThuUngTuyenDaGui(email);
			cv.setListThuUngVienDagui(listDagui);
			
			return mapping.findForward("thungtuyen");
	}
}
