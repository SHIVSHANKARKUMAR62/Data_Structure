package Data_Structure;

import java.util.Scanner;

public class Deletion_In_Circular_Linked_List_at_Begin {

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
        int n,data;
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

    public void display_data(){
        Node temp = head;
        if (head==null){
            System.out.println("There is No data.");
        }else {
            System.out.print("Data are:- ");
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while (temp!=head);
        }
    }

    public void deletion_data_at_begin(){
        if (head==null){
            System.out.println("There is no data.");
        }else{
            Node temp=head;
            temp=temp.next;
            head=temp;
            tail.next=head;
        }
    }

    public static void main(String[] args) {
        Deletion_In_Circular_Linked_List_at_Begin d = new Deletion_In_Circular_Linked_List_at_Begin();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("\nEnter Your Choice\n1.Create data\n2.View Data at the begin\n3.Delete Data\n4.Exit the Program\n");
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    d.creation_data();
                    break;
                }
                case 2: {
                    d.display_data();
                    break;
                }
                case 3: {
                    d.deletion_data_at_begin();
                    break;
                }
                case 4: {
                    System.exit(1);
                }
            }
        }while (true);
    }
}
