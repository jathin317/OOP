package week4;

/*Create an interface Calculator with the following methods:		[2.5m]
•	double add(double a, double b)
•	double subtract(double a, double b)
•	double multiply(double a, double b)
•	double divide(double a, double b)
•	double power(double base, double exponent)
•	long factorial(int n)
 Create a class ScientificCalculator that implements the Calculator interface:
•	Implement add, subtract, multiply, and divide for basic arithmetic.
•	Implement power to compute baseexponent.
•	Implement factorial to calculate the factorial of a number n using an iterative approach.
   
Create a CalculatorApp class with a main method to:
•	Display a menu of operations.
•	Accept user input for the selected operation and numbers.
•	Perform the operation using the ScientificCalculator class.
•	Display the result.

Sample Menu
Select an operation:
1. Add
2. Subtract
3. Multiply
4. Divide
5. Power
6. Factorial
Enter your choice: 1

Enter first number: 10
Enter second number: 5

Sample output:
Result: 15.0
*/
import java.util.Scanner;

interface Calculator {
    double add(double a, double b);

    double subtract(double a, double b);

    double multiply(double a, double b);

    double divide(double a, double b);

    double power(double base, double exponent);

    long factorial(int n);
}

class ScientificCalculator implements Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double power(double base, double exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public long factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class CalculatorApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println(
                "MENU\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Power\n6. Factorial\nEnter your choice: ");
        ch = sc.nextInt();

        ScientificCalculator s = new ScientificCalculator();
        switch (ch) {
            case 1:
                double a, b;
                System.out.print("Enter first number: ");
                a = sc.nextDouble();
                System.out.print("Enter second number: ");
                b = sc.nextDouble();
                System.out.println("Result: " + s.add(a, b));
                break;
            case 2:
                double a1, b1;
                System.out.print("Enter first number: ");
                a1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                b1 = sc.nextDouble();
                System.out.println("Result: " + s.subtract(a1, b1));
                break;
            case 3:
                double a2, b2;
                System.out.print("Enter first number: ");
                a2 = sc.nextDouble();
                System.out.print("Enter second number: ");
                b2 = sc.nextDouble();
                System.out.println("Result: " + s.multiply(a2, b2));
                break;
            case 4:
                double a3, b3;
                System.out.print("Enter first number: ");
                a3 = sc.nextDouble();
                System.out.print("Enter second number: ");
                b3 = sc.nextDouble();
                System.out.println("Result: " + s.divide(a3, b3));
                break;
            case 5:
                double base, exponent;
                System.out.print("Enter base: ");
                base = sc.nextDouble();
                System.out.print("Enter the exponent: ");
                exponent = sc.nextDouble();
                System.out.println("Result: " + s.power(base, exponent));
                break;
            case 6:
                int n;
                System.out.print("Enter a number: ");
                n = sc.nextInt();
                System.out.println("Result: " + s.factorial(n));
                break;
            default:
                System.out.println("Invalid Input.");
        }
        sc.close();
    }
}
