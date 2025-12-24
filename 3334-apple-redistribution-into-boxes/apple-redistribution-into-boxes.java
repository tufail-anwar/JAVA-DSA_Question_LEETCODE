class Solution {
    public int minimumBoxes(int[] apple, int[] cap) {
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum=sum+apple[i];
        }
        int n=cap.length;
        int count=0;
        Arrays.sort(cap);
        for(int i=n-1;i>=0;i--){  
           if(sum>cap[i]){
            count++;
            sum=sum-cap[i];
           }else{
            count++;
            break;
           }
        }
        return count;
    }
}