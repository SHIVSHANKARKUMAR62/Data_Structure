package Data_Structure;

import java.util.Scanner;

public class LL_ADD {
    Node head = null;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public void Creation(){
            int n,i;
            do {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Data:- ");
                n=sc.nextInt();
                Node new_node = new Node(n);
                if (head==null){
                    head=new_node;
                }else {
                    new_node.next=head;
                    head=new_node;
                }
                System.out.print("If You want to add more data then press 1 otherwise press any other key:- ");
                i=sc.nextInt();
            }while (i==1);
        }

        public void addition(){
            int sum=0;
            Node temp = head;
            if (head==null){
                System.out.print("Null Value.");
            }else {
                while (temp!=null){
                    sum = sum + temp.data;
                    temp = temp.next;
                }
                System.out.println("Sum is:- "+sum);
            }
        }
    public static void main(String[] args) {
        LL_ADD s = new LL_ADD();
        Scanner sc = new Scanner(System.in);
        do {
            int a;
            System.out.print("Enter Your Choice......\n1.TAKE DATA\n2.ADDITION THE DATA\n3.Exit the Program\n");
            a=sc.nextInt();
            switch (a){
                case 1->
                    s.Creation();
                case 2->
                    s.addition();
                case 3->
                    System.exit(1);
            }
        }while (true);
    }
}
