package Unit01;

public class P2_Task02_ConstantsInJava {

    public static final double Pi = 3.14; 
		
	public static void main(String[] args) {
	
		final int a = 10;
		
		/*
		 * The final keyword in java is used to restrict the user

		 * The java final keyword can be used in many context. Final can be:
	
			1. Variable
			2. Method
			3. Class
			
		 */

		System.out.println(Pi);

		System.out.println(a);

		add(1, 2); // Creating method

		multi(1, 2); // Creating method
		
	/* Java provides five ways to create an object.

		Using new Keyword
		Using clone() method
		Using newInstance() method of the Class class
		Using newInstance() method of the Constructor class
		Using Deserialization
		
		Using the new keyword is the most popular way to create an object or instance of the class. 
		When we create an instance of the class by using the new keyword, it allocates memory (heap) for 
		the newly created object and also returns the reference of that object to that memory. 
		The new keyword is also used to create an array. The syntax for creating an object is:
	 * 
	 */
		
		Calculator obj = new Calculator(); 
		System.out.println(obj.add(4, 5));
		System.out.println(obj.a);
	}

	static int add(int a, int b) { /*
									The static keyword in Java is used for memory management mainly. 
									We can apply static keyword with variables, methods, blocks and nested classes.
									*/
		System.out.println(a);

		System.out.println(Pi);

		return (a + b);
	}

	static int multi(int a, int b) {
		return (a * b);
	}

}

class Calculator {
	int a = 10;

	int add(int a, int b) {

		return (a + b);
	}
	
	int multi(int a, int b) {
		return (a * b);
	}
}