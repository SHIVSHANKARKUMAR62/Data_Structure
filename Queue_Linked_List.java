package Data_Structure;

import java.util.Scanner;

class queue1
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front = null;
    Node rare = null;
    public void enqueue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The data:- ");
        int j= sc.nextInt();
        Node new_node = new Node(j);
        if (front==null && rare==null){
            front=new_node;
            rare=new_node;
        }else {
            rare.next=new_node;
            rare=new_node;
        }
    }
    public void dequeue(){
        if (front==null && rare==null){
            System.out.println("Underflow condition");
        }else {
            front= front.next;
        }
    }

    public void Display(){
        System.out.print("Items are :- ");
        Node  temp = front;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Queue_Linked_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue1 new_queue = new queue1();
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
