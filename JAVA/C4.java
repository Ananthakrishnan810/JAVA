import java.util.Scanner;
class Complex
{
float real1,image1,real2,image2;
void get()
{
Scanner op=new Scanner(System.in);
System.out.print("Enter the real part of the first complex 
number:");
real1=op.nextFloat();
System.out.print("Enter the imaginary part of the first 
complex number:");
image1=op.nextFloat();
System.out.print("Enter the real part of the second complex 
number:");
real2=op.nextFloat();System.out.print("Enter the imaginary part of the second 
complex number:");
image2=op.nextFloat();
}
void display()
{
System.out.println("Sum of complex numbers 
"+real1+"+"+image1+"i and "+real2+"+"+image2+"i is 
"+(real1+real2)+"+"+(image1+image2)+"i");
}
public static void main(String args[])
{
Complex cmp=new Complex();
cmp.get();
cmp.display();
}
}


Output:

Enter the real part of the first complex number:3
Enter the imaginary part of the frist complex number:4
Enter the real part of the second complex number:2
Enter the imaginary part of the second complex number:4
Sum of complex numbers 3.0+4.0i and 2.0+4.0i is 5.0+8.0i