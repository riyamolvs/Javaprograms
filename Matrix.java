import java.util.Scanner;
public class Matrix{
	
	public static void main(String []args)
	{
	int i,j;
	 Scanner input=new Scanner (System.in);
	 System.out .println("Enter the number of rows of 1st matrix : ");
	 int rows1=input.nextInt();
	 System.out .println("Enter the number of columns of 1st matrix : ");
	 int cols1=input.nextInt();
	 System.out .println("Enter the number of rows of 2nd matrix : ");
	 int rows2=input.nextInt();
	 System.out .println("Enter the number of columns of 2nd matrix : ");
	 int cols2=input.nextInt();
	 
	 if(rows1==rows2 && cols1==cols2){
	 
	 int matrix1[][]=new int[rows1][cols2];
	 int matrix2[][]=new int[rows2][cols2];
	 int sum[][]=new int[rows1][cols1];
	 
	 
	 System.out .println("Enter the elements of the first matrix :\n");
	 for(i=0;i<rows1;i++)
	 {
	 	for(j=0;j<cols1;j++)
	 	{
	 		matrix1[i][j]=input.nextInt();
	 	}
	 }
	 System.out .println("Enter the elements of the second matrix :\n");
	 for(i=0;i<rows2;i++)
	 {
	 	for(j=0;j<cols2;j++)
	 	{
	 		matrix2[i][j]=input.nextInt();
	 	}
	 }
	 System.out.println("Sum of the above matrices is : \n");
	 for(i=0;i<rows1;i++)
	 {
	 	for(j=0;j<cols1;j++)
	 	{
	 		sum[i][j]=matrix1[i][j]+matrix2[i][j];
	 	}
	 }
	 for(i=0;i<rows1;i++)
	 {
	 	
	 	for(j=0;j<cols1;j++)
	 	{
	 		System.out.print(sum[i][j]+" ");
	 	}
	 	System.out.println("");
	 }
	 }
	 else{
	 	System.out.println("Invalid");
	 }
	}
}
