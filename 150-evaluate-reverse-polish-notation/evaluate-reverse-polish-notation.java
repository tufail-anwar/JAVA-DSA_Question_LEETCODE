class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> stack=new Stack<>();
     
      for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int sum=stack.pop()+stack.pop();
                stack.push(sum);
            }else if(tokens[i].equals("*")){
                int f=stack.pop();
                int sec=stack.pop();
                int mul=sec*f;
                stack.push(mul);
            }else if(tokens[i].equals("/")){ 
                if(stack.peek()==0){
                    break;
                } 
                int f=stack.pop();
                int sec=stack.pop();
                int div=sec/f;
                stack.push(div);
            }else if(tokens[i].equals("-")){
                int f=stack.pop();
                int sec=stack.pop();
                int min=sec-f;
                stack.push(min);
            }else{
               int x=Integer.parseInt(tokens[i]);
                stack.push(x);
            }
        
      } 
      return stack.peek();
    }
}