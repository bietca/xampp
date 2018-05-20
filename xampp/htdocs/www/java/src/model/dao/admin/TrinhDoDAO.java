package model.dao.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.admin.TrinhDo;

public class TrinhDoDAO {

	public ArrayList<TrinhDo> getListTrinhDo() {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_TrinhDo";
		ArrayList<TrinhDo>list=new ArrayList<>();
		TrinhDo trinhDo=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				trinhDo=new TrinhDo(rs.getString("MaTD"), rs.getString("TenTrinhDo"));
				list.add(trinhDo);
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
