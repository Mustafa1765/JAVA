import java.util.Scanner;
class binarysearchdemo
{
 public static void main(String args[])
 {
 int n, i, num,first, last, middle;
 int a[ ]=new int[20];
 Scanner s = new Scanner(System.in);
 System.out.println("Enter total number of elements:");
 n = s.nextInt(); 
 System.out.println("Enter elements in sorted order:");
 for (i = 0; i < n; i++)
 a[i] = s.nextInt();
 System.out.println("Enter the search value:");
 num = s.nextInt();
 first = 0;
 last = n - 1;
 middle = (first + last)/2;

 {
 System.out.println("number found");
 break;
 }
 else
 {
 last = middle - 1;
 }
 middle = (first + last)/2;
 }
 if ( first > last )
 System.out.println( " Number is not found");
 }
}
