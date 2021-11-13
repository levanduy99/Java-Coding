public class PartitionList {
    
    static class Node {
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

    //solution 1
    public static Node partition1(Node head, int x) {

        Node newList = new Node(0);
        Node dummyNode = new Node(0);
        Node dummyHead = dummyNode;
        Node newHead = newList;
        dummyNode.next = head;

        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.data < x) {
                //add into new list
                newList.next = temp;
                newList = newList.next;
                //remove node 
                if (dummyNode.next != null) {
                    dummyNode.next = dummyNode.next.next;
                } else {
                    dummyNode.next = null;
                }
            } else {
                dummyNode = dummyNode.next;
            }
        }

        newList.next = dummyHead.next;
        return newHead.next;
    }

    //solution 2
    public static Node partition(Node head, int x) {

        Node beforeHead = new Node(0);
        Node before = beforeHead;
        Node afterHead = new Node(0);
        Node after = afterHead;

        while (head != null) {
            if (head.data < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }

            head = head.next;
        }
        after.next = null;
        before.next = afterHead.next;

        return beforeHead.next;
    }


    public static void main(String[] args) {
        Node head = null;
        head = push(head, 2);
        head = push(head, 5);
        head = push(head, 2);
        head = push(head, 3);
        head = push(head, 4);
        head = push(head, 1);
        //Linked list 1 --> 4 --> 3 --> 2 --> 5 -- > 2

        for (Node temp = partition(head, 3); temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
    }
}
