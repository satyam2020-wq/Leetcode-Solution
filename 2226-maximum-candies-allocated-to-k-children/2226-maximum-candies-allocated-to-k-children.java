class Solution {

    boolean isValidAnswer(int[] candies, long k, int mid) {

        long children = 0;

        for (int candy : candies) {
            children += candy / mid;
        }

        return children >= k;
    }

    public int maximumCandies(int[] candies, long k) {

        int s = 1;
        int e = 0;

        for (int candy : candies) {
            e = Math.max(e, candy);
        }

        int ans = 0;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAnswer(candies, k, mid)) {
                ans = mid;      // valid answer
                s = mid + 1;    // try larger
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }
}