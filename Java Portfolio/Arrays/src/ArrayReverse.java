public class ArrayReverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int length = numbers.length;

        System.out.print("Original Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int[] reversedArray = new int[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = numbers[length - i - 1];
        }

        System.out.print("\nReversed Array: ");
        for (int number : reversedArray) {
            System.out.print(number + " ");
        }
    }
}