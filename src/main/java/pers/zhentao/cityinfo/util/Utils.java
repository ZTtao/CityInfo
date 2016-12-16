package pers.zhentao.cityinfo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	public static String dateTimeChange(Date date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = format.format(date);
		return str;
	}
	public static String HTMLChange(String str){
		str = str.replaceAll("&", "&amp;");
		str = str.replaceAll(" ", "&nbsp;");
		str = str.replaceAll("<", "&lt;");
		str = str.replaceAll(">", "&gt;");
		str = str.replaceAll("\r\n", "<br>");
		return str;
	}
}
