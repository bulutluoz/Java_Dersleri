package K15_doWhileLoop.D01_DoWhileLoopVsWhileLoop;

import java.util.Scanner;

public class C02_whileLoopVsDoWhileLoop {

    public static void main(String[] args) {

        /*
            while loop'un en buyuk eksisi
            kullanicidan deger alinan gorevlerde
            loop calismadan once kod yazan kisinin atayacagi degerin ONEMLI olmasidir

            Cunku kod yazan kisi ilk deger atamasini yanlis yaparsa
            LOOP BODY hic calismayabilir.
         */

        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin

        Scanner scanner = new Scanner(System.in);

        int girilenSayi= 0; // while loop icin bunun 0 olmamasi lazim
                            // do while loop icin ilk degerin hic bir onemi yok
                            // cunku kontrol yapmadan once kullanicidan deger aliyor
        int sayiToplami = 0;
        int sayac = 0 ;


        // while loop ile yapalim

//        while(girilenSayi != 0 ){
//
//            System.out.println("Toplanmak uzere pozitif bir tamsayi giriniz " +
//                    "\nBitirmek icin 0 (sifir)a basiniz");
//
//            girilenSayi = scanner.nextInt();
//
//            if (girilenSayi>0){
//                sayiToplami += girilenSayi;
//                sayac++;
//            } else if (girilenSayi<0) {
//                System.out.println("Sayi negatif olamaz...");
//            }
//
//        }
//
//
//        System.out.println("Girilen " + sayac + " adet pozitif sayinin toplami : " + sayiToplami);


        // aynisini do while ile yapalim


        do {

            System.out.println("Toplanmak uzere pozitif bir tamsayi giriniz " +
                                "\nBitirmek icin 0 (sifir)a basiniz");

            girilenSayi = scanner.nextInt();

            if (girilenSayi>0){
                sayiToplami += girilenSayi;
                sayac++;
            } else if (girilenSayi<0) {
                System.out.println("Sayi negatif olamaz...");
            }
        } while (girilenSayi != 0);


        System.out.println("Girilen " + sayac + " adet pozitif sayinin toplami : " + sayiToplami);


    }
}
