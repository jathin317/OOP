import java.util.Scanner;

class person {
    String name;
    int age;
    char gender;
}

class employee extends person {
    int id;
    String department;
    int salary;
}

public class inheritence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee emp = new employee();

        System.out.print("Enter name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter age: ");
        emp.age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        emp.gender = sc.next().charAt(0);

        System.out.print("Enter ID: ");
        emp.id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter department: ");
        emp.department = sc.nextLine();

        System.out.print("Enter salary: ");
        emp.salary = sc.nextInt();

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Gender: " + emp.gender);
        System.out.println("ID: " + emp.id);
        System.out.println("Department: " + emp.department);
        System.out.println("Salary: " + emp.salary);
        sc.close();
    }
}

/*
Sample Output:
Enter name: John
Enter age: 30
Enter gender (M/F): M
Enter ID: 101
Enter department: IT
Enter salary: 50000

Employee Details:
Name: John
Age: 30
Gender: M
ID: 101
Department: IT
Salary: 50000
*/