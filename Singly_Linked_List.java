package Data_Structure;

import java.util.Scanner;

public class Singly_Linked_List {
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
        int data, n,m;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter data:- ");
            data = sc.nextInt();
            Node New_node = new Node(data);
            if (head == null) {
                head = New_node;
            } else {
                System.out.println("Enter Your Choice \n 1.Enter the element at First \n 2.Enter the element at Last \n 3.Enter the element at a Position ");
                 m = sc.nextInt();
                switch (m) {
                    case 1 -> {
                        New_node.next = head;
                        head = New_node;
                    }
                    case 2 -> {
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = New_node;
                    }
                    case 3 -> {
                        System.out.print("Enter Position of node to be inserted:- ");
                        int p = sc.nextInt();
                        Node temp = head;
                        for (int i = 0; i < p-1; i++) {
                            temp = temp.next;
                        }
                        New_node.next = temp.next;
                        temp.next = New_node;
                    }
                }
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
        Singly_Linked_List ll = new Singly_Linked_List();
        ll.Creation();
        ll.Traverser();
    }
}
