package Data_Structure;

import java.util.Scanner;

public class Doubly_Linked_List_insertion_at_the_end {
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

    public void creation_data(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data:- ");
            data=sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head=new_node;
            }else {
                tail.next=new_node;
                new_node.pre=tail;
            }
            tail=new_node;
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }

    public void view_data() {
        Node temp = head;
        if (head == null) {
            System.out.println("There is no any data.");
        } else {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != null);
        }
    }

    public static void main(String[] args) {
        Doubly_Linked_List_insertion_at_the_end dt = new Doubly_Linked_List_insertion_at_the_end();
        dt.creation_data();
        dt.view_data();
    }
}
