package action.ungvien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.KiemTraDuLieu;
import form.ungvien.ThuUngTuyenForm;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.ungvien.HoSo;
import model.bean.ungvien.ThuUngTuyenNhanh;
import model.bean.ungvien.UngVien;
import model.bo.tuyendung.TuyenDungBO;
import model.bo.ungvien.HoSoBO;
import model.bo.ungvien.UngVienBO;

public class ThuUngTuyenNhanhAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			HttpSession httpSession=request.getSession();
			String email=(String) httpSession.getAttribute("tenDangNhap");
			System.out.println("Email :"+email);
			
			ThuUngTuyenForm  tutn=(ThuUngTuyenForm) form;
			int macv=tutn.getMaCV();
			String  submit=tutn.getSubmit();
			System.out.println("Ma CV "+macv +" - submit"+ submit +" -ngay :"+tutn.getNgayUngTuyen());
			//load du lieu len trang ung tuyen
			
			
			if(email!=null&&!"submit".equals(tutn.getSubmit())){
				System.out.println("Qua trang load thong tin  ung tuyen");
				UngVienBO ungVienBO=new UngVienBO();
				//set thong tin ung vien email
				UngVien ungVien=ungVienBO.getUngVienID(email);
				tutn.setEmaiNguoiTimViec(ungVien.getEmail());
				//ma  cv 
				HoSoBO hoSoBO=new HoSoBO();
				ArrayList<HoSo> hoSos=hoSoBO.getListHoSoID(email);
				//set thong tin nha tuyen dung
				
				int maBaiViet=tutn.getMaBaiViet();
				System.out.println("Mai Bai Tuyen DUng :"+maBaiViet);
				TuyenDungBO tuyenDungBO=new TuyenDungBO();
				BaiTuyenDung1 baiTuyenDung1=tuyenDungBO.getListALLBaiTuyenDungID(maBaiViet);
				
				tutn.setEmailNhaTuyenDung(baiTuyenDung1.getEmail());
				tutn.setMaBaiViet(baiTuyenDung1.getMaBaiViet());
				
				//list ho so de chon ung tuyen
				tutn.setListHoSo(hoSos);
				return mapping.findForward("thanhcong");
			}
			
			
			//thuc hien insert thong tin ung tuyen
			if(email!=null&&"submit".equals(tutn.getSubmit())){
				System.out.println("Qua trang them submit");
				
				/*if(KiemTraDuLieu.ktNgay(tutn.getNgayUngTuyen())){
					ActionErrors errors=new ActionErrors();
					errors.add("loingay", new ActionMessage("loi.Ngaysinh"));
					saveErrors(request, errors);
					System.out.println("loi ngay nhap");
					return mapping.findForward("thanhcong");
				}*/
				if(tutn.getMaCV()==0){
					UngVienBO ungVienBO=new UngVienBO();
					//set thong tin ung vien email
					UngVien ungVien=ungVienBO.getUngVienID(email);
					tutn.setEmaiNguoiTimViec(ungVien.getEmail());
					//ma  cv 
					HoSoBO hoSoBO=new HoSoBO();
					ArrayList<HoSo> hoSos=hoSoBO.getListHoSoID(email);
					//set thong tin nha tuyen dung
					
					int maBaiViet=tutn.getMaBaiViet();
					System.out.println("Mai Bai Tuyen DUng :"+maBaiViet);
					TuyenDungBO tuyenDungBO=new TuyenDungBO();
					BaiTuyenDung1 baiTuyenDung1=tuyenDungBO.getListALLBaiTuyenDungID(maBaiViet);
					
					tutn.setEmailNhaTuyenDung(baiTuyenDung1.getEmail());
					tutn.setMaBaiViet(baiTuyenDung1.getMaBaiViet());
					
					//list ho so de chon ung tuyen
					tutn.setListHoSo(hoSos);
					System.out.println("ma Cv Nho Hon Khong");
					
					ActionErrors errors=new ActionErrors();
					errors.add("loicv", new ActionMessage("loi.cv"));
					
					Date date=new Date(System.currentTimeMillis());
					
					SimpleDateFormat  dt=new SimpleDateFormat("dd/MM/yyyy");
					String dt1=dt.format(date);
					System.out.println("Ngay Hien Tai :"+dt1);
					
					saveErrors(request, errors);
					return mapping.findForward("thanhcong");
				}
				if(KiemTraDuLieu.ktRong(tutn.getTieuDe())){
					UngVienBO ungVienBO=new UngVienBO();
					//set thong tin ung vien email
					UngVien ungVien=ungVienBO.getUngVienID(email);
					tutn.setEmaiNguoiTimViec(ungVien.getEmail());
					//ma  cv 
					HoSoBO hoSoBO=new HoSoBO();
					ArrayList<HoSo> hoSos=hoSoBO.getListHoSoID(email);
					//set thong tin nha tuyen dung
					
					int maBaiViet=tutn.getMaBaiViet();
					System.out.println("Mai Bai Tuyen DUng :"+maBaiViet);
					TuyenDungBO tuyenDungBO=new TuyenDungBO();
					BaiTuyenDung1 baiTuyenDung1=tuyenDungBO.getListALLBaiTuyenDungID(maBaiViet);
					
					tutn.setEmailNhaTuyenDung(baiTuyenDung1.getEmail());
					tutn.setMaBaiViet(baiTuyenDung1.getMaBaiViet());
					
					//list ho so de chon ung tuyen
					tutn.setListHoSo(hoSos);
					ActionErrors errors=new ActionErrors();
					errors.add("loirong", new ActionMessage("loi.Rong"));
					saveErrors(request, errors);
					System.out.println("THem That bai rong");
					return mapping.findForward("thanhcong");
				}
				Date date=new Date(System.currentTimeMillis());	
				SimpleDateFormat  dt=new SimpleDateFormat("dd/MM/yyyy");
				String dt1=dt.format(date);
				
				ThuUngTuyenNhanh nhanh=new ThuUngTuyenNhanh(
						tutn.getEmailNhaTuyenDung() ,
						tutn.getEmaiNguoiTimViec(),
						tutn.getMaBaiViet(),
						tutn.getMaCV(),
						tutn.getTieuDe(),tutn.getNoiDung(),dt1,tutn.getTrangThai());
				
				UngVienBO ungVienBO1=new UngVienBO();
				if(ungVienBO1.kiemTraThuUngTuyen(nhanh)){
					UngVienBO ungVienBO=new UngVienBO();
					//set thong tin ung vien email
					UngVien ungVien=ungVienBO.getUngVienID(email);
					tutn.setEmaiNguoiTimViec(ungVien.getEmail());
					//ma  cv 
					HoSoBO hoSoBO=new HoSoBO();
					ArrayList<HoSo> hoSos=hoSoBO.getListHoSoID(email);
					//set thong tin nha tuyen dung
					
					int maBaiViet=tutn.getMaBaiViet();
					System.out.println("Mai Bai Tuyen DUng :"+maBaiViet);
					TuyenDungBO tuyenDungBO=new TuyenDungBO();
					BaiTuyenDung1 baiTuyenDung1=tuyenDungBO.getListALLBaiTuyenDungID(maBaiViet);
					
					tutn.setEmailNhaTuyenDung(baiTuyenDung1.getEmail());
					tutn.setMaBaiViet(baiTuyenDung1.getMaBaiViet());
					
					//list ho so de chon ung tuyen
					tutn.setListHoSo(hoSos);
					System.out.println("Trung khoa ching");
					ActionErrors errors=new ActionErrors();
					errors.add("loitrungkhoa", new ActionMessage("loi.khoaungtuyen"));
					saveErrors(request, errors);
					return mapping.findForward("thanhcong");
				}
				if(ungVienBO1.themThuUngTuyen(nhanh)){
					System.out.println("Them Thu Thanh Cong");
					return mapping.findForward("themthanhcong");
				}
			}
			
			return mapping.findForward("thatbai");
	}
}
