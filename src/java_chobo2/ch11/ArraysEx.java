package java_chobo2.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysEx {
	public static void main(String[] args) {
//		arrayToString();
//		arrayDeepToString();
//		arrayToEquals();
//		arrayToFill();
//		arrayToList();
//		arrayToBinarySearchBySort();

		Student[] stdArr = { 
				new Student(1,"이종윤",90,90,90),
				new Student(5,"김길현",80,79,68),
				new Student(3,"박유진",78,91,58),
				new Student(4,"김인환",99,60,40) };
		
		//학번순 정렬, Student 클래스 Comparable 인터페이스 구현
		Arrays.sort(stdArr);
		System.out.println(Arrays.toString(stdArr));
		
		//국어 오름차순
		Comparator<Student> comp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getKor() - o2.getKor();  //양수면 스왑 , 음수면 그대로
			}
		};
		
		//수학 오름차순
		Comparator<Student> mathComp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getMath()-o2.getMath();
			}
		};
		Arrays.sort(stdArr,comp);
		prnStudent(stdArr);
		Arrays.sort(stdArr,mathComp);
		System.out.println(Arrays.toString(stdArr));
		
		prnStudent(stdArr);
	}

	

	private static void prnStudent(Student[] stdArr) {
		for(Student s : stdArr) {
			System.out.println(s);
		}
	}



	public static void arrayToBinarySearchBySort() {
		int[] arr = { 10, 9, 5, 6, 7, 8, 1 };

		System.out.println(Arrays.binarySearch(arr, 8));
		System.out.println(Arrays.binarySearch(arr, 1));

		Arrays.sort(arr);
//		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.binarySearch(arr, 8));
		System.out.println(Arrays.binarySearch(arr, 1));
	}

	public static void arrayToList() {
		Integer[] intArr = new Integer[] { 1, 2, 3, 4 };

		List<Integer> arList = Arrays.asList(new Integer[] { 1, 2, 3, 4 });
		for (int a : arList) {
			System.out.println(a);
		}

		arList.set(1, 6);
		System.out.println(arList);

//		arList.add(10);
//		System.out.println(arList);

		ArrayList<Integer> al = new ArrayList<Integer>(arList);
		al.add(10);

		System.out.println(al);
	}

	public static void arrayToFill() {
		int[] intArr1 = { 1, 2, 3, 4, 5, 6 };
		int[] copyArr1 = Arrays.copyOf(intArr1, intArr1.length);
		System.out.println(Arrays.toString(copyArr1));
		System.out.println(Arrays.equals(intArr1, copyArr1));

		int[] copyArr2 = Arrays.copyOf(intArr1, 3);
		int[] copyArr3 = Arrays.copyOfRange(intArr1, 1, 10);
		System.out.println(Arrays.toString(copyArr2));
		System.out.println(Arrays.toString(copyArr3));

		int[] newArr = new int[10];
		Arrays.fill(newArr, 10);
		System.out.println(Arrays.toString(newArr));
		Arrays.setAll(newArr, (i) -> (int) ((Math.random() * 5) + 1));
		/*
		 * Arrays.setAll(newArr, new IntUnaryOperator() {
		 * 
		 * @Override public int applyAsInt(int operand) {
		 * 
		 * return (int) (Math.random()*100)+1; } });
		 */
		System.out.println(Arrays.toString(newArr));
	}

	public static void arrayToEquals() {
		int[] intArr1 = { 1, 2, 3 };
		int[] intArr2 = { 1, 2, 5 };
		System.out.println(Arrays.equals(intArr2, intArr1));

		int[][] intTwoDimen1 = { { 1, 2 }, { 3, 4 } };
		int[][] intTwoDimen2 = { { 1, 2 }, { 3, 5 } };
		System.out.println(Arrays.deepEquals(intTwoDimen1, intTwoDimen2));
	}

	public static void arrayDeepToString() {
		int[][] twoArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepToString(twoArr));
		System.out.println(Arrays.toString(twoArr));
		System.out.println(twoArr);
	}

	public static void arrayToString() {
		// List >> array
		ArrayList<String> arList = new ArrayList<String>();
		arList.add("abc");
		arList.add("def");
		arList.add("ghi");
		System.out.println(arList.toString());

		Object[] objArr = arList.toArray();
		System.out.println(Arrays.deepToString(objArr));
		String str = Arrays.toString(objArr);
		System.out.println(str);

		String[] strArr = new String[arList.size()];
		arList.toArray(strArr);
		System.out.println(Arrays.toString(strArr));
	}
}
