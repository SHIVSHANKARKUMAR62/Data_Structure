package Data_Structure;

import java.util.Scanner;

public class LL_SUBTRACTION {
    int sub=0,sum=0,s,ss;
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
            System.out.print("Enter the data:- ");
            n=sc.nextInt();
            Node new_node= new Node(n);
            if (head==null){
                head=new_node;
            }else {
                new_node.next=head;
                head=new_node;
            }
            System.out.print("Enter 1 to add more data otherwise enter any other key:- ");
            i=sc.nextInt();
        }while (i==1);
    }
    public void view_data(){
        Node temp = head;
        if (head==null){
            System.out.print("Not any data.");
        }else {
            System.out.print("Data is:- ");
            while (temp!=null){
                System.out.print(" "+temp.data);
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public void Addition(){
        Node temp = head;
        if (head==null){
            System.out.println("No any data.");
        }else {
            while (temp!=null){
                sum = sum + temp.data;
                temp=temp.next;
            }
        }
        System.out.println("Addition is:- "+sum);
        s=sum;
        sum=0;
    }
    public void subtraction(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter subtraction value:- ");
        n=sc.nextInt();
        sub =s-n;
        System.out.format("After subtracting %d then value is:- %d\n",n,sub);
        sub=0;
    }
    public static void main(String[] args) {
        LL_SUBTRACTION sub = new LL_SUBTRACTION();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter Your Choice\n1.Creation\n2.Addition\n3.Display\n4.Subtraction\n5.End The Program\n");
            n=sc.nextInt();
            switch (n){
                case 1->
                    sub.creation();
                case 2->
                    sub.Addition();
                case 3->
                    sub.view_data();
                case 4->
                    sub.subtraction();
                case 5-> System.exit(1);
            }
        }while (true);
    }
}
