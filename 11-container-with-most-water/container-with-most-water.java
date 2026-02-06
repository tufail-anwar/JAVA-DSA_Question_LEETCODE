class Solution {
    public int maxArea(int[] height) {
        int j=height.length-1;
        int i=0;
        int max=0;
        int x=0;
        while(i<j){
            if(height[i]<height[j]){
                x=height[i]*(j-i);
                i++;
            }else{
                x=height[j]*(j-i);
                j--;
            }
            max=Math.max(max,x);
        }
        return max;
    }
}