import java.util.Scanner;

class Employ{
     
   int eno;
   String ename;
   int esal;

  Employ(int eno, String ename,int esal){
      this.eno= eno;
      this.ename = ename;
      this.esal = esal;
   }
   
   public void printDetails() {
      System.out.print("Employee Details: ");
      System.out.println(this.eno+ ", " + this.ename + ", " + esal);
   }
}
   
class Emp{

   public static void main(String[] args) {

      Employ emp[]=new Employ[3];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++)
      {
           System.out.println("Enter the Details of Employee:"+ (i+1));
           int k=sc.nextInt();sc.nextLine();
           String n=sc.nextLine();
           int s=sc.nextInt();sc.nextLine();
           emp[i]=new Employ(k,n,s);
      }
     
      System.out.println("Enter the Employee number to search:");
      int e=sc.nextInt();sc.nextLine();
         
      for(int i=0;i<3;i++)
      {
           if(emp[i].eno==e)
           {
                emp[i].printDetails();
           }
      }  
   }
}

