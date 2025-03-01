package week7;

/*    4. Stack
    •  Create a Stack<Integer> with elements 5, 15, 25, 35, 45.
        ◦ Print the Stack.
    • Push and Pop Elements from the Stack
        ◦ Push the elements 12, 22, 32 into a Stack<Integer>.
        ◦ Pop the top two elements and print the updated stack.
    • Peek at the Top Element
        ◦ Given a Stack<Integer> = [100, 200, 300, 400], find and print the top element without removing it.
        ◦ Expected Output: 400.
    • Search for an Element in the Stack
        ◦ Given Stack<Integer> = [10, 20, 30, 40, 50], check if the number 30 is present.
        ◦ If found, print its 1-based position (as returned by search()).
    • Check if the Stack is Empty
        ◦ Given a Stack<String>:
        ◦ Initially empty, check if it is empty.
        ◦ Push "Apple", "Banana", "Cherry".
        ◦ Check again if it is empty.
        ◦ Intermediate Stack Operations (with different inputs):
    • Reverse a String Using a Stack
        ◦ Given a string "STACK", use a Stack<Character> to reverse it.
        ◦ Expected Output: "KCATS".
    • Check for Balanced Parentheses Using a Stack
        ◦ Example Input 1: "({[]})" → Output: true
        ◦ Example Input 2: "([{}])" → Output: true
        ◦ Example Input 3: "({[)]}" → Output: false
        */
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
            System.out.println("30 is present at position " + s1.indexOf(30) + 1);
        }
        if (s1.isEmpty()) {
            System.out.println("Stack is empty");
        } else
            System.out.println("Stack is not empty");
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
                System.out.print(s3.peek());
                s3.pop();
            }
            System.out.println("Enter the paranthesis: ");
            s = sc.nextLine();
            boolean balanced = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    s3.push(s.charAt(i));
                } else {
                    if (s.charAt(i) == ')' && s3.peek() != '(') {
                        balanced = false;
                        break;
                    } else if ((s.charAt(i) == '}' && s3.peek() != '{')) {
                        balanced = false;
                        break;
                    } else if (s.charAt(i) == ']' && s3.peek() != '[') {
                        balanced = false;
                        break;
                    }
                    s3.pop();
                }
            }
            if (balanced) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not balanced");
            }
        }
    }
}
