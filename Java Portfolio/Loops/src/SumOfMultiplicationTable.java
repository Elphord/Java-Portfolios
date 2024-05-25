public class SumOfMultiplicationTable {
    public static void main(String[] args) {
        int sumTable = 0;

        for (int i = 1; i <= 10; i++) {
            sumTable += 8 * i;
        }

        System.out.println("Sum of the numbers occurring in the multiplication table of 8: " + sumTable);
    }
}