public class ReorderList {
    
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

    static Node push(int data, Node head) {
        return new Node(data, head);
    }

    static void reorderList(Node head) {
        //head of first half
        Node l1 = head;
        //head of second half
        Node slow = head;

        //tail of second half
        Node fast = head;
        //tail of first half 
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            prev.next = null;
        } 

        Node l2 = reverse(slow);

        merge(l1, l2);
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node currentNode = head;

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }

        return prev;
    }

    static void merge(Node l1, Node l2) {
        while (l1 != null) {
            Node l1Next = l1.next;
            Node l2Next = l2.next;

            l1.next = l2;

            if (l1Next == null) {
                break;
            }

            l2.next = l1Next;
            l1 = l1Next;
            l2 = l2Next;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(5, head);
        head = push(4, head);
        head = push(3, head);
        head = push(2, head);
        head = push(1, head);
        reorderList(head);
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
    }
}
