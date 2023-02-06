import java.util.*;

/*
 * HashSet class uses a hash table for storing the elements.
 * It implements the set interface.
 * Duplicate values are not allowed.
 * Before storing any object, the hashset uses the hashCode() and equals() method to check any duplicate entry in the hash table.
 * Allows null value.
 * Best suited for search operations.
 
 * HashSet(): This constructor is used to create a new empty HashSet that can store 16 elements and have a load factor of 0.75.
 * HashSet(int initialCapacity, float loadFactor): This constructor is used to create a new empty HashSet with the capacity 
   & load factor equal to specified integer and float value.
 * Load Factor: the measure that decides when to increase the capacity of the Map.
*/

public class Main{
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(16);
        myHashSet.add(33);
        myHashSet.add(78);
        myHashSet.add(19);
        myHashSet.add(29);
        myHashSet.add(10);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println("myHashSet before removing any element : " + myHashSet);
        myHashSet.remove(3); //deletes 3 from the hashset
        // remove() doesn't throw any exception in case the element is not present
        System.out.println("myHashSet after removing a element : " + myHashSet);

        System.out.println("The size of myHashSet is : " + myHashSet.size());

        System.out.println(myHashSet.isEmpty());

        System.out.println("myHashSet before : " + myHashSet);
        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet after  : " + myHashSet);

    }
}
