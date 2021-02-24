package java_chobo2.ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class NumberToStringEx {
	public static void main(String[] args) throws ParseException {
//		extractedMethod();
		
		//pattern : #,###
		//123567 >> format(pattern) pattern : #,### >> "123,567"
		//"123,567" >> parse(pattern) pattern : #,###  >>123567
		
		
		
		
		
		
		
		
		
		
		
		
		//숫자를 문자로
		int salary =12345678;
		DecimalFormat df = new DecimalFormat("#,###.#");
		System.out.println(df.format(salary));
		df.applyPattern("#.#");
		System.out.println(df.format(salary));
//		System.out.printf("%,d%n",salary);
//		String str = String.format("%,d%n", salary);
//		System.out.println(str);
		String strDbl = String.format("%,.2f", 1234.56);
		System.out.println(strDbl);
		System.out.println();
		
		//문자를 숫자로
		String strNum = "123,456";
		DecimalFormat df2 = new DecimalFormat("0,000");
		System.out.println(df2.parse(strNum));
		
		
		
	}

	public static void extractedMethod() throws ParseException {
		double number = 1234567.89;
		System.out.println(number);
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,###.#");
		
		
		String str = df.format(number);
		System.out.println(str);
		
		df.applyPattern("00000000.0");
		System.out.println(df.format(number));
		
		df.applyPattern("############.#");
		System.out.println(df.format(number));
		
		df.applyPattern("#.#E0");
		System.out.println(df.format(number));
		
		Number numberStr =df.parse("1.2E6");
		Double d = numberStr.doubleValue();
		System.out.println(d);
		
		df.applyLocalizedPattern("#,###.0");
		numberStr = df.parse("123,456.55");
		d = numberStr.doubleValue();
		System.out.println(d);
	}
}
