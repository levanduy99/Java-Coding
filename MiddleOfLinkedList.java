public class MiddleOfLinkedList {
    
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
        Node newNode = new Node(data, head);
        head = newNode;
        return head;
    } 

    //solution 1
    public static Node middleNode1(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        for (int i = 0; i < count/2; i++) {
            head = head.next;
        }

        return head;
    }

    //solution 2
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            System.out.println(fast.data);
            fast = fast.next.next;
        }

        return slow;
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

       for (Node temp = middleNode(head); temp != null; temp = temp.next) {
           System.out.print(temp.data + " ");
       }
    }
}
