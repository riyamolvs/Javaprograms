import java.util.Scanner;
public class Complex{
	public static void main(String []args){
	Scanner num=new Scanner(System.in);
	int real1,real2,img1,img2,real,img;
	
	System.out.println("Enter the real part of the first complex number :");
	real1=num.nextInt();
	System.out.println("Enter the real part of the second complex number :");
	real2=num.nextInt();
	System.out.println("Enter the imaginary part of the first complex number :");
	img1=num.nextInt();
	System.out.println("Enter the imaginary part of the second complex number :");
	img2=num.nextInt();
	
	real=real1+real2;
	img=img1+img2;
	System.out.println("The sum of complex numbers is : "+real+"+"+img+"i");
	
	
	
}
}
