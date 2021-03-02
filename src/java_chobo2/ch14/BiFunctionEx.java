package java_chobo2.ch14;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionEx {
	public static void main(String[] args) {

		BiConsumer<String, Integer> bic = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String t, Integer u) {
				if (t.length() == u) {
					System.out.println("같음");
				} else {
					System.out.println("다름");
				}

			}
		};

		bic.accept("abc", 2);
		bic.accept("abc", 3);

		BiConsumer<String, Integer> bic1 = (t, u) -> {
			if (t.length() == u) {
				System.out.println("같음");
			} else {
				System.out.println("다름");
			}
		};

		bic1.accept("abcd", 3);
		bic1.accept("abcd", 4);
		

		String str = "abc".length() == 3 ? "같음" : "다름";

		BiPredicate<String, String> bip = new BiPredicate<String, String>() {

			@Override
			public boolean test(String t, String u) {
				return t.equals(u);
			}
		};

		System.out.println(bip.test("abc", "abc"));
		System.out.println(bip.test("abc", "abcd"));

		BiPredicate<String, String> bip1 = (t, u) -> t.equals(u);
		System.out.println(bip1.test("abc", "abc"));
		System.out.println(bip1.test("abc", "abcd"));

		BiFunction<Integer, Integer, String> bif = new BiFunction<Integer, Integer, String>() {

			@Override
			public String apply(Integer t, Integer u) {
				if (t == u) {
					return "true";
				} else {
					return "false";
				}
			}
		};
		
		System.out.println(bif.apply(5, 7));
		System.out.println(bif.apply(5, 5));
	
		BiFunction<Integer, Integer, String> bif1 = (t,u) -> t==u?"true":"false";
		
		System.out.println(bif1.apply(5, 7));
		System.out.println(bif1.apply(7, 7));
	}
}
