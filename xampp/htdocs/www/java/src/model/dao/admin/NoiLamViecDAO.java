package model.dao.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.admin.NoiLamViec;

public class NoiLamViecDAO {

	public ArrayList<NoiLamViec> getListNoiLamViec() {
		ConnectData.connection=ConnectData.getconnect();
		
		String sql="select * from tb_NoiLamViec";
		ArrayList<NoiLamViec> listNoiLamViec=new ArrayList<>();
		NoiLamViec noiLamViec=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				noiLamViec=new NoiLamViec(rs.getString("MaNoiLamViec"),rs.getString("TenNoiLamViec"));
				listNoiLamViec.add(noiLamViec);
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
		return listNoiLamViec;
	}

	public String getTenNoiLamViecID(String ma) {
			ConnectData.connection=ConnectData.getconnect();
			String sql="Select * from tb_NoiLamViec where MaNoiLamViec='"+ma+"'";
			NoiLamViec noilamViec =null;
			ResultSet rs;
			try {
				PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
				rs=ps.executeQuery();
				while(rs.next()){
					noilamViec=new NoiLamViec(rs.getString("MaNoiLamViec"), rs.getString("TenNoiLamViec"));
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
			return noilamViec.getTenNoiLamViec();
		}

}
