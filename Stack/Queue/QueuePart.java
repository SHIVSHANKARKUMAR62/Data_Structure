package Data_Structure.Stack.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueuePart {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // inserting the data in the queue
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Queue: ");
        int n = sc.nextInt();

        // Inserting the data
        System.out.print("Enter the elements: ");
        for (int i=0; i<n; i++){
            int data = sc.nextInt();
            q.add(data); // addAll() method is used to insert total data in one queue to another queue
        }


        // Size of the queue
        System.out.println("Size of the queue before deletion is: "+q.size());

        // Display the data of the queue
        System.out.println("Before deletion Queue elements are: "+q);

        // First elements in the queue is...
        System.out.println("First element in the queue before deletion is: "+q.peek());

        // delete the data in the queue
        int delete = q.remove();
        System.out.println("Deleted data in the queue is: "+delete);

        // First elements in the queue is...
        System.out.println("First element in the queue after deletion is: "+q.peek());
        // after deletion queue elements are...

        System.out.println("After deletion Queue elements are: "+q);

        // Size of the queue

        System.out.print("Size of the queue after deletion is: "+q.size());

    }
}
