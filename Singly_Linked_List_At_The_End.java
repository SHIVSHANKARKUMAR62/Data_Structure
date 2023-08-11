package Data_Structure;

import java.util.Scanner;

public class Singly_Linked_List_At_The_End {
    static class Node{
        int data;
       Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
     Node head = null;
    public void Creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter data:- ");
            data = sc.nextInt();
            Node New_node = new Node(data);
            if (head == null) {
                head = New_node;
            } else {
                Node temp = head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=New_node;
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }
    public void Traverser(){
        int count =0,max=0;
        Node temp=head;
        if (head==null){
            System.out.println("Linked List does not exist.....");
        }else {
            System.out.print("Data are:- ");
            while (temp!=null){
                System.out.print(temp.data+" ");
                if (temp.data>max){   // find the max value in the linked list.
                    max=temp.data;
                }
                temp=temp.next;
                count++;    // this is used to print the length of the linked list.
            }
        }
        System.out.println();
        System.out.println("Maximum value of the Linked list is:- "+max);
        System.out.println("Length of the Linked list is:- "+count);
    }
    public static void main(String[] args) {
        Singly_Linked_List_At_The_End singly_linked_list_at_the_end = new Singly_Linked_List_At_The_End();
        singly_linked_list_at_the_end.Creation();
        singly_linked_list_at_the_end.Traverser();
    }
}
