package DSA_Stacks;

public class MinStack {
   //we need two stack here to hold minmums in one stack and other for normal one.
    private Stack stack = new Stack(5);
    private Stack minStack = new Stack(5);

    public void push(int item){
        stack.push(item);

        if(minStack.isEmpty())
            minStack.push(item);
        else if (item < minStack.peek())
            minStack.push(item);
    }

    public int pop(){
        if(stack.isEmpty())
            throw new IllegalStateException();

        int top = stack.pop();

        if(minStack.peek() == top)
            minStack.pop();

        return top;
    }

    public int min(){
        return minStack.peek();
    }

}
