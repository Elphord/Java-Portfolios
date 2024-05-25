import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's income: ");
        double income = scanner.nextDouble();

        double tax = 0.0;

        if (income >= 2.5 && income <= 5.0) {
            tax = income * 0.05;
        } else if (income > 5.0 && income <= 10.0) {
            tax = income * 0.20;
        } else if (income > 10.0) {
            tax = income * 0.30;
        }

        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
    }
}
