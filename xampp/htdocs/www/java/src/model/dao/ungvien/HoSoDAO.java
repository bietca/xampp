package model.dao.ungvien;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.bean.ungvien.HoSo;
import model.dao.admin.ConnectData;

public class HoSoDAO {
	/**
	 * Them Ho so Ung vien
	 * @param hoSo
	 * @return
	 */
	public boolean themHoSo(HoSo hoSo) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Insert into tb_HoSo values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1,hoSo.getAnh());
			ps.setString(2,hoSo.getHoTen());
			ps.setString(3,hoSo.getSoDienThoai());
			ps.setString(4,hoSo.getEmail());
			ps.setString(5,hoSo.getNgaySinh());
			ps.setString(6,hoSo.getDiaChi());
			ps.setString(7,hoSo.getHocVan());
			ps.setString(8,hoSo.getChuyenNganh());
			ps.setString(9,hoSo.getMucTieuCongViec());
			ps.setString(10,hoSo.getKinhNghiepLamViec());
			ps.setString(11,hoSo.getHoatDong());
			ps.setString(12,hoSo.getChucChi());
			ps.setString(13,hoSo.getKiNang());
			ps.setString(14,hoSo.getSoThich());
			ps.setInt(15,hoSo.getKhoa());
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
	 * Lay ho so theo ID
	 * @param email
	 * @return
	 */
	public ArrayList<HoSo> getListHoSoID(String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql ="select * from tb_HoSo where Email='"+email+"'";
		ArrayList<HoSo> listHoSO=new ArrayList<>();
		HoSo hoSo=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				hoSo=new HoSo(rs.getInt("MaCV"),
						rs.getString("Anh"), 
						rs.getString("HoTen"), 
						rs.getString("SoDienThoai"), 
						rs.getString("Email"), 
						rs.getString("NgaySinh"), 
						rs.getString("DiaChi"), 
						rs.getString("HocVan"), 
						rs.getString("ChuyenNganh"), 
						rs.getString("MucTieuCongViec"), 
						rs.getString("KinhNghiem"),
						rs.getString("HoatDong"), 
						rs.getString("ChucChi"), 
						rs.getString("KiNang"),
						rs.getString("SoThich"), 
						rs.getInt("Khoa"));
				listHoSO.add(hoSo);
				System.out.println(hoSo.toString());
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
		return listHoSO;
	}
	/**
	 *  lay mot danh sach ho so
	 * @param string
	 * @param email
	 * @return
	 */
	public HoSo getListHoSoMaHoSo(String string ,String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql ="select * from tb_HoSo where Macv='"+string+"' and Email='"+email+"'";
		HoSo hoSo1=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("Da XEm CHi Teit tap");
				hoSo1=new HoSo(rs.getInt("MaCV"),
						rs.getString("Anh"), 
						rs.getString("HoTen"), 
						rs.getString("SoDienThoai"), 
						rs.getString("Email"), 
						rs.getString("NgaySinh"), 
						rs.getString("DiaChi"), 
						rs.getString("HocVan"), 
						rs.getString("ChuyenNganh"), 
						rs.getString("MucTieuCongViec"), 
						rs.getString("KinhNghiem"),
						rs.getString("HoatDong"), 
						rs.getString("ChucChi"), 
						rs.getString("KiNang"),
						rs.getString("SoThich"), 
						rs.getInt("Khoa"));
				
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
		return hoSo1;
	}
	/**
	 * Get List Danh sach ma CV
	 * @param maCV
	 * @return
	 */
	public HoSo getListHoSoMaHoSoMacv(int maCV) {
		ConnectData.connection=ConnectData.getconnect();
		String sql ="select * from tb_HoSo where Macv='"+maCV+"'";
		HoSo hoSo1=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("Da XEm CHi Teit tap");
				String sodt="";
				sodt=rs.getString("SoDienThoai").trim();
				hoSo1=new HoSo(
						rs.getInt("MaCV"),
						rs.getString("Anh"), 
						rs.getString("HoTen"), 
						sodt, 
						rs.getString("Email"), 
						rs.getString("NgaySinh"), 
						rs.getString("DiaChi"), 
						rs.getString("HocVan"), 
						rs.getString("ChuyenNganh"), 
						rs.getString("MucTieuCongViec"), 
						rs.getString("KinhNghiem"),
						rs.getString("HoatDong"), 
						rs.getString("ChucChi"), 
						rs.getString("KiNang"),
						rs.getString("SoThich"), 
						rs.getInt("Khoa"));
				
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
		return hoSo1;
	}
	/**
	 * Xoa ho So
	 * @param maCV
	 * @return
	 */
	public boolean xoaHoSo(String email,int maCV) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="delete from tb_HoSo where email='"+email+"' and MaCV='"+maCV+"'";
		
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
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
	 * Sua ho so ung tuyen
	 * @param hoSo
	 * @return
	 */
	public boolean suaHoSo(HoSo hoSo) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="update tb_HoSo set Anh=?,HoTen=?,SoDienThoai=?,NgaySinh=?,DiaChi=?,HocVan=?,ChuyenNganh=?,MucTieuCongViec=?,"
				+ "KinhNghiem=?,HoatDong=?,ChucChi=?,KiNang=?,SoThich=? where MaCV=?";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1,hoSo.getAnh());
			ps.setString(2,hoSo.getHoTen());
			ps.setString(3,hoSo.getSoDienThoai());
			ps.setString(4,hoSo.getNgaySinh());
			ps.setString(5,hoSo.getDiaChi());
			ps.setString(6,hoSo.getHocVan());
			ps.setString(7,hoSo.getChuyenNganh());
			ps.setString(8,hoSo.getMucTieuCongViec());
			ps.setString(9,hoSo.getKinhNghiepLamViec());
			ps.setString(10,hoSo.getHoatDong());
			ps.setString(11,hoSo.getChucChi());
			ps.setString(12,hoSo.getKiNang());
			ps.setString(13,hoSo.getSoThich());
			ps.setInt(14,hoSo.getMaCV());
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

}
