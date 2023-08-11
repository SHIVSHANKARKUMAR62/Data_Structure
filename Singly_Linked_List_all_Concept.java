package Data_Structure;

import java.util.Scanner;

public class Singly_Linked_List_all_Concept {
    Node head = null;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void creation_data_at_the_begin1(){
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
            }
            head = New_node;
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }
    public void creation_data_at_the_end1(){
        int n,data;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.print("Enter data:- ");
        data=sc.nextInt();
        Node new_node = new Node(data);
            if (head==null){
                head=new_node;
            }else {
                Node temp = head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=new_node;

            }
            System.out.print("Enter 1 to add the data otherwise press any  other key:- ");
            n=sc.nextInt();
        }while (n==1);
    }
    public void creation_data_at_the_position1(){
        int n,data;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.print("Enter data:- ");
        data=sc.nextInt();
        Node new_node = new Node(data);
            if (head==null){
                head=new_node;
            }else {
                int p;
                System.out.print("Enter position of the node index :- ");
                p=sc.nextInt();
                Node temp = head;
                for (int j=1;j<=p;j++){
                    temp=temp.next;
                }
                new_node.next=temp.next;
                temp.next=new_node;
            }
            System.out.print("Enter 1 to add the data otherwise press any  other key:- ");
            n=sc.nextInt();
        }while (n==1);
    }
    public void view_data(){
        Node temp = head;
        if (head==null){
            System.out.println("No Data is Present.");
        }else {
            System.out.print("Data are:- ");
            while (temp!=null){
                System.out.print(" "+temp.data);
                temp=temp.next;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Singly_Linked_List_all_Concept all = new Singly_Linked_List_all_Concept();
        Scanner sc = new Scanner(System.in);
        int n,i;
        do {
        System.out.print("Enter your choice\n1.creation_data_at_the_begin\n2.creation_data_at_the_end\n3.creation_data_at_the_position\n4.Display the data\n5.Exit\n");
        n=sc.nextInt();
            switch (n){
                case 1->
                    all.creation_data_at_the_begin1();
                case 2->
                    all.creation_data_at_the_end1();
                case 3->
                    all.creation_data_at_the_position1();
                case 4->
                    all.view_data();
                case 5->
                    System.exit(1);
            }
        }while (true);
    }
}
