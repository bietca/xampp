package form.ungvien;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.ungvien.HoSo;

public class TrangCVDaTaoForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private int maHoSo;
	
	public int getMaHoSo() {
		return maHoSo;
	}

	public void setMaHoSo(int maHoSo) {
		this.maHoSo = maHoSo;
	}

	private String maCV;
	private ArrayList<HoSo> listHoSo;
	private HoSo hoSo;

	

	public String getMaCV() {
		return maCV;
	}

	public void setMaCV(String maCV) {
		this.maCV = maCV;
	}

	public ArrayList<HoSo> getListHoSo() {
		return listHoSo;
	}

	public void setListHoSo(ArrayList<HoSo> listHoSo) {
		this.listHoSo = listHoSo;
	}

	public HoSo getHoSo() {
		return hoSo;
	}

	public void setHoSo(HoSo hoSo) {
		this.hoSo = hoSo;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
