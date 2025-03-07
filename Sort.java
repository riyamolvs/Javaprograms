import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of strings you want to sort: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
      
        String[] strings = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }
        
        Arrays.sort(strings);
        
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
        
        scanner.close();
    }
}
