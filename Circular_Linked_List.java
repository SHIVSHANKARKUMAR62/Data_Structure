package Data_Structure;

import java.util.Scanner;

public class Circular_Linked_List {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head = null;
    Node tail = null;

    public void creation(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data:- ");
            data=sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head=new_node;
                tail=new_node;  // we can also write 'tail = head';
                //new_node.next=head;
            }else {
                new_node.next=head;
                head=new_node;
                tail.next=head;
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }

    public void Traverser(){
        Node temp=head;
        if (head==tail){
            System.out.println("Linked List does not exist.....");
        }else {
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while (temp!=head);
        }
    }

    public static void main(String[] args) {
        Circular_Linked_List circular_linked_list = new Circular_Linked_List();
        circular_linked_list.creation();
        circular_linked_list.Traverser();
    }
}
