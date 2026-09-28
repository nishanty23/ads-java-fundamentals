public class LinkedListDemo {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtPosition(int data, int pos) {

        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListDemo list = new LinkedListDemo();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        System.out.println("Original list:");
        list.display();

        list.insertAtPosition(25, 2);

        System.out.println("After inserting 25 at position 2:");
        list.display();
    }
}
