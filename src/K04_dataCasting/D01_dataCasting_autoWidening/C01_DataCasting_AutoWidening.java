package K04_dataCasting.D01_dataCasting_autoWidening;

public class C01_DataCasting_AutoWidening {

    public static void main(String[] args) {

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";

        /*
         int data turundeki bir degeri
         yine int data turundeki bir variable'a atama yaparsak
         bu data casting olmaz, ATAMA olur
         */

        int sayi = sayiInt;
        double sayi2 = dbl;


    // bir variable'a baska data turundeki bir deger ATANABILIR MI?


//         bl = chr; // 'a'
//         bl = byt; // 24
//         bl = shrt; // 23
//         bl = sayiInt; // 30
//         bl = str; // "Java Candir"


//         chr = bl; // true
//         chr = flt; // 3.5F
//         chr = dbl; // 4.5
//         chr = str; // "Java Candir";
//         chr = 45;


//         str = bl; // true
//         str = byt; // 24
//         str = chr; // 'a'
//         str = shrt; // 23
//         str = lng; // 40


        /*
         boolean veya String data turundeki bir variable'a
         baska data turundeki degerleri ATAYAMAYIZ
         char data turu ozel bir data turudur ve ayrica inceleyecegiz
         */

        // compile time'da Java SADECE syntax ile ilgilenir
        // yani degerin kac olduguna degil, degerin DATA TURUNE bakar

//        byt = shrt; // 23
//        byt = sayiInt; // 30
//        byt = lng; // 40
//        byt = flt; // 3.5F
//        byt = dbl; // 4.5

        shrt = byt;
//        shrt = sayiInt;
//        shrt = lng;
//        shrt = flt;
//        shrt = dbl;

        sayiInt = byt;
        sayiInt = shrt;
//        sayiInt = lng;
//        sayiInt = flt;
//        sayiInt = dbl;

        lng = byt;
        lng = shrt;
        lng = sayiInt;
//        lng = flt;
//        lng = dbl;

        flt = byt;
        flt = shrt;
        flt = sayiInt;
        flt = lng;
//        flt = dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;

        /*
         Sayi icin kullandigimiz
         byte, short, int, long, float ve double variable'lar ise
         variable'in data turunden daha dar kapsamli olan data turundeki degerleri
         hic bir islem yapmamiza gerek kalmadan kabul ederler
         buna Auto Widening (Otomatik genisletme) denir
         */


    }
}
