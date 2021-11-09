public class PalindromeLinkedList {
 
    public static class Node {
        int data; 
        Node next;
        Node() {}
        Node(int data) {
            this.data = data;
        }
        Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }
    }

    public static Node push(Node head, int data) {
        Node newNode = new Node(head, data);
        head = newNode;
        return head;
    }

    public static boolean isPalindrome(Node head) {

        Node reverse = reverseList(head);
        while (head != null) {
            if (head.data != reverse.data) {
                return false;
            }
            head = head.next;
        }

        return true;
    }

    public static Node reverseList(Node head) {

        Node next = null;
        Node tail = null;

        while (head != null) {
            next = head.next;
            head.next = tail;
            tail = head;
            head = next;
        }

        return tail;
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(head, 1);
        head = push(head, 2);
        head = push(head, 2);
        head = push(head, 1);

        System.out.println(isPalindrome(head));
    }
}
