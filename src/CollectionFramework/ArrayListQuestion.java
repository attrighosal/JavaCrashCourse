package CollectionFramework;

import java.util.ArrayList;

public class ArrayListQuestion {

    public static void main(String[] args) {
        int[] inArr = new int[] {1,2,2,3,4,4,5,5,6,6};
        ArrayList<Integer> outArr = new ArrayList<>();

        outArr.add(inArr[0]); // [1]
        for (int i=1; i<inArr.length; i++) {
            if (inArr[i] != inArr[i-1]) {
                outArr.add(inArr[i]);  // [1,2,3,4,5,6]
            }
        }

        System.out.println(outArr);
    }
}

/*
Input : [1,2,2,3,4,4,5,5,6,6] = arr
Output : ArrayList [1,2,3,4,5,6]
 */
