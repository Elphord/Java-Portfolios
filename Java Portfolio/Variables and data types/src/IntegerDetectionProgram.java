import java.util.Scanner;

public class IntegerDetectionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("The entered number is an integer.");
        } catch (NumberFormatException e) {
            System.out.println("The entered number is not an integer.");
        }

        scanner.close();
    }
}