package week7;

/*    2. Write a program to create a LinkedList<Integer> and add the elements 10, 20, 30, 40, 50 to it.
Print the LinkedList.
    • Insert an Element at a Specific Position
Insert the number 25 at index 2 in a LinkedList<Integer>.
Print the updated list.
    • Remove an Element from the LinkedList
Remove the element 40 from the LinkedList.
Print the modified list.
    • Check if an Element Exists in the LinkedList
Check if the LinkedList contains the number 30.
Print true or false.
    • Iterate Over a LinkedList in Different Ways
Print all elements using:
A for-each loop
A ListIterator (both forward and backward)
*/
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListFunctions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(
                "1. Enter the element at specific position\n2. Remove an element\n3. Check if an element exist\n4. Print");

        while (true) {
            int ch = sc.nextInt();
            switch (ch)

            {
                case 1:
                    System.out.println("Enter the index and integer element :");
                    list.add(sc.nextInt(), sc.nextInt());
                case 2:
                    System.out.print("Enter the element to remove: ");
                    int i, j = 0;
                    i = sc.nextInt();
                    for (int k : list) {
                        if (i == k) {
                            i = j;
                        }
                        j++;
                    }
                    list.remove(i);
                    break;
                case 3:
                    System.out.println("Enter the element to find: ");
                    if (list.contains(sc.nextInt())) {
                        System.out.println("It is present.");
                    } else {
                        System.out.println("It is not present.");
                    }
                    break;
                case 4:
                    System.out.println("Using for-each: ");
                    for (int l : list) {
                        System.out.print(l + " ");
                    }
                    System.out.println();
                    System.out.println("Using iterator:Forward");
                    ListIterator<Integer> iterator = list.listIterator();
                    while (iterator.hasNext()) {
                        System.out.print(iterator.next() + " ");
                    }
                    System.out.println("Reverse:");

                    while (iterator.hasPrevious()) {
                        System.out.print(iterator.previous() + " ");
                    }
                default:
                    sc.close();
                    return;
            }
        }
    }
}

/*
 * Sample Input:
 * Enter elements (comma-separated): A, B, C, D
 * Enter an element to add at the beginning: Z
 * Output:
 * Original LinkedList: [A, B, C, D]
 * LinkedList after adding Z at the beginning: [Z, A, B, C, D]
 */
