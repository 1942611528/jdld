package circulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test01 {
	public static void main(String[] args) throws ParseException {
	     String string="2018-12-6";
	     SimpleDateFormat sdf = new SimpleDateFormat("MM");  //ת��ʲô��ʽ��Stringʱ�䣬�˴���ʽ��Ҫ��������һ��
	     Date date = sdf.parse(string);
	     System.out.println(date);
	}
}
