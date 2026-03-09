class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = 1;

        while (i < nums.length) {
            if (j == nums.length) {
                j = 0;
            }
            if (j == i) {
                arr[i] = -1;
                i++;
                j = (i + 1) % nums.length;
                continue;
            }
            if (nums[i] < nums[j]) {
                arr[i] = nums[j];
                i++;
                j = (i + 1) % nums.length;
            } else {
                j++;
            }
        }
        return arr;
    }
}