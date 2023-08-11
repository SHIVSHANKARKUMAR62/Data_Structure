package Data_Structure;

import java.util.Scanner;

public class Circular_LL_at_a_specific_Location {
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

    public void creationData(){
        int n,data;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data:- ");
            data=sc.nextInt();
            Node new_node = new Node(data);
            if (head==null){
                head = new_node;
                tail = new_node;
            }else {
                System.out.print("Enter Position of node to be inserted:- ");
                int p = sc.nextInt();
                Node ptr =  head;
                for (int i=0;i<(p-1);i++){
                    ptr=ptr.next;
                }
                new_node.next=ptr.next;
                ptr.next=new_node;
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        }while (n==1);
    }

    public void insert_at_a_position(){
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
        Circular_LL_at_a_specific_Location l = new Circular_LL_at_a_specific_Location();
        l.creationData();
        l.insert_at_a_position();
    }
}
