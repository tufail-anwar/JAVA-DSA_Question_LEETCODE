class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int sum_of_num=0;
        int sum_of_set=0;
       for (int x : nums) {
         set.add(x);
         sum_of_num +=x;
       }
       for(int i : set){
        sum_of_set += i;
       }
       int n2=set.size();
       return (sum_of_num-sum_of_set)/(n-n2);
    }
}