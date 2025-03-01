package week7;
/*1. Write a Java program that performs the following basic operations using an ArrayList<Integer>:
    • Create an ArrayList and add the numbers 10, 20, 30, 40, 50 to it.
    • Insert 25 at index 2.
    • Remove the number 40 from the list.
    • Check if the list contains the number 30.
    • Sort the ArrayList in descending order.
    • Print the final ArrayList.
    • Reverse the ArrayList after sorting and print it.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListFunctions {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n;
        System.out.println("Enter number of elements: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        int ch;
        do{
            System.out.println("1. Insert at position\n2. Remove from the list\n3. Check if it contains a number\n4. Sort the array list\n5. Print the array list\n6. Reverse the array list");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the index and integer element :");
                    list.add(sc.nextInt(), sc.nextInt());
                case 2:
                    System.out.print("Enter the element to remove: ");
                    int i,j=0;
                    i=sc.nextInt();
                    for(int k: list)
                    {
                        if(i==k)
                        {
                            i=j;
                        }
                        j++;
                    }
                    list.remove(i);
                    break;
                case 3:
                    System.out.println("Enter the element to find: ");
                    if(list.contains(sc.nextInt()))
                    {
                        System.out.println("It is present.");
                    }
                    else
                    {
                        System.out.println("It is not present.");
                    }
                    break;
                case 4:
                    Collections.sort(list);
                    break;
                case 5:
                    System.out.println(list);
                    break;
                case 6:
                    System.out.println(list.reversed());
                    break;
                default:
                    sc.close();
                    return;
            }
            
        }while(true);
    }
}
