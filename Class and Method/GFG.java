

// Java Program to Demonstrate Working of Set by
// Iterating through the Elements
 
// Importing utility classes
import java.util.*;
 
// Main class
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Creating object of Set and declaring String type
        Set<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<5;i++){
       hs.add(i);

        }
 
        // Adding elements to Set 
        // using add() method
 
        // Custom input elements
       // hs.add("A");
       // hs.add("B");
       // hs.add("C");
       // hs.add("B");
       // hs.add("D");
       // hs.add("E");
 
        // Iterating through the Set
        // via for-each loop
        for (Integer value : hs)
 
            // Printing all the values inside the object
            System.out.print(value + ", ");
         
        System.out.println();
    }
}