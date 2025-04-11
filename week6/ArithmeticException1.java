/*1.  The program should Accept two integers from the user: the numerator and the denominator.								[2.5m]
Handle the following exceptions:
    • ArithmeticException: Raised when the denominator is zero.
    • NumberFormatException: Raised when the user enters a non-integer value.
Display appropriate error messages for each exception and ensure the program continues running until valid input is provided.

Sample Input 1
Enter the numerator: 10
Enter the denominator: 0
Output 1
Error: Division by zero is not allowed. Please try again.

Sample Input 2
Enter the numerator: ten
Enter the denominator: 5
Output 2
Error: Invalid input. Please enter integers only.

Sample Input 3
Enter the numerator: 20
Enter the denominator: 5
Output 3
*/
package week6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticException1 {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter the numerator: ");
                a = sc.nextInt();
                System.out.print("Enter the denominator: ");
                b = sc.nextInt();

                int c = a / b;
                System.out.println(a + " / " + b + " = " + c);
                sc.close();
                return;
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed. Please try again.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter integers only.");
                sc.nextLine(); // Clear the buffer
            }
        } while (true);
    }
}

/*
 * Sample Input 1:
 * Enter the numerator: 10
 * Enter the denominator: 0
 * Output 1:
 * Error: Division by zero is not allowed. Please try again.
 * 
 * Sample Input 2:
 * Enter the numerator: ten
 * Enter the denominator: 5
 * Output 2:
 * Error: Invalid input. Please enter integers only.
 * 
 * Sample Input 3:
 * Enter the numerator: 20
 * Enter the denominator: 5
 * Output 3:
 * 20 / 5 = 4
 */
