class MinStack {
    public int[] data;
    public static final int DEFAULT_SIZE =10;
    int ptr=-1;
    public MinStack(int size) {
        this.data=new int[size];
    }
    public MinStack() { 
        this(DEFAULT_SIZE);
    }
    
    public void push(int val) {
        if(ptr == data.length-1){
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        ptr++;
        data[ptr]=val;
    }
    
    public void pop() {
       if (ptr >= 0) {
            ptr--;
        }
        
    }
    
    public int top() {
        if(ptr<0){
            return -1;
        }
        return data[ptr];
    }
    public int getMin() {
    if (ptr < 0) {
        return -1;
    }

    int min = data[0];
    for (int i = 1; i <= ptr; i++) {
        min = Math.min(min, data[i]);
    }
    return min;
}
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */