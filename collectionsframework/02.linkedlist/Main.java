import java.util.*;
 
/*
 * The LinkedList class in Java provides us with the doubly linked list data structure.
 * Each element of the linked list is known as a node.
 * Each node points to the address of the next node & its previous node.
*/

/*
    ArrayList Vs. LinkedList 
 * The insertion & deletion can be done in constant time in Linked List
 * Accessing random indices is cheaper and done in constant time in Array List
 * both implement the List interface and have the same methods
*/
public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);
        
        l1.addLast(676);
        l1.addFirst(788);
        
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        
        //l1.clear();
        l1.set(1, 566);
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
