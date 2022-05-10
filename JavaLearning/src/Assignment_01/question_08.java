/*Q8. WAP in java, to delete index=3, element from the given array mentioned below. 
 * Int[] arr = {1,2,3,4,5,6,7,8,9} Note: Non relevance places would be filled with zeros.
*/

package Assignment_01;

public class question_08 {
public static void main(String[] args) {

System.out.println("ANAYAT KHAN H 12");
int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
int n = a.length;

array obj = new array(); obj.delete(a, n, 3); obj.print_array(a, n);

}

}

class array
{
int i;
int[] delete(int []a, int n, int index)
{

for(i = index + 1; i < n; i++)
{
a[i - 1] = a[i];
}
a[n - 1] = 0;
return a;
}

void print_array(int []a ,int n)
{
for(i = 0; i < n; i++)
{
System.out.print(a[i]+" ");
}
}
}
