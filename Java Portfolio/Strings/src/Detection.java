public class Detection {
    public static void main(String[] args) {
        String input = "Hello  World! This   is a test.";
        boolean hasDoubleSpaces = input.contains("  ");
        boolean hasTripleSpaces = input.contains("   ");

        System.out.println("Input: " + input);
        System.out.println("Has double spaces: " + hasDoubleSpaces);
        System.out.println("Has triple spaces: " + hasTripleSpaces);
    }
}