package linkedList;

public class LL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int data, int idx) {
        Node newNode = new Node(data);
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("no data to delete");
            return;
        }
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("no data to delete");
            return;
        }
        int size = size();
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;

    }

    public int size() {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    public void printList() {
        if (head == null) {
            System.out.println("data not found");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addlast(4);
        list.addMiddle(5, 2);
        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println(list.size());
        ;

    }

}
