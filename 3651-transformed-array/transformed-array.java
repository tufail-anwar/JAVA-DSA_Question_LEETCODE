class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                int x=i+nums[i];
                while(x>=nums.length){
                    x=x-(nums.length-1)-1;
                }
                res[i]=nums[x];
            }else{
                int y=i+nums[i];
                while(y<0){
                    y=nums.length+y;
                }
                res[i]=nums[y];
            }
        }
        return res;
    }
}