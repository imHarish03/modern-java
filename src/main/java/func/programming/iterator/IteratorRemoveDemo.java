package func.programming.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveDemo {
    public static void main(String[] args) {
        // Create a list with some elements
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Collections.synchronizedList(list);
        
        System.out.println("Original list: " + list);
        
        // Get an iterator
        Iterator<String> it = list.iterator();
        
        try {
            // First move to an element
            it.next();
            
            // First remove - this is valid
            it.remove();
            System.out.println("After first remove: " + list);
            
            // Second remove - this will throw IllegalStateException
            it.remove();
            System.out.println("After second remove: " + list);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
        
        System.out.println("Final list: " + list);
    }
}