package Data_Structure;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void sort(int[] arr,int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements are: ");
        for (int num1 : arr){
            System.out.print(num1+" ");
        }
        sort(arr,n);

        System.out.println("\nSorted elements are: "+Arrays.toString(arr));
    }
}
