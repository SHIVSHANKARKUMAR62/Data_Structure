package Data_Structure.Stack.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue02 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(!queue.isEmpty());
        System.out.println(queue.peek());
    }
}
