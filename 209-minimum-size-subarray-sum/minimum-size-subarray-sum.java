class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int i=0;
        int j=0;
        int main_count= Integer.MAX_VALUE;
        while(i<nums.length && j<nums.length ){
            sum += nums[i];
            i++;
            if(sum>=target){
                main_count=Math.min(i-j,main_count);
                j++;
                i=j;
                sum=0;
            }
        }
        
        return main_count== Integer.MAX_VALUE ? 0 : main_count;
    }
}