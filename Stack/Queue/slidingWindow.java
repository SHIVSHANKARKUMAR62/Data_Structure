package Data_Structure.Stack.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class slidingWindow {

    public static int[] maxSlidingWindows(int[] a,int k){
        int n = a.length;
        int[] r = new int[n-k+1];
        int ri = 0;

        // store index...
        Deque<Integer> q = new ArrayDeque<>();
        for (int i=0;i<a.length;i++){
            while (!q.isEmpty() && q.peek()<i-k+1){
                q.poll();
            }
            // remove smaller number in k range as they are useless

            while (!q.isEmpty() && a[q.peekLast()]<a[i]){
                q.pollLast();
            }

            // q contain index... r contains content

            q.offer(i);

            if (i>k-1){
                r[ri++] = a[q.peek()];
            }
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Creating an array...
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nEnter the index of checking: ");
        int index = sc.nextInt();

        int[] result = maxSlidingWindows(arr,index);

        System.out.print("Desired output is: ");
        for (int i=0; i< result.length-1; i++){
            System.out.print(result[i]+" ");
        }
    }
}
