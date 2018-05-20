package action.ungvien;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import form.trangchu.TrangChuForm;
import model.bean.ungvien.DangKiTimViec;
import model.bo.ungvien.DangKiTimViecBO;

public class DangKiTimViecAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			TrangChuForm  daForm=(TrangChuForm) form;
			 String email=daForm.getEmail();
			 System.out.println("Email angki:"+email);
			String maNganh=daForm.getChuyenNganh();
			 String noiLamViec=daForm.getNoiLamViec();
			 String loaiCongViec=daForm.getLoaiCongViec();
			 String capBac=daForm.getCapBac();
			 String luong=daForm.getLuong();
			 String submit=daForm.getSubmit();
		     DangKiTimViec kiTimViec=new DangKiTimViec(email, maNganh, noiLamViec, loaiCongViec, capBac, luong);
			 HttpSession session=request.getSession();
			 String tenDangNhap=session.getAttribute("tenDangNhap") != null?null:"";
			 DangKiTimViecBO bo=new DangKiTimViecBO();
			 System.out.println("Kiem tra dang nhap chuaw: "+tenDangNhap);
			 System.out.println("Toi submit: "+submit);
			 if("submit".equals(submit)){	
				 System.out.println("Da vao submit");
				 //kiem tra neu nhan email dang ki la khac rong
				 if(!email.equals("")){
					 //KIem tra neu email chua dc dang ki thi chuyen sang trang dang ki
					 if(bo.kiemtraTonTai(email)==false){
						 ActionErrors errors=new ActionErrors();
						 errors.add("loidk", new ActionMessage("loi.dangki"));
						 saveErrors(request, errors); 
						 //Chuyen sang trang dang ki tai khoan moi dc them cong viec
						 System.out.println("Chua dang ki tai khoan email ma dang ki");
						 return mapping.findForward("loidangki");
					 }else {
						 //kiem tra thu trang thai la da dang nhap chua
						 if("".equals(tenDangNhap)){
							 System.out.println("Da qua day 1");
							 //chua dang nhap - kiem tra xem emal da ton tai trong bang dang ki chua neu roi thu upate 
							 if(bo.kiemtraTonTaiTrongDK(email)==true){
								 System.out.println("Da qua day 2");
								 //email da dang ki nen uapdate
								 //viet han update du lieu
								if(bo.suaDangKiTimViec(kiTimViec)){
									 ActionErrors errors=new ActionErrors();
									 errors.add("loidk", new ActionMessage("loi.dangki1"));
									 saveErrors(request, errors); 
									 //Dang Ki thanh cong va chuyen sang trang dang nhap
									 System.out.println("update thanh cong khi chua dang nhap");
									 return mapping.findForward("dkchuadangnhap");
								 }else {
									 // dang ki that bai 
									 System.out.println("update that bai khi chua dang nhap");
									 return mapping.findForward("loidangki");
								}
							 }else {
								//Dang ki tai khoan va chuyen sang dang nhap
								 //viet ham them mooi dang ki
								 if(bo.themDangKiTimViec(kiTimViec)){
									 ActionErrors errors=new ActionErrors();
									 errors.add("loidk", new ActionMessage("loi.dangki1"));
									 saveErrors(request, errors); 
									 //dang ki thanh cong va chuyen sang trang dang nhap
									 System.out.println("Dang ki thanh cong khi chua dang nhap");
									 return mapping.findForward("dkchuadangnhap");
								 }else {
									 System.out.println("Dang ki that bai khi chua dang nhap");
									 return mapping.findForward("loidangki");	 
								}
								
							}				
						 }else {
							 if(bo.kiemtraTonTaiTrongDK(email)){
								 //email da dang ki nen uapdate
								 //viet han update du lieu
								 if(bo.suaDangKiTimViec(kiTimViec)){
									 ActionErrors errors=new ActionErrors();
									 errors.add("loidk", new ActionMessage("loi.dk"));
									 saveErrors(request, errors); 
									 //updata khi da dang nhap va vhuyen ve trang chu ung vien
									 System.out.println("Update thanh cong khi dang nhap");
									 return mapping.findForward("dkdadangnhap");
								 }else {
									 //dang ki that bai tra ve trang chu
									 System.out.println("Update that bai khi dang nhap");
									 return mapping.findForward("dkdadangnhap");	 
								}
								
							 }else {
								//Dang ki tai khoan va chuyen sang dang nhap
								 //viet ham them mooi dang ki
								 if(bo.themDangKiTimViec(kiTimViec)){
									 ActionErrors errors=new ActionErrors();
									 errors.add("loidk", new ActionMessage("loi.dk"));
									 saveErrors(request, errors); 
									 System.out.println("Dang ki thanh cong khi dang nhap");
									 return mapping.findForward("dkdadangnhap");
								 }else {
									 //dang ki that bai 
									 System.out.println("Dang ki that bai khi dang nhap");
									 return mapping.findForward("dkdadangnhap");
								}
								
							}				
							
						}
	
					}
					 
				 }else {
					 //Chua nhap email dang ki
					 ActionErrors errors=new ActionErrors();
					 errors.add("loidk", new ActionMessage("loi.dangki"));
					 saveErrors(request, errors);
					 System.out.println("chua dang ki tai khoan chuyen sang dang ki nguoi dung");
					return mapping.findForward("loidangki");
				}
				
			 }	
			 ActionErrors errors=new ActionErrors();
			 errors.add("loidk", new ActionMessage("loi.dangki"));
			 saveErrors(request, errors);
			 System.out.println("chua nhap email");
			return mapping.findForward("loidangki");
	}
}
