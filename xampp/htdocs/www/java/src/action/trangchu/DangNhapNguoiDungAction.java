package action.trangchu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import form.trangchu.DangNhapNguoiDungForm;
import model.bo.tuyendung.TuyenDungBO;
import model.bo.ungvien.UngVienBO;

public class DangNhapNguoiDungAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			DangNhapNguoiDungForm dangNhapNguoiDungForm=(DangNhapNguoiDungForm) form;
			String tenDangNhap1=dangNhapNguoiDungForm.getTenDangNhap();
			String matKhau=dangNhapNguoiDungForm.getMatKhau();
			System.out.println("mádada :"+matKhau);
			String loaiTK=dangNhapNguoiDungForm.getLoaiTK();
			String submit=dangNhapNguoiDungForm.getSubmit();
		/*	System.out.println("Ten Dang Nhap :"+tenDangNhap1+ "-"+ matKhau+"-"+loaiTK+"-"+submit);*/
			// String filePathDr = getServlet().getServletContext().getRealPath("/") +"upload";
			UngVienBO ungVienBO=new UngVienBO();
			TuyenDungBO dungBO=new TuyenDungBO();
			if(matKhau==null){
				return mapping.findForward("dnnguoidung");
			}
			if("submit".equals(dangNhapNguoiDungForm.getSubmit())){
				System.out.println("Da quan dayqưqw");
				String tenDangNhap=tenDangNhap1.replace("-"," ");
				if("1".equals(loaiTK)){
					System.out.println("Dang nhap ung vien");
					if(ungVienBO.kiemtraDangNhap(tenDangNhap, matKhau)){
						HttpSession httpSession=request.getSession();
						httpSession.setAttribute("tenDangNhap",tenDangNhap);
						return mapping.findForward("thanhcongUV");
					}else {
						ActionErrors errors=new ActionErrors();
						errors.add("loiDangNhap", new ActionMessage("loi.dangNhap"));
						 saveErrors(request, errors);
						 System.out.println("Dang nhap that bai ung vien");
						return mapping.findForward("thaibai");
					}
				}
				if("2".equals(loaiTK)){
					System.out.println("Dang nhap tuyen dung");
					if(dungBO.kiemtraDangNhap(tenDangNhap, matKhau)){
						HttpSession httpSession=request.getSession();
						httpSession.setAttribute("tenDangNhap",tenDangNhap);
						return mapping.findForward("thanhcongNTD");
					}else {
						ActionErrors errors=new ActionErrors();
						errors.add("loiDangNhap", new ActionMessage("loi.dangNhap"));
						 saveErrors(request, errors);
						 System.out.println("Dang nhap that bai Nha tuyen dung");
						return mapping.findForward("thaibai");
					}
				}
			}
			return mapping.findForward("dnnguoidung");
	}
}
