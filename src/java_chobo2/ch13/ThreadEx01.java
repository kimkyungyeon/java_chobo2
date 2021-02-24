package java_chobo2.ch13;

public class ThreadEx01 {
	public static void main(String[] args) throws InterruptedException {
		Thread01 th1 = new Thread01();
		th1.start();
		Thread02 runnable = new Thread02();
		
		Thread th2 = new Thread(runnable);
		th2.start();
//		th1.run();
		for(int i =0; i<10; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
		System.out.println("Done.");
		
	}
}
