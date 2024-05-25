import java.util.Scanner;

public class GradeEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade to encrypt: ");
        int grade = scanner.nextInt();

        // Encrypt the grade
        int encryptedGrade = encryptGrade(grade);
        System.out.println("Encrypted grade: " + encryptedGrade);

        // Decrypt the grade
        int decryptedGrade = decryptGrade(encryptedGrade);
        System.out.println("Decrypted grade: " + decryptedGrade);
    }

    // Encrypt the grade by adding 8
    public static int encryptGrade(int grade) {
        return grade + 8;
    }

    // Decrypt the grade by subtracting 8
    public static int decryptGrade(int encryptedGrade) {
        return encryptedGrade - 8;
    }
}