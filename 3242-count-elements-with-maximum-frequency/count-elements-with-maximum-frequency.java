class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                list.add(count);
                count=1;
            }
        }
        list.add(count);
        int max = 0;
        for(int x : list){
            max = Math.max(max, x);
        }
        int sum = 0;
        for(int x : list){
            if(x == max){
                sum += x;
            }
        }
        return sum;
    }
}