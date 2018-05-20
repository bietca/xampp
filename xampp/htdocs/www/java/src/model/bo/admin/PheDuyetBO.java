package model.bo.admin;

import java.util.ArrayList;

import model.bean.admin.PheDuyet;
import model.dao.admin.PheDuyetDAO;



public class PheDuyetBO {
PheDuyetDAO pheDuyetDAO = new PheDuyetDAO();
public ArrayList<PheDuyet>getListpheDuyet(){
	return pheDuyetDAO.getListpheDuyet();
}
}
