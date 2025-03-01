/*Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20	*/
package week6;
import java.lang.Runnable;

class Even implements Runnable {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}

class Odd implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}

public class EvenAndOdd {
    public static void main(String args[]) {
        Even e = new Even();
        Odd o = new Odd();
        o.run();
        System.out.println();
        
        e.run();

    }
}
