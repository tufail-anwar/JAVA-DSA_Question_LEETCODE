class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int sum = nums[s] + nums[e]; 
            s++;
            e--;
            list.add(sum);
        }
        Collections.sort(list);
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                count++;
            }
        }
        return count;
    }
}