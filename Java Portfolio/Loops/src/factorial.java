import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int factorial = 1;
        int count = 1;

        while (count <= n) {
            factorial *= count;
            count++;
        }

        System.out.println("Factorial of " + n + " is " + factorial);
    }
}