package K04_dataCasting.D02_ExplicitNarrowing_charDataType;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {



        // kullanicidan iki tamsayi alin
        // sayilari birbirine bolup, islem sonucunu ondalikli olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iki adet pozitif tamsayi giriniz...");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println(  "sayilarin birbirine bolumu : "  + (sayi1/sayi2)  );
        // 28 / 10 ==> 2.8 Java 2 yazdirdi

        /*
         NOT : Java'da iki tamsayiyi birbirine bolerseniz
               Java islem sonucunun tamsayi kismini alir
         */

        double sonuc = (double)(sayi1 / sayi2);

        System.out.println("double'a cast edilen sonuc : " + sonuc);


        // sayi1 veya sayi2'yi double yapalim

        System.out.println(    (double)sayi1 / sayi2       );
        System.out.println(    sayi1 / (double)sayi2       );
        System.out.println(    (double)sayi1 / (double)sayi2       );


        // NOT : bir tamsayiyi 10'a bolersek, birler basamagini silmis oluruz

        System.out.println( 258 / 10 ); // 25
        System.out.println( 25 / 10 ); // 2
        System.out.println( 2 / 10 ); // 0



    }
}
