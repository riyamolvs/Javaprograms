import java.util.Scanner;

public class Manipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String greeting = str + " Welcome to Java.";
        System.out.println("Concatenated: " + greeting);
        
        if (str.length() >= 5) {
            String sub = str.substring(0, 5);
            System.out.println("Substring (first 5 chars): " + sub);
        } else {
            System.out.println("String is too short for a substring.");
        }
        
        String replaced = str.replace("World", "Java");
        System.out.println("Replaced 'World' with 'Java': " + replaced);
        
        int length = str.length();
        System.out.println("Length: " + length);
        
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);
        
        scanner.close();
    }
}
