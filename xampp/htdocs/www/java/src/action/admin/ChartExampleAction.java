package action.admin;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.KiemTraDuLieu;
import common.ProcessDate;
import form.admin.ChartExampleForm;
import model.bean.admin.TheLoaiNgayDang;
import model.dao.admin.GetAllDAO;

public class ChartExampleAction extends Action {

	public float tinhTrungBinh(float a, float b, float c) {
		float x = 0;
		x = x + (a / (a + b + c)) * 100;
		return x;
	}

	/* @Override */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ChartExampleForm chartExampleForm = (ChartExampleForm) form;

		HttpSession ss = request.getSession();

		if (ss.getAttribute("admin") != null) {
			GetAllDAO da = new GetAllDAO();
			System.out.println("Chart"+ss.getAttribute("admin"));
			float a = da.getAdmin();
			float b = da.getCadidate();
			float c = da.getEmployer();

			System.out.println(tinhTrungBinh(a, b, c));
			System.out.println(tinhTrungBinh(b, c, a));
			System.out.println(tinhTrungBinh(c, b, a));

			float admin = tinhTrungBinh(a, b, c);
			float candidate = tinhTrungBinh(b, a, c);
			float employer = tinhTrungBinh(c, a, b);

			chartExampleForm.setAdmin(admin);
			chartExampleForm.setCandidate(candidate);
			chartExampleForm.setEmployer(employer);

			//System.out.println("Da Qua");
			ArrayList<TheLoaiNgayDang> listNgayDang = new ArrayList<>();

			String tuNgay = chartExampleForm.getTuNgay();
			String denNgay = chartExampleForm.getDenNgay();
			//System.out.println("Ngay bat dau :"+tuNgay);
			//System.out.println("Den Ngay :"+denNgay);
			if(!(tuNgay==null)&&!(denNgay==null) &&  !("".equals(tuNgay)|| "".equals(denNgay))){
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
				/*
				Date tuNgayTemp = ProcessDate.smf.parse(tuNgay);
				Date denNgayTemp = ProcessDate.smf.parse(denNgay);*/
				Date ngayTN = dateFormat.parse(tuNgay);
				Date ngayTNsau = dateFormat.parse(denNgay);
				if(KiemTraDuLieu.sosanhNgay(ngayTN, ngayTNsau)<0)
					chartExampleForm.setThongBao("<p style=\"color:red;margin-top:5px;\">Ngày Bắt đầu lớn Hơn Ngày kết thúc</p>");
				else
					chartExampleForm.setThongBao("");
				
				listNgayDang = da.getList(tuNgay, denNgay);
				System.out.println("list ngày :"+listNgayDang.size() );
				if((listNgayDang.size() == 0) &&KiemTraDuLieu.sosanhNgay(ngayTN, ngayTNsau)>0){
					chartExampleForm.setThongBao("<p style=\"color:red ; margin-top:5px;\"> Không có bài đăng trong khoảng thời gian đó.</p>");
				}
				chartExampleForm.setListNgayDang(listNgayDang);
				return mapping.findForward("thanhCong");
			}
			
			
			if (tuNgay == null || tuNgay.length() == 0 || denNgay == null || denNgay.length() == 0 ) {
			//	System.out.println("OK QUa");
				System.out.println(ProcessDate.getFristDayOfYear().trim());
				System.out.println(ProcessDate.getDateNow().trim());
				listNgayDang = da.getList(ProcessDate.getFristDayOfYear().trim(), ProcessDate.getDateNow().trim());

			} else {
				// System.out.println("Qua OK");
				listNgayDang = da.getList(tuNgay, denNgay);
			}
			chartExampleForm.setThongBao(" <p style=\"color:green;margin-top:5px;\">Số lượng bài đăng trong năm nay.</p>");
			chartExampleForm.setListNgayDang(listNgayDang);
			return mapping.findForward("thanhCong");
		} else
			return mapping.findForward("thatTinh");
	}

}
