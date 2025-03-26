package K17_arrays.D04_arrayeYeniDegerAtama;

import java.util.Arrays;

public class C04_Runner {

    public static void main(String[] args) {

        int[] abc = {3,5,7};


        // abc array'inin sonuna eleman olarak 4 ekleyin

        abc = C03_ArrayeYeniElemanEkleme.arrayeElemanEkle(abc,4);

        System.out.println(Arrays.toString(abc)); // [3, 5, 7, 4]


        // abc array'inin sonuna eleman olarak 1 ekleyin

        abc = C03_ArrayeYeniElemanEkleme.arrayeElemanEkle(abc,1);

        System.out.println(Arrays.toString(abc)); // [3, 5, 7, 4, 1]


        String[] kelimeler = {"Java","Guzeldir"};

        // kelimeler array'ininin sonuna "dogrudur" ekleyin

        kelimeler = C03_ArrayeYeniElemanEkleme.arrayeElemanEkle(kelimeler,"dogrudur");

        System.out.println(Arrays.toString(kelimeler)); // [Java, Guzeldir, dogrudur]



    }
}
