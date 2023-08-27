package Data_Structure.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stack_Using_Queue {

    // stack flow LIFO concept and queue flow FIFO concept...

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // Inserting the data in the stack
    public void Insert(int data){
        // move the data from queue1 to queue2
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek()); // put the 1st element in queue2
            queue1.poll(); // this is used to remove the elements
        }
        queue1.add(data);
        // move the data from queue2 to queue1
        while (!queue2.isEmpty()){
            queue1.add(queue2.peek());  // put the 1st element in queue1
            queue2.poll(); // this is used to remove the elements
        }
    }

    public int delete(){

        int remove;
        if (queue1.isEmpty()){
            System.out.print("Stack is Empty...");
            System.exit(0);
        }

        remove = queue1.peek();
        queue1.poll();
        return remove;

    }

    public static void main(String[] args) {
        stack_Using_Queue sq = new stack_Using_Queue();
        // creating the class of the object...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Stack: ");
        int n = sc.nextInt();

        // Inserting the data
        System.out.print("Enter the elements: ");
        for (int i=0; i<n; i++){
            int data = sc.nextInt();
            sq.Insert(data);
        }

        System.out.print("Deletion element in the queue is: "+ sq.delete());
    }
}
