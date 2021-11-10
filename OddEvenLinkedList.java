public class OddEvenLinkedList {

    static class Node {
        int data;
        Node next;
        Node() {}
        Node(int data) {
            this.data = data;
        }
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node push(Node head, int data) {
        Node newHead = new Node(data, head);
        head = newHead;
        return head;
    }

    public static Node oddEvenList(Node head) {

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        //Linked list: 1 --> 2 --> 3 --> 4 --> 5

        for (Node temp = oddEvenList(head); temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
    }
}
