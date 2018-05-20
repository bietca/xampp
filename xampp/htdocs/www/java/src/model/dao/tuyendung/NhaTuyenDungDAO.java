package model.dao.tuyendung;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import model.bean.tuyendung.NhaTuyenDung;
import model.dao.admin.ConnectData;

public class NhaTuyenDungDAO {

	public NhaTuyenDung getNhaTuyenDungID(String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_NhaTuyenDung where Email='"+email+"'";
		NhaTuyenDung dung=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				dung=new NhaTuyenDung(rs.getString("TenNhaTuyenDung"), rs.getString("SoDienThoai"),
						rs.getString("Email"), rs.getString("DiaChi"), rs.getString("Website"),
						rs.getString("TenCongTY") ,rs.getString("matkhau"));
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
		return dung;
	}

	public ArrayList<NhaTuyenDung> getListNhaTuyenDung() {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_NhaTuyenDung";
		ArrayList<NhaTuyenDung> listNhaTuyenDung=new ArrayList<>();
		NhaTuyenDung dung=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				dung=new NhaTuyenDung(rs.getString("TenNhaTuyenDung"), rs.getString("SoDienThoai"),
						rs.getString("Email"), rs.getString("DiaChi"), rs.getString("Website"),
						rs.getString("TenCongTY") ,rs.getString("MatKhau"));
				listNhaTuyenDung.add(dung);
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
		return listNhaTuyenDung;
	}

	public boolean suaNhaTuyenDung(NhaTuyenDung dung) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="update tb_NhaTuyenDung set TenNhaTuyenDung=?,SoDienThoai=?,DiaChi=?,Website=?,TenCongTY=?  where Email=?";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1, dung.getTenNhaTuyenDung());
			ps.setString(2, dung.getSoDienThoai());
			ps.setString(3,dung.getDiaChi());
			ps.setString(4,dung.getWebsite());
			ps.setString(5,dung.getTenCongTY());
			ps.setString(6, dung.getEmail());
			if(ps.executeUpdate()>0){
				System.out.println("Update thanh cong");
				return true;
			}
		} catch (SQLException e) {
			e.toString();
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

	public ArrayList<NhaTuyenDung> getlistNhaTuyenDung(String ten) {
		ArrayList<NhaTuyenDung> listUngVien = new ArrayList<>();
		
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_NhaTuyenDung where TenNhaTuyenDung like '%"+ten+"%'";
		NhaTuyenDung ntd=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ntd = new NhaTuyenDung(rs.getString("TenNhaTuyenDung"), rs.getString("SoDienThoai")
						, rs.getString("Email"), rs.getString("DiaChi"), rs.getString("Website"), rs.getString("TenCongTY"));
				listUngVien.add(ntd);
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
		return listUngVien;
	}
	public void xoaNhaTuyenDung(String email) {
		// TODO Auto-generated method stub
		ConnectData.connection=ConnectData.getconnect();
		String sql = String.format("delete from tb_NhaTuyenDung where Email='"+email+"'");
		try {
			Statement tm = ConnectData.connection.createStatement();
			int rs = tm.executeUpdate(sql);
			if(rs != 0){
				System.out.println("Xoa Thanh Cong");
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
	}
	public int getSoLuongNhaTuyenDung() {
		// TODO Auto-generated method stub
		int x = 0 ;
			ConnectData.connection=ConnectData.getconnect();
			String sql="select count(*) as SoLuong from tb_NhaTuyenDung";
			try {
				Statement stm = ConnectData.connection.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				while(rs.next()){
					x = rs.getInt("SoLuong");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return x;
	}
	
	public ArrayList<NhaTuyenDung> getlistNhaTuyenDung() {
		// TODO Auto-generated method stub
		ArrayList<NhaTuyenDung> listUngVien = new ArrayList<>();
		
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_NhaTuyenDung ";
		NhaTuyenDung ntd=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ntd = new NhaTuyenDung(rs.getString("TenNhaTuyenDung"), rs.getString("SoDienThoai")
						, rs.getString("Email"), rs.getString("DiaChi"), rs.getString("Website"), rs.getString("TenCongTY"),
						rs.getString("MatKhau"));
				listUngVien.add(ntd);
				System.out.println("daqua1 Dao");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listUngVien;
	}
}
