import java.util.Scanner;

public class Main {

    // Fibonacci Recursive 
    public static int fibonacciRecursive(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Fibonacci Iterative 
    public static int fibonacciIterative(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    // Decimal to Binary Recursive 
    public static String decimalToBinaryRecursive(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return decimalToBinaryRecursive(n / 2) + (n % 2);
    }

    // Decimal to Binary Iterative 
    public static String decimalToBinaryIterative(int n) {
        if (n == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n = n / 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Fibonacci Recursive");
            System.out.println("2. Fibonacci Iterative");
            System.out.println("3. Decimal to Binary Recursive");
            System.out.println("4. Decimal to Binary Iterative");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Fibonacci Recursive of " + num + " = " + fibonacciRecursive(num));
                    break;
                case 2:
                    System.out.println("Fibonacci Iterative of " + num + " = " + fibonacciIterative(num));
                    break;
                case 3:
                    System.out.println("Decimal " + num + " to Binary (Recursive) = " + decimalToBinaryRecursive(num));
                    break;
                case 4:
                    System.out.println("Decimal " + num + " to Binary (Iterative) = " + decimalToBinaryIterative(num));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
