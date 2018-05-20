package action.tuyendung;

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
import form.tuyendung.ThemBaiTuyenDungForm;
import model.bean.admin.CapBac;
import model.bean.admin.KiNang;
import model.bean.admin.KinhNghiem;
import model.bean.admin.LoaiCongViec;
import model.bean.admin.Luong;
import model.bean.admin.Nganh;
import model.bean.admin.NoiLamViec;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.tuyendung.NhaTuyenDung;
import model.bean.tuyendung.ThemMoTa;
import model.bo.admin.CapBacBO;
import model.bo.admin.KiNangBO;
import model.bo.admin.KinhNghiemBO;
import model.bo.admin.LoaiCongViecBO;
import model.bo.admin.LuongBO;
import model.bo.admin.NganhBO;
import model.bo.admin.NoiLamViecBO;
import model.bo.tuyendung.NhaTuyenDungBO;
import model.bo.tuyendung.ThemMoTaBO;
import model.bo.tuyendung.TuyenDungBO;

public class ThemBaiTuyenDungAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			ThemBaiTuyenDungForm ttd=(ThemBaiTuyenDungForm) form;
			
			//Get List Nganh
			NganhBO nganhBO=new NganhBO();
			ArrayList<Nganh> listNganh=nganhBO.getListNganh();
			ttd.setListNganh(listNganh);
			
			//get List Noi lam Viec
			NoiLamViecBO lamViecBO=new NoiLamViecBO();
			 ArrayList<NoiLamViec> listNoiLamViec=lamViecBO.getListNoiLamViec();
			 ttd.setListNoiLamViec(listNoiLamViec);
			 
			 //Get List Trinh Do
			 LuongBO luongBO=new LuongBO();
			 ArrayList<Luong> listLuong=luongBO.getListLuong();
			 ttd.setListLuong(listLuong);
			 
			 //Get List LoaiCong Viiec
			 LoaiCongViecBO congViecBO=new LoaiCongViecBO();
			 ArrayList<LoaiCongViec> listLoaiCongViec=congViecBO.getListLoaiCongViec();
			 ttd.setListLoaiCongViec(listLoaiCongViec);
			 //Get List kinh nghiem
			 KinhNghiemBO kinhNghiemBO=new KinhNghiemBO();
			 ArrayList<KinhNghiem> listKinhNghiem=kinhNghiemBO.getListKinhNghiem();
			 ttd.setListKinhNghiem(listKinhNghiem);
			 //get List Ki Nang
			 KiNangBO kiNangBO=new KiNangBO();
			 ArrayList<KiNang> listKiNang=kiNangBO.getListKiNang();
			 ttd.setListKiNang(listKiNang);
			 
			 //
			 CapBacBO capBacBO=new CapBacBO();
			 ArrayList<CapBac> listCapbac=capBacBO.getListCapBac();
			 ttd.setListCapBac(listCapbac);
			 
			 
			 
			 TuyenDungBO bo=new TuyenDungBO();
			 
			 
			 if("submit".equals(ttd.getSubmit())){
				 
				 
				 if(ttd.getTieuDe().equals("")){
					 ActionErrors errors=new ActionErrors();
					 errors.add("loiRong", new ActionMessage("loi.Rong"));
					 System.out.println("Tieu de rong" );
					 saveErrors(request, errors);
					 return mapping.findForward("themthatbai");
				 }
				 String ngayTNForm = ttd.getHanNopHoSo();

					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

					long soNgayChenhLech = 0;

					try {
						Date ngayTN = dateFormat.parse(ngayTNForm);

						Date homNay = new Date();

						soNgayChenhLech = KiemTraDuLieu.sosanhNgay(ngayTN,homNay);
						System.out.println("Nhay Chen Leck :"+soNgayChenhLech);
					} catch (Exception e) {
					}
				System.out.println("ttd.getHanNopHoSo()= "+ttd.getHanNopHoSo());
				 if(ttd.getHanNopHoSo().equalsIgnoreCase("")){
					 ActionErrors errors=new ActionErrors();
					 errors.add("loiNgay", new ActionMessage("loi.Ngaysinh"));
					 System.out.println("Loi Ngay sinh"+ttd.getHanNopHoSo());
					 saveErrors(request, errors);
					 return mapping.findForward("themthatbai");
				 }
					if(soNgayChenhLech>0){
						 ActionErrors errors=new ActionErrors();
						 errors.add("loiNgay", new ActionMessage("loi.hanno"));
						 System.out.println("Loi Ngay sinh"+ttd.getHanNopHoSo());
						 saveErrors(request, errors);
						 return mapping.findForward("themthatbai");
					}
				 if(ttd.getTieuDe().equals("")){
					 ActionErrors errors=new ActionErrors();
					 errors.add("loiRong", new ActionMessage("loi.Rong"));
					 System.out.println("Tieu de rong" );
					 saveErrors(request, errors);
					 return mapping.findForward("themthatbai");
				 }
				 if(KiemTraDuLieu.ktSoDienThoai(ttd.getSoDienThoai())){
					 ActionErrors errors=new ActionErrors();
					 errors.add("loiSDT", new ActionMessage("loi.Sodt"));
					 System.out.println("Loi so dien thoai");
					 saveErrors(request, errors);
					 return mapping.findForward("themthatbai");
				 }
				/*if(KiemTraDuLieu.ktThoiGian(ttd.getHanNopHoSo())==false){
					 ActionErrors errors=new ActionErrors();
					 errors.add("loiNgay", new ActionMessage("loi.Ngaysinh"));
					 System.out.println("Loi Ngay sinh"+ttd.getHanNopHoSo());
					 saveErrors(request, errors);
					 return mapping.findForward("themthatbai");
				 } */
				 Date date=new Date(System.currentTimeMillis());
					
					SimpleDateFormat  dt=new SimpleDateFormat("yyyy/MM/dd");
					String dt1=dt.format(date);
					BaiTuyenDung1  btd=new BaiTuyenDung1(ttd.getTieuDe(),ttd.getMaNganh(),ttd.getMaNganh1(),ttd.getMaNganh2	()
						 ,ttd.getMaNoiLamViec(), ttd.getMaNoiLamViec1(), ttd.getMaNoiLamViec2(), ttd.getSoLuongCanTuyen(), ttd.getMaTD(),
						 ttd.getMaLoaiCongViec() ,ttd.getGioiTinh(),ttd.getMaKinhNghiem(), ttd.getMaLuong(), ttd.getHanNopHoSo(),
						 ttd.getTenNguoiNhanHoSo(),ttd.getEmail(),ttd.getSoDienThoai(), ttd.getGioiThieuCty(),
						 ttd.getMotaCongViec(), ttd.getYeuCauUngVien(), ttd.getQuyenLoiUngVien(), 
						 ttd.getKyNang(),ttd.getKyNang1(),ttd.getKyNang2(),ttd.getLuotxem(), ttd.getTrangthai(),dt1);
				 		if(bo.themBaiTuyenDung(btd)){
				 			
				 			ThemMoTaBO themMoTa=new ThemMoTaBO();
				 			//Them Mo Ta Ki nag
				 			KiNangBO kiNangBO2=new KiNangBO();
				 			String tenKiNag="";
				 			if(btd.getKyNang().equals("0")){
				 				tenKiNag+="";
				 			}else {
								tenKiNag+="/"+kiNangBO2.getTenKiNangID(btd.getKyNang());
							}
				 			if(btd.getKyNang1().equals("0")){
				 				tenKiNag+="";
				 			}else {
								tenKiNag+="/"+kiNangBO2.getTenKiNangID(btd.getKyNang1());
							}
				 			if(btd.getKyNang2().equals("0")){
				 				tenKiNag+="";
				 			}else {
								tenKiNag+="/"+kiNangBO2.getTenKiNangID(btd.getKyNang2());
							}
				 			
				 			//String tenKiNag=kiNangBO2.getTenKiNangID(btd.getKyNang())+"/ "
				 		//	+kiNangBO2.getTenKiNangID(btd.getKyNang1())+"/ "+kiNangBO2.getTenKiNangID(btd.getKyNang2());
				 			System.err.println("Ki nag : "+tenKiNag);
				 			
				 			//Thuc hien them mo ta  ki nang
				 			ThemMoTa mota1=new ThemMoTa(btd.getMaBaiViet(),tenKiNag);
				 			themMoTa.themMoTaKiNang(mota1);
				 							 			
				 			//Them Mo Ta Moi Lma Viec
				 			NoiLamViecBO lv=new NoiLamViecBO();
				 			String motaNoiLamViec="";
				 			if(btd.getNoiLamViec().equals("0")){
				 				motaNoiLamViec+="";
				 			}else {
								motaNoiLamViec+="/"+lv.getTenNoiLamViecID(btd.getNoiLamViec());
							}
				 			if(btd.getNoiLamViec1().equals("0")){
				 				motaNoiLamViec+="";
				 			}else {
								motaNoiLamViec+="/"+lv.getTenNoiLamViecID(btd.getNoiLamViec1());
							}
				 			if(btd.getNoiLamViec2().equals("0")){
				 				motaNoiLamViec+="";
				 			}else {
								motaNoiLamViec+="/"+lv.getTenNoiLamViecID(btd.getNoiLamViec2());
							}
				 			
				 			
				 			//Them Khoa Ngoai mo o noi lam viec 
				 			themMoTa.themKhoaNgoaiNoiLam(new ThemMoTa(btd.getMaBaiViet(),btd.getNoiLamViec()));
				 			themMoTa.themKhoaNgoaiNoiLam(new ThemMoTa(btd.getMaBaiViet(),btd.getNoiLamViec1()));
				 			themMoTa.themKhoaNgoaiNoiLam(new ThemMoTa(btd.getMaBaiViet(),btd.getNoiLamViec2()));
				 			
				 			//String motaNoiLamViec=lv.getTenNoiLamViecID(btd.getNoiLamViec())+"/ "+lv.getTenNoiLamViecID(btd.getNoiLamViec1())+"/ "
				 			//		+lv.getTenNoiLamViecID(btd.getNoiLamViec2());
				 			System.err.println("Cong Viec : "+motaNoiLamViec);
				 			
				 			//Them Mo Ta Noi Lam Viec
				 			ThemMoTa mota2=new ThemMoTa(btd.getMaBaiViet(),motaNoiLamViec);
				 			themMoTa.themMoTaNoiLamViec(mota2);
				 			
				 			
				 			
				 			//Them mo ta Nganh
				 			NganhBO bo2=new NganhBO();
				 			String chuoiNganh="";
				 			if(btd.getNganh().equals("0")){
				 				System.out.println("Nganh :");
				 				chuoiNganh+="";
				 			}else {
				 				chuoiNganh+="/"+bo2.getTenNganhID(btd.getNganh());
							}
				 			if(btd.getNganh1().equals("0")){
				 				chuoiNganh+="";
				 			}else {
								chuoiNganh+="/"+bo2.getTenNganhID(btd.getNganh1());
							}
				 			if(btd.getNganh2().equals("0")){
				 				chuoiNganh+="";
				 			}else {
								chuoiNganh+="/"+bo2.getTenNganhID(btd.getNganh2());
							}
				 			
				 			System.err.println("Nganh : "+chuoiNganh);
				 			
				 			ThemMoTa mota3=new ThemMoTa(btd.getMaBaiViet(),chuoiNganh); 
				 			//Them Mo ta Nganh
				 			themMoTa.themMoTaNganh(mota3);
                            
				 			
				 			//Khoa Ngai Nganh
				 			themMoTa.themKhoaNgoaiNganh(new ThemMoTa(btd.getMaBaiViet(),btd.getNganh()));
				 			themMoTa.themKhoaNgoaiNganh(new ThemMoTa(btd.getMaBaiViet(),btd.getNganh1()));
				 			themMoTa.themKhoaNgoaiNganh(new ThemMoTa(btd.getMaBaiViet(),btd.getNganh2()));
				 			
				 			System.out.println("them mo ta thanh cong");
				 			return mapping.findForward("themthanhcong");
				 		}else {
							return mapping.findForward("themthatbai");
						}
			 }
			 HttpSession httpSession=request.getSession();
			 String email=(String) httpSession.getAttribute("tenDangNhap");
			 System.out.println("Ten Dang Nhap :"+email);
			 NhaTuyenDungBO dungBO=new NhaTuyenDungBO();
			 NhaTuyenDung nhaTuyenDung=dungBO.getNhaTuyenDungID(email);
			 String sdt=nhaTuyenDung.getSoDienThoai()+"";
			 ttd.setEmail(nhaTuyenDung.getEmail());
			 ttd.setSoDienThoai(sdt);
			 ttd.setTenNguoiNhanHoSo(nhaTuyenDung.getTenNhaTuyenDung());
			return mapping.findForward("thembaituyendung");
	}
}
