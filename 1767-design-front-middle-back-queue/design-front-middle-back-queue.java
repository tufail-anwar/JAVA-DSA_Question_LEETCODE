class FrontMiddleBackQueue {
    int size;
    int[] arr;
    public FrontMiddleBackQueue() {
        this.arr=new int[1];
        size=0;
    }
    
    public void pushFront(int val) {
        Capacity();
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val;
        size++;
         
    }

    public void pushMiddle(int val) {
        Capacity();
        
      Stack<Integer> stack=new Stack<>();
      for(int i=size-1;i>=size/2;i--){
        stack.push(arr[i]);
      }
      stack.push(val);
       for(int i=size/2-1;i>=0;i--){
        stack.push(arr[i]);
      }
      size++;
      for(int i=0;i<size;i++){
        arr[i]=stack.pop();
      }
    }
    
    public void pushBack(int val) {
        Capacity();
        arr[size] = val; 
        size++;    
    }
    
    public int popFront() {
        if(size==0){
            return -1;
        }
      int x= arr[0];
      for(int i=0;i<size-1;i++){
        arr[i]=arr[i+1];
      }
      size--;
      return x;
    }
    
    public int popMiddle() {
        if(size==0){
            return -1;
        }
        Stack<Integer> stack=new Stack<>();
        int mid = (size - 1) / 2;
      for (int i = size - 1; i > mid; i--) {
            stack.push(arr[i]);
        }
      int x = arr[mid];
       for (int i = mid - 1; i >= 0; i--) {
            stack.push(arr[i]);
        }
      size--;
      for(int i=0;i<size;i++){
        arr[i]=stack.pop();
      }
      return x;
    }
    
    public int popBack() {
        if(size==0){
            return -1;
        }
      return arr[--size];
    }

     private void Capacity() {
        if (size == arr.length) {
            int[] temp = new int[arr.length * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
     }
}

}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */