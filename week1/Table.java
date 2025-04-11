import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Multiplication Table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        sc.close();
    }
}

/*
 * Sample Output:
 * Enter a number: 5
 * Multiplication Table of 5
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * ...
 * 5 x 10 = 50
 */