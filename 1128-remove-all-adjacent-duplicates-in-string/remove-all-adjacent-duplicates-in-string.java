class Solution {
    public String removeDuplicates(String s) {
         Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && ch==stack.peek()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
           sb.append(c);
        }
        return sb.toString();
    }
}