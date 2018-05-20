package action.tuyendung;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.tuyendung.QuanLyHopThuFrom;
import model.bean.tuyendung.TraLoiThuUngVien;
import model.bean.ungvien.ThuUngTuyenNhanh;
import model.bo.tuyendung.ThuTraLoiUngVienBO;
import model.bo.ungvien.UngVienBO;

public class QuanLyHopThuAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		QuanLyHopThuFrom baiTuyenDungForm=(QuanLyHopThuFrom) form;
		
		HttpSession session=request.getSession();
		String email=(String) session.getAttribute("tenDangNhap");
		//get list thu da gui ung tuyen
		UngVienBO ungVienBO=new UngVienBO();
		ArrayList<ThuUngTuyenNhanh> listDanhSach=ungVienBO.getListThuGuiUngTuyen(email);
		System.out.println("Da qua trang danhs sach ung tuyen : "+listDanhSach.size() +"-"+email);
		baiTuyenDungForm.setListThuUngTuyenNhanh(listDanhSach);
		//get list thu da gui 
		ThuTraLoiUngVienBO loiUngVienBO=new ThuTraLoiUngVienBO();
		ArrayList<TraLoiThuUngVien> list=loiUngVienBO.getlistThuUng(email);
		baiTuyenDungForm.setListTraLoiThuUngVien(list);
		//get list thu da tuyen dung
		ArrayList<TraLoiThuUngVien> listhunhan=loiUngVienBO.getThuNhaTuyenDungNhan(email);
		baiTuyenDungForm.setListThuDaNhan(listhunhan);
				
		return mapping.findForward("quanlythuungtuyen");
	}
}
