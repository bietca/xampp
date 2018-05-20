package action.ungvien;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ungvien.HopThuUngVienForm;
import model.bean.tuyendung.TraLoiThuUngVien;
import model.bo.tuyendung.ThuTraLoiUngVienBO;


public class LocThuAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			response.setContentType("text/text;charset=utf-8");
			HopThuUngVienForm form2=(HopThuUngVienForm) form;
			
			int trangthai=form2.getTrangthai();
			HttpSession session=request.getSession();
			String email=(String) session.getAttribute("tenDangNhap");
			System.out.println("Da qua day tranthaui+ : "+trangthai);
			ThuTraLoiUngVienBO listKetqua=new ThuTraLoiUngVienBO();
			ArrayList<TraLoiThuUngVien> arrayList;
			if(trangthai==3){
				 arrayList=listKetqua.getlistThuUngVienDaNhan(email);
			}else {
				arrayList=listKetqua.getlistTLocThuUngVien(email, trangthai);
			}	
			PrintWriter out=response.getWriter();
			String result="";
			for (TraLoiThuUngVien btd : arrayList) {		
				if(result != "")
					result += ", ";
				result += btd.toJSONString();
				System.out.println(" thuc thi json :"+result);
			}
			result = "[" + result + "]";
			
			out.println(result);    
			return null;
	}
}
