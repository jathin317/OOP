package week9;

/*A news website, e-commerce platform, or online forum wants to track the unique visitors in the order they arrived.
    • Each visitor (IP address) should be recorded only once (no duplicates)
    • Order of visits must be preserved (to analyze user engagement trends). */
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.lang.String;

public class WebsiteVisitorsOrder {
    public static void main(String Args[]) {
        LinkedHashSet<String> visitors = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.println("Enter the IP address:(0 to stop taking input)");
            str = sc.nextLine();
            if (!str.equals("0")) {
                visitors.add(str);
            }
        } while (!str.equals("0"));
        System.out.println("Visitors:" + visitors);
        sc.close();
    }
}
