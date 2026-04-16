import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Fibonacci Number ===");
        System.out.print("Enter a number: ");

        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();

        System.out.println("Fibonacci: " + fibonacci(n));
    }

    static long fibonacci(int n) {
        if (n == 0) return 0;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
