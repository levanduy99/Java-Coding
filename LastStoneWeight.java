import java.util.PriorityQueue;

class LastStoneWeight {

    static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int stone : stones) {
            maxHeap.add(-stone);
        }

        while (maxHeap.size() > 1) {
            int heaviest = - maxHeap.remove();
            int secondHeavy = -maxHeap.remove();
            if (heaviest != secondHeavy) {
                maxHeap.add(-(heaviest - secondHeavy));
            }
        }

        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
    }

    public static void main(String[] args) {
        int[] stones = {2, 10, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }
}