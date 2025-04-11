import java.util.Scanner;

public class div3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Number is divisible by 3 and 5");
        } else {
            System.out.println("Number is not divisible by 3 and 5");
        }
        sc.close();
    }
}

/*
 * Sample Output:
 * Enter a number: 15
 * Number is divisible by 3 and 5
 */