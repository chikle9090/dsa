package linkedlist;

public class basics {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    // Add at first
    public static void addfirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    // Add at last
    public static void addlast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }


    // Add at middle/index
    public static void addmiddle(int index, int data) {

        if (index == 0) {
            addfirst(data);
            return;
        }

        Node newNode = new Node(data);

        Node temp = head;

        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    // Display
    public static void display() {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }


    public static void main(String[] args) {

        addfirst(10);
        addlast(20);
        addlast(30);

        display();

        addmiddle(2, 25);

        display();
    }
}