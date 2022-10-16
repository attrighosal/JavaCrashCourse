package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        int[] inArr = new int[] {1,3,2,4,4,2,2,1,1,5,6,6};
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<inArr.length; i++) {
            set.add(inArr[i]);
        }

        System.out.println(set);
    }
}
