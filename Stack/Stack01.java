package Data_Structure.Stack;

import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        // Creating a stack class.
        Stack<Integer> stack = new Stack<>();
        // add the data
        stack.push(3);
        stack.push(7);
        stack.push(9);
        stack.push(11);
        stack.push(14);
        // print the stack element
        System.out.print("Elements are: "+stack);
        System.out.println();
        // print the top element
        int n = stack.peek();
        System.out.println("Peek element is: "+n);
        // delete the element in the stack
        stack.pop(); // this is used to delete the last element in the stack
        System.out.println("After deletion elements are: "+stack);
        // search the element search function return -1 when an element is not present in the stack
        System.out.println("Searching element present at the index is: "+stack.search(3));
        // empty function, they return boolean function...
        System.out.print("Is stack empty or not: "+stack.isEmpty());

    }
}
