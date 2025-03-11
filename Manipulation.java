import java.util.Scanner;

public class Manipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String concatenated = str1 + " " + str2;
        String substring = str1.substring(0, 3); 
        int length = str1.length();
        String upperCase = str1.toUpperCase();
        String lowerCase = str2.toLowerCase();

        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Substring of first string: " + substring);
        System.out.println("Length of first string: " + length);
        System.out.println("Uppercase of first string: " + upperCase);
        System.out.println("Lowercase of second string: " + lowerCase);

        scanner.close();
    }
}

