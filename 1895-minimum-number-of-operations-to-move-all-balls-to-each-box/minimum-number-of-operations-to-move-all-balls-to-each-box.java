class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        int i=0;
        int sum=0;
        int j=1;
        while(i<boxes.length()){
           while(j<boxes.length()){
                if(boxes.charAt(j)== '0'){
                    j++;
                }else{
                    int n=Math.abs(j-i);
                    sum+=n;
                    j++;
                }
            }
            arr[i]=sum;
            sum=0;
            i++;
            j=0;
        }
        return arr;
    }
}