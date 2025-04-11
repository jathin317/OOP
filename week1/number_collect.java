import java.util.Scanner;

public class number_collect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a number:");
            n = scanner.nextInt();
        } while (n != 0);
        scanner.close();
    }
}

/*
 * Sample Output:
 * Enter a number: 5
 * Enter a number: 10
 * Enter a number: 0
 */
