package Data_Structure;

import java.util.Scanner;
class queue{
    int front=-1;
    int rare =-1;

    public int sizeofanarray(){
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:- ");
        m=sc.nextInt();
        return m;
    }
    int n=sizeofanarray();
    int []a=new int[n];
    public void enqueue(){
        Scanner sc = new Scanner(System.in);
        if (rare==(n-1)){
            System.out.println("Overflow condition");
        }else {
            System.out.print("Enter Data:- ");
            int j= sc.nextInt();
            if (front==-1 && rare==-1){
                front=0;
                rare=0;
                a[rare]=j;
            }else {
                rare=rare+1;
                a[rare]=j;
            }
        }
    }
    public void dequeue(){
        if (front==-1 && rare==-1){
            System.out.println("Underflow");
        }else {
            front=front+1;
        }
    }

    public void Display(){
        System.out.print("Items are :- ");
        for (int i=front;i<=rare;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
public class Queue_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue new_queue = new queue();
        int d,l;
        do {
            System.out.println("Enter Your Choice\nPress 1 to enqueue\nPress 2 to dequeue\nPress 3 to display the item");
            d=sc.nextInt();
            switch (d){
                case 1: {
                    new_queue.enqueue();
                    break;
                }
                case 2:{
                    new_queue.dequeue();
                    break;
                }
                case 3:{
                    new_queue.Display();
                    break;
                }
            }
            System.out.print("If u want to run the Program then press Zero(0) otherWise press any key:- ");
            l = sc.nextInt();
        }while (l==0);
        System.out.println("Exit Successfully");
    }
}
