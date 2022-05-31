package Unit03;

public class Sample {

	public static void main(String[] args) { }
		// TODO Auto-generated method stub
     
	  
		 void handleException()
		 {
			 	//ArithmeticException
				//compiler cannot catch this exception at compile time
				try
				{
					int b=0;
					int a=5/b;                          //code breaks at this line and exception is thrown
					System.out.println("5/0="+a);
				}
				catch(ArithmeticException e)
				{
					//Thrown when an exceptional arithmetic condition has occurred.
					//For example, an integer "divide by zero" throws an instance of this class
					
					//catch the occurred exception
					
					System.out.println(e.getMessage());
					System.out.println("ArithmeticException handled");
					
					
				}
				
				System.out.println("Done!");
	}

}
