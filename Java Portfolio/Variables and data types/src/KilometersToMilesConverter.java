import java.util.Scanner;

public class KilometersToMilesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Conversion factor for kilometers to miles
        double conversionFactor = 0.62137119;

        // Convert kilometers to miles
        double miles = kilometers * conversionFactor;

        System.out.println("Distance in miles: " + miles);

        scanner.close();
    }
}