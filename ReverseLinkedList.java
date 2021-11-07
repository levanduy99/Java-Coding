public class ReverseLinkedList {
    
    static class Node {
        int data;
        Node next;
        Node() {}
        Node(int data) {
            this.data = data;
        }
        Node(Node node, int data) {
            this.next = node;
            this.data = data;
        }
    }

    //Add node at head
    public static Node pushNode(Node head, int data) {
        Node newNode = new Node(head, data);
        head = newNode;
        return head;
    }

    //solution 1
    public static Node reverseList(Node head) {
        Node newHead = null;
        for (Node temp = head; temp != null; temp = temp.next) {
            newHead = pushNode(newHead, temp.data);
        }
        return newHead;
    }

    //solution 2
    public static Node reverse(Node head) {
        
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node head = null;
        
        head = pushNode(head, 5);
        head = pushNode(head, 4);
        head = pushNode(head, 3);
        head = pushNode(head, 2);
        head = pushNode(head, 1);
        //listed list 1 --> 2 --> 3 --> 4 --> 5

        Node newHead = reverse(head);

        for (Node temp = newHead; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
    }
}
