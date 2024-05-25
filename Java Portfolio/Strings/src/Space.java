import java.util.Scanner;

public class Space {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        String input = scanner.nextLine();
        String replaced = input.replace(" ", "_");
        System.out.println("Original: " + input);
        System.out.println("Replaced: " + replaced);
    }
}