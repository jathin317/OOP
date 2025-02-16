/*Given an input string, you are expected to extract either all vowels, or all non-vowels from the string and return the result as all lowercase or uppercase, based on the options specified.
input1 represents the input string.
input2 represents the extraction option. 0 for extraction of all non-vowels. 1 for extraction of all vowels.
input3 represents the output case option. 0 for all lowercase letters. 1 for all UPPERCASE letters.*/
package week5;

import java.util.Scanner;

public class ExtractVowels {
    public static String extractVowels(String str) {
        String vowels = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowels += ch;
            }
        }
        return vowels;
    }

    public static String extractNonVowels(String str) {
        String nonVowels = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U')) {
                nonVowels += ch;
            }
        }
        return nonVowels;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char ch;
        System.out.print("Enter '0' to extract vowels from the string and '1' to extract non-vowels from the string:");
        ch = sc.next().charAt(0);
        switch (ch) {
            case '0':
                str = extractVowels(str);
                break;
            case '1':
                str = extractNonVowels(str);
                break;
        }
        System.out.println(
                "Enter '0' to display the extracted string in lowercase and '1' to display the extracted string in uppercase:");
        ch = sc.next().charAt(0);
        switch (ch) {
            case '0':
                System.out.println(str.toLowerCase());
                break;
            case '1':
                System.out.println(str.toUpperCase());
                break;
        }
        sc.close();
    }
}
