import java.util.LinkedList;
import java.util.Collections;

public class LinkedListsortExample {
    public static void main(String[] args) {
        // Create a LinkedList to hold String elements
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        // Unsorted LinkedList
        System.out.println("Unsorted LinkedList: " + linkedList);

        // 1. Sort the list using Collections.sort()
        Collections.sort(linkedList);

        // Sorted LinkedList
        System.out.println("Sorted LinkedList: " + linkedList);

        // 2. Custom sorting using reverse order (descending order)
        Collections.sort(linkedList, Collections.reverseOrder());

        // Custom sorted LinkedList (in reverse order)
        System.out.println("Custom Sorted LinkedList (Reverse Order): " + linkedList);
    }
}