package model.bo.admin;

import java.util.ArrayList;

import model.bean.admin.TrinhDo;
import model.dao.admin.TrinhDoDAO;

public class TrinhDoBO {
	TrinhDoDAO  trinhDoDAO=new TrinhDoDAO();
	public ArrayList<TrinhDo> getListTrinh(){
		return trinhDoDAO.getListTrinhDo();
	}
}
