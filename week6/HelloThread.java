/*Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.*/
package week6;
import java.lang.Thread;

class Hello extends Thread {
    public void run() {
        System.out.println("Hello world");
    }
}

public class HelloThread {
    public static void main(String[] args) {

        Hello t = new Hello();
        t.start();
    }
}
