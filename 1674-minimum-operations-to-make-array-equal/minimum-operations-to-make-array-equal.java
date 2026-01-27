class Solution {
    public int minOperations(int n) {
        int[] arr=new int[n];
        int first=0;
        int last=n-1;
        for(int i=0;i<n;i++){
            arr[i]=(2*i)+1;
        }
        int count=0;
        while(first<=last){
            int diff=arr[last]-arr[first];
            count +=diff/2;
            first++;
            last--;
       
        }
            return count;
    }
}