package K17_arrays.D03_arraysClassMethodlari;

import java.util.Arrays;

public class C02_binarySearch {

    public static void main(String[] args) {

        String[] harfler = {"d","t","p","k","z"};

        // verilen arr'de d harfinin var olup olmadigini yazdirin


        System.out.println(Arrays.binarySearch(harfler, "d")); // 0
        System.out.println(Arrays.binarySearch(harfler, "t")); // -5
        System.out.println(Arrays.binarySearch(harfler, "p")); // 2
        System.out.println(Arrays.binarySearch(harfler, "k")); // -2
        System.out.println(Arrays.binarySearch(harfler, "z")); // 4


        /*
            Arrays.binarySearch() bir array'de aranan elementin
            hangi index'de oldugunu verir

            ANCAKKKK bu method'dan once sort() calistirilmalidir

            sort() calistirilmadan yapilan aramalarda
            SONUC BILINEMEZ
         */


        Arrays.sort(harfler);

        System.out.println(Arrays.toString(harfler)); // [d, k, p, t, z]


        System.out.println(Arrays.binarySearch(harfler, "d")); // 0
        System.out.println(Arrays.binarySearch(harfler, "t")); // 3
        System.out.println(Arrays.binarySearch(harfler, "p")); // 2
        System.out.println(Arrays.binarySearch(harfler, "k")); // 1
        System.out.println(Arrays.binarySearch(harfler, "z")); // 4



        /*
            olmayan elementler icin index degil sira kullanilir
            index'de 0 oldugu icin -0 anlamsiz olur

            ornegin a icin artip index olsaydi
            -0 derdi ==> 0 yazardi
         */

        System.out.println(Arrays.binarySearch(harfler, "m")); // -3
        System.out.println(Arrays.binarySearch(harfler, "a")); // -1
        System.out.println(Arrays.binarySearch(harfler, "y")); // -5
        System.out.println(Arrays.binarySearch(harfler, "c")); // -1
        System.out.println(Arrays.binarySearch(harfler, "v")); // -5



    }
}
