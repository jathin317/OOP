package week9;

/*A university grading system needs to maintain a list of students sorted by marks in ascending order. If multiple students have the same marks, they should be sorted alphabetically by name.
Use TreeSet with:
    • Comparable to define natural sorting order (by marks).
    • Comparator for custom sorting (by name in case of equal marks).
    • Ensures unique students (based on Roll Number).
    • Automatically maintains sorted order. */

import java.util.TreeSet;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    int roll;
    float marks;

    Student(String name, int roll, float marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        int temp = Float.compare(marks, s.marks);
        if (temp != 0) {
            return temp;
        }
        return name.compareTo(s.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll: " + roll + ", Marks: " + marks;
    }
}

public class GradingSystem {
    public static void main(String[] args) {
        TreeSet<Student> list = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details: (Name, Roll no., Marks)");
            String name = sc.next();
            int roll = sc.nextInt();
            float marks = sc.nextFloat();
            list.add(new Student(name, roll, marks));
        }

        System.out.println("Students sorted by marks (and name if marks are equal):");
        for (Student s : list) {
            System.out.println(s);
        }

        sc.close();
    }
}
