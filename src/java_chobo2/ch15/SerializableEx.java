package java_chobo2.ch15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableEx {
	public static void main(String[] args) {
		String fileName = "UserInfo.ser";
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos)){
			
			UserInfo u1 = new UserInfo("JavaMan", "1234",30);
			UserInfo u2 = new UserInfo("JavaWoman","4321",26);
			
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			list.add(u1);
			list.add(u2);
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			System.out.println("done.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
