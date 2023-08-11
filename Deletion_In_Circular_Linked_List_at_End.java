package Data_Structure;

import java.util.Scanner;

public class Deletion_In_Circular_Linked_List_at_End {
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
            System.out.print("Enter data:- ");
            data=sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head=new_node;
                tail=new_node;
            }else {
                tail.next=new_node;
                tail=new_node;
                new_node.next=head;
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }

    public void view_data(){
        Node temp = head;
        if (head==null){
            System.out.println("There have no any data present.");
        }else {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while (temp!=head);
        }
    }

    public void deletion_data_at_End(){
        Node temp = head;
        Node ptr = temp.next;
        while (ptr.next!=head){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=head;
        tail=temp;
    }

    public static void main(String[] args) {
        Deletion_In_Circular_Linked_List_at_End d = new Deletion_In_Circular_Linked_List_at_End();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("\nEnter Your Choice\n1.Create data\n2.View Data\n3.Delete Data at the end\n4.Exit the Program\n");
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    d.creation_data();
                    break;
                }
                case 2: {
                    d.view_data();
                    break;
                }
                case 3: {
                    d.deletion_data_at_End();
                    break;
                }
                case 4: {
                    System.exit(1);
                }
            }
        }while (true);
    }
}
