import java.util.Scanner;

public class Comparion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int userNumber = scanner.nextInt();

        int GivenNumber = 45;

        if (GivenNumber > userNumber) {
            System.out.println(GivenNumber + " is greater than " + userNumber);
        } else if (GivenNumber < userNumber) {
            System.out.println(GivenNumber + " is less than " + userNumber);
        } else {
            System.out.println(GivenNumber + " is equal to " + userNumber);
        }

    }
}
