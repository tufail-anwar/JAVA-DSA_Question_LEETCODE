class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         return targetSum(nums,0,target);
    }
    public int targetSum(int[] arr,int i,int tar){
        if (i == arr.length) {
            if (tar == 0) {
               return 1;
            } else {
               return 0;
            }
        }
        int count=0;
        count+=targetSum(arr,i+1,tar-arr[i]); 
        count+=targetSum(arr,i+1,tar+arr[i]);
        return count;
    }
}