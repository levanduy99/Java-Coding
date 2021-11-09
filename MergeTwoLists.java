public class MergeTwoLists {
    
    public static class Node {
        int data;
        Node next;
        Node() {};
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

    public static Node mergeTwoLists(Node l1, Node l2) {

        Node dummyNode = new Node(0);
        Node tail = dummyNode;

        while (true) {
            if (l1 == null) {
                tail.next = l2;
                break;
            }
            if (l2 == null) {
                tail.next = l1;
                break;
            }

            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {
        Node head1 = null;
        head1 = push(head1, 4);
        head1 = push(head1, 2);
        head1 = push(head1, 1);
        //l1: 1 --> 2 --> 4

        Node head2 = null;
        head2 = push(head2, 4);
        head2 = push(head2, 3);
        head2 = push(head2, 1);
        //l2: 1 --> 3 --> 4

        for (Node temp = mergeTwoLists(head1, head2); temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
    }
}
