import java.util.Scanner;

public class WebsiteType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a URL: ");
        String url = scanner.nextLine();

        String websiteType;

        if (url.endsWith(".com")) {
            websiteType = "Commercial website";
        } else if (url.endsWith(".org")) {
            websiteType = "Organization website";
        } else if (url.endsWith(".in")) {
            websiteType = "Indian website";
        } else {
            websiteType = "Unknown website";
        }

        System.out.println("Website type: " + websiteType);
    }
}