package Data_Structure;

import java.util.Scanner;

public class Max_Value_In_Linked_List {
    Node head = null;
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
            }else {
                Node temp = head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=new_node;
            }
            System.out.print("Enter 1 to take the data otherwise press any other key:- ");
            n=sc.nextInt();
        }while (n==1);
    }

    public void view_data(){
        Node temp = head;
        int max=0;
        if (head==null){
            System.out.println("There have no any data.");
        }else {
            System.out.print("Data are:- ");
            while (temp!=null){
                System.out.print(temp.data+" ");
                if (temp.data>max){
                    max= temp.data;
                }
                temp=temp.next;
            }
            System.out.println();
            System.out.println("Maximum value of the Linked List is:- "+max);
        }
    }

    public static void main(String[] args) {
        Max_Value_In_Linked_List maxv = new Max_Value_In_Linked_List();
        maxv.creation_data();
        maxv.view_data();
    }
}
