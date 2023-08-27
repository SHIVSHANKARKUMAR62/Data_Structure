package Data_Structure.Stack.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuePart {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // Add the elements at the first index using addFirst() method...
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);
        // Showing all the elements....
        System.out.println("Deque elements are: "+deque);

        // Add the elements at the last index...
        deque.addLast(40);
        deque.addLast(50);

        // Showing the deque elements after using addLast() method...

        System.out.println("Deque elements are: "+deque);

        // Using offerFirst() method to add the elements in the deque...

        deque.offerFirst(80);
        deque.offerFirst(90);

        // Showing the deque elements after using offerFirst() method using...

        System.out.println("Deque elements are: "+deque);

        // using offerLast() method to add the elements at the last index...

        deque.offerLast(100);
        deque.offerLast(110);

        // Showing the deque elements after using offerLast() method...

        System.out.println("Deque elements are: "+deque);

        // using removeFirst() method to delete the elements in the deque...

        deque.removeFirst();

        // sowing the elements after delete the 1st index of the elements...

        System.out.println("Deque elements are: "+deque);

        // using removeLast() method to delete the last index of the elements...

        deque.removeLast();

        // showing the elements after delete the last index of the elements in deque...

        System.out.println("Deque elements are: "+deque);

        // using the peekFirst() method to peek the first elements in the deque...

        deque.peekFirst();

        // showing the deque elements after using peekFirst() method...

        System.out.println("Deque elements are: "+deque);

        // using the peekLast() method to peek the first elements in the deque...

        deque.peekLast();

        // showing the deque elements after using peekLast() method...

        System.out.println("Deque elements are: "+deque);

    }
}
