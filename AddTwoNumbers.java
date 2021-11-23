public class AddTwoNumbers {
   
    static class Node {
        int data;
        Node next;
        Node () {}
        Node (int data) {
            this.data = data;
        }
        Node (int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static Node push(Node head, int data) {
        Node newHead = new Node(data, head);
        return newHead;
    }

    static Node addTwoNumbers(Node l1, Node l2) {

        Node result = new Node(0);
        Node head = result;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int data = carry;

            if (l1 != null) {
                data += l1.data; 
                l1 = l1.next;
            }

            if (l2 != null) {
                data += l2.data;
                l2 = l2.next;
            }

            result.next = new Node(data % 10);
            result = result.next;
            carry = data/10;
        }

        if (carry != 0) {
            result.next = new Node(carry);
        }

        return head.next;
    }

    public static void main(String[] args) {
        Node head1 = null;
        head1 = push(head1, 9);
        head1 = push(head1, 9);
        head1 = push(head1, 9);
        head1 = push(head1, 9);

        Node head2 = null;
        head2 = push(head2, 9);
        head2 = push(head2, 9);
        head2 = push(head2, 9);
        head2 = push(head2, 9);
        head2 = push(head2, 9);
        head2 = push(head2, 9);
        head2 = push(head2, 9);

        for (Node temp = addTwoNumbers(head1, head2); temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
    }
}
