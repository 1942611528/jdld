package circulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test01 {
	public static void main(String[] args) throws ParseException {
	     String string="2018-12-6";
	     SimpleDateFormat sdf = new SimpleDateFormat("MM");  //转换什么格式的String时间，此处格式需要和它保持一致
	     Date date = sdf.parse(string);
	     System.out.println(date);
	}
}
