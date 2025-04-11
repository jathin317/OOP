package week4;

/* . create a Java program that calculates the area of different shapes using an interface. The program should include:							[2.5m]
	A Shape interface with a method double calculateArea().
	Implementations of this interface for at least three shapes:
o	Circle
o	Rectangle
o	Triangle
Sample input:
Enter radius of the circle: 5
Enter length and width of the rectangle: 10 4
Enter base and height of the triangle: 6 8
Output
Area of Circle: 78.54
Area of Rectangle: 40.0
Area of Triangle: 24.0  */
import java.util.Scanner;

interface Shape {
    Scanner sc = new Scanner(System.in);

    double calculateArea();
}

class Circle implements Shape {
    double r;

    {
        System.out.print("Enter radius of the circle: ");
        r = sc.nextDouble();
    }

    public double calculateArea() {
        double area;
        area = 3.14 * r * r;
        return area;
    }
}

class Rectangle implements Shape {
    double l, w;
    {
        System.out.println("Enter the length and width of the rectangle: ");
        l = sc.nextDouble();
        w = sc.nextDouble();
    }

    public double calculateArea() {
        return l * w;
    }
}

class Triangle implements Shape {
    double b, h;
    {
        System.out.println("Enter the base and height of the triangle: ");
        b = sc.nextDouble();
        h = sc.nextDouble();
    }

    public double calculateArea() {
        return 0.5 * b * h;
    }
}

public class Main1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle\nEnter your choice: ");
        ch = sc.next().charAt(0);
        switch (ch) {
            case '1':
                Circle c = new Circle();
                System.out.println("Area of Circle: " + c.calculateArea());
                break;
            case '2':
                Rectangle r = new Rectangle();
                System.out.println("Area of Rectangle: " + r.calculateArea());
                break;
            case '3':
                Triangle t = new Triangle();
                System.out.println("Area of Triangle: " + t.calculateArea());
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}

/*
 * Sample Output:
 * 1. Circle
 * 2. Rectangle
 * 3. Triangle
 * Enter your choice: 1
 * Enter radius of the circle: 5
 * Area of Circle: 78.54
 * 
 * 1. Circle
 * 2. Rectangle
 * 3. Triangle
 * Enter your choice: 2
 * Enter the length and width of the rectangle: 10 4
 * Area of Rectangle: 40.0
 * 
 * 1. Circle
 * 2. Rectangle
 * 3. Triangle
 * Enter your choice: 3
 * Enter the base and height of the triangle: 6 8
 * Area of Triangle: 24.0
 */