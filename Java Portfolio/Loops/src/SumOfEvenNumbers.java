import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sumEven = 0;
        int count = 1;
        int num = 2;

        while (count <= n) {
            sumEven += num;
            num += 2;
            count++;
        }

        System.out.println("Sum of the first " + n + " even numbers: " + sumEven);
    }
}