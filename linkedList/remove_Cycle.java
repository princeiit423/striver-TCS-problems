package linkedList;

public class remove_Cycle {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node head;
        Node tail;

        public void removeCycle() {
            // detect cycle present or not
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    cycle = true;
                    break;
                }
            }
            if (cycle == false) {
                return;
            }
            // detect node where cycle start
            slow = head;
            Node prev = null;
            while (slow != fast) {
                slow = slow.next; // +1 increase
                prev = fast;
                fast = fast.next; // +1 increase
            }

            // prev node (previous node of final node) point to null
            prev.next = null;

        }
    }

    public static void main(String[] args) {

    }
}
