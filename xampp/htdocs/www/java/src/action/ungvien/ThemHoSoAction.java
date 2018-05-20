package action.ungvien;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

import common.KiemTraDuLieu;
import form.ungvien.ThemHoSoForm;
import model.bean.ungvien.HoSo;
import model.bean.ungvien.UngVien;
import model.bo.ungvien.HoSoBO;
import model.bo.ungvien.UngVienBO;

public class ThemHoSoAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			ThemHoSoForm tcv=(ThemHoSoForm) form;
			System.out.println("sub:"+tcv.getSubmit());

		    if("submit".equals(tcv.getSubmit())){
		    	FormFile file = tcv.getFile();
				
			    FileOutputStream outputStream = null;
			    
			    String filePathDr = getServlet().getServletContext().getRealPath("/") +"upload";
			  //  String filePathDr="upload//";
			    System.out.println("duong dan dr"+filePathDr);
			    
			    File newFile=null;
			    
			    try {
				    File folder = new File(filePathDr);
				    if(!folder.exists()){
				    	folder.mkdir();
				    }

				    String fileName = file.getFileName();

				    if(!("").equals(fileName)){

				        System.out.println("Server path:" +filePathDr);
				        
				        newFile= new File(filePathDr, fileName);

				        if(!newFile.exists()){
				          FileOutputStream fos = new FileOutputStream(newFile);
				          fos.write(file.getFileData());
				          fos.flush();
				          fos.close();
				        }
				    }
				    
			    }catch (Exception e) {
			    	
			        
			    }finally{
			        if(outputStream != null)
			        outputStream.close();
			    }
			    
		    	 HoSoBO   hosoBO=new HoSoBO();
		    	 String url="upload/"+tcv.getFile();
		    	 System.out.println("Size :"+url.length());
				 System.out.println("Anh:"+url);
				 HoSo hoSo=new HoSo(url,tcv.getHoTen(),
						tcv.getSoDienThoai(),tcv.getEmail(),
						tcv.getNgaySinh(),tcv.getDiaChi(),
						tcv.getHocVan(), tcv.getChuyenNganh(),
						tcv.getMucTieuCongViec(),tcv.getKinhNghiem(),
						tcv.getHoatDong(),tcv.getChungChi()
						,tcv.getKyNang(),tcv.getSoThich(),Integer.parseInt(tcv.getKhoa()));
				 if(url.length()==7){
					 ActionErrors errors=new ActionErrors();
					 errors.add("anhrong", new ActionMessage("loi.chonanh"));
					 saveErrors(request, errors);
					 return mapping.findForward("taocv");
				 }
				 if(tcv.getChuyenNganh().length()==0){
					 ActionErrors errors=new ActionErrors();
					 errors.add("rongcn", new ActionMessage("loi.roncn"));
					 saveErrors(request, errors);
					 return mapping.findForward("taocv");
				 }
				 if(KiemTraDuLieu.ktSoDienThoai(tcv.getSoDienThoai().trim())){
					 ActionErrors errors=new ActionErrors();
					 errors.add("loisdt", new ActionMessage("loi.Sodt"));
					 saveErrors(request, errors);
					 return mapping.findForward("taocv");
				 }
				 if(KiemTraDuLieu.ktNgay(tcv.getNgaySinh())){
					 ActionErrors errors=new ActionErrors();
					 errors.add("loins", new ActionMessage("loi.Ngaysinh"));
					 saveErrors(request, errors);
					 return mapping.findForward("taocv");
				 }
				 /*if(KiemTraDuLieu.ktSoDienThoai(tcv.getSoDienThoai())){
					 ActionErrors errors=new ActionErrors();
					 errors.add("loisodt", new ActionMessage("loi.Ngaysinh"));
					 saveErrors(request, errors);
					 return mapping.findForward("taocv");
				 }*/
				if(hosoBO.themHoSo(hoSo)==true){
					System.out.println("Them Thanh Cong");
					return mapping.findForward("thanhCongRoi");
				}
			}
		    HttpSession session=request.getSession();
		    String email=(String) session.getAttribute("tenDangNhap");
		    UngVienBO ungVienBO=new UngVienBO();
		    UngVien ungVien=ungVienBO.getUngVienID(email);
		    tcv.setHoTen(ungVien.getTenNguoiDung());
		    tcv.setEmail(ungVien.getEmail());
		    String sodt=ungVien.getSoDienThoai()+"";
		    tcv.setSoDienThoai(sodt);
		    tcv.setNgaySinh(ungVien.getNgaySinh());
		    tcv.setDiaChi(ungVien.getQueQuan());
			return mapping.findForward("taocv");
	}
}
