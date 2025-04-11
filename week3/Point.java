/*Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:
•	One constructor takes int parameters.
•	Another constructor takes double parameters.
•	Print the values of the variables for each constructor.
Output:
Point (x, y): (4, 5)
Point (x, y): (4, 5)
*/
import java.util.*;

class Point {
    int x, y;

    public Point(int x, int y) {
        System.out.println("Inside constructor int");
        this.x = x;
        this.y = y;
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }

    public Point(double x, double y) {
        System.out.println("Inside constructor double");
        this.x = (int) x;
        this.y = (int) y;
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        // Example outputs based on user input:
        // If user selects double and enters x=4.5, y=5.5:
        // Output:
        // Inside constructor double
        // Point (x, y): (4, 5)

        // If user selects int and enters x=4, y=5:
        // Output:
        // Inside constructor int
        // Point (x, y): (4, 5)

        int x, y;
        double x1, y1;
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("1. double\n2. int");
        ch = sc.next().charAt(0);
        switch (ch) {
            case '1' -> {
                System.out.print("Enter x and y values: ");
                x1 = sc.nextDouble();
                y1 = sc.nextDouble();
                @SuppressWarnings("unused")
                Point p1 = new Point(x1, y1);
            }
            case '2' -> {
                System.out.println("Enter x and y values: ");
                x = sc.nextInt();
                y = sc.nextInt();
                @SuppressWarnings("unused")
                Point p2 = new Point(x, y);
            }
            default -> System.out.println("Invalid choice");
        }
        sc.close();
    }
}

// Output (example):
// 1. double
// 2. int
// Enter your choice: 1
// Enter x and y values: 4.5 5.5
// Inside constructor double
// Point (x, y): (4, 5)