package model.dao.tuyendung;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.bean.tuyendung.ThemMoTa;
import model.dao.admin.ConnectData;

public class ThemMoTaDAO {
	/**
	 * Them Khoa Ngaoi mo ta Ngah
	 * @param moTaNganh
	 * @return
	 */
	public boolean themMoTaNganh(ThemMoTa moTaNganh){
		ConnectData.connection=ConnectData.getconnect();
		String sql="Insert into tb_MoTaNganh values(?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setInt(1,moTaNganh.getMaBaiBiet());
			ps.setString(2, moTaNganh.getMoTa());
			if(ps.executeUpdate()>0){
				return true;
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
		return false;
	}
	/**
	 * Them Khoa Ngoai mo ta Noi Lam Viec
	 * @param moTaNganh
	 * @return
	 */
	public boolean themMoTaNoiLamViec(ThemMoTa moTaNganh) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Insert into tb_MoTaNoiLamViec values(?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setInt(1,moTaNganh.getMaBaiBiet());
			ps.setString(2, moTaNganh.getMoTa());
			if(ps.executeUpdate()>0){
				return true;
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
		return false;
	}
	/**
	 * Them Khoa ngaoi mo ta ki nawng
	 * @param moTaKiNang
	 * @return
	 */
	public boolean themMoTaKiNang(ThemMoTa moTaKiNang) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Insert into tb_MoTaKiNang values(?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setInt(1,moTaKiNang.getMaBaiBiet());
			ps.setString(2, moTaKiNang.getMoTa());
			if(ps.executeUpdate()>0){
				return true;
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
		return false;
	}
	public void themKhoaNgoaiNganh(ThemMoTa khoaNganh) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Insert into tb_TuyenDung_Nganh values(?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setInt(1,khoaNganh.getMaBaiBiet());
			ps.setString(2, khoaNganh.getMoTa());
			ps.executeUpdate();
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
	}
	public void themKhoaNgoaiNoiLam(ThemMoTa khoaNganh) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Insert into tb_TuyenDung_NoiLamViec values(?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setInt(1,khoaNganh.getMaBaiBiet());
			ps.setString(2, khoaNganh.getMoTa());
			ps.executeUpdate();
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
		
	}
}
