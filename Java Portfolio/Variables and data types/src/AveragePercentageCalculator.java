import java.util.Scanner;

public class AveragePercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSubjects = 5;
        int[] marks = new int[totalSubjects];

        // Input marks for each subject
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Enter marks for course " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate the total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate the average percentage
        double averagePercentage = (double) totalMarks / totalSubjects;

        System.out.println("Average Percentage: " + averagePercentage + "%");

        scanner.close();
    }
}