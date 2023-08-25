package Data_Structure;

import java.util.Scanner;

public class InsertionSort {

    public static void Insertion(int[] arr,int n){
        for (int i=1;i< n-1;i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
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


        Insertion(arr,n);

        System.out.print("\nSorted elements are: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
