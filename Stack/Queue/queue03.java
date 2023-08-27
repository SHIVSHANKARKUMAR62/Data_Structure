package Data_Structure.Stack.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class queue03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.print("Enter array elements: ");
        for (int i=0;i<n;i++){
            deque.offer(i);
        }

        System.out.print("Queue elements are: "+deque);
    }
}
