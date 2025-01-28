import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input
        int x = sc.nextInt(); 
        int y = sc.nextInt();
        // Logical Operators section
        System.out.println("Logical Operators:");
        System.out.println(x > y && x < y); // Logical AND, checks if both conditions are true
        System.out.println(x < y && x < y); // Logical AND, checks if both conditions are true
        System.out.println(!(x > y)); // Logical NOT, negates the condition

        sc.close(); 
    }
}
