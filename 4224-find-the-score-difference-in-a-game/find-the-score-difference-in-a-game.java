class Solution {
    public int scoreDifference(int[] nums) {
        int first_player = 0;
        int second_player = 0;
        boolean res = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0 ) {
                res = !res;
            }
            if( i%6 == 5) {
                res = !res;
            }
            if (res) {
                first_player += nums[i];
            } else {
                second_player += nums[i];
            }

        }
        return first_player - second_player;
    }
}