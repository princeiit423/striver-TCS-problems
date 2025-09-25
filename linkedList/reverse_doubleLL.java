package linkedList;

class doubleL {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.print("data not found");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // reverse doubleLL function
    public void reverseDoubleLL() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

}

public class reverse_doubleLL {
    public static void main(String args[]) {
        doubleL list = new doubleL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        list.print();

        list.reverseDoubleLL();

        list.print();

    }
}
