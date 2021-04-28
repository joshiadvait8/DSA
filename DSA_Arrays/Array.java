package DSA_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array {
    int arr[];
    int count;
    public Array(int length){
        arr=new int[length];
    }

    public void insertAt(int item,int index){
        if(index<0 || index >=count)
            throw new IllegalArgumentException();
        //shift items after given index to right
        count++;
        int newItems[] = new int[count];
        int j=0;
        for(int i=0;i<count;i++){
            if(i==index){
                newItems[i]=item;
                continue;
            }
//            if(i>index)
//                newItems[i+1] = arr[i];
            else
                newItems[i]=arr[j++];

        }

        arr=newItems;

    }

    public void reverse(){
        int[] newArr = new int[count];
        int j=0;
        for(int i=count-1;i>=0;i--){
            newArr[j++]=arr[i];
        }
        arr = newArr;
    }

    public List<Integer> intersect(int otherArr[]){
        //O(n^2) time
        List<Integer> commonItems = new ArrayList<>();
        for(int i=0;i<count;i++){
            for(int j=0;j<otherArr.length;j++){
                if(arr[i]==otherArr[j])
                    commonItems.add(arr[i]);

            }
        }
        return commonItems;
    }
    public int max(){
        //O(n) time
        int max=Integer.MIN_VALUE;
        for(int i=0;i<count;i++){
            if(arr[i]>=max)
                max = arr[i];
        }
        return max;
    }
    public void insert(int item){
        //if array is full we will resize it
        if(count==arr.length) {
            // if the array size is reached we will twice the size of new array
            int[] newArr = new int[count * 2];
            //copy all new items
            for (int i = 0; i < count; i++)
                newArr[i] = arr[i];
            //set arr to new array
            arr = newArr;
        }
        //append to end array
        arr[count++] = item;
    }
    public void removeAt(int index){
        //validate the index
        if(index<0 || index>=count)
            throw new IllegalArgumentException();

        //shift items to left fill the hole
        //[10,20,30,40]
        //index:1 we want to remove
        arr[index]=0;
        for(int i=index;i<count;i++){
            arr[i]=arr[i+1];
        }
        //to shrink the size of actual array
        count--;
    }
    public int  indexOf(int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}
