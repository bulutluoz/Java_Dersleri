package K17_arrays.D03_arraysClassMethodlari;

import java.util.Arrays;

public class C02_binarySearch {

    public static void main(String[] args) {

        String[] harfler = {"d","t","p","k","z"};

        // verilen arr'de d harfinin var olup olmadigini yazdirin


        System.out.println(Arrays.binarySearch(harfler, "d")); //



        /*
            Arrays.binarySearch() bir array'de aranan elementin
            hangi index'de oldugunu verir

            ANCAKKKK bu method'dan once sort() calistirilmalidir

            sort() calistirilmadan yapilan aramalarda
            SONUC BILINEMEZ
         */



        /*
            olmayan elementler icin index degil sira kullanilir
            index'de 0 oldugu icin -0 anlamsiz olur

            ornegin a icin artip index olsaydi
            -0 derdi ==> 0 yazardi
         */


    }
}
