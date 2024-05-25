import java.util.Scanner;
import java.lang.Math;

public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of V:");
        int V = scanner.nextInt();

        System.out.print("Enter value of U:");
        int U = scanner.nextInt();

        System.out.print("Enter value of A:");
        int A = scanner.nextInt();

        System.out.print("Enter value of S:");
        int S = scanner.nextInt();

         double Speed = (Math.pow(V,2) - Math.pow(U,2))/ 2*A*S;
        System.out.println("Speed:" + Speed);
    }
}
