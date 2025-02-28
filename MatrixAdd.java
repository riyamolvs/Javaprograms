import java.util.Scanner;
public class MatrixAdd {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        System.out.print("Rows: ");
       
        int r = s.nextInt();
        System.out.print("Cols: ");
       
        int c = s.nextInt();
        int[][] a = new int[r][c], b = new int[r][c], sum = new int[r][c];

        System.out.println("Matrix A:");
       
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = s.nextInt();

        System.out.println("Matrix B:");
       
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = s.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = a[i][j] + b[i][j];

        System.out.println("Sum:");
       
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
           
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
        s.close();
    }
}
