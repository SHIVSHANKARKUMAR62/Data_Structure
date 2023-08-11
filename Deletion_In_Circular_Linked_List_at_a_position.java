package Data_Structure;

import java.util.Scanner;

public class Deletion_In_Circular_Linked_List_at_a_position {
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

    public void Creation_data(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter data:- ");
            data=sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head = new_node;
                tail = new_node;
            }else {
                tail.next=new_node;
                tail=new_node;
                new_node.next=head;
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }

    public void display_data(){
        Node temp = head;
        if (head==null){
            System.out.println("There have no any data.");
        }else {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while (temp!=head);
        }
    }

    public void delete_data(){
        Scanner sc = new Scanner(System.in);
        if (head==null){
            System.out.print("There have no any data.");
        }else {
            int p;
            System.out.print("Enter Index Where You Want to delete a data:- ");
            p=sc.nextInt();
            Node temp = head;
            Node ptr = temp.next;
            for (int i=0;i<(p-1);i++){
                temp=ptr;
                ptr=ptr.next;
            }
            temp.next=ptr.next;
        }
    }

    public static void main(String[] args) {
        Deletion_In_Circular_Linked_List_at_a_position d = new Deletion_In_Circular_Linked_List_at_a_position();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("\nEnter Your Choice\n1.Create data\n2.View Data\n3.Delete Data at the end\n4.Exit the Program\n");
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    d.Creation_data();
                    break;
                }
                case 2: {
                    d.display_data();
                    break;
                }
                case 3: {
                    d.delete_data();
                    break;
                }
                case 4: {
                    System.exit(1);
                }
            }
        }while (true);
    }
}
