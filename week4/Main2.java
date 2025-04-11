package week4;

import java.util.Scanner;

/*Design a payment system where different payment methods (Credit Card, Debit Card, and PayPal) can process payments.
 Use an interface to define the common functionality of processing payments and implement it in the respective classes.[2.5m]
Sample Output
Processing credit card payment of ₹500.75
Card Number: 1234-5678-9876-5432
----------------
Processing debit card payment of ₹300.50
Card Number: 9876-5432-1234-5678
----------------
Processing PayPal payment of ₹1000.0
Email: user@example.com
 */
interface Payment {
    void processPayment(double amount);
}

class CreditCard implements Payment {
    Scanner sc = new Scanner(System.in);
    {
        System.out.print("Enter the card number:");
    }
    long cardNumber = sc.nextLong();

    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
        System.out.println("Card Number: " + cardNumber);
    }
}

class DebitCard implements Payment {
    Scanner sc = new Scanner(System.in);

    {
        System.out.print("Enter the card number:");
    }
    long cardNumber = sc.nextLong();

    public void processPayment(double amount) {
        System.out.println("Processing debit card payment of ₹" + amount);
        System.out.println("Card Number: " + cardNumber);
    }
}

class PayPal implements Payment {
    Scanner sc = new Scanner(System.in);
    {
        System.out.print("Enter the email:");
    }
    String email = sc.nextLine();

    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of ₹" + amount);
        System.out.println("Email: " + email);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount:");
        double amount = sc.nextDouble();
        while (true) {
            System.out.print("1. Credit Card\n2. Debit Card\n3. PayPal\n4. Exit\nEnter your choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    CreditCard c = new CreditCard();
                    c.processPayment(amount);
                    break;
                case 2:
                    DebitCard d = new DebitCard();
                    d.processPayment(amount);
                    break;
                case 3:
                    PayPal p = new PayPal();
                    p.processPayment(amount);
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

/*
 * Sample Output:
 * Enter the amount: 500.75
 * 1. Credit Card
 * 2. Debit Card
 * 3. PayPal
 * 4. Exit
 * Enter your choice: 1
 * Enter the card number: 1234567898765432
 * Processing credit card payment of ₹500.75
 * Card Number: 1234567898765432
 * 1. Credit Card
 * 2. Debit Card
 * 3. PayPal
 * 4. Exit
 * Enter your choice: 4
 */
