package Data_Structure;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int temp;
        System.out.print("Enter the size of ab array:-");
        n=sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter Array Elements:- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Before Sorting array elements are:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Bubble sorted elements are:-");
        for (int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
        }
    }
}
