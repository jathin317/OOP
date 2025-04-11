package week9;

/*    1 Write a Java program to demonstrate the usage of various Set interface methods using HashSet. Perform the following operations:
    • Create a HashSet “ Student ” of type String and add at least five names (“Alice”, ”Bob”, ”Charlie”, ”David”, ”Alice”,”Eve”) and check size of the set.
    • Check if a "Charlie" exists in the Student set 
    • Remove "Bob" from the Student set 
    • Display the size of the Student  , and check if it is empty .
    • Iterate over the Student using both a for-each loop and an Iterator.
    • Add another collection of names (“Alice”,”Eve”,”Frank”) to the new HashSet named newStudents .
    • Create a new HashSet named commonStudents by retaining common elements between two sets 
    • Remove all the common students from Students set
    • Convert the set to an array using toArray() method and print the elements using Arrays.toString() method .
    • Clear all elements from the set and display the empty set. */
import java.util.HashSet;
import java.util.Arrays;

public class Hash_Set {
    public static void main(String[] Args) {
        HashSet<String> student = new HashSet<>();
        student.add("Alice");
        student.add("Bob");
        student.add("Charlie");
        student.add("David");
        student.add("Alice");
        student.add("Eve");
        if (student.contains("Charlie")) {
            System.out.println("Charlie is present in the student hash set");
        } else {
            System.out.println("Charlie is not found in the hashset");
        }
        student.remove("Bob");
        System.out.println("Size of the hashset = " + student.size());
        System.out.println("/nUsing for each");
        for (String str : student) {
            System.out.print(str + " ");
        }
        System.out.println();
        HashSet<String> commonStudents = new HashSet<String>();
        commonStudents.add("Alice");
        commonStudents.add("Eve");
        commonStudents.add("Frank");
        commonStudents.retainAll(student);
        System.out.println(Arrays.toString(student.toArray()));
        System.out.println("Removing all elements ");
        student.clear();
        System.out.println("Hashset = " + student);
    }
}

/*
 * Sample Input:
 * Enter elements to add to the HashSet (comma-separated): 10, 20, 30, 20, 40
 * 
 * Sample Output:
 * Original HashSet: [10, 20, 30, 40]
 * HashSet size: 4
 * Is 20 present in the HashSet? true
 */
