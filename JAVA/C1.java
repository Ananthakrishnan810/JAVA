import java.util.*; 
public class SumPer
{  public static void main(String args[]) 
 { 
 Scanner sc = new Scanner(System.in); 
 int n; 
 System.out.println("Enter the total subjects:");
 n=sc.nextInt();
 int arr[] = new int[n]; 
 System.out.println("Enter the marks:");
 for(int i=0;i<n;i++)
 {
 arr[i]=sc.nextInt();
 }
 
 int tot=0;
 for(int i=0;i<n;i++)
 {
 tot=tot+arr[i];
 }
 System.out.println("Total marks:"+tot);
 float per; 
 per= (tot / (float)n); 
 System.out.println( "Total Percentage:"+ per + "%"); 
 } 
}



Output:

Enter the total subjects:
4
Enter the marks:
45
34
56
45
Total marks:180
Total percentage:45.0%
