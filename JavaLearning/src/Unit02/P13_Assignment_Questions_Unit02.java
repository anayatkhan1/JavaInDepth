package Unit02;

public class P13_Assignment_Questions_Unit02 {

	public static void main(String[] args) {
		
		Assignment_Questions_Unit02 obj = new Assignment_Questions_Unit02();
		obj.abstractClassCall();
		obj.overloadingAndOverriding();
		obj.accessProtectionInJava();
		obj.interfaceImpllementation();

	}

}

class Assignment_Questions_Unit02 {
	void abstractClassCall() {
		Sample3 obj = new Sample3();
		obj.run();
	}
	
	void overloadingAndOverriding() {
		
		Sample3 obj = new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1,2);
		
		obj.display();
	}
	void accessProtectionInJava() {
		Sample3 obj = new Sample3();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.showData();
		obj.display();
	}
	void interfaceImpllementation() {
		Sample3 obj = new Sample3();
		
		obj.display1();
		obj.display2();
		
	}
}

abstract class Sample2{
	
	int a = 10;//default protection
	public int b = 20;// can be accessed outside unit02 package but within same project
	protected int c = 30;// can be only accessed within unit02 package
	private int d = 40;// within ParentClass only, not even in its subclass
	
	void showData() {
		System.out.println("Inside sample 2 ParentClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	public void display() {
		System.out.println("This is a display method in side the class sample2");
	}
	
	abstract public void run();// unimplemented method
}

class Sample3 extends Sample2 implements A3, B3 {
	public void display() {
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		//System.out.println("d = " + d); //private member cannot be accessed
	}
	
	public void display1() {
		System.out.println("This is a display1 method in child class Sample3 from Interface");
	}
	public void display2() {
		System.out.println("This is a display2 method in child class Sample3 from Interface");
	}
	public void run() {
		System.out.println("This is run method from abstract class Sample2!");
	}
	public void run(int x) {
		System.out.println("This is run overloaded method in Sample2!");
	}
	public void run(int x, int y) {
		System.out.println("This is run overloaded method from Sample3!");
	}
}

interface A3{
	public void display1();
}
interface B3{
	public void display2();
}





















