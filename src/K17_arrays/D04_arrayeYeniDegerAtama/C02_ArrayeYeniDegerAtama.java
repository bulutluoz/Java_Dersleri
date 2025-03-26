package K17_arrays.D04_arrayeYeniDegerAtama;

import java.util.Arrays;

public class C02_ArrayeYeniDegerAtama {

    public static void main(String[] args) {

        int[] sayilar = {3,5,10};

        String[] isimler = {"Kemal", "Hasan"};

        // sayilar array'ine 4.deger olarak 8 ekleyin
        // sayilar[3] = 8; // ArrayIndexOutOfBoundsException


        // isimler array'ine 3.deger olarak "Can" ekleyin
        // isimler[2] = "Can"; // ArrayIndexOutOfBoundsException



        // sayilar array'ine {3, 5, 10, 8} array'ini atayin

        // sayilar = {3, 5, 10, 8};

        int[] yeniArr = {3, 5, 10, 8};

        sayilar = yeniArr ;

        System.out.println( "sayilar array'inin yeni hali : " + Arrays.toString(sayilar));



        //  isimler = {"Ali", "Hasan"};
        //  isimler array'ine {"Ali", "Hasan", "Can"} array'ini atayin


        String[] yeniIsimler = {"Ali", "Hasan", "Can"};
        isimler = yeniIsimler;

        System.out.println( "isimler array'inin yeni hali : " + Arrays.toString(isimler));


        // {3, 5, 10, 8};
        sayilar = new int[5];

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0, 0]





    }
}
