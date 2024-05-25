public class Letter{
    public static void main(String[] args) {
        String template = "Dear [name],\n\nThank you for [feedback].\n\nSincerely,\n[sender]";
        String filledTemplate = template
                .replace("[name]", "John")
                .replace("[feedback]", "your valuable input")
                .replace("[sender]", "Jane");

        System.out.println(filledTemplate);
    }
}