package model.dao.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.admin.LoaiCongViec;

public class LoaiConhViecDAO {

	public ArrayList<LoaiCongViec> getListLoaiCongViec() {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_LoaiCongViec";
		ArrayList<LoaiCongViec> list=new ArrayList<>();
		LoaiCongViec loaiCongViec=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				loaiCongViec=new LoaiCongViec(rs.getString("MaLoaiCongViec"), rs.getString("TenLoaiCongViec"));
				list.add(loaiCongViec);
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
		return list;
	}

}
