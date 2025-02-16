/*Given an array of integers, you are expected to find the minimum integer in the array then subtract the same from each element of the array and multiply each 
element with the same minimum integer and return the result.*/
package week5;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        int minimum;
        minimum = arr[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] - minimum) * minimum;
        }
        System.out.println("The array after the operation is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
