package model.dao.admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.bsf.Main;

import common.ProcessDate;
import common.KiemTraDuLieu;
import model.bean.admin.NgayDang;
import model.bean.admin.TheLoaiNgayDang;;

public class GetAllDAO {
	
	public int getAdmin(){
		ConnectData.getconnect();
		String sql = "select count(*) as SoLuong from tb_NguoiQuanTri";
		int admin = 0;
		try {
			Statement stm = ConnectData.connection.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next())
				admin = rs.getInt("Soluong");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return admin;
	}
	
	public int getEmployer(){
		ConnectData.getconnect();
		String sql = "select count(*) as SoLuong from tb_NhaTuyenDung";
		int employer = 0;
		try {
			Statement stm = ConnectData.connection.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next())
				employer = rs.getInt("Soluong");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employer;
	}
	
	public int getCadidate(){
		ConnectData.getconnect();
		String sql = "select count(*) as SoLuong from tb_UngVien";
		int cadidate = 0;
		try {
			Statement stm = ConnectData.connection.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next())
				cadidate = rs.getInt("Soluong");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cadidate;
	}
	
	
	public ArrayList<model.bean.admin.NgayDang> getListNgayDang(String tuNgay, String denNgay){
		ConnectData.getconnect();
		ArrayList<NgayDang> listNgayDang = new ArrayList<>();
		System.out.println("Da Qua GetListNgayDang");
		String sql = "select count(MaBaiViet) as ChiSo , datepart(month, NgayDang) As Months,"
				+ 	" datepart(YEAR, NgayDang) as years "
				+	" from tb_BaituyenDung1 "
				+   " where NgayDang between '"+tuNgay+"' and '"+denNgay+"'"
				+	" group by datepart(month, NgayDang) , datepart(YEAR, NgayDang)";
		try {
			Statement statement = ConnectData.connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while(rs.next()){
				NgayDang nd = new NgayDang();
				nd.setThangNam(KiemTraDuLieu.noiChuoi(rs.getString("Months"),rs.getString("years")));
				nd.setChiSo(rs.getInt("ChiSo"));
				
				listNgayDang.add(nd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listNgayDang;
	}
	

	
	public static void main(String[] args) {
		GetAllDAO dao = new GetAllDAO();
		
		ArrayList<TheLoaiNgayDang> list = new ArrayList<>();
		list = dao.getList("1/1/2006", "12/1/2006");
		for (TheLoaiNgayDang ngayDang : list) {
			System.out.println(ngayDang.getDate());
			System.out.println(ngayDang.getThucTap());
			System.out.println(ngayDang.getBanThoiGian());
			System.out.println(ngayDang.getToanThoiGian());
		}
	
		
	}
	
	
	public ArrayList<TheLoaiNgayDang> getList(String tuNgay,String DenNgay){
		ConnectData.getconnect();
		String sql = "select sum(toangthoigian) as toangthoigians,"
				+ "sum(banthoigian) as banthoigians,sum(thuctap ) as thuctaps,"
				+ "	datepart(mm,ngay) months,datepart(yyyy,ngay) as years "
				+ "from thongKe('"+tuNgay+"','"+DenNgay+"')"
				+ "group by  datepart(mm,ngay) , datepart(yyyy,ngay)"
				+ "order by datepart(mm,ngay) , datepart(yyyy,ngay)";
		ArrayList<TheLoaiNgayDang> listNgayDang = new ArrayList<>();
		System.out.println("Da Qua getList");
		try {
			Statement statement = ConnectData.connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while(rs.next()){
				TheLoaiNgayDang nd = new TheLoaiNgayDang();
				nd.setDate(KiemTraDuLieu.noiChuoi(rs.getString("months"),rs.getString("years")));
				nd.setToanThoiGian(rs.getInt("toangthoigians"));
				nd.setBanThoiGian(rs.getInt("banthoigians"));
				nd.setThucTap(rs.getInt("thuctaps"));
				listNgayDang.add(nd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listNgayDang;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
