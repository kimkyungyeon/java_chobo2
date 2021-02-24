package java_chobo2.ch10;

import java.text.*;
import java.util.*;

public class SelfT {
	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("y년 M월 d일");
		DateFormat df2 = new SimpleDateFormat("y/M/d");

		try {
			String str = "2019년 11월 23일";
			Date d = df.parse(str);
			System.out.println(df2.format(d));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
