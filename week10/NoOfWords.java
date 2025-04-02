package week10;

/*1.Design Frequency Counter using Map interface
Input:
“Java is great. Java is powerful. Java is popular!”
Output:
java: 3
is: 3
great: 1
powerful: 1
popular: 1 */
import java.util.Scanner;
import java.util.TreeMap;
import java.lang.String;

public class NoOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        TreeMap<String, Integer> frequency = new TreeMap<>();
        String wordArray[] = str.split("\\s+");
        for (String word : wordArray) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }
        System.out.println(frequency);
        sc.close();
    }
}
