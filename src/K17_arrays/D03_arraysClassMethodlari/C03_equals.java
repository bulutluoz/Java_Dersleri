package K17_arrays.D03_arraysClassMethodlari;

import java.util.Arrays;

public class C03_equals {

    public static void main(String[] args) {


        int[] arr1 = {3,5,6,8,9};
        int[] arr2 = {8,5,3,6,7};


        System.out.println(Arrays.equals(arr1,arr2)); // false

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1)); // [3, 5, 6, 8, 9]
        System.out.println(Arrays.toString(arr2)); // [3, 5, 6, 7, 8]

        System.out.println(Arrays.equals(arr1,arr2)); // false



        int[] arr3 = {3,5,6,8,1};
        int[] arr4 = {8,5,3,6,1};


        System.out.println(Arrays.equals(arr3,arr4)); // false


        Arrays.sort(arr3);
        Arrays.sort(arr4);

        System.out.println(Arrays.toString(arr3)); // [1, 3, 5, 6, 8]
        System.out.println(Arrays.toString(arr4)); // [1, 3, 5, 6, 8]


        System.out.println(Arrays.equals(arr3,arr4)); // true




    }
}
