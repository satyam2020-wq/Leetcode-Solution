  // Time Complexity: O(n log(log n))
// Space Complexity: O(n)
    class Solution {
    public int countPrimes(int n) {

        // Stores whether each number is prime or not
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        int ans = 0; // Counts prime numbers less than n

        // Start from 2, the smallest prime number
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                ++ans;

                // Mark multiples of i as non-prime
                for (int j = i * 2; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }

        return ans;
    }
}