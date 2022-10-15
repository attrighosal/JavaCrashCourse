package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestion {

    public static void main(String[] args) {

        // Input n : size of the array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Creation of the array of size n
        int[] a = new int[n];

        /*
        int i = 0;
        while(i<n) {
            a[i] = i+1;
            i++;
        }
         */

        for (int i=0;i<n;i++) {
            a[i] = i+1;
        }


        for (int i=0; i<n;  i++) {
            a[i] = i+1;
        }

        for (int i=0; i<n; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println(Arrays.toString(a));

        boolean flag = false;

        while(flag==true) {

        }

        for (boolean flags=false; flags==true; ) {

        }
    }
}

/*
n (integer)
create an array of size n = {1,2,3,4,5,6,7,8,9,10}
 */
