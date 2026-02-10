class Solution {
    public int finalPositionOfSnake(int n, List<String> list) {
        int res=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals("RIGHT")){
                res +=1;
            }else if(list.get(i).equals("LEFT")){
                res -=1;
            }else if(list.get(i).equals("DOWN")){
                res +=n;
            }else{
                res -=n;
            }
        }
        return res;
    }
}