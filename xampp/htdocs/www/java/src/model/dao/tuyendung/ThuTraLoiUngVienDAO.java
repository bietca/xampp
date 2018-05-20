package model.dao.tuyendung;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.tuyendung.TraLoiThuUngVien;
import model.dao.admin.ConnectData;

public class ThuTraLoiUngVienDAO {
	/**
	 * Them Thu Nha Tuyen Dung
	 * @param thuUngVien 
	 * @return true neu them dung nguoc lai la sai
	 */
	public boolean traLoiThuUngTuyen(TraLoiThuUngVien thuUngVien) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="insert into tb_ThuCuaUngVien values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1,thuUngVien.getEmailNhaTuyenDung());
			ps.setString(2, thuUngVien.getEmailNguoiTimViec());
			ps.setString(3, thuUngVien.getTieuDe());
			ps.setString(4, thuUngVien.getNoiDung());
			ps.setString(5,thuUngVien.getNgayPhanHoi());
			ps.setInt(6, thuUngVien.getTrangThai());
			ps.setInt(7, thuUngVien.getTrangThai2());
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
	 * get ldanh sach thu ung tuyen nhanh hien thi tren gia dien nha tuyen dung
	 * @param email
	 * @return
	 */
	public ArrayList<TraLoiThuUngVien> getlistThuUngTuyenNhanh(String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuCuaUngVien where EmailNhaTuyenDung='"+email+"'";
		ArrayList<TraLoiThuUngVien> listTraloi=new ArrayList<>();
		TraLoiThuUngVien nhanh=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				nhanh=new TraLoiThuUngVien(rs.getInt("MaPhanHoi"),
						rs.getString("EmailNhaTuyenDung"), rs.getString("EmailNguoiTimViec"),
						rs.getString("TieuDe"), rs.getString("NoiDung"),
						rs.getString("NgayPhanHoi"),rs.getInt("TrangThai"),rs.getInt("TrangThai2"));
				listTraloi.add(nhanh);
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
		return listTraloi;
	}
	/**
	 * Get danh sach da nhan cua ung vien đe hien thi tren danh sach
	 * @param email
	 * @return
	 */
	public ArrayList<TraLoiThuUngVien> getlistThuUngVienDaNhan(String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuCuaUngVien where EmailNguoiTimViec='"+email+"'";
		ArrayList<TraLoiThuUngVien> listTraloi=new ArrayList<>();
		TraLoiThuUngVien nhanh=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				nhanh=new TraLoiThuUngVien(rs.getInt("MaPhanHoi"),
						rs.getString("EmailNhaTuyenDung"), rs.getString("EmailNguoiTimViec"),
						rs.getString("TieuDe"), rs.getString("NoiDung"),
						rs.getString("NgayPhanHoi"),rs.getInt("TrangThai"),rs.getInt("TrangThai2"));
				listTraloi.add(nhanh);
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
		return listTraloi;
	}
	/**
	 * get thu tra loi theo ID
	 * @param maPhanHoi
	 * @return
	 */
	public TraLoiThuUngVien getTraLoiThuUngVienID(int maPhanHoi) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuCuaUngVien where MaPhanHoi='"+maPhanHoi+"'";		
		TraLoiThuUngVien nhanh=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				nhanh=new TraLoiThuUngVien(rs.getInt("MaPhanHoi"),
						rs.getString("EmailNhaTuyenDung"), rs.getString("EmailNguoiTimViec"),
						rs.getString("TieuDe"), rs.getString("NoiDung"),
						rs.getString("NgayPhanHoi"),rs.getInt("TrangThai"),rs.getInt("TrangThai2"));
				
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
		return nhanh;
	}
	
	/**
	 * Ung vien tra loi thu nha tuyen dung
	 * @param thuUngVien 
	 * @return true neu them dung nguoc lai la sai
	 */
	public boolean traLoiThuNhaTuyenDung(TraLoiThuUngVien thuUngVien) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="insert into tb_ThuCuaNhaTuyenDung values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1, thuUngVien.getEmailNguoiTimViec());
			ps.setString(2,thuUngVien.getEmailNhaTuyenDung());
			ps.setString(3, thuUngVien.getTieuDe());
			ps.setString(4, thuUngVien.getNoiDung());
			ps.setString(5,thuUngVien.getNgayPhanHoi());
			ps.setInt(6, thuUngVien.getTrangThai());
			ps.setInt(7, thuUngVien.getTrangThai2());
			if(ps.executeUpdate()>0){
				return true;
			}
			//ConnectData.connection.close();
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
 * Get list dahs ach thu da gui
 * @param email
 * @return
 */
	public ArrayList<TraLoiThuUngVien> getListThuUngTuyenDaGui(String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_ThuCuaNhaTuyenDung where EmailNguoiTimViec='"+email+"'";
		ArrayList<TraLoiThuUngVien> listDs=new ArrayList<>();
		TraLoiThuUngVien thuUngVien=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				thuUngVien=new TraLoiThuUngVien(rs.getInt("MaPhanHoi"),
						rs.getString("EmailNguoiTimViec"), 
						rs.getString("EmailNhaTuyenDung"), 
						rs.getString("TieuDe"),rs.getString("NoiDung") ,
						rs.getString("NgayPhanHoi"), rs.getInt("TrangThai"),rs.getInt("TrangThai2"));
				listDs.add(thuUngVien);
			}
			//ConnectData.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {
			}
		}
		return listDs;
	}
	/**
	 * lay ddanh sach thu nha tuyen dung da gui
	 * @param maPhaHoi
	 * @return
	 */
	public TraLoiThuUngVien getThuDaGui(int maPhaHoi) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuCuaNhaTuyenDung where MaPhanHoi='"+maPhaHoi+"'";		
		TraLoiThuUngVien nhanh=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				nhanh=new TraLoiThuUngVien(rs.getInt("MaPhanHoi"),
						rs.getString("EmailNhaTuyenDung"), rs.getString("EmailNguoiTimViec"),
						rs.getString("TieuDe"), rs.getString("NoiDung"),
						rs.getString("NgayPhanHoi"),rs.getInt("TrangThai"),rs.getInt("TrangThai2"));
				
			}
			//ConnectData.connection.close();
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
		return nhanh;
	}
	public TraLoiThuUngVien getThuDaGui1(int maPhaHoi) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuCuaNhaTuyenDung where MaPhanHoi='"+maPhaHoi+"'";		
		TraLoiThuUngVien nhanh=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				nhanh=new TraLoiThuUngVien(rs.getInt("MaPhanHoi"),
						rs.getString("EmailNhaTuyenDung"), rs.getString("EmailNguoiTimViec"),
						rs.getString("TieuDe"), rs.getString("NoiDung"),
						rs.getString("NgayPhanHoi"),rs.getInt("TrangThai"),rs.getInt("TrangThai2"));
				
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
		return nhanh;
	}
	/**
	 * lay danh sach thu nha tuyen dung da nhan
	 * @param email
	 * @return
	 */
	public ArrayList<TraLoiThuUngVien> getThuNhaTuyenDungNhan(String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Select * from tb_ThuCuaNhaTuyenDung where EmailNhaTuyenDung='"+email+"'";
		//String sql="Select * from tb_ThuCuaNhaTuyenDung ";
		ArrayList<TraLoiThuUngVien> listDs=new ArrayList<>();
		TraLoiThuUngVien thuUngVien=null;
		ResultSet rs=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			 rs=ps.executeQuery();
			while(rs.next()){
				thuUngVien=new TraLoiThuUngVien(rs.getInt("MaPhanHoi"),
						rs.getString("EmailNhaTuyenDung"), 
						rs.getString("EmailNguoiTimViec"), 
						rs.getString("TieuDe"),rs.getString("NoiDung") ,
						rs.getString("NgayPhanHoi"), rs.getInt("TrangThai"),rs.getInt("TrangThai2"));
				listDs.add(thuUngVien);
			}
		//	ConnectData.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listDs;
	}
	/**
	 * Loc thu ung vien teo tung trang thai (All, chua xem ,daxem)
	 * @param email
	 * @param trangthai
	 * @return
	 */
	public ArrayList<TraLoiThuUngVien> getlistTLocThuUngVien(String email, int trangthai) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuCuaUngVien where EmailNguoiTimViec='"+email+"' and TrangThai='"+trangthai+"'";
		ArrayList<TraLoiThuUngVien> listTraloi=new ArrayList<>();
		TraLoiThuUngVien nhanh=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				nhanh=new TraLoiThuUngVien(rs.getInt("MaPhanHoi"),
						rs.getString("EmailNhaTuyenDung"), rs.getString("EmailNguoiTimViec"),
						rs.getString("TieuDe"), rs.getString("NoiDung"),
						rs.getString("NgayPhanHoi"),rs.getInt("TrangThai"),rs.getInt("TrangThai2"));
				listTraloi.add(nhanh);
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
		return listTraloi;
	}
	/**
	 * Cap nhat trang thau khi ung vien xem thu
	 * @param maPhanHoi
	 */
	public void thayDoiTrangThaiThu(int maPhanHoi) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="update tb_ThuCuaUngVien set TrangThai=1";
		PreparedStatement ps;
		try {
			ps = ConnectData.connection.prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {
			}
		}
		
	}
	/**
	 * loc thu nha tuyeen dung theo trang thai thu all ,xxem chua xem)
	 * @param email
	 * @param trangthai
	 * @return
	 */
	public ArrayList<TraLoiThuUngVien> getlistTLocThuNhatuyenDung(String email, int trangthai) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_ThuCuaNhaTuyenDung where EmailNhaTuyenDung='"+email+"' and TrangThai2='"+trangthai+"'";
		ArrayList<TraLoiThuUngVien> listTraloi=new ArrayList<>();
		TraLoiThuUngVien nhanh=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				nhanh=new TraLoiThuUngVien(rs.getInt("MaPhanHoi"),
						rs.getString("EmailNhaTuyenDung"), rs.getString("EmailNguoiTimViec"),
						rs.getString("TieuDe"), rs.getString("NoiDung"),
						rs.getString("NgayPhanHoi"),rs.getInt("TrangThai"),rs.getInt("TrangThai2"));
				listTraloi.add(nhanh);
			}
		///ConnectData.connection.close();
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
		return listTraloi;
	}
	/**
	 * thua doi trang thai thu khi mha tuyen dung xem thu
	 * @param maPhanHoi
	 */
	public void thayDoiTrangThaiThuNhaTuyenDung(int maPhanHoi) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="update tb_ThuCuaNhaTuyenDung set TrangThai2=1 where MaPhanHoi='"+maPhanHoi+"'";
		PreparedStatement ps;
		try {
			ps = ConnectData.connection.prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {
			}
		}
	}
	
}
