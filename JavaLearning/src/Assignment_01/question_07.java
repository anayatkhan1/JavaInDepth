/*Q7. WAP to count the total number of calls for a member function: 
 * display(), from more than one objects and 
 * how many times the object is created of a class name Employee. 
 * Note: Call display() function from more than 3 objects.
 */

package Assignment_01;

public class question_07 {
public static void main(String[] args) {
// count of object created
// count of display() method called 
	System.out.println("ANAYAT KHAN H 12");
	Employee1 obj1 = new Employee1(); 
	Employee1 obj2 = new Employee1(); 
	Employee1 obj3 = new Employee1(); 
	obj2.display();
    obj3.display();

}
}

class Employee1
{
static int object_count = 0; static int method_count = 0; Employee1()
{
object_count ++;
}

void display()
{
method_count++;
}

void print()
{
System.out.println("Object count "+ object_count + "method count "+method_count);
}
}
