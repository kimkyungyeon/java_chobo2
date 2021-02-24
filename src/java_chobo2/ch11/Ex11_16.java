package java_chobo2.ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.println("id : ");
			String id = s.nextLine().trim();

			System.out.println("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지않습니다.");
				continue;
			}
			System.out.println(map.get(id));
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지않습니다. 다시입력하세요");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
	}
}
