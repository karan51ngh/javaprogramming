import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);
        ad1.addFirst(5);

        /*
         * removeFirst() & pollFirst() methods are used to delete an element from the head of the queue.
         * removeFirst() throws an exception if the queue is empty.
         * pollFirst() returns null if the queue is empty
        */
        ad1.pollFirst(); //deletes 5
        ad1.removeFirst(); //deletes 6

        // Removing the last element: 

        ad1.pollLast(); //deletes 19
        ad1.removeLast(); //deletes 91

        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());
    }
}
