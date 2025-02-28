import java.util.Scanner;

public class SymmetricMatrixChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                matrix[i][j] = scanner.nextInt();

        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }

        System.out.println(isSymmetric ? "The matrix is symmetric." : "The matrix is not symmetric.");
        scanner.close();
    }
}

