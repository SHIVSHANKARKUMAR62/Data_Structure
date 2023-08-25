package Data_Structure;

import java.util.Scanner;

public class BinarySearch {

    public static int Search(int[] arr, int key,int n){
        int l = 0,r = n-1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == key)
                return m;

            if (arr[m] < key)
                l = m + 1;

            else
                r = m - 1;
        }
        return  0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
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
        System.out.print("\nEnter searching element: ");
        int key = sc.nextInt();
        int result = Search(arr,key,n);
        if(result!=0){
            System.out.println("Element is found at the index "+result+"...");
        }else {
            System.out.println("Element is not found...");
        }

    }
}
