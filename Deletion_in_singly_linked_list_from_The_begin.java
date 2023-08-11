package Data_Structure;

import java.util.Scanner;

public class Deletion_in_singly_linked_list_from_The_begin {
     Node head = null;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void creation(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter data:- ");
            data=sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head=new_node;
            }else {
                new_node.next=head;
                head=new_node;
            }
            System.out.print("Enter 1 to add the data otherwise enter any other key:- ");
            n=sc.nextInt();
        }while (n==1);
    }
    public void Deletion(){
        Node temp = head;
        if (head==null){
            System.out.println("No data is Present.");
        }else {
            temp=temp.next;
            head=temp;
        }
    }
    public void view_data(){
        Node temp = head;
        if (head==null){
            System.out.println("No any Data.");
        }else {
            System.out.print("Data are:- ");
            while (temp!=null) {
                System.out.print(" " + temp.data);
                temp = temp.next;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Deletion_in_singly_linked_list_from_The_begin db = new Deletion_in_singly_linked_list_from_The_begin();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Your Choice\n1.Creation The Element\n2.View The Data\n3.Deletion The Element\n4.Exit\n");
            int n = sc.nextInt();
            switch (n){
                case 1->
                    db.creation();
                case 2->
                    db.view_data();
                case 3->
                    db.Deletion();
                case 4->
                    System.exit(0);
            }
        }while (true);

    }
}
