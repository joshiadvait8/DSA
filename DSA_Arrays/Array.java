package DSA_Arrays;

public class Array {
    int arr[];
    int count;
    public Array(int length){
        arr=new int[length];
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
