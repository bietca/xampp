package action.tuyendung;

import java.io.PrintWriter;
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
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class QuanLyHopThuAction1 extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			QuanLyHopThuFrom hopThuFrom=(QuanLyHopThuFrom) form;
			
			response.setContentType("text/text;charset=utf-8");
			
			HttpSession session=request.getSession();
			String email=(String) session.getAttribute("tenDangNhap");
			//get list thu da gui ung tuyen
			
			
		ThuTraLoiUngVienBO loiUngVienBO=new ThuTraLoiUngVienBO();
			ArrayList<TraLoiThuUngVien> listhunhan=null;
			
			
			
			UngVienBO ungVienBO=new UngVienBO();
			ArrayList<ThuUngTuyenNhanh> getListhosoungtuyen=new ArrayList<>();
			
			int trangthai=hopThuFrom.getTrangthai();
			System.out.println("trang thai  : "+trangthai);	
			if(trangthai==3){
				listhunhan=loiUngVienBO.getThuNhaTuyenDungNhan(email);
				//het danh sach ho so ung tuyen
				getListhosoungtuyen=ungVienBO.getListThuGuiUngTuyen(email);
			
			}
			else {
				getListhosoungtuyen=ungVienBO.getListThuGuiUngTuyenTrangthai(email,trangthai);
				listhunhan=loiUngVienBO.getlistTLocThuNhatuyenDung(email, trangthai);
			}
			
			System.out.println(getListhosoungtuyen.toString());
			PrintWriter out=response.getWriter();
			JSONObject obj=new JSONObject();
			
			JSONArray listHoSoUngTuyen = JSONArray.fromObject(getListhosoungtuyen);
			JSONArray listThuNhan = JSONArray.fromObject(listhunhan);
			
			obj.put("listHoSoUngTuyen", listHoSoUngTuyen);
			obj.put("val", listThuNhan);
			out.print(obj);
			out.flush();
			return null;
	}
}
