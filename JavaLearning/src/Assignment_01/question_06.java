/*Q6. As given there are two sample methods:
 *  First one returns the sum of two numbers a and b and second one returns the subtraction of a and b. 
 *  if a-b is negative then return value would be 0. Use ternary operator to call these two methods. 
 *  If a>b then ternary should call sum(a,b) but if a<b then ternary operator should call sub(a,b). 
 * Eventually print the result of the ternary operation on variable a and b.
 */

package Assignment_01; 

import java.util.Scanner; 

public class question_06 {
public static void main(String[] args) {
	
	System.out.println("ANAYAT KHAN H 12");
	System.out.println("Q6");
	arithmetic obj = new arithmetic(); 
	Scanner s = new Scanner(System.in); 
	int a = s.nextInt();
	int b = s.nextInt();
	
	a = (a > b)?obj.add(a, b):obj.sub(a, b);
	}
	
	}
	
	
	class arithmetic
	{
	int add(int a, int b)
	{
	return a+b;
	}
	
	int sub(int a, int b)
	{
	int res = a - b;
	if(res < 0)
	{
	return 0;
	}
	return res;
	}
	}
