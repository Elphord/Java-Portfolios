public class ArraySum {
    public static void main(String[] args) {
        float[] numbers = {1.5f, 2.3f, 3.7f, 4.2f, 5.1f};
        float sum = 0;

        for (float number : numbers) {
            sum += number;
        }

        System.out.println("Sum of the array elements: " + sum);
    }
}