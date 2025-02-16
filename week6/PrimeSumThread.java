/*Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads	*/
package week6;

import java.lang.Thread;
import java.util.Scanner;

class PrimeThread extends Thread {
    int i;
    boolean isPrime = true;

    PrimeThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        if (i < 2) {
            isPrime = false;
            return;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
    }

    boolean getIsPrime() {
        return isPrime;
    }
}

public class PrimeSumThread {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        boolean arr[] = new boolean[n + 1];
        PrimeThread[] threads = new PrimeThread[n + 1];
        for (int i = 1; i <= n; i++) {
            threads[i] = new PrimeThread(i);
            threads[i].start();
        }
        try {
            for (int i = 1; i <= n; i++) {
                threads[i].join();
                arr[i] = threads[i].getIsPrime();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                sum += i;
            }
        }
        System.out.println("Sum of prime numbers: " + sum);
        sc.close();
    }
}
