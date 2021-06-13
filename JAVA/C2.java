import java.util.*; 
import java.util.Arrays; 
public class Count
{ 
 public static void main(String args[]) 
 { 
 Scanner sc=new Scanner(System.in);
 int n;
 System.out.println("Enter the size of an array:");
 n=sc.nextInt();
 int arr[]=new int[n];
 System.out.println("Enter the elements of the array:");
 for(int i=0; i<n ;i++)
 {
 arr[i]=sc.nextInt();
 }
 System.out.println("Enter the element whose frequency you want to 
know:");
 int elmt;
 elmt=sc.nextInt();
 int occ=0;
 for(int i=0;i<n;i++) {
 if(elmt==arr[i])
 {
 occ++;
 }
 }
 System.out.println(elmt+" occurred "+occ+" times "); 
 }
}



Output:

Enter the size of an array:
6
Enter the elements of the array:
3
5
6
7
6
6
Enter the element whose frequency you want to know:
6
6 occured 3 times