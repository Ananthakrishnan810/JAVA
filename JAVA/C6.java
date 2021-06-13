import java.util.*;
public class Products
{
int pcode;
String pname;
int price;
Products()
{
pcode=0;
pname=null;
price=0;
} 
public static void cal(int a,int b,int c)
{
int p1=a;int p2=b;
int p3=c;
float lowest;
if(p1<p2)
{
if(p3<p1) 
{
lowest = p3;
} 
else 
{
lowest = p1;
}
} 
else 
{
if(p2<p3) 
{
lowest = p2;
} 
else{
lowest = p3;
}
}
System.out.println("The lowest price among the 3 Products is : 
"+lowest);
}
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
Products p1= new Products();
Products p2= new Products();
Products p3= new Products();
System.out.print("Enter the product1 details\n");
System.out.print("Enter the product Code:");
p1.pcode =s.nextInt();
System.out.print("Enter the product Name:");
p1.pname = s.next();
System.out.print("Enter the product Price:");
p1.price=s.nextInt();
System.out.print("Enter the product2 details\n");System.out.print("Enter the product Code:");
p2.pcode =s.nextInt();
System.out.print("Enter the product Name:");
p2.pname = s.next();
System.out.print("Enter the product Price:");
p2.price = s.nextInt();
System.out.print("Enter the product3 details\n");
System.out.print("Enter the product Code:");
p3.pcode =s.nextInt();
System.out.print("Enter the product Name:");
p3.pname = s.next();
System.out.print("Enter the roduct Price:");
p3.price = s.nextInt();
Products.cal(p1.price,p2.price,p3.price);
}
}


Output:

Enter the product1 details
Enter the product Code:112
Enter the product Name:Book
Enter the product price:45
Enter the product2 details
Enter the product Code:123
Enter the product Name:Box
Enter the product price:80
Enter the product3 details
Enter the product Code:134
Enter the product Name:pen
Enter the product price:10
The lowest price among the 3 product is :10.0