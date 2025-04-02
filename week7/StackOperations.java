package week7;

import java.util.Scanner;
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(5);
        s1.push(15);
        s1.push(25);
        s1.push(35);
        s1.push(45);
        s1.push(12);
        s1.push(22);
        s1.push(32);
        s1.pop();
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.peek());
        if (s1.contains(30)) {
            System.out.println("30 is present at position " + (s1.indexOf(30) + 1));
        }
        if (s1.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }

        Stack<String> s2 = new Stack<>();
        System.out.println("New stack is empty: " + s2.isEmpty());
        s2.push("Apple");
        s2.push("Banana");
        s2.push("Cherry");
        System.out.println(s2);

        Stack<Character> s3 = new Stack<>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string to be reversed: ");
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                s3.push(s.charAt(i));
            }
            while (!s3.isEmpty()) {
                System.out.print(s3.pop());
            }
            System.out.println();

            System.out.println("Enter the parentheses: ");
            s = sc.nextLine();
            boolean balanced = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    s3.push(s.charAt(i));
                } else {
                    if (s3.isEmpty()) {
                        balanced = false;
                        break;
                    }
                    if (s.charAt(i) == ')' && s3.peek() != '(') {
                        balanced = false;
                        break;
                    } else if (s.charAt(i) == '}' && s3.peek() != '{') {
                        balanced = false;
                        break;
                    } else if (s.charAt(i) == ']' && s3.peek() != '[') {
                        balanced = false;
                        break;
                    } else {
                        s3.pop();
                    }
                }
            }
            if (!s3.isEmpty()) {
                balanced = false;
            }
            if (balanced) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not balanced");
            }
        }
    }
}
