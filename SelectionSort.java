package Data_Structure;

import java.util.Scanner;

public class SelectionSort {

    public static void Selection(int[] arr,int n){
        for (int i=0;i<n;i++){
            int min_index = i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if (min_index!=i){
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
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


        Selection(arr,n);

        System.out.print("\nSorted elements are: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
