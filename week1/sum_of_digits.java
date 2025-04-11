import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int n = number;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println("Sum of digits of " + number + " is " + sum);
        sc.close();
    }
}

/*
 * Sample Output:
 * Enter a number: 123
 * Sum of digits of 123 is 6
 */
