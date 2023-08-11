package Data_Structure;

import java.util.Scanner;

public class Singly_Linked_List_At_The_Begin {
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
                New_node.next = head;
                head = New_node;
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }
    public void Traverser(){
        Node temp=head;
        if (head==null){
            System.out.println("Linked List does not exist.....");
        }else {
            while (temp!=null){
                System.out.print(" "+temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Singly_Linked_List_At_The_Begin ll = new Singly_Linked_List_At_The_Begin();
        ll.Creation();
        ll.Traverser();
    }
}
