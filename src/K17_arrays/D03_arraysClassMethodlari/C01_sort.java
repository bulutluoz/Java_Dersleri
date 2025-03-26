package K17_arrays.D03_arraysClassMethodlari;

import java.util.Arrays;

public class C01_sort {

    public static void main(String[] args) {


        String[] isimler = {"Metin","Mete","metehan","Mikail","Nevzat","Yasar","yakup","Yaman"};

        int[] sayilar = {4,-3,8,-1,0,12};


        // array'i natural order'a gore duzenleyip (dogal siralama) yazdirin

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [-3, -1, 0, 4, 8, 12]

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));

        //  [Mete, Metin, Mikail, Nevzat, Yaman, Yasar, metehan, yakup]


        /*
            NOT 1 : Natural order sayilar icin kucukten buyuge,
                    metinler icin ise sozluk siralamasina gore siralama demektir
                    ANCAKKK java'nin case sensitive oldugunu ve
                    kucuk harflerin buyuk harflerden sonra geldigini UNUTMAMALIYIZ
         */


        String[] isimler2 = {"Metin","Çetin","Şebnem"};

        Arrays.sort(isimler2);

        System.out.println(Arrays.toString(isimler2));
        // [Metin, Çetin, Şebnem]


        String str = "Java Candir";

        str.toUpperCase();

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str); // Java Candir

        /*
            NOT 2 : String'de method ile yapilan degisiklikler atama olmazsa KALICI degisiklik olmaz
                    ANCAKKK bu kural tum non-primitive'ler icin gecerli degildir.
                    (ilerde bu konu detayli anlatilacak)
                    array ve arrayList'de method ile yapilan degisiklikler KALICI OLUR
         */


    }
}
