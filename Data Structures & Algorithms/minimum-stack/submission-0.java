class MinStack {
    private int[] stack;
    private int[] mins;
    private int counter;

    public MinStack() {
        stack = new int[30000];
        mins = new int[30000];
        counter = -1;

    }
    
    public void push(int val) {
        counter++;
        stack[counter] = val;
        if (counter == 0) {
            mins[counter] = val;
        } else {
            mins[counter] = Math.min(val, mins[counter - 1]);
        }

    }
    
    public void pop() {
        counter--;  
    }
    
    public int top() {
        return stack[counter];
    }
    
    public int getMin() {
        return mins[counter]; 
    }
}
