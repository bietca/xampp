package common;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class KiemTraDuLieu {
     /**
      * Kiem tra Email Hop le Khong
      * @param email
      * @return
      */
	  public static boolean  ktEmail(String s){
		  String patternEmail = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*(\\.[a-zA-Z]{2,}$)";
			if(ktRong(s)) return true;
			 if(s.matches(patternEmail)) return false;
			 return true;
	   }
	  /**
	   * Kiem tra So Dien Thoai Hop le Khong
	   * @param sodienthoai
	   * @return
	   */
    public static boolean  ktSoDienThoai(String s){
    	String patternPhone = "^0[0-9]{9,13}";
    	if(ktRong(s)) return true;
       if(s.matches(patternPhone)){
           return false;
       }
       return true;
   }
    /**
     * kiem tra ngay sinh hop le khong
     * @param ngaysinh
     * @return
     */
    public static boolean ktThoiGian(String date){
    	 boolean isDate = false;
         String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
         isDate = date.matches(datePattern);
         return isDate;
    }
     public  static boolean  ktNgay(String ngaysinh){	
    String datePattern = "\\d{4}-\\d{1,2}-\\d{1,2}";
      // String patternDateBorn = "\\d{4}/(0[1-9]|1[1-2])/(0[1-9]|[1-2][0-9]|3[0-1])"; 
       if(ktRong(ngaysinh)) return true;
       if(datePattern.matches(ngaysinh)){
           return true;
       }
       return false;
   }

	/**
	 * In mot chuoi String
	 * @param s
	 * @return
	 */
	public static String inChuoi(String s) {
		if(s==null) return "";
		return s;
	}
	 /**
     * Kiem tra du lieu rong khong
     * @param s
     * @return
     */
	public static boolean ktRong(String s){
		if(s==null || s.length()==0) return true;
		return false;
	}
	/**
	 * Kiem Tra so hop le khoong
	 * @param s
	 * @return
	 */
	public static boolean kiemTraSo(String s){
		if(ktRong(s)) return true;
		String kt = "[0-9]+"; 
		if(s.matches(kt)) return false;
		return true;
	}
	
	public static long sosanhNgay(Date d1, Date d2) {
		long diff = d2.getTime() - d1.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	public static String noiChuoi(String a, String b){
		a = a.concat("/").concat(b);
		return a;
	}
	
}
