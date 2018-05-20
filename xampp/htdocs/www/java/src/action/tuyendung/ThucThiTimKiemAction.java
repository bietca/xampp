package action.tuyendung;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.tuyendung.TimKiemBaiTuyenDungForm;
import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.tuyendung.TimKiemLoc;
import model.bo.tuyendung.TuyenDungBO;



public class ThucThiTimKiemAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//response.setContentType("text/text;charset=utf-8");
		TimKiemBaiTuyenDungForm  tkform=(TimKiemBaiTuyenDungForm) form;
		response.setContentType("text/text;charset=utf-8");
		
		 
		String manganh=tkform.getMaNganh();
		String noiLamViec=tkform.getMaNoiLamViec();
		String kinhghiem=tkform.getMaKinhNghiem();
		String capbac=tkform.getMaTD();
		String maCV=tkform.getMaLoaiCongViec();
		String maLuong=tkform.getMaLuong();
		String tieude=tkform.getTieuDe();
		
	/*	int locNganh=tkform.getLocNganh();
		int locNoiLamViec=tkform.getLocNoiLamViec();
		int locKinhNghiem=tkform.getLocKinhNghiem();
		int locCapBac=tkform.getLocCapBac();
		int locLoaiCongViec=tkform.getLocLoaiCongViec();
		int locLuong=tkform.getLocLuong();*/
		
		/*System.out.println("Loc Nganh  : "+locNganh);
		System.out.println("Loc Noi lam Viec  : "+locNoiLamViec);
		TimKiemLoc kiemLoc=new TimKiemLoc(locNganh, locNoiLamViec, locKinhNghiem, locCapBac, locLoaiCongViec, locLuong);
		*/
		
		/*System.out.println("Tim Kiem :"+kiemLoc.toString());*/
		//System.out.println("Loc Noi lam Viec  : "+locNoiLamViec);
		
		/*System.out.println("Tieu De :"+tieude);
		
		System.out.println("Nganh:"+manganh+" Noi Lam :"+noiLamViec +"Kinh nghime :"
		+kinhghiem+"-Cap bav"+capbac+"-loaicv:"+maCV+"-luong:"+maLuong);*/
		BaiTuyenDung1 baiTuyenDung=new BaiTuyenDung1();
		baiTuyenDung.setNganh(manganh);
		baiTuyenDung.setNoiLamViec(noiLamViec);
		baiTuyenDung.setKinhghiem(kinhghiem);
		baiTuyenDung.setCapBac(capbac);
		baiTuyenDung.setLoaiHinhLamViec(maCV);
		baiTuyenDung.setLuong(maLuong);
		baiTuyenDung.setTieuDe(tieude);
		
		
		TuyenDungBO tuyenDungBO=new TuyenDungBO();
     //  ArrayList<BaiTuyenDung1> listKetqua=tuyenDungBO.timkiemLoc1(baiTuyenDung);
       
      ArrayList<BaiTuyenDung1> listKetqua=tuyenDungBO.timkiemLoc1(baiTuyenDung);
		
		PrintWriter out=response.getWriter();
		String result="";
		for (BaiTuyenDung1 btd : listKetqua) {		
			if(result != "")
				result += ", ";
			result += btd.toJSONString1();
			System.out.println(" thuc thi json :"+result);
		}
		result = "[" + result + "]";
		
		out.println(result);    
		return null;
	}
}
