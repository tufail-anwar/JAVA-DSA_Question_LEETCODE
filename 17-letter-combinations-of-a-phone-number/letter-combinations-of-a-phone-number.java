class Solution {
    public List<String> letterCombinations(String digits) {
      return  padlist("",digits);
    }
    public ArrayList<String> padlist(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
      ArrayList<String> list=new ArrayList<>();
        int digit = up.charAt(0)-'0';
        if( digit ==9){
            for (int i = (digit-2)*3+1; i < (digit *3)-1; i++) {
                char ch= (char)('a'+ i);
                list.addAll(padlist(p+ch,up.substring(1)));
            }
        }else if(digit==7 ){
            for (int i = (digit-2)*3; i < (digit *3)-2; i++) {
                char ch= (char)('a'+ i);
                list.addAll(padlist(p+ch,up.substring(1)));
            }
        }else if(digit == 8) {
            for (int i = (digit - 2) * 3+1; i < (digit * 3) - 2; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padlist(p + ch, up.substring(1)));
            }
        }else{
                for (int i = (digit-2)*3; i < (digit *3)-3; i++) {
                    char ch= (char)('a'+ i);
                    list.addAll(padlist(p+ch,up.substring(1)));
                }
            }

        return list;
    }
}