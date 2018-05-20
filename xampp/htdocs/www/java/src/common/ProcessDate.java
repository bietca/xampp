package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;


public class ProcessDate {
	
	public static SimpleDateFormat smf = new SimpleDateFormat("MM/dd/yyyy");
	public static SimpleDateFormat smF = new SimpleDateFormat("yyyy");
	
	public static String getDateNow(){
		String date = null;
		date = smf.format(Calendar.getInstance().getTime());
		return date;
	}
	public static String getFristDayOfYear(){
		String year = null;
		year =	smF.format(Calendar.getInstance().getTime());
		String Twelfth = "1/1/".concat(year);
		return Twelfth;
	}
	
		
	
	public static void main(String[] args) {
		System.out.println(getFristDayOfYear());
	}
}
