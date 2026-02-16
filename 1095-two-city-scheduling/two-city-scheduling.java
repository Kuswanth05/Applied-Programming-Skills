import java.util.*;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        // Sort by cost difference (A - B)
        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

        int totalCost = 0;
        int n = costs.length / 2;

        // First n go to City A
        for (int i = 0; i < n; i++) {
            totalCost += costs[i][0];
        }

        // Remaining n go to City B
        for (int i = n; i < costs.length; i++) {
            totalCost += costs[i][1];
        }

        return totalCost;
    }
}
