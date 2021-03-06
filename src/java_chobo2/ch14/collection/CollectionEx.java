package java_chobo2.ch14.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import javax.xml.transform.TransformerException;

import com.sun.org.apache.xpath.internal.objects.XObject;
import com.sun.org.apache.xpath.internal.operations.UnaryOperation;

public class CollectionEx {
	public static void main(String[] args) {
		ArrayList<Integer> arList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arList.add(i);
		}

		for (int i : arList) {
			System.out.print(i + " ");

		}
		System.out.println();

		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");
			}
		};

		Consumer<Integer> d = i -> System.out.print(i + " ");

		arList.forEach(c);
		System.out.println();

		arList.forEach(d);
		System.out.println();

		arList.forEach(i -> System.out.print(i + " "));
		System.out.println();

		arList.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		arList.forEach(i -> System.out.print(i + " "));

		System.out.println();
		System.out.println("------------------------------------");
		ArrayList<Integer> arList3 = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++) {
			arList3.add(i);
		}

		for (int i : arList3) {
			System.out.print(i + " ");

		}
		System.out.println();

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i % 3 == 0;
		Predicate<Integer> p3 = p1.or(p2);
		arList3.removeIf(p3);
		arList3.forEach(c);
		System.out.println();
		System.out.println("------------------------------------");
		UnaryOperator<Integer> v = new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * 10;
			}
		};
		
		arList.replaceAll(v);
		arList.forEach(i->System.out.print(i+ " "));
		System.out.println();
		
		UnaryOperator<Integer> u = i-> i*10;
		arList3.replaceAll(u);
		arList3.forEach(i->System.out.print(i + " "));
		System.out.println();
		
		Map<String,String> map = new HashMap<>();
		map.put("1","a");
		map.put("2","b");
		map.put("3","c");
		map.put("4","d");
		
		for(Entry<String, String> e :map.entrySet()) {
			System.out.printf("{ %s -> %s}%n", e.getKey(), e.getValue());
		}
		
		for(String key : map.keySet()) {
			System.out.printf("{ %s -> %s}%n", key, map.get(key));
			
		}
		BiConsumer<String, String> w = new BiConsumer<String, String>() {

			@Override
			public void accept(String t, String u) {
				System.out.printf("{ %s -> %s}%n", t, u);
				
			}
		};
		
		
		System.out.println("Map<key,value> 함수형 인터페이스 출력");
		map.forEach(w);
		System.out.println();
		
		System.out.println("Map<key,value> 함수형 인터페이스 출력2");
		map.forEach((key,value) -> System.out.printf("{%s -> %s} %n", key, value));
		
	}
}