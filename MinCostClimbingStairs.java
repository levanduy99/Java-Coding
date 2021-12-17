public class MinCostClimbingStairs {
    
    static int minCostClimbingStairs(int[] cost) {

        int size = cost.length;

        for (int i = 2; i < size; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }

        return Math.min(cost[size - 1], cost[size - 2]);
    }

    public static void main(String[] args) {
        int[] cost = {1, 2, 10, 1};
        System.out.println(minCostClimbingStairs(cost));
    }
}
