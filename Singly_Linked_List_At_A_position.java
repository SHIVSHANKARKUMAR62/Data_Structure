package Data_Structure;

import java.util.Scanner;

public class Singly_Linked_List_At_A_position {
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
        int n,i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data:- ");
            n=sc.nextInt();
            Node new_node = new Node(n);
            if (head==null){
                head=new_node;
            }else {
                int p;
                System.out.print("Enter position of the node:- ");
                p=sc.nextInt();
                Node  temp = head;
                for (int j=0;j<p-1;j++){
                    temp=temp.next;
                }
                new_node.next=temp.next;
                temp.next=new_node;
            }
            System.out.print("Enter 1 to take more data otherwise press any other key:- ");
            i=sc.nextInt();
        }while (i==1);
    }
    public void view_data(){
        Node temp = head;
        if (head==null){
            System.out.print("LL have no any data.");
        }else{
            while (temp!=null){
                System.out.print(" "+temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Singly_Linked_List_At_A_position s = new Singly_Linked_List_At_A_position();
        s.creation();
        s.view_data();
    }
}
