class DeleteNodeLinkedList {

    static class Node {
        int data;
        Node next = null;
        Node (int data) {
            this.data = data;
        }
    }

    Node head;

    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void insert(DeleteNodeLinkedList list, int data) {

        //create new Node
        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {

            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }
    }

    public static void printLinkedList(DeleteNodeLinkedList list) {
        Node currNode = list.head;
        while(currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        DeleteNodeLinkedList list = new DeleteNodeLinkedList();
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);

        Node node2 = list.head.next;
        deleteNode(node2);

        printLinkedList(list);
    }
}