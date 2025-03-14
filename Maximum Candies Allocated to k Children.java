class Solution {
    public boolean canDistribute(int[] candies, long k, int portionSize) {
        long count = 0;
        for (int pile : candies) {
            count += pile / portionSize;
        }
        return count >= k;
    }

    public int maximumCandies(int[] candies, long k) {
        int maxPile = Arrays.stream(candies).max().getAsInt();  // Get max element
        int left = 1, right = maxPile, ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canDistribute(candies, k, mid)) {
                ans = mid;  // Update answer
                left = mid + 1;  // Search for a larger portion size
            } else {
                right = mid - 1;  // Reduce portion size
            }
        }
        return ans;
    }
}