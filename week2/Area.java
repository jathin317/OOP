/*3. Create a base class Shape with an attribute area and method calculate_area(). Create two subclasses Circle and Rectangle, both
 of which inherit from Shape and implement their own calculate_area() method. Display the area of both shapes.
Example:
•	Class Shape has a method calculate_area().
•	Class Circle inherits from Shape and overrides calculate_area() for a circle.
•	Class Rectangle inherits from Shape and overrides calculate_area() for a rectangle.
•	Calculate and display the area for both shapes.
*/

import java.util.Scanner;

class Shape {
    public void calculate_area() {
        System.out.println("Area of Shape is not defined.");
    }
}

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

/*
Sample Output:

1. Circle
2. Rectangle
Enter your choice: 
1
Enter radius of Circle: 
5
Area of Circle is: 78.5

---

1. Circle
2. Rectangle
Enter your choice: 
2
Enter length of Rectangle: 
4
Enter breadth of Rectangle: 
6
Area of Rectangle is: 24.0

---

1. Circle
2. Rectangle
Enter your choice: 
3
Invalid choice
*/
