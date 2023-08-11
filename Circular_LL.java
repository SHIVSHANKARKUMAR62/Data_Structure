package Data_Structure;

import java.util.Scanner;

public class Circular_LL {

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
                head = new_node;
                tail = new_node;
            }else {
                int s;
                System.out.print("Enter Your Choice\n1.Enter data at the Begging.\n2.Enter data at a Specific position.\n3.Enter data at the End.\n");
                s=sc.nextInt();
                switch (s){
                    case 1: {
                        new_node.next=head;
                        head=new_node;
                        tail.next=head;
                        break;
                    }
                    case 2:{
                        System.out.print("Enter the index leaving the 1st number where you want to put the data:- ");
                        int p = sc.nextInt();
                        Node ptr = head;
                        for (int i=0;i<(p-1);i++){
                            ptr=ptr.next;
                        }
                        new_node.next=ptr.next;
                        ptr.next=new_node;
                        break;
                    }
                    case 3:{
                        tail.next=new_node;
                        tail=new_node;
                        new_node.next=head;
                        break;
                    }
                    default:{
                        System.out.println("Please enter a valid number.");
                    }
                }
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }

    public void view(){
        Node temp = head;
        if (head==null){
            System.out.println("There have no any data present here.");
        }else {
            System.out.print("Circular Link List data is:- ");
            do {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while (temp!=head);
        }
    }

    public static void main(String[] args) {
        Circular_LL c = new Circular_LL();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nEnter Your Choice.\n1.Put the Data.\n2.View The Data.\n3.End the program.\n");
            int n = sc.nextInt();
            switch (n){
                case 1->
                    c.creation_data();
                case 2->
                    c.view();
                case 3->
                    System.exit(1);
            }
        }while (true);
    }
}
