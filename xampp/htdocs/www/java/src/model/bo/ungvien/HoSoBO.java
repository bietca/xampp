package model.bo.ungvien;

import java.util.ArrayList;
import model.bean.ungvien.HoSo;
import model.dao.ungvien.HoSoDAO;

public class HoSoBO {
	HoSoDAO hoSoDAO=new HoSoDAO();
	
	
	/**
	 * them go so
	 * @param hoSo
	 * @return
	 */
	public boolean themHoSo(HoSo hoSo){
		return hoSoDAO.themHoSo(hoSo);
	}
	/**
	 * Up load file
	 * @param formfile
	 * @param dungdanfile
	 * @return
	 */
	
	public ArrayList<HoSo> getListHoSoID(String email){
		return hoSoDAO.getListHoSoID(email);
	}
	/**
	 * Het ho all ho so them email ung vien
	 * @param string
	 * @param email
	 * @return
	 */
	public HoSo getListHoSoMaHoSo(String string,String email){
		return hoSoDAO.getListHoSoMaHoSo(string,email);
	}
	/**
	 * Get Ho so ung vien theo MaCV
	 * @param maCV
	 * @return
	 */
	public HoSo getListHoSoMaHoSoMacv( int maCV){
		return hoSoDAO.getListHoSoMaHoSoMacv(maCV);
	}
	/**
	 * Xoa Ho So
	 * @param email
	 * @param maCV
	 * @return
	 */
	public boolean xoaHoSo(String email,int maCV){
		return hoSoDAO.xoaHoSo(email,maCV);
	}
	public boolean suaHoSo(HoSo hoSo) {
		return hoSoDAO.suaHoSo(hoSo);
	}
}
