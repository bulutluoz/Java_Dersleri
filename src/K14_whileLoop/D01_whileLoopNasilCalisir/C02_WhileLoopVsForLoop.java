package K14_whileLoop.D01_whileLoopNasilCalisir;

import java.util.Scanner;

public class C02_WhileLoopVsForLoop {

    public static void main(String[] args) {

        // kullaniciya istedigi kadar pozitif sayi girmesini soyleyin
        // girilen sayilar pozitif ise sayiyi toplama ekleyin
        // girilen sayi negatif ise uyari verin ve sayiyi isleme almayin
        // girilen sayi 0 oldugunda islemi bitirin
        // ve kac tane pozitif sayi girildigini
        // ve toplamlarinin kac oldugunu yazdirin


        // Tekrar sayisi belli degil
        // while loop daha avantajli olacaktir

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int girilenSayi = 10; // loop'un calismasi icin 0 disinda herhangi bir deger olmali
        /*
            while loop'da dikkat edilmesi gereken 2 durum var
            1- while loop'un bitmek icin kontrol ettigi degiskenin
               loop icerisinde degistiginden EMIN OLMAK
            2- eger while loop'un bitmek icin kontrol ettigi degiskene
               looptan once biz deger atamasi yapiyorsak
               int girilenSayi = 0;
               bu degerin loop'un calismasina ENGEL olmadigindan emin olmak
         */
        int sayac = 0;

        while (  girilenSayi != 0 ){ // loop body'nin calismasi icin gerekli sart

            System.out.println("Toplanmak uzere 1 pozitif tamsayi giriniz, " +
                                "\nBitirmek icin 0'a basiniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi>0){
                toplam += girilenSayi;
                sayac++;
            }

            if (girilenSayi<0){
                System.out.println("Girilen sayi gecersiz...");
            }

        }


        System.out.println("Girilen " + sayac + " adet pozitif tamsayinin toplami : " + toplam);

        System.out.println("=============");


        toplam = 0;
        sayac = 0;

        // ayni gorevi for loop ile de yapabiliriz

        for (int i = 0; i <100000 ; i++) {

            System.out.println("Toplanmak uzere 1 pozitif tamsayi giriniz, " +
                    "\nBitirmek icin 0'a basiniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi>0){
                toplam += girilenSayi;
                sayac++;
            } else if (girilenSayi<0){
                System.out.println("Girilen sayi gecersiz...");
            } else { // geriye 0 girilmesi kaldi
                break;
            }

        }

        System.out.println("Girilen " + sayac + " adet pozitif tamsayinin toplami : " + toplam);



    }
}
