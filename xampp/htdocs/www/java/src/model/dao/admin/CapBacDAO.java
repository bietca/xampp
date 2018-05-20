package model.dao.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.admin.CapBac;


public class CapBacDAO {
	/**
	 * get list cap bac
	 * @return
	 */
	public ArrayList<CapBac> getListCapBac() {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_CapBac";
		ArrayList<CapBac> listKiNang =new ArrayList<>();
		CapBac kiNang =null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				kiNang=new CapBac(rs.getString("MaCapBac"), rs.getString("TenCapBac"));
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
}
