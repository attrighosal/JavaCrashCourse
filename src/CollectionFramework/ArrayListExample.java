package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> ars = new ArrayList<>(100);
        ars.add("Attri");
        ArrayList<Integer> arrI = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // int[] a = new int[size];

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(0, 0);

        System.out.println(arr);

        for (int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
