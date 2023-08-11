package Data_Structure;

import java.util.Scanner;

public class Circular_LL_Begin {
    Node head = null;
    Node tail = null;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void creation_data(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data:- ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head=new_node;
                tail=new_node;
                //new_node.next=tail;  // we use this or not they don't show any error.
            }else {
                new_node.next=head;
                head=new_node;
                tail.next=head;
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }

    public void view_data(){
        Node temp = head;
        System.out.print("Data are:- ");
        if (head==null){
            System.out.println("Circular Linked List have no any data.");
        }else {
            do{
                System.out.print(" "+temp.data);
                temp=temp.next;  // here we used do-while loop.
            }while (temp!=head);
        }
    }

    public static void main(String[] args) {
        Circular_LL_Begin cb = new Circular_LL_Begin();
        cb.creation_data();
        cb.view_data();
    }
}
