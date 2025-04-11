package week5;

/*Given an array of numbers, you are expected to return the sum of the longest sequence of odd numbers in the array. If there are no odd numbers in the array, you are expected to return -1. The array will contain numbers >= 0.
If there are more than one group of elements in the array having the longest sequence of odd numbers, you are expected to return the total sum of all those odd numbers. */
import java.util.Scanner;

public class LargestSequence {
    public static int findLongestOddSequenceSum(int[] arr) {
        int maxSum = -1, currentSum = 0, maxLength = 0, currentLength = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                currentSum += num;
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxSum = currentSum;
                } else if (currentLength == maxLength) {
                    maxSum += currentSum;
                }
                currentSum = 0;
                currentLength = 0;
            }
        }
        if (currentLength > maxLength) {
            maxSum = currentSum;
        } else if (currentLength == maxLength) {
            maxSum += currentSum;
        }

        return maxSum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findLongestOddSequenceSum(arr);
        System.out.println("The sum of the longest sequence of odd numbers is: " + result);

        sc.close();
    }
}

/*
 * Sample Input:
 * Enter the number of elements in the array: 7
 * Enter the elements in the array: 1 3 5 2 7 9 11
 * 
 * Sample Output:
 * The sum of the longest sequence of odd numbers is: 27
 */
