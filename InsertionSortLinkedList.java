class InsertionSortLinkedList {

    static class Node {
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

    static Node push(Node head, int data) {
        Node newHead = new Node(head, data);
        return newHead;
    }

    static Node insertionSort(Node head) {

        Node res = new Node(0);

        while(head != null) {
            // Create a dummy node
            Node dummy = res;

            // Loop while next exists
            while(dummy.next != null && dummy.next.data < head.data) {
                // Reset our dummy
                dummy = dummy.next;
            }

            //Swap two nodes
            Node nextNode = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = nextNode;
        }

        return res.next;
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(head, 30);
        head = push(head, 3);
        head = push(head, 4);
        head = push(head, 20);
        head = push(head, 5);
        //List 5 --> 20 --> 4 --> 3 --> 30

        for (Node temp = insertionSort(head); temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
    }
}