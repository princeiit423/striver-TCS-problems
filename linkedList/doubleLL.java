public class doubleLL {
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
    int size;

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

        size++;
    }

    // del fisrt

    public void remFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;
        head = temp.next;
        temp.prev = null;

        size--;
    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {
        doubleLL dl = new doubleLL();
        dl.addFirst(1);
        dl.addFirst(2);
        dl.addFirst(3);
        dl.addFirst(4);
        dl.remFirst();
        dl.print();

    }
}
