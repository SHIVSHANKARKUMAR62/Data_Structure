package Data_Structure;

import java.util.Scanner;

public class Circular_LL_End {

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

    public void creationLL(){
        int n,i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data:- ");
            n = sc.nextInt();
            Node new_node = new Node(n);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                //Node temp = head;
                tail.next=new_node;
                tail=new_node;
                new_node.next=head;
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            i = sc.nextInt();
        }while (i==1);
    }

    public void insert_end(){
        Node temp = head;
        if (head==null){
            System.out.println("There is no data present hear.");
        }else {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while (temp!=head);
        }
    }

    public static void main(String[] args) {
        Circular_LL_End end = new Circular_LL_End();
        end.creationLL();
        end.insert_end();
    }
}
