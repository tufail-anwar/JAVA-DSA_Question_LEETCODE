class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange){
            int n=numBottles/numExchange;
            int m=n*numExchange;
            sum+=n;
            numBottles=n+(numBottles-m);
        }
        return sum;
    }
}