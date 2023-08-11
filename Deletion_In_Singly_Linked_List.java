package Data_Structure;

import java.util.Scanner;

public class Deletion_In_Singly_Linked_List {static class Node{
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
                switch (m)
                {
                    case 1: {
                        New_node.next = head;
                        head = New_node;
                        break;
                    }
                    case 2: {
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = New_node;
                        break;
                    }
                    case 3: {
                        System.out.print("Enter Position of node to be inserted:- ");
                        int p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < p; i++) {
                            temp1 = temp1.next;
                        }
                        New_node.next = temp1.next;
                        temp1.next = New_node;
                        break;
                    }

                }
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }
    public void delete() {
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
                switch (m)
                {
                    case 1: {
                       Node temp = head;
                       temp = temp.next;
                       head = temp;
                        break;
                    }
                    case 2: {
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next!=null){
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next=null;
                        break;
                    }
                    case 3: {
                        System.out.print("Enter Position of node to be inserted:- ");
                        int p = sc.nextInt();
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        for (int i = 0; i < p; i++) {
                            temp1=ptr;
                            ptr=ptr.next;
                        }
                        temp1.next=ptr.next;
                        break;
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
        Deletion_In_Singly_Linked_List ll = new Deletion_In_Singly_Linked_List();
        ll.Creation();
        ll.Traverser();
        ll.delete();
        ll.Traverser();
    }
}
