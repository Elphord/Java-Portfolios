import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        int subject1Marks = scanner.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int subject2Marks = scanner.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int subject3Marks = scanner.nextInt();

        double totalPercentage = (subject1Marks + subject2Marks + subject3Marks) / 3.0;
        boolean isPass = totalPercentage >= 40 && subject1Marks >= 33 && subject2Marks >= 33 && subject3Marks >= 33;

        if (isPass) {
            System.out.println("Congratulations! You passed the exam.");
        } else {
            System.out.println("Sorry! You failed the exam.");
        }
    }
}