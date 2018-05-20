package form.admin;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.admin.BaiViet;
import model.bean.admin.PheDuyet;



public class DanhSachBaiVietForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1745835622791507300L;

	private String maBaiViet;
	private int page;
	private int totalPage;
	private String key;
	private int pheDuyet;
	private ArrayList<PheDuyet> listPheDuyet;
	private ArrayList<BaiViet> listBaiViet;
	
	public DanhSachBaiVietForm() {
		super();
	}
	
	public DanhSachBaiVietForm(String maBaiViet, int page, int totalPage, String key, ArrayList<PheDuyet> listPheDuyet,
			ArrayList<BaiViet> listBaiViet,int pheDuyet) {
		super();
		this.maBaiViet = maBaiViet;
		this.page = page;
		this.totalPage = totalPage;
		this.key = key;
		this.listPheDuyet = listPheDuyet;
		this.listBaiViet = listBaiViet;
		this.pheDuyet=pheDuyet;
	}

	public int getPheDuyet() {
		return pheDuyet;
	}

	public void setPheDuyet(int pheDuyet) {
		this.pheDuyet = pheDuyet;
	}

	public String getMaBaiViet() {
		return maBaiViet;
	}
	public void setMaBaiViet(String maBaiViet) {
		this.maBaiViet = maBaiViet;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public ArrayList<PheDuyet> getListPheDuyet() {
		return listPheDuyet;
	}
	public void setListPheDuyet(ArrayList<PheDuyet> listPheDuyet) {
		this.listPheDuyet = listPheDuyet;
	}
	public ArrayList<BaiViet> getListBaiViet() {
		return listBaiViet;
	}
	public void setListBaiViet(ArrayList<BaiViet> listBaiViet) {
		this.listBaiViet = listBaiViet;
	}
	
	
	
	
	
}
