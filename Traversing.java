package Data_Structure;

import java.util.Scanner;

public class Traversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int []arr;
        System.out.print("Enter the size of  an Array:- ");
        n=sc.nextInt();
        arr = new int[n];
        System.out.print("Enter the Array Elements:- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array Elements are:- ");
        for (int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
