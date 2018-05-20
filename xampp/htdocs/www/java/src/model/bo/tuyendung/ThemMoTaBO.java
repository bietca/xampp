package model.bo.tuyendung;


import model.bean.tuyendung.ThemMoTa;
import model.dao.tuyendung.ThemMoTaDAO;

public class ThemMoTaBO {
	
	ThemMoTaDAO moTaNganh1=new ThemMoTaDAO();
	public boolean themMoTaNganh(ThemMoTa moTaNganh){
		return moTaNganh1.themMoTaNganh(moTaNganh);
	}
	
	public boolean themMoTaNoiLamViec(ThemMoTa noiLamViec){
		return moTaNganh1.themMoTaNoiLamViec(noiLamViec);
	}
	public boolean themMoTaKiNang(ThemMoTa moTaKiNang){
		return moTaNganh1.themMoTaKiNang(moTaKiNang);
	}
	public void themKhoaNgoaiNganh(ThemMoTa khoaNganh){
		 moTaNganh1.themKhoaNgoaiNganh(khoaNganh);
	}
	public void themKhoaNgoaiNoiLam(ThemMoTa khoaNganh){
		 moTaNganh1.themKhoaNgoaiNoiLam(khoaNganh);
	}
}
