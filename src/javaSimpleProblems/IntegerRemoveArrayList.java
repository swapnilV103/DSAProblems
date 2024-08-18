package javaSimpleProblems;
//import java.util.Arrays;
import java.util.ArrayList;

public class IntegerRemoveArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(33);
        arr.add(4);
        arr.add(5);

        System.out.println(arr);

        int index = arr.indexOf(33);
        arr.remove(index);

        System.out.println(arr);


    }
}
 