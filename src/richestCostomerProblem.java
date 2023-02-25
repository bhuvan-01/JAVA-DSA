public class richestCostomerProblem {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4},{5,6,7,8},{
            7,8,4}};

        int ans1 = maximumWealth(arr);
        System.out.println(ans1);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;
    }
}
