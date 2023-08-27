package Data_Structure.Stack;

import java.util.Scanner;
import java.util.Stack;

public class queue_Using_Stack {


    // stack flow LIFO concept and queue flow FIFO concept...

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Inserting data in the stack...
    public void Enqueue(int data){
        stack1.push(data);
    }

    public int Dequeue(){
        int delete;
        if (stack1.empty() && stack2.empty()){
            System.out.println("Queue is empty...");
            System.exit(0);
        }

        // show the elements present in the stack

        System.out.print("Elements are in first stack is: "+stack1);
        System.out.println();

        // push all the elements in stack1 to stack2...
        if (stack2.empty()){
            while (!stack1.empty()){
                delete = stack1.pop();
                stack2.push(delete);
            }
        }

        // pop the elements from stack2
        // they flow FIFO concept// show the elements present in the stack
        // second stack have elements
        System.out.print("Elements are in second stack is: "+stack2);
        System.out.println();

        delete = stack2.pop();
        return delete;

    }

    public static void main(String[] args) {
        // creating the class of the object...
        queue_Using_Stack qs = new queue_Using_Stack(); // qs mean queue using stack...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Queue: ");
        int n = sc.nextInt();

        // Inserting the data
        System.out.print("Enter the elements: ");
        for (int i=0; i<n; i++){
            int data = sc.nextInt();
            qs.Enqueue(data);
        }

       System.out.print("Deletion element in the queue is: "+ qs.Dequeue());

    }
}
