
/*3. Create a base class Shape with an attribute area and method calculate_area(). Create two subclasses Circle and Rectangle, both of which inherit from Shape and implement their own calculate_area() method. Display the area of both shapes.
Example:
•	Class Shape has a method calculate_area().
•	Class Circle inherits from Shape and overrides calculate_area() for a circle.
•	Class Rectangle inherits from Shape and overrides calculate_area() for a rectangle.
•	Calculate and display the area for both shapes.
*/
import java.util.Scanner;

// Base class Shape
class Shape {
    // Method to calculate area (can be overridden by subclasses)
    public void calculate_area() {
        System.out.println("Area of Shape is not defined.");
    }
}

// Circle class inherits from Shape
class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    public void calculate_area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle is: " + area);
    }
}

// Rectangle class inherits from Shape
class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    @Override
    public void calculate_area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle is: " + area);
    }
}

// Main class to test the implementation
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.println("1. Circle\n2. Rectangle");
        System.out.println("Enter your choice: ");
        ch = sc.next().charAt(0);

        switch (ch) {
            case '1':
                System.out.println("Enter radius of Circle: ");
                double r = sc.nextDouble();
                Circle c = new Circle(r);
                c.calculate_area();
                break;

            case '2':
                System.out.println("Enter length of Rectangle: ");
                double l = sc.nextDouble();
                System.out.println("Enter breadth of Rectangle: ");
                double b = sc.nextDouble();
                Rectangle rec = new Rectangle(l, b);
                rec.calculate_area();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
