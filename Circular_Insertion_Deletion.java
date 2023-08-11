package Data_Structure;

import java.util.Scanner;

public class Circular_Insertion_Deletion {
    Node head = null;
    Node tail = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void creation_data() {
        int n, data;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data:- ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                int choiceInsertion;
                System.out.print("Enter Choice\n1.Insertion at the begin\n2.Insertion at the end\n3.Insertion at the specific position\n");
                choiceInsertion = sc.nextInt();
                switch (choiceInsertion) {
                    case 1 -> {
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;
                    }
                    case 2 -> {
                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;
                    }
                    case 3 -> {
                        int p;
                        System.out.print("Enter Index Where You Want to Insert The data:- ");
                        p = sc.nextInt();
                        Node temp = head;
                        for (int i = 1; i < (p - 1); i++) {
                            temp = temp.next;
                        }
                        new_node.next = temp.next;
                        temp.next = new_node;
                    }
                }
            }
            System.out.print("If u want to run the Program then press 1 otherWise press any key:- ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void delete_data() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Choice\n1.Deletion at the begin\n2.Deletion at the end\n3.Deletion at the specific position\n");
        n = sc.nextInt();
        switch (n) {
            case 1 -> {
                Node temp = head;
                temp = temp.next;
                head = temp;
                tail.next = head;
            }
            case 2 -> {
                Node temp = head;
                Node ptr = temp.next;
                while (ptr.next != head) {
                    temp = ptr;
                    ptr = ptr.next;
                }
                temp.next = head;
                tail = temp;
            }
            case 3 -> {
                int p;
                System.out.print("Enter Index Where You Want to delete a data:- ");
                p = sc.nextInt();
                Node temp = head;
                Node ptr = temp.next;
                for (int i = 0; i < (p - 1); i++) {
                    temp = ptr;
                    ptr = ptr.next;
                }
                temp.next = ptr.next;
            }
        }
    }

    public void display_data() {
        if (head == null) {
            System.out.println("There have no any data.");
        } else {
            System.out.print("Data are:- ");
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Circular_Insertion_Deletion id = new Circular_Insertion_Deletion();
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Your Choice\n1.Creation\n2.Deletion\n3.View Data\n4.Exit\n");
            n = sc.nextInt();
            switch (n) {
                case 1 -> id.creation_data();
                case 2 -> id.delete_data();
                case 3 -> id.display_data();
                case 4 -> System.exit(1);
            }
        } while (true);
    }
}