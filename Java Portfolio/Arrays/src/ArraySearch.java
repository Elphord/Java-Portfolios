public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int target = 15;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}