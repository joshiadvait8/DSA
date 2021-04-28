package DSA_Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Array a = new Array(3);
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.removeAt(2);
        a.print();
        a.removeAt(0);
        a.print();
        System.out.println(a.indexOf(3));

        //Innbuilt dyanmic array
        //arraylist --> 50% grow
        //vectors -->100% grow
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.remove(0);
        list.toArray();
        System.out.println(list.toString());

    }
}
