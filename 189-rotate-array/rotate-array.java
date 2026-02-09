class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1) return;
        k = k % nums.length; 
         if (k == 0) return;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int j=nums.length-k;
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[j];
            j++;
            if(j==nums.length){
                j=0;
            }
        }
    }
}