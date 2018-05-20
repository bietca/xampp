package model.dao.ungvien;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.ungvien.ThuUngTuyenNhanh;
import model.bean.ungvien.UngVien;
import model.dao.admin.ConnectData;

public class UngVienDAO {

	/**
	 * Them Unh Vien
	 * @param email
	 * @param matKhau
	 * @return
	 */
	public boolean themUngVien(String email, String matKhau) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Insert into tb_UngVien(Email,MatKhau) values(?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, matKhau);
			if(ps.executeUpdate()>0){
				return true;
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
		return false;
	}
	/**
	 * Kiem tra Email Da ton tai chua adgasg
	 * @param email
	 * @return
	 */
	public boolean ktEmailUngVien(String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select  * from tb_UngVien Where Email='"+email+"'";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}
	/**
	 * Kiem tra dang nhap he thong
	 * @param tenDangNhap
	 * @param matKhau
	 * @return
	 */
	public boolean kiemtraDangNhap(String tenDangNhap, String matKhau) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select  * from tb_UngVien Where Email='"+tenDangNhap+"' and MatKhau='"+matKhau+"'";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	/**
	 * Bao danh ung tuyen cho nha tuyen dung muon ung tuyen
	 * @param tuyenNhanh
	 * @return
	 */
	public boolean themThuUngTuyen(ThuUngTuyenNhanh tuyenNhanh) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Insert into tb_ThuUngTuyen values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1, tuyenNhanh.getEmailNhaTuyenDung());
			ps.setString(2, tuyenNhanh.getEmaiNguoiTimViec());
			ps.setInt(3, tuyenNhanh.getMaBaiTuyenDung());
			ps.setInt(4, tuyenNhanh.getMaCV());
			ps.setString(5, tuyenNhanh.getTieuDe());
			ps.setString(6, tuyenNhanh.getNoiDung());
			ps.setString(7, tuyenNhanh.getNgayUngTuyen());
			ps.setInt(8, tuyenNhanh.getTrangThai());
			if(ps.executeUpdate()>0){
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				ConnectData.connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	/**
	 * lay thong tin ung vien theo email
	 * @param email
	 * @return
	 */
	public UngVien getUngVienID(String email){
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_UngVien where EMail='"+email+"'";
		UngVien ungVien=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ungVien=new UngVien(rs.getString("TenNguoiDung"), rs.getString("NgaySinh"),
						rs.getString("GioiTinh"), rs.getString("SoDienThoai"), rs.getString("QueQuan"),
						rs.getString("Email"),rs.getString("matKhau"));
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
		
		
		return ungVien;
	}
	/**
	 * danh sach thu gui ung tuyen
	 * @param email
	 * @return
	 */
	public ArrayList<ThuUngTuyenNhanh> getListThuGuiUngTuyen(String email){
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuUngTuyen where EmailNhaTuyenDung='"+email+"'";
		ArrayList<ThuUngTuyenNhanh> litsThu=new ArrayList<>();
		ThuUngTuyenNhanh thuUngTuyenNhanh=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				thuUngTuyenNhanh=new ThuUngTuyenNhanh(rs.getInt("MaThuUngTuyen"),
						rs.getString("EmailNhaTuyenDung"), rs.getString("EmaiNguoiTimViec"),
						rs.getInt("MaBaiTuyenDung"), rs.getInt("MaCV"),rs.getString("TieuDe"), 
						rs.getString("NoiDung"), rs.getString("NgayUngTuyen"),rs.getInt("TrangThai"));
				litsThu.add(thuUngTuyenNhanh);
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
		return litsThu;
	}
	/**
	 * Lay alll danh sach ho so ung tuyen da xem hoac chua xem cho nha tuyen dung
	 * @param email
	 * @param trangthai
	 * @return
	 */
	public ArrayList<ThuUngTuyenNhanh> getListThuGuiUngTuyenTrangthai(String email,int trangthai){
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuUngTuyen where EmailNhaTuyenDung='"+email+"' and TrangThai='"+trangthai+"'";
		ArrayList<ThuUngTuyenNhanh> litsThu=new ArrayList<>();
		ThuUngTuyenNhanh thuUngTuyenNhanh=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				thuUngTuyenNhanh=new ThuUngTuyenNhanh(rs.getInt("MaThuUngTuyen"),
						rs.getString("EmailNhaTuyenDung"), rs.getString("EmaiNguoiTimViec"),
						rs.getInt("MaBaiTuyenDung"), rs.getInt("MaCV"),rs.getString("TieuDe"), 
						rs.getString("NoiDung"), rs.getString("NgayUngTuyen"),rs.getInt("TrangThai"));
				litsThu.add(thuUngTuyenNhanh);
			}
			thuUngTuyenNhanh.toString();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {  
			}
		}
		return litsThu;
	}
	/**
	 * ung vien get ho so da ung tuyen
	 * @param email
	 * @return
	 */
	public ArrayList<ThuUngTuyenNhanh> getListThuDaUngTuyen(String email){
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuUngTuyen where EmaiNguoiTimViec='"+email+"'";
		ArrayList<ThuUngTuyenNhanh> litsThu=new ArrayList<>();
		ThuUngTuyenNhanh thuUngTuyenNhanh=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				thuUngTuyenNhanh=new ThuUngTuyenNhanh(
						rs.getString("EmailNhaTuyenDung"), rs.getString("EmaiNguoiTimViec"),
						rs.getInt("MaBaiTuyenDung"), rs.getInt("MaCV"),rs.getString("TieuDe"), 
						rs.getString("NoiDung"), rs.getString("NgayUngTuyen"),rs.getInt("TrangThai"));
				litsThu.add(thuUngTuyenNhanh);
			}
			//
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {
				
			}
		}
		return litsThu;
	}
	/**
	 * kiem tra thu da ung tuyen co trung lap khong
	 * @param nhanh
	 * @return
	 */
	public boolean kiemTraThuUngTuyen(ThuUngTuyenNhanh nhanh) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuUngTuyen where EmailNhaTuyenDung=? and MaBaiTuyenDung=? and Macv=?";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1, nhanh.getEmailNhaTuyenDung());
			ps.setInt(2, nhanh.getMaBaiTuyenDung());
			ps.setInt(3, nhanh.getMaCV());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
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
	 * Sua Thong tin ung vien
	 * @param ungVien
	 * @return
	 */
	public boolean suaUngVien(UngVien ungVien) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="update tb_UngVien set TenNguoiDung=?,NgaySinh=?,GioiTinh=? ,SoDienThoai=?,QueQuan=? where Email=?";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1, ungVien.getTenNguoiDung());
			ps.setString(2, ungVien.getNgaySinh());
			ps.setString(3, ungVien.getGioiTinh());
			ps.setString(4, ungVien.getSoDienThoai());
			ps.setString(5, ungVien.getQueQuan());
			ps.setString(6, ungVien.getEmail());
			if(ps.executeUpdate()>0){
				return true;
			}
			//
		} catch (SQLException e) {
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
	 * Xoa thong tin ung vien
	 * @param email
	 */
	public void xoaUngVien(String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql = String.format("delete from tb_UngVien where Email='"+email+"'");
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
				// TODO: handle exception
			}
		}
	}
	/**
	 * Get All Danh Sach Ung VIen
	 * @return
	 */
	public ArrayList<UngVien> getlistUngVienID() {
		ConnectData.connection=ConnectData.getconnect();
		ArrayList<UngVien> listUngVien = new ArrayList<>();
		String sql="Select * from tb_UngVien ";
		UngVien ungVien=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ungVien=new UngVien(rs.getString("TenNguoiDung"), rs.getString("NgaySinh"),
						rs.getString("GioiTinh"), rs.getString("SoDienThoai"), rs.getString("QueQuan"),
						rs.getString("Email"),rs.getString("MatKhau"));
				System.out.println(ungVien.toString());
				listUngVien.add(ungVien);
			}
			System.out.println(ungVien.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return listUngVien;
	}
	public int gegetSoLuongUngVien() {
		// TODO Auto-generated method stub
		int x = 0 ;
			ConnectData.connection=ConnectData.getconnect();
			String sql="select count(*) as SoLuong from tb_UngVien";
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
			finally {
				try {
					ConnectData.connection.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		return x;
	}
	public ArrayList<UngVien> getlistUngVienID(String email) {
		// TODO Auto-generated method stub
		
		ConnectData.connection=ConnectData.getconnect();
		ArrayList<UngVien> listUngVien = new ArrayList<>();
		String sql="Select * from tb_UngVien where Email = '"+email+"'";
		UngVien ungVien=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ungVien=new UngVien(rs.getString("TenNguoiDung"), rs.getString("NgaySinh"),
						rs.getString("GioiTinh"), rs.getString("SoDienThoai"), rs.getString("QueQuan"),
						rs.getString("Email"));
				listUngVien.add(ungVien);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listUngVien;
		}
}
	
