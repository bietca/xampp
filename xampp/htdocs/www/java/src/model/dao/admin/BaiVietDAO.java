package model.dao.admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.admin.BaiViet;




public class BaiVietDAO {

	public ArrayList<BaiViet> getlistquanliBaiViet() {
		ConnectData.connection = ConnectData.getconnect();
		String sql ="SELECT MaBaiViet,TieuDe,GioiThieuCty,SoDienThoai,MotaCongViec,Email,PheDuyet from tb_BaiTuyenDung1 ";
		ResultSet rs=null;
		Statement stmt=null;
		try {
			stmt=ConnectData.connection.createStatement();
			rs=stmt.executeQuery(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<BaiViet>list =new ArrayList<>();
		BaiViet baiViet=null;
		try {
			while(rs.next()){
				baiViet =new BaiViet();
				baiViet.setMaBaiViet(rs.getInt("maBaiViet"));
				baiViet.setTieuDe(rs.getString("tieuDe"));
				baiViet.setGioiThieuCty(rs.getString("gioiThieuCty"));
				baiViet.setSoDienThoai(rs.getString("soDienThoai"));
				baiViet.setMotaCongViec(rs.getString("motaCongViec"));
				baiViet.setYeuCauUngVien(rs.getString("Email"));
				baiViet.setPheDuyet(rs.getInt("pheDuyet"));
				list.add(baiViet);
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		return list;
	}

	public void xoaBaiViet(int maBaiViet) {
		ConnectData.connection = ConnectData.getconnect();
		String sql=	String.format("DELETE FROM tb_BaiTuyenDung1 WHERE MaBaiViet = '%s'", maBaiViet);
		System.out.println(sql);
		Statement stmt=null;
		try {
			 stmt = ConnectData.connection.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public BaiViet getThongTinBaiViet(int maBaiViet) {
		
		ConnectData.connection = ConnectData.getconnect();
		String sql=	String.format("select MaBaiViet,TieuDe,GioiThieuCty,SoDienThoai,MotaCongViec,YeuCauUngVien,PheDuyet"+
				" FROM tb_BaiTuyenDung1 WHERE MaBaiViet = '%s'", maBaiViet);
	ResultSet rs = null;
	Statement stmt=null;
	try {
		 stmt= ConnectData.connection.createStatement();
		rs = stmt.executeQuery(sql);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	BaiViet baiViet =null;
	try {
		while(rs.next()){
			baiViet = new BaiViet();
			baiViet.setMaBaiViet(rs.getInt("maBaiViet"));
			baiViet.setTieuDe(rs.getString("tieuDe"));
			baiViet.setGioiThieuCty(rs.getString("gioiThieuCty"));
			baiViet.setSoDienThoai(rs.getString("soDienThoai"));
			baiViet.setMotaCongViec(rs.getString("motaCongViec"));
			baiViet.setYeuCauUngVien(rs.getString("yeuCauUngVien"));
			baiViet.setPheDuyet(rs.getInt("pheDuyet"));

		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return baiViet;
	}

	public ArrayList<BaiViet> getlistpheDuyetBaiViet(int pheDuyet) {
		ConnectData.connection = ConnectData.getconnect();
		String sql=	String.format("select MaBaiViet,TieuDe,GioiThieuCty,SoDienThoai,MotaCongViec,Email,k.PheDuyet"+
				" FROM tb_BaiTuyenDung1 k INNER JOIN tb_PheDuyet p ON k.PheDuyet=p.PheDuyet WHERE k.PheDuyet ='"+pheDuyet+"'");
		ResultSet rs = null;
		try {
			Statement stmt = ConnectData.connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ArrayList<BaiViet>list =new ArrayList<>();
		BaiViet baiViet=null;
		try {
			while(rs.next()){
				baiViet =new BaiViet();
				baiViet.setMaBaiViet(rs.getInt("maBaiViet"));
				baiViet.setTieuDe(rs.getString("tieuDe"));
				baiViet.setGioiThieuCty(rs.getString("gioiThieuCty"));
				baiViet.setSoDienThoai(rs.getString("soDienThoai"));
				baiViet.setMotaCongViec(rs.getString("MotaCongViec"));
				baiViet.setYeuCauUngVien(rs.getString("Email"));
				baiViet.setPheDuyet(rs.getInt("pheDuyet"));
				list.add(baiViet);
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		return list;
	}

	public void suaSinhVien(int maBaiViet,int trangthai) {
		ConnectData.connection = ConnectData.getconnect();
		String sql=	String.format("UPDATE tb_BaiTuyenDung1  SET PheDuyet ='"+trangthai+"' WHERE maBaiViet = '"+maBaiViet+"'");
		try {
			Statement stmt = ConnectData.connection.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	

}
