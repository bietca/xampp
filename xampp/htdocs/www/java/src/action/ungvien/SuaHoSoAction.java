package action.ungvien;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import model.bo.ungvien.HoSoBO;

public class SuaHoSoAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			ThemHoSoForm tcv=(ThemHoSoForm) form;
			HoSoBO bo=new HoSoBO();			
			if("submit".equals(tcv.getSubmit())){
				FormFile file = tcv.getFile();
				 String url=""+tcv.getFile();
				 System.out.println("lengt :"+url);
				if(url.length()>1){
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
					      url="upload/"+tcv.getFile();
					     System.out.println("anh moi :"+url);
					    }
					    
				    }catch (Exception e) {  
				    }finally{
				        if(outputStream != null)
				        outputStream.close();
				    }
				}else {
					 url=tcv.getAnh();
					 System.out.println("anh :"+url);
				}
				HoSoBO hoSoBO=new HoSoBO();
			    String ten=tcv.getChuyenNganh();
			    System.out.println("Ma HO so :"+tcv.getMaHoSo());
			    System.out.println("Chuyen nganh :"+ten);
				 System.out.println("Anh:"+url);
				
				/* if(url.length()==7){
					HoSo hoSo1=bo.getListHoSoMaHoSoMacv(tcv.getMaCV());
					tcv.setHoSo(hoSo1);	
					 ActionErrors errors=new ActionErrors();
					 errors.add("anhrong", new ActionMessage("loi.chonanh"));
					 saveErrors(request, errors);
					 return mapping.findForward("taocv");
				 }*/
				 if(KiemTraDuLieu.ktSoDienThoai(tcv.getSoDienThoai())){
					 HoSo hoSo1=bo.getListHoSoMaHoSoMacv(tcv.getMaHoSo());
						tcv.setHoSo(hoSo1);	
						 ActionErrors errors=new ActionErrors();
						 errors.add("loisdt", new ActionMessage("loi.Sodt"));
						 saveErrors(request, errors);
						 return mapping.findForward("suaHoSo");
				 }
				 if(tcv.getChuyenNganh().length()==0){
					 HoSo hoSo1=bo.getListHoSoMaHoSoMacv(tcv.getMaHoSo());
					 tcv.setHoSo(hoSo1);	
					 ActionErrors errors=new ActionErrors();
					 errors.add("rongcn", new ActionMessage("loi.roncn"));
					 saveErrors(request, errors);
					 return mapping.findForward("suaHoSo");
				 }
				 System.out.println("Kinh nghiem :"+tcv.getKinhNghiepLamViec());
				 System.out.println("Kinh nghiem :"+tcv.getChucChi());
				 HoSo hoSo=new HoSo(tcv.getMaHoSo(),url,tcv.getHoTen(),
							tcv.getSoDienThoai(),tcv.getEmail(),
							tcv.getNgaySinh(),tcv.getDiaChi(),
							tcv.getHocVan(), tcv.getChuyenNganh(),
							tcv.getMucTieuCongViec(),tcv.getKinhNghiepLamViec(),
							tcv.getHoatDong(),tcv.getChucChi()
							,tcv.getKyNang(),tcv.getSoThich(),Integer.parseInt(tcv.getKhoa()));
				if(hoSoBO.suaHoSo(hoSo)==true){
					System.out.println("Them Thanh Cong");
					return mapping.findForward("thanhCongRoi");
				}
			}
			int maHoso=tcv.getMaHoSo();
			HoSo hoSo=bo.getListHoSoMaHoSoMacv(maHoso);
			tcv.setHoSo(hoSo);			
			return mapping.findForward("suaHoSo");
	}
}
