class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1=new int[nums.length/2];
        int[] arr2=new int[nums.length/2];
        int k=0; int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr1[k]=nums[i];
                k++;
            }else{
                arr2[j]=nums[i];
                j++;
            }
        }
        j=0;
        k=0;
        int i=0;
        while(j<arr1.length && k<arr2.length){
            nums[i]=arr1[k];
            i++;
            nums[i]=arr2[j];
            i++;
            j++;
            k++;
        }
        return nums;
    }
}