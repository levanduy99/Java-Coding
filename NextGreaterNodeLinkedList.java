import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class NextGreaterNodeLinkedList {

    static class ListNode {
        int data;
        ListNode next;
        ListNode() {}
        ListNode(int data) {
            this.data = data;
        }
        ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    static ListNode push(int data, ListNode head) {
        return new ListNode(data, head);
    }

    static int[] nextLargerNodes(ListNode head) {
        
        List<Integer> nodeVals = new ArrayList<>();
        ListNode currentNode = head;

        while(currentNode != null) {
            nodeVals.add(currentNode.data);
            currentNode = currentNode.next;
        }

        int[] answer = new int[nodeVals.size()];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nodeVals.size(); i++) {
            while (!stack.isEmpty() && nodeVals.get(stack.peek()) < nodeVals.get(i)) {
                answer[stack.pop()] = nodeVals.get(i);
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = push(5, head);
        head = push(3, head);
        head = push(4, head);
        head = push(7, head);
        head = push(2, head);

        for (int i : nextLargerNodes(head)) {
            System.out.print(i + " ");
        }
     }
}