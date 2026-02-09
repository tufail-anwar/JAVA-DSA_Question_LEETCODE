class Solution {
    public boolean judgeSquareSum(int c) {
        int s = 0;
        int e = (int) Math.sqrt(c);

        while (s <= e) {
            long sum = (long) s * s + (long) e * e;

            if (sum == c) return true;
            if (sum < c) s++;
            else e--;
        }

        return false;
    }
}
