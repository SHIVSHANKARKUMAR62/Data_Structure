package Data_Structure;

import java.util.Scanner;

public class Doubly_Linked_List_insertion_at_the_position {
    Node head = null;
    Node tail = null;
    static class Node{
        int data;
        Node next;
        Node pre;
        Node(int data){
            this.data=data;
            this.next=null;
            this.pre=null;
        }
    }

    public void creation_data() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data:- ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail=new_node;
            } else {
                System.out.print("Enter Your Choice\n1.Insertion at the begin\n2.Insertion at specific Position\n3.Insertion at the end\n");
                int po = sc.nextInt();
                switch (po) {
                    case 1->{
                        new_node.next=head;
                        head.pre=new_node;
                        head=new_node;
                    }
                    case 2-> {
                        System.out.print("Enter a index where we want to add the data:- ");
                        int p = sc.nextInt();
                        Node temp = head;
                        Node ptr = temp.next;
                        for (int i = 1; i < (p - 1); i++) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        new_node.pre = temp;
                        new_node.next = ptr;
                        temp.next = new_node;
                        ptr.pre = new_node;
                    }
                    case 3->{
                            tail.next = new_node;
                            new_node.pre = tail;
                            tail = new_node;
                    }
                }
            }
                System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
                n = sc.nextInt();
            } while (n == 1) ;
        }

        public void deletion_data(){
            int  n;
            Scanner sc = new Scanner(System.in);
            do {
                if (head == null) {
                    System.out.println("There have no data.");
                } else {
                    System.out.print("Enter Your Choice\n1.Deletion at the begin\n2.Deletion at specific Position\n3.Deletion at the end\n");
                    int po = sc.nextInt();
                    switch (po) {
                        case 1->{
                            Node temp = head;
                            temp=temp.next;
                            head=temp;
                            head.pre=null;
                        }
                        case 2-> {
                            System.out.print("Enter a index where we want to add the data:- ");
                            int p = sc.nextInt();
                            Node temp = head;
                            Node ptr = temp.next;
                            for (int i = 1; i < (p - 1); i++) {
                                temp = ptr;
                                ptr = ptr.next;
                            }
                            temp.next=ptr.next;
                            ptr.next.pre=temp;
                        }
                        case 3->{
                            Node temp = tail;
                            temp=temp.pre;
                            temp.next=null;
                            tail=temp;

                        }
                    }
                }
                System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
                n = sc.nextInt();
            } while (n == 1) ;
        }

    public void view_data() {
        Node temp = head;
        if (head == null) {
            System.out.println("There is no any data.");
        } else {
            System.out.print("Data are:- ");
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != null);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Doubly_Linked_List_insertion_at_the_position dt = new Doubly_Linked_List_insertion_at_the_position();
        int c;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Choice\n1.Creation\n2.Display\n3.Deletion\n4.Exit\n");
            c=sc.nextInt();
            switch (c){
                case 1-> dt.creation_data();
                case 2-> dt.view_data();
                case 3-> dt.deletion_data();
                case 4-> System.exit(1);
            }

        }while (true);
    }
}
