package action.trangchu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.KiemTraDuLieu;
import form.trangchu.TrangDangKiTaiKhangForm;
import model.bo.tuyendung.TuyenDungBO;
import model.bo.ungvien.UngVienBO;

public class TrangDangKiTaiKhoanAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		response.setContentType("text/text;charset=utf-8");
		TrangDangKiTaiKhangForm dangkitaikhoan=(TrangDangKiTaiKhangForm) form; 			
		TuyenDungBO tuyenDungBO=new TuyenDungBO();
		UngVienBO ungVienBO=new UngVienBO();
		String email=dangkitaikhoan.getEmail();
		String matKhau=dangkitaikhoan.getMatKhau();
		String loaiTK=dangkitaikhoan.getLoaiTK();
		String xacNhan=dangkitaikhoan.getXacNhan();
		System.out.println("dang ki Submit:"+dangkitaikhoan.getSubmit());
	//	System.out.println("Ma Xhax nhan "+matKhau +" -"+xacNhan);
		
		if("submit1".equals(dangkitaikhoan.getSubmit())){
			if(matKhau.length()<8){
				ActionErrors errors=new ActionErrors();
				errors.add("loigiohan",new ActionMessage("loi.GioHan"));
				 saveErrors(request, errors);
				System.out.println("Ma Xac nhan khong khop");
				return mapping.findForward("thatbai");
			}
			if(KiemTraDuLieu.ktEmail(email)){
				ActionErrors errors=new ActionErrors();
				errors.add("loiEmail",new ActionMessage("loi.Email"));
				 saveErrors(request, errors);
				System.out.println("Email Khong Hop Le");
				return mapping.findForward("thatbai");
			}
			if(!matKhau.equals(xacNhan)){
				ActionErrors errors=new ActionErrors();
				errors.add("loiXacThuc",new ActionMessage("loi.XacThuc"));
				 saveErrors(request, errors);
				System.out.println("Ma Xac nhan khong khop");
				return mapping.findForward("thatbai");
			}
			if(KiemTraDuLieu.ktRong(email)||KiemTraDuLieu.ktRong(matKhau)){
				ActionErrors errors=new ActionErrors();
				errors.add("loiRong",new ActionMessage("loi.Rong"));
				 saveErrors(request, errors);
				System.out.println("Tai khoan mat khau kh�ng rong");
				return mapping.findForward("thatbai");
			}
			if("2".equals(loaiTK)){
				if(tuyenDungBO.kiemTraEmail(email)){
					ActionErrors errors=new ActionErrors();
					errors.add("emailtontai",new ActionMessage("loi.EmailTontai"));
					 saveErrors(request, errors);
					System.out.println("Email Da Ton Tai");
					return mapping.findForward("thatbai");
				}
				else {
					if(tuyenDungBO.themNhaTuyenDung(email, matKhau)){
						ActionErrors errors=new ActionErrors();
						errors.add("thanhcong",new ActionMessage("loi.thanhcong"));
						 saveErrors(request, errors);
						System.out.println("Danh ki thanh cong");
						return mapping.findForward("thanhCong");
					}
					else {
						return mapping.findForward("thatbai");
					}
				}		
			}else {
				if(ungVienBO.ktEmailUngVien(email)){
					ActionErrors errors=new ActionErrors();
					errors.add("emailtontai",new ActionMessage("loi.EmailTontai"));
					 saveErrors(request, errors);
					 return mapping.findForward("thatbai");
				}else {
					if(ungVienBO.themUngVien(email, matKhau)){
						ActionErrors errors=new ActionErrors();
						errors.add("thanhcong",new ActionMessage("loi.thanhcong"));
						 saveErrors(request, errors);
						System.out.println("Danh ki thanh cong");
						return mapping.findForward("thanhCong");
					}
				}
				
			}
			
		}
		return mapping.findForward("dangkitaikhoan");	
	}
}
