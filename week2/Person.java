import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;
    private String ssn;

    public Person(String name, int age, String address, String ssn) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter SSN: ");
        String ssn = scanner.nextLine();

        // Creating Person object with user input
        Person person = new Person(name, age, address, ssn);

        // Accessing fields and methods
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Address: " + person.address);
        System.out.println("SSN: " + person.getSsn());

        scanner.close();
    }
}

/*
Sample Output:
Enter name: Alice
Enter age: 25
Enter address: 123 Main St
Enter SSN: 123-45-6789
Name: Alice
Age: 25
Address: 123 Main St
SSN: 123-45-6789
*/