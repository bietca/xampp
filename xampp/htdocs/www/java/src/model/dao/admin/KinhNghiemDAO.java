package model.dao.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.admin.KinhNghiem;

public class KinhNghiemDAO {

	public ArrayList<KinhNghiem> getListKinhNghiem() {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_KinhNghiem";
		ArrayList<KinhNghiem> kinhNghiems=new ArrayList<>();
		KinhNghiem kinhNghiem=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				kinhNghiem=new KinhNghiem(rs.getString("MaKinhNghiem"), rs.getString("TenKinhNghiem"));
				kinhNghiems.add(kinhNghiem);
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
		return kinhNghiems;
	}

}
