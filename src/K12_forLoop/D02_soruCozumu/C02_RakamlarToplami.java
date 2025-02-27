package K12_forLoop.D02_soruCozumu;

import java.util.Scanner;

public class C02_RakamlarToplami {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini asagidaki gibi yazdirin.
        // input : 1453 output => 1+4+5+3 = 13
        // output :  "Girilen 1453 sayisinin rakamlar toplami : 13"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();


        int sayi = girilenSayi;

        int rakam = 0;
        int rakamlarToplami = 0;

        int basamakSayisi = (sayi+"").length();


        for (int i = 1; i <= basamakSayisi ; i++) {

            rakam = sayi % 10 ;
            rakamlarToplami += rakam;
            sayi = sayi/10 ;

        }


        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);


    }


}








