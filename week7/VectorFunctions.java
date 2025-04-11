package week7;

/*    3. Create a Vector<Integer> with elements 5, 15, 25, 35, 45.
Print the Vector.
    • Insert an Element at a Specific Index
Insert the number 18 at index 3 in a Vector<Integer>.
Example Input: [5, 15, 25, 35, 45] → Insert 18 at index 3 → Output: [5, 15, 25, 18, 35, 45].
    • Remove an Element from the Vector
Remove the element 25 from the Vector.
Example Input: [5, 15, 25, 35, 45] → Output: [5, 15, 35, 45].
    • Check if an Element Exists in the Vector
Check if the Vector contains the number 60.
Example Input: [10, 20, 30, 40, 50] → Output: false.
    • Iterate Over a Vector in Different Ways
Given Vector<String> names = ["Alice", "Bob", "Charlie", "David"], print all elements using:
A for-each loop
A ListIterator (both forward and backward)
 */
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorFunctions {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> list = new Vector<>();
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
            switch (ch) {
                case 1:
                    System.out.println("Enter the index and integer element :");
                    list.add(sc.nextInt(), sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter the element to remove: ");
                    int i,
                            j = 0;
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
                    break;
                default:
                    sc.close();
                    return;
            }
        }
    }
}

/*
 * Sample Input:
 * Enter elements (comma-separated): 1, 2, 3, 4
 * Enter an element to search: 3
 * Output:
 * Original Vector: [1, 2, 3, 4]
 * Element 3 found at index: 2
 */
