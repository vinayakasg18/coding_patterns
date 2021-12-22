package oas.liveRamp;

class MinCost {
    public int minCost(String s, int[] cost) {
        int result = 0, maxCost = 0, sumCost = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (i > 0 && s.charAt(i) != s.charAt(i - 1)) {
                result += sumCost - maxCost;
                sumCost = maxCost = 0;
            }
            sumCost += cost[i];
            maxCost = Math.max(maxCost, cost[i]);
        }
        result += sumCost - maxCost;
        return result;
    }
}
