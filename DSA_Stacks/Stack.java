package DSA_Stacks;

import DSA_Arrays.Array;

import java.util.Arrays;

public class Stack {

    private int[] array;
    private int count;

    public Stack(int size){
        array = new int[size];
    }

    public void push(int item){
        if(count == array.length)
            throw new StackOverflowError();

        array[count++] = item;
    }

    public int pop(){
        if(count==0)
            throw new IllegalStateException();

        return array[--count];
    }

    public boolean isEmpty(){
        return count==0;
    }
    public int peek(){
        if(count==0)
            throw new IllegalStateException();

        return array[count-1];
    }

    @Override
    public String toString(){
       int[] content = Arrays.copyOfRange(array,0,count);

        return Arrays.toString(content);
    }
}
