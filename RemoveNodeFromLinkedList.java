public class RemoveNodeFromLinkedList {
    
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

    //Function to push node at head
    public static Node push(Node headRef, int newData) {
        Node newNode = new Node(newData, headRef);
        headRef = newNode;
        return headRef;
    }

    //Remove Nth Node From End of List
    public static Node removeNthFromEnd(Node head, int n) {

        Node dymmyHead = new Node(0);
        dymmyHead.next = head;

        Node fast = dymmyHead;
        Node slow = dymmyHead;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dymmyHead.next;
    }

    //Delete a node in the linked list by key
    public static Node deleteByKey(Node head, int key) {

        if (head != null && head.data == key) {
            return removeFirstNode(head);
        }

        Node currNode = head, prev = null;
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prev.next = currNode.next;
        }

        return head;
    }

    //Function to remove the first node of the linked list
    public static Node removeFirstNode(Node head) {
        return head == null ? null : head.next;
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        //list [1, 2, 3, 4, 5, 6, 7]

        head = removeNthFromEnd(head, 7);

        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
    }
}
