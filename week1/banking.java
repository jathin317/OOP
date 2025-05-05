import java.util.Scanner;

public class banking {
    s.o.p
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        char ch = 0;

        while (ch != '4') {
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter your choice: ");
            ch = scanner.next().charAt(0);
            switch (ch) {
                case '1':
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Deposit amount must be greater than zero.");
                    }
                    break;
                case '2':
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case '3':
                    System.out.println("Current balance: " + balance);
                    break;
                case '4':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}

/*
 * Sample Output:
 * 1. Deposit
 * 2. Withdraw
 * 3. Check Balance
 * 4. Exit
 * Enter your choice: 1
 * Enter amount to deposit: 500
 * Deposit successful.
 * 1. Deposit
 * 2. Withdraw
 * 3. Check Balance
 * 4. Exit
 * Enter your choice: 3
 * Current balance: 500.0
 * 1. Deposit
 * 2. Withdraw
 * 3. Check Balance
 * 4. Exit
 * Enter your choice: 4
 * Exiting...
 */