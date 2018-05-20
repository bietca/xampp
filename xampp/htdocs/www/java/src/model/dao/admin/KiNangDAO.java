package model.dao.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.admin.KiNang;

public class KiNangDAO {

	public ArrayList<KiNang> getListKiNang() {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_KiNang";
		ArrayList<KiNang> listKiNang =new ArrayList<>();
		KiNang kiNang =null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				kiNang=new KiNang(rs.getString("MaKiNang"), rs.getString("TenKiNang"));
				listKiNang.add(kiNang);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {
			}
		}
		return listKiNang;
	}

	public String getTenKiNangID( String ma) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_KiNang where MaKiNang='"+ma+"'";
		KiNang kiNang =null;
		ResultSet rs;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				kiNang=new KiNang(rs.getString("MaKiNang"), rs.getString("TenKiNang"));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {
			}
		}
		return kiNang.getTenKiNang();
	}
}
