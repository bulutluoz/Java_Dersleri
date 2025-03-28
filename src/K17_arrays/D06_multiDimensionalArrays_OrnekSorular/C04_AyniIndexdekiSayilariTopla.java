package K17_arrays.D06_multiDimensionalArrays_OrnekSorular;

import java.util.Arrays;

public class C04_AyniIndexdekiSayilariTopla {

    public static void main(String[] args) {


        // Verilen 2 katli ve 2 inner array'e sahip bir int array’de
        // ayni index’e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.

        //		input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //	    output:                       [5, 7, 11]


        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        // ortak index sayisi inner array'lerden kisa olanin length'ine esit olur
        // length'ler esit ise ortak index sayisi bu length'e esit olur
        int ortakIndexSayisi = arr[0].length > arr[1].length ? arr[1].length : arr[0].length ;


        int[] ortakIndexlerArr = new int[ortakIndexSayisi];

        for (int i = 0; i <ortakIndexSayisi ; i++) {

            ortakIndexlerArr[i] = arr[0][i] + arr[1][i];

        }

        System.out.println(Arrays.toString(ortakIndexlerArr));

    }
}
