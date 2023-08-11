package Data_Structure;

import java.util.Scanner;

class Stacks{
    int top=-1;

    public int sizeofanarray(){
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        m=sc.nextInt();
        return m;
    }
    int n=sizeofanarray();
    int []a=new int[n];
    public void push(){
        Scanner sc = new Scanner(System.in);
        if (top==(n-1)){
            System.out.println("Overflow");
        }else {
            //Scanner sc = new Scanner(System.in);
            System.out.print("Enter Item:- ");
            int i = sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("Item Inserted....");
        }
    }
    public void pop(){
        if (top==-1){
            System.out.println("Underflow");
        }else {
            top=top-1;
            System.out.println("Item Deleted");
        }
    }

    public void Display(){
        System.out.print("Items are :- ");
        for (int i=top;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

public class Stack_In_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stacks new_stack = new Stacks();
        int d,l;
        do {
            System.out.println("Enter Your Choice\nPress 1 to push the item\nPress 2 to pop the item\nPress 3 to display the item");
            d=sc.nextInt();
            switch (d){
                case 1: {
                    new_stack.push();
                    break;
                }
                case 2:{
                    new_stack.pop();
                    break;
                }
                case 3:{
                    new_stack.Display();
                    break;
                }
            }
            System.out.print("If u want to run the Program then press Zero(0) otherWise press any key:- ");
            l = sc.nextInt();
        }while (l==0);
        System.out.println("Exit Successfully");
    }
}
