package Unit03;

import java.util.Scanner;

/*
 * Sequential 
 */
public class P16_MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		C1 obj1 = new C1();
//		obj1.show1();
//		
//		C2 obj2 = new C2();
//		
//		obj2.show2();
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(new T1(), "T1");
		Thread t2 = new Thread(new T2(), "T2");
		Thread t3 = new Thread(new T3(), "T3");
		
		t1.start();
		t2.start();
		t3.start();
}
}

//class  C1{
//	
//	void show1() {
//		
//		Scanner obj = new Scanner(System.in);
//		int a = obj.nextInt();
//		System.out.println("Done with show()!");
//		obj.close();
//	}
//}
//
//class C2 {
//	
//	void show2() {
//		
//		for(int i = 0 ; i<10 ; i++) {
//			System.out.println(i + "_Hey_2");
//		}
//	}
//}

class T1 extends Thread {
	
	@Override
	// why we create run method because jvm will run this method
	public void run() {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println("Done with show()!");
		obj.close();
		System.out.println(Thread.currentThread().getName());
	}
}

class T2 implements Runnable {
	
	@Override
	public void run() {
		for(int i = 0 ; i<10 ; i++) {
			System.out.println(i + "_Hey_2");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
class T3 implements Runnable {
		
		@Override
		public void run() {
			for(int i = 0 ; i<10 ; i++) {
				System.out.println(i + "_Hey_3");
			}
			System.out.println(Thread.currentThread().getName());
		}
}
