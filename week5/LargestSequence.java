package week5;
/*Given an array of numbers, you are expected to return the sum of the longest sequence of odd numbers in the array. If there are no odd numbers in the array, you are expected to return -1. The array will contain numbers >= 0.
If there are more than one group of elements in the array having the longest sequence of odd numbers, you are expected to return the total sum of all those odd numbers. */
import java.util.Scanner;
public class LargestSequence {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
}
