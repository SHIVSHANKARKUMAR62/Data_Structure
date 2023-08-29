package Data_Structure;

import java.util.Scanner;

public class Floor_Number_Using_Binary_Search {

    public static int Solution(int[] arr, int target){

        int start = 0, end = arr.length-1, mid;


        while (start<=end){

            mid = start + (end - start)/2;

            if (target>=arr[mid]){

                return mid;

            }if (target>arr[mid]){

                start = mid + 1;

            }else {

                end = mid - 1;

            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array element: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements are: ");
        for (int s : arr){ // using for each loop
            System.out.print(s+" ");
        }

        System.out.print("\nEnter Floor Number: ");
        int element = sc.nextInt();

        // call the function...

        int index = Solution(arr,element);

        if (index==-1){
            System.out.print("No Floor element in the array...");
        }else {
            System.out.print("Floor elements fount at at the index: "+index);
        }
    }
}
