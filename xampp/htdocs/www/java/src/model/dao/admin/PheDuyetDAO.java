package model.dao.admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.admin.PheDuyet;



public class PheDuyetDAO {

	public ArrayList<PheDuyet> getListpheDuyet() {
		ConnectData.connection = ConnectData.getconnect();
		String sql= "SELECT * FROM tb_PheDuyet";
		ResultSet rs=null;
		try {
			Statement stmt=ConnectData.connection.createStatement();
			rs=stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<PheDuyet>list=new ArrayList<>();
		PheDuyet pheDuyet;
		try {
			while(rs.next()){
				pheDuyet=new PheDuyet();
				pheDuyet.setPheDuyet(rs.getInt("pheDuyet"));
				pheDuyet.setTenPheDuyet(rs.getString("tenPheDuyet"));
				list.add(pheDuyet);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
