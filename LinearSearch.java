package Data_Structure;

import java.util.Scanner;

class Linear{
    int n,flag=0,pos;
    Scanner sc = new Scanner(System.in);
    void getdata() {
        System.out.print("Enter Size of  an Array:- ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Eements are:-");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int key;
        System.out.print("Enter Searching Element:-");
        key = sc.nextInt();
        for (int i=0;i<n;i++){
            if (arr[i]==key){
                flag++;
                pos=i+1;
            }
        }
    }
    void display(){
        if (flag==1){
            System.out.println("Searching Element present at the posstion:-  "+pos);
        }else {
            System.out.println("The Searching Element is not Fount .");
        }
    }
}
public class LinearSearch {
    public static void main(String[] args) {
        Linear l = new Linear();
        l.getdata();
        l.display();
    }
}
