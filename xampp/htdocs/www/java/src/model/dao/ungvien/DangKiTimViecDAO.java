package model.dao.ungvien;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.ungvien.DangKiTimViec;
import model.dao.admin.ConnectData;

public class DangKiTimViecDAO {
   /**
    * Them dang ki tim viec
    * @param kiTimViec
    * @return
    */
	public boolean themDangKiTimViec(DangKiTimViec kiTimViec) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="insert into tb_DangKiTimViec values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1, kiTimViec.getEmail());
			ps.setString(2,kiTimViec.getChuyenNganh());
			ps.setString(3,kiTimViec.getNoiLamViec());
			ps.setString(4, kiTimViec.getLoaiCongViec());
			ps.setString(5, kiTimViec.getCapBac());
			ps.setString(6,kiTimViec.getLuong());
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
     * Kiem tra email da ton tai trong csdl chưa
     * @param email
     * @return
     */
	public boolean kiemtraTonTai(String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_UngVien where Email='"+email+"'";
		ResultSet rs=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("Email dang ki da tom tai");
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
     * Thực hiện sua thong tin tim viec
     * @param kiTimViec
     * @return
     */
	public boolean suaDangKiTimViec(DangKiTimViec kiTimViec) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Update tb_DangKiTimViec set ChuyenNganh=?,NoiLamViec=?,LoaiCongViec=?,CapBac=?,Luong=? where Email=?";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ps.setString(1, kiTimViec.getChuyenNganh());
			ps.setString(2,kiTimViec.getNoiLamViec() );
			ps.setString(3,kiTimViec.getLoaiCongViec());
			ps.setString(4,kiTimViec.getCapBac());
			ps.setString(5,kiTimViec.getLuong());
			ps.setString(6, kiTimViec.getEmail());
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
     * Kiem tra tai khoan da dang ki tim viec trước đó chưa
     * @param email
     * @return
     */
	public boolean kiemtraTonTaiTrongDK(String email) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_DangKiTimViec where Email='"+email+"'";
		ResultSet rs=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			rs=ps.executeQuery();
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
    * 
    * Get top bai tuyen dung theo ung yeu dang ki tim viec
    * @param kiTimViec
    * @return
    */
	public ArrayList<BaiTuyenDung1> getTop10BTDTheoDangKi(DangKiTimViec kiTimViec) {
		System.out.println("sql: "+kiTimViec.getCapBac());
		String sql="select  distinct  top 10 t1.MaBaiViet ,t1.TieuDe,t9.MoTaNganh, t3.MoTaNoiLamViec, t1.SoLuongCanTuyen, t5.TenLoaiCongViec,t8.TenLuong,t1.HanNopHoSo , t1.LuotXem  ,t1.NgayDang "
				+ " from tb_BaituyenDung1 t1   inner join tb_MoTaNganh t9 on t1.MaBaiViet=t9.MaBaiViet   inner join tb_TuyenDung_Nganh t2  on t1.MaBaiViet=t2.MaBaiViet inner join tb_MoTaNoiLamViec t3 "
				+ "on t1.MaBaiViet=t3.MaBaiViet   inner join tb_TuyenDung_NoiLamViec t10 on t1.MaBaiViet=t10.MaBaiViet   inner join tb_CapBac t4 on t1.CapBac=t4.MaCapBac  inner join tb_LoaiCongViec t5"
				+ "  on t1.LoaiHinhLamViec=t5.MaLoaiCongViec inner join tb_KinhNghiem t6   "
				+ " on t1.Kinhghiem=t6.MaKinhNghiem inner join tb_KiNang  t7 on t1.KiNang=t7.MaKiNang    "
				+ "or t1.KiNang1=t7.MaKiNang  or t1.KiNang2=t7.MaKiNang inner join tb_Luong t8 on t1.Luong=t8.MaLuong"
				+ " where  t2.MaNganh = '"+kiTimViec.getChuyenNganh()+" '  and   t10.MaNoiLamViec='"+kiTimViec.getNoiLamViec()+" '"
				+ " and   CapBac = '"+kiTimViec.getCapBac()+" '  and   LoaiHinhLamViec = '"+kiTimViec.getLoaiCongViec()+" '  and   luong = '"+kiTimViec.getLuong()+"' and t1.PheDuyet='1' ORDER BY  t1.NgayDang  DESC";
		System.out.println("sql: "+sql);
		ConnectData.connection=ConnectData.getconnect();
		ArrayList<BaiTuyenDung1> listBaiTuyen=new ArrayList<>();
		ResultSet rs=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()){
				BaiTuyenDung1 baiTuyenDung1=new BaiTuyenDung1(
						rs.getInt("MaBaiViet"),
						rs.getString("TieuDe"),
						rs.getString("MoTaNoiLamViec"),
						rs.getInt("SoLuongCanTuyen"),
						rs.getString("TenLoaiCongViec"), 
						rs.getString("TenLuong"), 
						rs.getString("HanNopHoSo"), 
						rs.getInt("LuotXem"),
						rs.getString("NgayDang"));
				listBaiTuyen.add(baiTuyenDung1);
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
		return listBaiTuyen;
	}
	/**
	 * Get thong tin dang ki tim viec
	 * @param email
	 * @return
	 */
	public DangKiTimViec getDangKiTimViecID(String email){
		ConnectData.connection=ConnectData.getconnect();
		String sql="select * from tb_DangKiTimViec where Email='"+email+"'";
		DangKiTimViec dangKiTimViec=null;
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				dangKiTimViec=new DangKiTimViec(
						rs.getInt("MaTimViec"), 
						rs.getString("Email"),
					    rs.getString("ChuyenNganh"), 
						rs.getString("NoiLamViec"), 
						rs.getString("LoaiCongViec"),
						rs.getString("CapBac"), 
						rs.getString("Luong"));
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
		return dangKiTimViec;
	}
}
