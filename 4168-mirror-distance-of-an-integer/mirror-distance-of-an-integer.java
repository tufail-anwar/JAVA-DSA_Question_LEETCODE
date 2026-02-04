class Solution {
    public int mirrorDistance(int n) {
        int m=n;
        int sum=0;
        while(n!=0){
            int x=n%10;
            n=n/10;
            sum +=x;
            if(n!=0){
                sum= sum*10;
            }
        }
        return (sum-m > 0) ? sum-m:-(sum-m);
    }
}