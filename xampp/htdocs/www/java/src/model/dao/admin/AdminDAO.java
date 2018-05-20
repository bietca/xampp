package model.dao.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDAO {

	public boolean checkLogin(String tenDangNhap, String matKhau) {
		ConnectData.connection = ConnectData.getconnect();
		String sql = "select * from tb_NguoiQuanTri where TenDangNhap='"
				+ tenDangNhap + "' and MatKhau='" + matKhau + "'";
		try {
			PreparedStatement ps = ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
				return true;
			}
			//ConnectData.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {
			}
		}
		return false;
	}
	public boolean checkAdmin(String email) {
		// TODO Auto-generated method stub
		ConnectData.connection = ConnectData.getconnect();
		String sql = "select Email from tb_NguoiQuanTri where TenDangNhap='"
				+ email + "'";
		try {
			Statement tm = ConnectData.connection.createStatement();
			ResultSet rs = tm.executeQuery(sql);
			if( rs.next() ) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public void insertAdmin(String email, String pass) {
		// TODO Auto-generated method stub
		ConnectData.connection = ConnectData.getconnect();
		String sql = "insert into tb_NguoiQuanTri(TenDangNhap,MatKhau) values('"+ email+"','"+pass+"')";
		System.out.println("OK");
		try {
			Statement tm = ConnectData.connection.createStatement();
			int rs = tm.executeUpdate(sql);
			if( rs!=0) {
				System.out.println("Them Thanh Cong");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
