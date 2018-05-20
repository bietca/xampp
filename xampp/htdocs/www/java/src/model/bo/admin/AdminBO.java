package model.bo.admin;

import model.dao.admin.AdminDAO;

public class AdminBO {
	AdminDAO  adminDAO=new AdminDAO();
	public boolean checkLogin(String tenDangNhap,String matKhau){
		return adminDAO.checkLogin( tenDangNhap, matKhau);
	}
	public boolean checkAdmin(String email){
		return adminDAO.checkAdmin(email);
	}
	public void insertAdmin(String email, String pass){
		adminDAO.insertAdmin(email,pass);
	}
}
