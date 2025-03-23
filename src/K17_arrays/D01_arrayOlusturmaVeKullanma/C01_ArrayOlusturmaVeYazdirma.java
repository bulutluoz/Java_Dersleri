package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class C01_ArrayOlusturmaVeYazdirma {

    public static void main(String[] args) {

        // int arr = new int[3];
        int[] arr = new int[3];
        int arr1 = 4;

        //String arr2 = {"Ali", "Veli"};
        String[] arr2 = {"Ali", "Veli"};
        // Array initializer is not allowed here


        // icinde 56,67,23,97 degerlerinin oldugu notlar array'i olusturun
        int[] notlar = {56,67,23,97};


        // icinde mevsim isimlerinin oldugu mevsimler array'i olusturun
        String[] mevsimler = {"Ilkbahar","Yaz","Sonbahar","Kis"};



        // 4 int deger koyabilecegimiz sayilar array'i olusturun
        int[] sayilar = new int[4];


        // 5 isim koyabilecegimiz bir array olusturun
        String[] isimler = new String[5];


        // 2 boolean deger koyabilecegimiz bir array olusturun
        boolean[] arr3 = new boolean[2];


        /*
            Array'de birden fazla deger oldugu icin
            herhangi bir element'e ulasmak istedigimizde
            index kullanmaliyiz
         */

        // {56,67,23,97}
        // notlar array'indeki 23'u yazdirin
        System.out.println(notlar[2]); // 23

        // {"Ilkbahar","Yaz","Sonbahar","Kis"}
        // mevsimlerden Kis'i yazdirin
        System.out.println(mevsimler[3]); // Kis

        // new int[4] == > [0, 0, 0, 0]
        // sayilar array'indeki ilk elementi yazdirin
        System.out.println(sayilar[0]); // 0

        // new String[5] ==> [null, null, null, null, null]
        // isimler array'indeki 2.elementi yazdirin
        System.out.println(isimler[1]); // null



        // notlar array'indeki 2.sayiyi 45 yapin
        notlar[1] = 45;


        // isimler array'inin ilk ismi olarak Mahmut atayin
        isimler[0] = "Mahmut";


        /*
            String'de oldugu gibi
            Array'lerde de varolmayan bir index'e ulasmaya calisirsak
            hata olusur : ArrayIndexOutOfBoundsException
         */

        // {"Ilkbahar","Yaz","Sonbahar","Kis"};
        // mevsimler array'inin 5. elementini yazdirin
        // System.out.println(mevsimler[4]); // ArrayIndexOutOfBoundsException
        //Index 4 out of bounds for length 4


        // mevsimler array'ine 5.mevsim olarak tatil mevsimi ekleyelim

        // mevsimler[4] = "tatil mevsimi"; // ArrayIndexOutOfBoundsException


        /*
            Array non-primitive data turudur

            Non-primitive data turlerinin
            referanslari stack memory'de, kendileri ise heap memory'de tutulur

            Eger bir array'i direkt yazdirmak isterseniz
            Java array'in kendisini degil, referansini yazdirir

            Array'in kendisini yazdirmak isterseniz
            Arrays class'indan yardim almalisiniz

         */

        // isimler array'ini yazdirin
        System.out.println(isimler); // [Ljava.lang.String;@2752f6e2
        System.out.println( Arrays.toString(isimler) );
        // [Mahmut, null, null, null, null]


        // sayilar array'ini yazdiralim
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0]


        // notlar array'ini yazdiralim
        System.out.println(Arrays.toString(notlar)); // [56, 45, 23, 97]



    }
}











