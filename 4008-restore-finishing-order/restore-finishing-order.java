class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr=new int[friends.length];
        int i=0;
        int k=0;
        while(i<order.length){
            int num=order[i];
            int j=0;
            while(j<friends.length){
                if(order[i]==friends[j]){
                    arr[k]=order[i];
                    k++;
                    break;
                }
                j++;
            }
            i++;
        }
        return arr;
    }
}