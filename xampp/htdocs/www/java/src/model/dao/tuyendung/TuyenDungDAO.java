package model.dao.tuyendung;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import model.bean.tuyendung.BaiTuyenDung1;
import model.bean.tuyendung.TimKiemLoc;
import model.bo.admin.PhanTrang;
import model.dao.admin.ConnectData;

public class TuyenDungDAO {
	/**
	 * Lay Bai Biet them ID
	 * 
	 * @param maBaiDang
	 * @return
	 */
	public BaiTuyenDung1 getListALLBaiTuyenDungID(int maBaiDang) {
		ConnectData.connection = ConnectData.getconnect();
	/*	String sql = "select * from tb_BaiTuyenDung1 where MaBaiViet='" + maBaiDang + "'";*/
		
		String sql="select t1.MaBaiViet ,t1.TieuDe,t2.MoTaNganh,t3.MoTaNoiLamViec,t1.SoLuongCanTuyen ,t1.SoDienThoai,t4.TenCapBac,t5.TenLoaiCongViec" 
				+",t1.GioiTinh,t6.TenKinhNghiem ,t8.TenLuong,t1.HanNopHoSo,t1.TenNguoiNhanHoSo,t1.Email,t1.SoDienThoai"
			+" ,t1.GioiThieuCty,t1.MotaCongViec,t1.YeuCauUngVien, t1.QuyenLoiUngVien,t7.MoTaKiNang,t1.LuotXem,t1.PheDuyet,t1.NgayDang  from tb_BaituyenDung1 t1 "
			+" inner join tb_MoTaNganh t2"
			+" on t1.MaBaiViet=t2.MaBaiViet "
			+" inner join tb_MoTaNoiLamViec t3 on t1.MaBaiViet=t3.MaBaiViet"
			+" inner join tb_CapBac t4 on t1.CapBac=t4.MaCapBac "
			+" inner join tb_LoaiCongViec t5 on t1.LoaiHinhLamViec=t5.MaLoaiCongViec"
			+" inner join tb_KinhNghiem t6 on t1.Kinhghiem=t6.MaKinhNghiem"
			+" inner join tb_MoTaKiNang  t7 on t1.MaBaiViet=t7.MaBaiViet"
			+" inner join tb_Luong t8 on t1.Luong=t8.MaLuong  where t1.MaBaiViet='" + maBaiDang + "'";

		BaiTuyenDung1 baiTuyenDung = null;
		try {
			PreparedStatement ps = ConnectData.connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				baiTuyenDung = new BaiTuyenDung1(
						rs.getInt("MaBaiViet"), 
						rs.getString("TieuDe"), 
						rs.getString("MoTaNganh"),
						rs.getString("MoTaNoiLamViec"),
						rs.getInt("SoLuongCanTuyen"), 
						rs.getString("TenCapBac"),
						rs.getString("TenLoaiCongViec"),
						rs.getString("GioiTinh"), 
						rs.getString("TenKinhNghiem"),
						rs.getString("TenLuong"),
						rs.getString("HanNopHoSo"),
						rs.getString("TenNguoiNhanHoSo"),
						rs.getString("Email"),
						rs.getString("SoDienThoai"),
						rs.getString("GioiThieuCty"),
						rs.getString("MotaCongViec"),
						rs.getString("YeuCauUngVien"), 
						rs.getString("QuyenLoiUngVien"),
						rs.getString("MoTaKiNang"),
						rs.getInt("LuotXem"), 
						rs.getInt("pheDuyet"),
						rs.getString("NgayDang"));
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
		return baiTuyenDung;
	}
	/**
	 * Tang Luoc xem
	 * 
	 * @param maBaiViet
	 */
	public void tangLuotXem(int maBaiViet) {
		ConnectData.connection = ConnectData.getconnect();
		String sql = "Update tb_BaiTuyenDung1 set LuotXem=LuotXem+1 where MaBaiViet='" + maBaiViet + "'";
		try {
			PreparedStatement ps = ConnectData.connection.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("Tang +1");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectData.connection.close();
			} catch (Exception e2) {
			}
		}
		
	}
	/**
	 * them tai khoan nha tuyen dung
	 * @param email
	 * @param matKhau
	 * @return
	 */
	public boolean themNhaTuyenDung(String email,String matKhau) {
		ConnectData.connection=ConnectData.getconnect();
		
		String sql="INSERT INTO tb_NhaTuyenDung(Email,MatKhau) VALUES(?,?) ";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);	
			ps.setString(1,email);
			ps.setString(2, matKhau);
			if(ps.executeUpdate()>0){
				return true;
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
		return false;
	}
	/**
	 * kiem tra email da ton tai
	 * @param email
	 * @return
	 */
	public boolean kiemTraEmail(String email) {
		ConnectData.connection=ConnectData.getconnect();
		
		String sql="select * from tb_NhaTuyenDung where Email='"+email+"'";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				return true;
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
		return false;
	}
	/**
	 * kiem tra dang nhap
	 * @param tenDangNhap
	 * @param matKhau
	 * @return
	 */
	public boolean kiemtraDangNhap(String tenDangNhap, String matKhau) {

		ConnectData.connection=ConnectData.getconnect();
		
		String sql="select * from tb_NhaTuyenDung where Email='"+tenDangNhap+"' and MatKhau='"+matKhau+"'";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql);			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				return true;
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
		return false;
	}
	/**
	 * get all bai tuyen dung theo emal nha quan tuyen dung
	 * @param email
	 * @return
	 */
	public ArrayList<BaiTuyenDung1> getListALLBaiTuyenDungEmail(String email) {
		ConnectData.connection = ConnectData.getconnect();
		String sql = "select * from tb_BaiTuyenDung1 where Email='"+email+"'";
		ArrayList<BaiTuyenDung1> lsUngVien = new ArrayList<>();
		BaiTuyenDung1 baiTuyenDung = null;
		try {
			PreparedStatement ps = ConnectData.connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				baiTuyenDung = new BaiTuyenDung1(rs.getInt("MaBaiViet"), rs.getString("TieuDe"), rs.getString("Nganh"),
						rs.getString("NoiLamViec"), rs.getInt("SoLuongCanTuyen"), rs.getString("CapBac"),
						rs.getString("LoaiHinhLamViec"), rs.getString("GioiTinh"), rs.getString("Kinhghiem"),
						rs.getString("Luong"), rs.getString("HanNopHoSo"), rs.getString("TenNguoiNhanHoSo"),
						rs.getString("Email"), rs.getString("SoDienThoai"), rs.getString("GioiThieuCty"),
						rs.getString("MotaCongViec"), rs.getString("YeuCauUngVien"), rs.getString("QuyenLoiUngVien"),
						rs.getString("KiNang"), rs.getInt("LuotXem"), rs.getInt("pheDuyet"),rs.getString("NgayDang"));
				lsUngVien.add(baiTuyenDung);
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
		return lsUngVien;
	}
	/**
	 * Them bai tuen dung
	 * @param baiTuyenDung1
	 * @return
	 */
	public boolean themBaiTuyenDung1(BaiTuyenDung1 baiTuyenDung1) {
		ConnectData.connection=ConnectData.getconnect();
		String sql="Insert into tb_BaiTuyenDung1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=ConnectData.connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,baiTuyenDung1.getTieuDe());
			ps.setString(2,baiTuyenDung1.getNganh());
			ps.setString(3,baiTuyenDung1.getNganh1());
			ps.setString(4,baiTuyenDung1.getNganh2());
			ps.setString(5,baiTuyenDung1.getNoiLamViec());
			ps.setString(6,baiTuyenDung1.getNoiLamViec1());
			ps.setString(7,baiTuyenDung1.getNoiLamViec2());
			ps.setInt(8,baiTuyenDung1.getSoLuongCanTuyen());
			ps.setString(9,baiTuyenDung1.getCapBac());
			ps.setString(10,baiTuyenDung1.getLoaiHinhLamViec());
			ps.setString(11,baiTuyenDung1.getGioiTinh());
			ps.setString(12,baiTuyenDung1.getKinhghiem());
			ps.setString(13,baiTuyenDung1.getLuong());
			ps.setString(14,baiTuyenDung1.getHanNopHoSo());
			ps.setString(15,baiTuyenDung1.getTenNguoiNhanHoSo());
			ps.setString(16,baiTuyenDung1.getEmail());
			ps.setString(17,baiTuyenDung1.getSoDienThoai());
			ps.setString(18,baiTuyenDung1.getGioiThieuCty());
			ps.setString(19,baiTuyenDung1.getMotaCongViec());
			ps.setString(20,baiTuyenDung1.getYeuCauUngVien());
			ps.setString(21,baiTuyenDung1.getQuyenLoiUngVien());
			ps.setString(22,baiTuyenDung1.getKyNang());
			ps.setString(23,baiTuyenDung1.getKyNang1());
			ps.setString(24,baiTuyenDung1.getKyNang2());
			ps.setInt(25,baiTuyenDung1.getLuotXem());
			ps.setInt(26,baiTuyenDung1.getPheDuyet());
			ps.setString(27,baiTuyenDung1.getNgayDang());	
			
			if(ps.executeUpdate()>0){				
				ResultSet generatedKeys = ps.getGeneratedKeys();
	            if (generatedKeys.next()) {
	                baiTuyenDung1.setMaBaiViet(generatedKeys.getInt(1)); 
	            }
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
	 * lay all bai tuyen dung va phan trang
	 * @param page
	 * @return
	 */
	public ArrayList<BaiTuyenDung1> getListALLBaiTuyenDung1PT(int page) {
		ConnectData.connection = ConnectData.getconnect();
		int totalItem = 0;
		int itemPerPage = 5;
		int totalPage = 0;
		int offset = page * itemPerPage;
		int feetchnext = page * itemPerPage + itemPerPage;

		String sql0 = "SELECT count(Email) as TotalItem FROM tb_BaiTuyenDung1 where PheDuyet='1'";
		ResultSet rs0 = null;
		try {
			Statement stmt0 = ConnectData.connection.createStatement();
			rs0 = stmt0.executeQuery(sql0);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			while (rs0.next()) {
				totalItem = rs0.getInt("TotalItem");
				totalPage = (int) Math.ceil(totalItem * 1.0 / itemPerPage);
				PhanTrang.soTrang = page;
				PhanTrang.tongTrang = totalPage;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "" + "SELECT * FROM" + " ("
				+ " SELECT ROW_NUMBER() OVER ( ORDER BY t1.MaBaiViet )  AS RowNum , t1.MaBaiViet, t1.TieuDe, t3.MoTaNganh, t2.MoTaNoiLamViec, SoLuongCanTuyen ,"
				+ " t5.TenLoaiCongViec, t8.TenLuong, HanNopHoSo, LuotXem ,NgayDang "
				+ " FROM tb_BaiTuyenDung1 t1 inner join tb_MoTaNoiLamViec t2 on t1.MaBaiViet=t2.MaBaiViet inner join tb_MoTaNganh t3 on t1.MaBaiViet=t3.MaBaiViet "
				+ "  inner join tb_LoaiCongViec t5 on t1.LoaiHinhLamViec=t5.MaLoaiCongViec "
				+ " inner join tb_Luong t8 on t1.Luong=t8.MaLuong  where t1.PheDuyet='1' )"
				+ " AS RowConstrainedResult " + " WHERE  RowNum > " + offset + " AND RowNum <= "
				+ feetchnext + "";
		ResultSet rs = null;
		try {
			Statement stmt = ConnectData.connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ArrayList<BaiTuyenDung1> list = new ArrayList<BaiTuyenDung1>();
		BaiTuyenDung1 baiTuyenDung;
		try {
			while (rs.next()) {
				baiTuyenDung=new BaiTuyenDung1(
						rs.getInt("MaBaiViet"),
						rs.getString("TieuDe"),
						rs.getString("MoTaNganh"),
						rs.getString("MoTaNoiLamViec"),
						rs.getInt("SoLuongCanTuyen"), 
						rs.getString("TenLoaiCongViec"), 
						rs.getString("TenLuong"), 
						rs.getString("HanNopHoSo"),
						rs.getInt("LuotXem"),
				        rs.getString("NgayDang"));
				list.add(baiTuyenDung);
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
		return list;
	}
	/**
	 * get to 10 bai tuyen dung thuc tap
	 * @return
	 */
	public ArrayList<BaiTuyenDung1> getListTop10BaiTHucTap() {
		
		String sql="select  distinct  top 10 t1.MaBaiViet ,t1.TieuDe,t2.MoTaNganh, t3.MoTaNoiLamViec, t1.SoLuongCanTuyen,t5.TenLoaiCongViec,t8.TenLuong,t1.HanNopHoSo , t1.LuotXem  ,t1.NgayDang "
                +" from tb_BaituyenDung1 t1  inner join tb_MoTaNganh t2 on t1.MaBaiViet=t2.MaBaiViet  inner join tb_MoTaNoiLamViec t3 on t1.MaBaiViet=t3.MaBaiViet "   
                +" inner join tb_CapBac t4 on t1.CapBac=t4.MaCapBac  inner join tb_LoaiCongViec t5 on t1.LoaiHinhLamViec=t5.MaLoaiCongViec inner join tb_KinhNghiem t6 "
                +"  on t1.Kinhghiem=t6.MaKinhNghiem inner join tb_KiNang  t7 on t1.KiNang=t7.MaKiNang"
                +"  or t1.KiNang1=t7.MaKiNang  or t1.KiNang2=t7.MaKiNang inner join tb_Luong t8 on t1.Luong=t8.MaLuong  "
                +" where  t1.LoaiHinhLamViec='3' and PheDuyet='1' ORDER BY t1.LuotXem DESC";
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
						rs.getString("MoTaNganh"),
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
			// TODO Auto-generated catch block
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
	public ArrayList<BaiTuyenDung1> getListTop10ToanThoiGian() {
		String sql="select  distinct  top 10 t1.MaBaiViet ,t1.TieuDe,t2.MoTaNganh, t3.MoTaNoiLamViec, t1.SoLuongCanTuyen,t5.TenLoaiCongViec,t8.TenLuong,t1.HanNopHoSo , t1.LuotXem  ,t1.NgayDang "
                +" from tb_BaituyenDung1 t1  inner join tb_MoTaNganh t2 on t1.MaBaiViet=t2.MaBaiViet  inner join tb_MoTaNoiLamViec t3 on t1.MaBaiViet=t3.MaBaiViet "   
                +" inner join tb_CapBac t4 on t1.CapBac=t4.MaCapBac  inner join tb_LoaiCongViec t5 on t1.LoaiHinhLamViec=t5.MaLoaiCongViec inner join tb_KinhNghiem t6 "
                +"  on t1.Kinhghiem=t6.MaKinhNghiem inner join tb_KiNang  t7 on t1.KiNang=t7.MaKiNang"
                +"  or t1.KiNang1=t7.MaKiNang  or t1.KiNang2=t7.MaKiNang inner join tb_Luong t8 on t1.Luong=t8.MaLuong  "
                +" where  t1.LoaiHinhLamViec='1' and PheDuyet='1' ORDER BY t1.LuotXem DESC";
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
						rs.getString("MoTaNganh"),
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
			// TODO Auto-generated catch block
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
	public ArrayList<BaiTuyenDung1> getListTop10BanThoiGian() {
		String sql="select  distinct  top 10 t1.MaBaiViet ,t1.TieuDe,t2.MoTaNganh, t3.MoTaNoiLamViec, t1.SoLuongCanTuyen,t5.TenLoaiCongViec,t8.TenLuong,t1.HanNopHoSo , t1.LuotXem  ,t1.NgayDang "
                +" from tb_BaituyenDung1 t1  inner join tb_MoTaNganh t2 on t1.MaBaiViet=t2.MaBaiViet  inner join tb_MoTaNoiLamViec t3 on t1.MaBaiViet=t3.MaBaiViet "   
                +" inner join tb_CapBac t4 on t1.CapBac=t4.MaCapBac  inner join tb_LoaiCongViec t5 on t1.LoaiHinhLamViec=t5.MaLoaiCongViec inner join tb_KinhNghiem t6 "
                +"  on t1.Kinhghiem=t6.MaKinhNghiem inner join tb_KiNang  t7 on t1.KiNang=t7.MaKiNang"
                +"  or t1.KiNang1=t7.MaKiNang  or t1.KiNang2=t7.MaKiNang inner join tb_Luong t8 on t1.Luong=t8.MaLuong  "
                +" where  t1.LoaiHinhLamViec='2' and PheDuyet='1' ORDER BY t1.LuotXem DESC";
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
						rs.getString("MoTaNganh"),
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
			// TODO Auto-generated catch block
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
	 * Xoa Bai Tuyen Dung them email va mabaiveit
	 * @param email
	 * @param mabai
	 * @return
	 */
	public boolean xoaBaiTuyenDUng(String email,int mabai) {
			ConnectData.connection=ConnectData.getconnect();
		
		String sql="delete from tb_BaiTuyenDung1 where Email='"+email+"' and  MaBaiViet='"+mabai+"' and PheDuyet=0";
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
	/*public BaiTuyenDung1 getBaiTuyenDung1ID(int maBaiViet) {
		ConnectData.connection=ConnectData.getconnect();
	//	String sql="select * from tb_BaiTuyenDung1 where MaBaiViet='"+maBaiViet+"' and "
		return null;
	}*/
	public ArrayList<BaiTuyenDung1> getTop10BaiTuyenDungMoi() {
		String sql="select  distinct  top 5 t1.MaBaiViet ,t1.TieuDe, t3.MoTaNoiLamViec, t1.SoLuongCanTuyen,t5.TenLoaiCongViec,t8.TenLuong,t1.HanNopHoSo , t1.LuotXem  ,t1.NgayDang "
                +" from tb_BaituyenDung1 t1  inner join tb_Nganh t2 on t1.Nganh=t2.MaNganh or t1.Nganh1=t2.MaNganh  or t1.Nganh2=t2.MaNganh  inner join tb_MoTaNoiLamViec t3 on t1.MaBaiViet=t3.MaBaiViet   " 
                +" inner join tb_CapBac t4 on t1.CapBac=t4.MaCapBac  inner join tb_LoaiCongViec t5 on t1.LoaiHinhLamViec=t5.MaLoaiCongViec inner join tb_KinhNghiem t6 "
                +" on t1.Kinhghiem=t6.MaKinhNghiem inner join tb_KiNang  t7 on t1.KiNang=t7.MaKiNang" 
                +" or t1.KiNang1=t7.MaKiNang  or t1.KiNang2=t7.MaKiNang inner join tb_Luong t8 on t1.Luong=t8.MaLuong where  PheDuyet='1' "
                +" ORDER BY  t1.NgayDang  DESC";
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
		// TODO Auto-generated catch block
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
    * Tim kiem bai tuyen dung
    * @param baiTuyenDung
    * @return
    */
public ArrayList<BaiTuyenDung1> timkiemLoc1(BaiTuyenDung1 baiTuyenDung) {
	ConnectData.connection = ConnectData.getconnect();
	String loc="";
	int dem=0;
	ResultSet rs=null;
	int len= baiTuyenDung.getNganh().length();
	System.out.println("Lengt nganh :"+len);
	
	if(!(baiTuyenDung.getNganh().length()==0)){
		if(dem==0)
			loc+=" where ";
		else 
			loc += " and  ";
		dem++;
		loc += " t2.MaNganh = '" +baiTuyenDung.getNganh()+ " ' ";

	}
	if(!(baiTuyenDung.getNoiLamViec().length()==0)){
		if(dem==0)
			loc+=" where ";
		else 
			loc += " and  ";
		dem++;
		loc+=" t10.MaNoiLamViec='" +baiTuyenDung.getNoiLamViec()+ " ' ";
	}
	if(!(baiTuyenDung.getKinhghiem().length()==0)){
			if(dem==0)
				loc+=" where ";
			else 
				loc += " and  ";
			dem++;
			loc += " Kinhghiem = '" +baiTuyenDung.getKinhghiem()+ " ' ";		
	}
	if(!(baiTuyenDung.getCapBac().length()==0)){
			if(dem==0)
				loc+=" where ";
			else 
				loc += " and  ";
			dem++;
			loc += " CapBac = '" +baiTuyenDung.getCapBac()+ " ' ";	
	}
	if(!(baiTuyenDung.getLoaiHinhLamViec().length()==0)){		
			if(dem==0)
				loc+=" where ";
			else 
				loc += " and  ";
			dem++;
			loc += " LoaiHinhLamViec = '" +baiTuyenDung.getLoaiHinhLamViec()+ " ' ";			
	}
	if(!(baiTuyenDung.getLuong().length()==0)){
			if(dem==0)
				loc+=" where ";
			else 
				loc += " and  ";
			dem++;
			loc += " luong = '" +baiTuyenDung.getLuong()+ " ' ";
	}
		
	if(!(baiTuyenDung.getTieuDe().length()==0)){
		if(dem==0)
			loc+=" where ";
		else 
			loc += " and  ";
		dem++;
		loc += " UPPER(TieuDe)  like  UPPER(N'%" +baiTuyenDung.getTieuDe()+ "%')  ";
	}
	System.out.println("sql: "+loc);
	String sql="  select  distinct  top 10 t1.MaBaiViet ,t1.TieuDe,t9.MoTaNganh, t3.MoTaNoiLamViec, t1.SoLuongCanTuyen,"
                  +" t5.TenLoaiCongViec,t8.TenLuong,t1.HanNopHoSo , t1.LuotXem  ,t1.NgayDang  from tb_BaituyenDung1 t1  "
                    +" inner join tb_MoTaNganh t9 on t1.MaBaiViet=t9.MaBaiViet  "
                 +" inner join tb_TuyenDung_Nganh t2  on t1.MaBaiViet=t2.MaBaiViet"
                +" inner join tb_MoTaNoiLamViec t3 on t1.MaBaiViet=t3.MaBaiViet  "
                 +" inner join tb_TuyenDung_NoiLamViec t10 on t1.MaBaiViet=t10.MaBaiViet  "
               +" inner join tb_CapBac t4 on t1.CapBac=t4.MaCapBac  inner join tb_LoaiCongViec t5 "
               +" on t1.LoaiHinhLamViec=t5.MaLoaiCongViec inner join tb_KinhNghiem t6   "
              +" on t1.Kinhghiem=t6.MaKinhNghiem inner join tb_KiNang  t7 on t1.KiNang=t7.MaKiNang  "
               +"  or t1.KiNang1=t7.MaKiNang  or t1.KiNang2=t7.MaKiNang inner join tb_Luong t8 on t1.Luong=t8.MaLuong "+loc +" and PheDuyet='1'";
	ArrayList<BaiTuyenDung1> listBaiTuyen1=new ArrayList<>();
	try {
		PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
		rs=ps.executeQuery();
		
		while(rs.next()){
			BaiTuyenDung1 baiTuyenDung1=new BaiTuyenDung1(
					rs.getInt("MaBaiViet"),
					rs.getString("TieuDe"),
					rs.getString("MoTaNganh"),
					rs.getString("MoTaNoiLamViec"),
					rs.getInt("SoLuongCanTuyen"),
					rs.getString("TenLoaiCongViec"), 
					rs.getString("TenLuong"), 
					rs.getString("HanNopHoSo"), 
					rs.getInt("LuotXem"),
					rs.getString("NgayDang"));
			listBaiTuyen1.add(baiTuyenDung1);
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
	return listBaiTuyen1;
}
public ArrayList<BaiTuyenDung1> getAllBaiuyennDung() {
	 ConnectData.connection=ConnectData.getconnect();
	String sql="select MaBaiViet,Email,TieuDe,NgayDang from tb_BaituyenDung1 ";
	ResultSet rs=null;
     ArrayList<BaiTuyenDung1> listBaiTuyen1=new ArrayList<>();
    try {
	PreparedStatement ps=ConnectData.connection.prepareStatement(sql);
	rs=ps.executeQuery();
	
	while(rs.next()){
		BaiTuyenDung1 baiTuyenDung1=new BaiTuyenDung1(
				rs.getInt("MaBaiViet"),
				rs.getString("TieuDe"),
				rs.getString("Email"),
				rs.getString("NgayDang"));
		listBaiTuyen1.add(baiTuyenDung1);
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
	return listBaiTuyen1;
}
}
