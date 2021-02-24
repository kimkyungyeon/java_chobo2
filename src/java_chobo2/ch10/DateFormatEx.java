package java_chobo2.ch10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx {
public static void main(String[] args) throws ParseException {
	Date toDay = new Date();
	System.out.println(toDay);
	
	SimpleDateFormat sdf = new SimpleDateFormat("y년 M월 d일 E요일 a K시");
	
	System.out.println(sdf.format(toDay));
	
	String str = "2021년 2월 16일";
	sdf.applyPattern("y년 M월 d일");
	System.out.println(sdf.parse(str));
}
}
