package Data_Structure;
import java.util.Scanner;
class stack{
    Node top = null;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    void push(){
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data:- ");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if (top==null){
            top=new_node;
        }else {
            new_node.next=top;
            top=new_node;
        }
    }
    void pop(){
        if (top==null){
            System.out.println("Stack is Empty");
        }else {
            top=top.next;
        }
    }
    void display(){
        Node temp=top;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}

public class Stack_In_An_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack new_stack = new stack();
        int d,l;
        do {
            System.out.println("Enter Your Choice\nPress 1 to push the item\nPress 2 to pop the item\nPress 3 to display the item");
            d=sc.nextInt();
            switch (d){
                case 1: {
                    new_stack.push();
                    break;
                }
                case 2:{
                    new_stack.pop();
                    break;
                }
                case 3:{
                    new_stack.display();
                    break;
                }
            }
            System.out.print("If u want to run the Program then press Zero(0) otherWise press any key:- ");
            l = sc.nextInt();
        }while (l==0);
        System.out.println("Exit Successfully");
    }
}
