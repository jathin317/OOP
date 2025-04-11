/* 2. Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter() . Create subclasses Triangle , Square,circle that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.
 Triangle: The area is calculated using the formula 1/2×base×height and the perimeter is the sum of all three sides.
  Square: The area is calculated as side×side  and the perimeter is 4×side
 Circle: The area is calculated using the formula π× radius2 and the perimeter (circumference) is calculated as 2×π×radius.
Output:
Triangle Area: 25.0
Triangle Perimeter: 24.0

Square Area: 16.0
Square Perimeter: 16.0

Circle Area: 153.93804
Circle Perimeter (Circumference): 43.98226
*/
import java.util.Scanner;

abstract class GeometricShape {
    abstract double area();

    abstract double perimeter();
}

class Circle extends GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Square extends GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }

    double perimeter() {
        return 4 * side;
    }
}

class Triangle extends GeometricShape {
    private double base, height, side1, side2, side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double area() {
        return 0.5 * base * height;
    }

    double perimeter() {
        return side1 + side2 + side3;
    }
}

public class shape {
    public static void main(String[] args) {
        // Example outputs based on user input:
        // If user selects Circle and enters radius 7:
        // Output:
        // Circle Area: 153.86
        // Circle Perimeter (Circumference): 43.96

        // If user selects Square and enters side 4:
        // Output:
        // Square Area: 16.0
        // Square Perimeter: 16.0

        // If user selects Triangle and enters base 10, height 5, and sides 6, 8, 10:
        // Output:
        // Triangle Area: 25.0
        // Triangle Perimeter: 24.0

        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.println("1. Circle\n2. Square\n3. Triangle");
        System.out.println("Enter your choice: ");
        choice = sc.next().charAt(0);
        switch (choice) {
            case '1':
                System.out.println("Enter radius: ");
                double radius = sc.nextDouble();
                Circle c = new Circle(radius);
                System.out.println("Circle Area: " + c.area());
                System.out.println("Circle Perimeter (Circumference): " + c.perimeter());
                break;
            case '2':
                System.out.println("Enter side: ");
                double side = sc.nextDouble();
                Square s = new Square(side);
                System.out.println("Square Area: " + s.area());
                System.out.println("Square Perimeter: " + s.perimeter());
                break;
            case '3':
                System.out.println("Enter base: ");
                double base = sc.nextDouble();
                System.out.println("Enter height: ");
                double height = sc.nextDouble();
                System.out.println("Enter side1: ");
                double side1 = sc.nextDouble();
                System.out.println("Enter side2: ");
                double side2 = sc.nextDouble();
                System.out.println("Enter side3: ");
                double side3 = sc.nextDouble();
                Triangle t = new Triangle(base, height, side1, side2, side3);
                System.out.println("Triangle Area: " + t.area());
                System.out.println("Triangle Perimeter: " + t.perimeter());
                break;
        }
        sc.close();
    }
}

// Output (example):
// 1. Circle
// 2. Square
// 3. Triangle
// Enter your choice: 1
// Enter radius: 7
// Circle Area: 153.86
// Circle Perimeter (Circumference): 43.96
