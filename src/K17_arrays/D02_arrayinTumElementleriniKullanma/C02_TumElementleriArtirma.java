package K17_arrays.D02_arrayinTumElementleriniKullanma;

import java.util.Arrays;

public class C02_TumElementleriArtirma {

    public static void main(String[] args) {
        // Verilen bir int array’in
        // tum elemanlarini 2 artirin

        int[] arr = {2,5,3,8,6,4,1,0};

        /*
        for (int i = 0; i < arr.length ; i++) {

            arr[i] +=2 ;

        }

        System.out.println(Arrays.toString(arr)); // [4, 7, 5, 10, 8, 6, 3, 2]

         */

        arr = elemanlariArtir(arr,2);

        System.out.println(Arrays.toString(arr)); // [4, 7, 5, 10, 8, 6, 3, 2]

        arr = elemanlariArtir(arr,4);

        System.out.println(Arrays.toString(arr)); // [8, 11, 9, 14, 12, 10, 7, 6]



    }

    // Verilen bir int array’in
    // tum elemanlarini verilen sayi kadar artirip donduren bir method olusturun.
    // Eski array’i yeni haliyle kaydedin.

    public static int[] elemanlariArtir(int[] arr, int artisMiktari){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += artisMiktari ;

        }

        return arr;



    }





}
