package Week_1;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int max = Integer.MAX_VALUE;
        int optimal = 0;

        for(int i : prices) {
            if(i < max) {
                max = i;
            }
            optimal = Math.max(optimal, i-max);
        }
        return optimal;
    }
}
