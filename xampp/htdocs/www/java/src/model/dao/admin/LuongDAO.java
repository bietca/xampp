package model.dao.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.admin.Luong;

public class LuongDAO {

	public ArrayList<Luong> getListLuong() {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_Luong";
		ArrayList<Luong> luongs=new ArrayList<>();
		Luong luong=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				luong=new Luong(rs.getString("MaLuong"), rs.getString("TenLuong"));
				luongs.add(luong);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {
			}
		}
		return luongs;
	}

}
