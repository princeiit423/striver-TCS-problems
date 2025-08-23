package linkedList;

public class remove_nth_node {
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

    public void removeNth(int idx) {
        if (head == null) {
            return;
        }
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (idx == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = size - idx;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        remove_nth_node list = new remove_nth_node();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        list.removeNth(1);
        list.print();
    }
}
