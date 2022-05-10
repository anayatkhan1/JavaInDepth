/*Q3- Given an interface in1 which includes a method display which takes an integer as input . 
 * interface In1 { void display(int p); } 
 * Task is to write a class testClass which implements interface In1 and has a method named 4
 * display which takes an integer as an input p and the display method should be able to tell 
 * if the number is prime or not? - 
 * The main method should not be in testClass, create a separate class for that.
 */

package Assignment_01;

import java.util.Scanner;

public class question_03 {
public static void main(String[] args) { 
	
	System.out.println("ANAYAT KHAN H 12");
	testClass obj = new testClass();

	Scanner o = new Scanner(System.in);
	int a = o.nextInt();
	
	obj.display(a); System.out.println("Q3");
	}
	
	}
	
	interface in1
	{
	void display();
	}
	
	class testClass
	{
	public void display(int p)
	{
	int i,m=0,flag=0; m=p/2; if(p==0||p==1){
	System.out.println(p+" is not prime number");
	}
	else{
	for(i=2;i<=m;i++){ if(p%i==0){
	System.out.println(p+" is not prime number"); flag=1;
	break;
	}
	}
	if(flag==0){
	System.out.println(p+" is prime number");
	}
	}
	}
	}
