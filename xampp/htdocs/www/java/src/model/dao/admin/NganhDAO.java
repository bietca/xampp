package model.dao.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.admin.Nganh;

public class NganhDAO {

	public ArrayList<Nganh> getListNganh() {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_Nganh";
		ArrayList<Nganh> listNganh=new ArrayList<>();
		Nganh nganh=null;
		try {
			PreparedStatement  ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				nganh=new Nganh(rs.getString("MaNganh"),rs.getString("TenNganh"));
				listNganh.add(nganh);
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
		return listNganh;
	}

	public String getTenNganhID(String ma) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_Nganh where MaNganh='"+ma+"'";
		Nganh nganh=null;
		try {
			PreparedStatement  ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				nganh=new Nganh(rs.getString("MaNganh"),rs.getString("TenNganh"));
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
		return nganh.getTenNganh();
	}

}
